package phones;
/**
 * @author Brittany Pruneau 
 * 
 * Holds information about phones and what phones can do.
 */
import java.util.Random;
import java.util.Scanner;

public class SmartPhone extends Phone
{
	private int storage; 
/**
 * 					Constructor initializes the fields. 
 * @param model		Describes the model of phone. 
 * @param dimension Holds the dimensions to a specified phone. 
 * @param storage	Holds the amount of memory in the phone. 
 */
	public SmartPhone(String model, Dimension dimension, int storage) 
	{
		super(model, dimension);
		
		if(storage <1)
		{
			throw new IllegalArgumentException("Storage needs to be assigned a positive value.");
		}
		this.storage = storage; 
		// TODO Auto-generated constructor stub
	}
	/**
	 * Returns a smart phone making a phone call. 
	 */
	@Override
	public String call(long number)
	{	
		return "Calling " + number + " by selecting the number"; 	
	}
	/**
	 * 
	 * @returns Browsing the web. 
	 */
	public String browse()
	{
		return "Browsing the web"; 
	}
	/**
	 * 
	 * @returns Taking a horizontal or vertical picture. 
	 */
	public String takePicture()
	{
		Random r = new Random(); 
		return r.nextBoolean() ? "Taking a horizontal picture" : "Taking a vertical picture"; 
	}
	/**
	 * Returns the model phone, it's dimensions, and the amount of storage it has. 
	 */
	@Override
	public String toString() 
	{
		return super.toString() + " " + storage + "GB"; 
	}
	
	
}
