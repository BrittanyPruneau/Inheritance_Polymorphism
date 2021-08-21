package phones;
/**
 * @author Brittany Pruneau 
 * 
 * Holds information about a rotary phone. 
 */
public class RotaryPhone extends DeskPhone
{
	/**
	 * 					Constructor initializes the fields. 
	 * @param model		Labels the specific model of phone. 
	 * @param dimension	Describes the dimensions of a specific model of phone. 
	 * @param voltage	Describes the voltage requirements for a specific model of phone. 
	 */
	public RotaryPhone(String model, Dimension dimension, Voltage voltage) 
	{
		super(model, dimension, voltage);
		
	}
	/**
	 * Returns a rotary phone making a phone call. 
	 */
	@Override
	public String call(long number)
	{
		return String.format("Rotating the dial to call %d", number);
	}
}
