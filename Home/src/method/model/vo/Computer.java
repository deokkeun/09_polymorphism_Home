package method.model.vo;

public class Computer extends Product{
	
	private int weight;
	
	public Computer() {}

	public Computer(String color, int size, int weight) {
		super(color, size);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String toString() {
		return "컴퓨터의 색상은 " + super.toString() + " 무게는 " + weight ;
	}
	
	
	
	
	

}
