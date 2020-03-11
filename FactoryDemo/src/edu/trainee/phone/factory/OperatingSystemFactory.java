package edu.trainee.phone.factory;

public class OperatingSystemFactory {

	public MobileOS getobj(String str)
	{
		if(str.equals("Google"))
		return new Android();
		else if(str.equals("Apple"))
		return new Ios();
		else
		return new BlackBerry();
		
	}
}
