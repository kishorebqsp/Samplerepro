package app;

public class Electricityapp {
	public int costelectricity(int unit,String type)
	{
		if(type.equalsIgnoreCase("home"))
		{
			return unit*3;
		}
		if(type.equalsIgnoreCase("comm"))
		{
			return unit*5;
		}
		return 0;
		
	}

}
