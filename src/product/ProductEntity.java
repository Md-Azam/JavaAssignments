package product;

public class ProductEntity {
	private String name;
	private String type;
	public String place;
	private int warranty;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	public ProductEntity(String name, String type, String place, int warranty) {
		super();
		this.name = name;
		this.type = type;
		this.place = place;
		this.warranty = warranty;
	}
	public ProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProductEntity [name=" + name + ", type=" + type + ", place=" + place + ", warranty=" + warranty + "]";
	}

	

}
