package method.model.service;
import method.model.vo.Computer;
import method.model.vo.Product;
import method.model.vo.Tv;

public class Buy {
	
	public void com() {
		Product pro = new Product();
		Product com = new Computer();
		
		com.setColor("White");
		com.setSize(50);
		
		Computer c = (Computer)com;
		c.setWeight(80);
		
		if(com instanceof Computer) {
			System.out.println("Product는 Computer형변환 가능");
			Computer t = (Computer)com;
			System.out.println(t.getWeight());
			
		} else {
			System.out.println("Product는 Computer형변환 불가능");
		}
		System.out.println(pro.toString());
		System.out.println(c.toString());
		
	}
		
	
	public void tv() {
		Product product = new Tv();
		
		product.setColor("white");
		product.setSize(100);
		System.out.println(product.toString());
		
		
		
		if(product instanceof Tv) {
			System.out.println("product는 Tv로 형변환 가능(인치 추가)");
			Tv te = (Tv)product;
			te.setInch(77);
			
			System.out.println(te.toString());
			
		} else {
			System.out.println("product는 Tv로 형변환 불가능");
		}
		
	}
	
	
	
	

}
