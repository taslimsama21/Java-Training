package edu.trainee.phone.factory;

public class MainFactory {

	public static void main(String args[])
	{
		OperatingSystemFactory osfobj = new OperatingSystemFactory();
		MobileOS obj = osfobj.getobj("Google");
		MobileOS obj2 = osfobj.getobj("Apple");
		MobileOS obj3 = osfobj.getobj("Hello");
		obj.showOSType();
		obj2.showOSType();
		obj3.showOSType();
		
	}
	
}
