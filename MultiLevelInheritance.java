package objectoriented;
class Vehicle{
	public void CarWashGuideLines() {
		System.out.println("use water to wash");
	}
}
class  TwoWheeler extends Vehicle{
	public void Services() {
		System.out.println("service the two wheelers once for 2000km of ride");
	}
}
class KTM extends TwoWheeler{
	public void RidingSafety() {
		System.out.println("wear helmet");
		
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KTM k=new KTM();
		k.CarWashGuideLines();
		k.Services();
		k.RidingSafety();
		

	}

}

