package week3.day2;

public class Desktop implements HardWare,SoftWare{

	public void softwareResources() {
		// TODO Auto-generated method stub
		
		System.out.println("Software is Windows OS");
		
	}

	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Hardware is Intel");
		
	}
	
	public static void main(String[] args) {
		
		Desktop d=new Desktop();
		d.hardwareResources();
		d.softwareResources();
	}

}
