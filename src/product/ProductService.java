package product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {
	List<ProductEntity> products = new ArrayList<>();
	//Add products
	public List<ProductEntity> getAllProduct() {
		return products;
	}

	// Filter product by place
	public List<ProductEntity> getProductByPlace(String place) {
		List<ProductEntity> matchingObjects = products.stream().filter(prod -> prod.getPlace().contains(place))
				.collect(Collectors.toList());
		return matchingObjects;
	}

	public ProductEntity getProduct(String name) {
		for (ProductEntity p : products) {
			if (p.getName().equals(name))
				return p;
		}
		return new ProductEntity();
	}

	public void addProduct(ProductEntity p) {
		products.add(p);

	}

//Find product by text
	public List<ProductEntity> getProductByText(String text) {
		String str = text.toLowerCase();
		List<ProductEntity> productsByText = new ArrayList<>();

		for (ProductEntity p : products) {
			if (p.getName().equalsIgnoreCase(text) || p.getPlace().equalsIgnoreCase(text)
					|| p.getType().equalsIgnoreCase(text))
				;
			productsByText.add(p);
		}
		return productsByText;
	}

//Filter product by warranty expired .
	public List<ProductEntity> getProductByWarrantyExpired(int warranty) {
		List<ProductEntity> matchingObjects = products.stream().filter(prod -> prod.getWarranty() < warranty)
				.collect(Collectors.toList());
		return matchingObjects;
	}

}
