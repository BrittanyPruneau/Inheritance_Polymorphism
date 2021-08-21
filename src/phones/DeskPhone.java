package phones;
/**
 * @author Brittany Pruneau 
 * 
 * Holds information about different types of desk phones.
 */
public abstract class DeskPhone extends Phone
{
	private Voltage voltage; 
	private boolean connected = false;
/**
 * 					Constructor initializes the fields. 
 * @param model		Labels the specific model of desk phone. 
 * @param dimension Describes the dimensions of the phone. 
 * @param voltage	Holds the voltage values for each type of phone.
 */
	protected DeskPhone(String model, Dimension dimension, Voltage voltage) 
	{
		super(model, dimension);
		this.voltage = voltage;
		
	}
	/**
	 * Plugs the phone into the wall. 
	 */
	public void plugIn()
	{
		connected = true; 
	}
	/**
	 * Unplugs the phone from the wall. 
	 */
	public void unplug()
	{
		connected = false; 
	}
	/**
	 * Lets us know if the phone is or is not connected. 
	 * @return
	 */
	public boolean isConnected()
	{
		return connected; 
		
	}
	/**
	 * Returns the model, dimensions and voltage requirements for a specific model of desk phone. 
	 */
	@Override
	public String toString() 
	{
		String s = (connected) ? "connected" : "not connected";
		return super.toString() + " " + voltage + " " + " " + s;
	}
}
