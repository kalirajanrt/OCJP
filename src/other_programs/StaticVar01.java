package other_programs;

class StaticVar01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Class_02 obj = new Class_02();
		
		System.out.println(Class_02.addition(5, 3));
		System.out.println(Class_02.sub(5, 3));
		

	}

}

class Class_02{
	
	static int addition (int a, int b){
		return a+b;
	}
	
	static int sub (int a, int b){
		return a-b;
	}
	
}
