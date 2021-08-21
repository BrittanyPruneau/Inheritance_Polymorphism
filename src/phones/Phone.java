package phones;
/**
 * @author Brittany Pruneau 
 * 
 * Holds information about phones, such as model, dimensions and memory. 
 */
public abstract class Phone 
{
	private String model;
	private Dimension dimension; 

	/**
	 * 					Constructor initializes the fields. 
	 * @param model		Labels the specific model of desk phone. 
	 * @param dimension Describes the dimensions of the phone. 
	 */
	protected Phone(String model, Dimension dimension) 
	{
		this.model = model;
		this.dimension = dimension; 
	} 
	/**
	 * 
	 * @param number Phone number being called. 
	 * @returns How a specific phone makes a phone call. 
	 */
	public abstract String call(long number);

	/**
	 * Returns the model of phone and its dimensions. 
	 */
	@Override
	public String toString() 
	{
		return model + " " + dimension; 
	}

}
