package other_programs;

public class CalculatorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calci obj = new Calci(15, 17);
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();

	}

}

class Calci{
	
	double valueone;
	double valuetwo;
	
	Calci(double valueone, double valuetwo){
		this.valueone = valueone;
		this.valuetwo = valuetwo;
	}
	
	void add(){
		System.out.println("addition "+(valueone+valuetwo));
	}
	
	void sub(){
		System.out.println("subraction "+(valueone-valuetwo));
	}
	
	void mul(){
		System.out.println("Multiplication "+(valueone*valuetwo));
	}
	
	void div(){
		System.out.println("Division "+(valueone/valuetwo));
	}
	
}
