package method.model.vo;

public class Product {

	private String color;
	private int size;
	
	
	public Product() {}
	
	public Product(String color, int size) {
		this.color = color;
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	
	public String toString() {
		return color + "색상 이고, 사이즈는 " + size + "입니다";
	}
	
	
	
	
}
