package method.model.vo;

public class Tv extends Product{

	private int inch;

	public Tv() {}

	public Tv(String color, int size, int inch) {
		super(color, size);
		this.inch = inch;
	}
	
	
	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public String toString() {
		return "Tv 의 색상은 " + super.toString() + " 인치는 " + inch;
		
	}




















}
