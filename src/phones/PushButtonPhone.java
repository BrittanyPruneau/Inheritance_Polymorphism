package phones;
/**
 * @author Brittany Pruneau 
 * 
 * Stores information about pushbutton phones. 
 */
public class PushButtonPhone extends DeskPhone
{
	/**
	 * 					Constructor initializes the fields. 
	 * @param model		Labels the specific model of phone. 
	 * @param dimension	Describes the dimensions of a specific model of phone. 
	 * @param voltage	Describes the voltage requirements for a specific model of phone. 
	 */
	public PushButtonPhone(String model, Dimension dimension, Voltage voltage) 
	{
		super(model, dimension, voltage);
		// TODO Auto-generated constructor stub
	}
	/**
	 * Displays a pushbutton phone making a phone call to a specified number. 
	 */
	@Override
	public String call(long number)
	{
		return String.format("Pushing buttons to call %d", number); 
	}

}
