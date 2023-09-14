package objectoriented;

class  Colour{
	public void m1() {
		System.out.println("Hi Im m1()");
				
	}
}
class Red extends Colour{
	public void m2() {
		System.out.println("Hi Im m2()");
	}
}


public class SingleLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Red r=new Red();
		r.m1();
		r.m2();

	}

}
