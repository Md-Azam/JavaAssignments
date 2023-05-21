package product;

import java.util.List;

public class ProductMain {

	public static void main(String[] args) {
		ProductService service = new ProductService();
		service.addProduct(new ProductEntity("samsung", "android 10", "hyderabad", 2024));
		service.addProduct(new ProductEntity("iphone", "android 2", "delhi", 2022));
		service.addProduct(new ProductEntity("nokia", "android 5", "chennai", 2025));
		service.addProduct(new ProductEntity("redmi", "android 7", "bangluru", 2021));
		service.addProduct(new ProductEntity("vivo", "android 2", "hitech", 2024));
		service.addProduct(new ProductEntity("realme", "android 9", "kolkata", 2024));

		List<ProductEntity> products = service.getAllProduct();
		for (ProductEntity p : products) {
			System.out.println(p);

		}
		System.out.println("*************************");
		System.out.println("print particular product");

		ProductEntity pe = service.getProduct("samsung");
		System.out.println(pe);

		System.out.println("**********<br> Get Product By Text");
		List<ProductEntity> prods = service.getProductByText("delhi");
		for (ProductEntity product : prods) {
			System.out.println(product);
		}
		System.out.println("product By place");
		List<ProductEntity> productByPlace = service.getProductByPlace("delhi");
		for (ProductEntity product : productByPlace) {
			System.out.println(product);
		}

		System.out.println("product By Expired warranty");
		List<ProductEntity> productByExpiredWarranty = service.getProductByWarrantyExpired(2026);
		for (ProductEntity product : productByExpiredWarranty) {
			System.out.println(product);
		}

	}
}
