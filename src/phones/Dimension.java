package phones;
/**
 * @author Brittany Pruneau 
 */
import java.text.DecimalFormat;

public class Dimension 
{
	private double height; 
	private double width; 
	private double depth;
	/**
	 * 					Constructor initializes the fields. 
	 * @param height	Describes the height of specific model of phone. 
	 * @param width		Describes the width of specific model of phone. 
	 * @param depth		Describes the depth of specific model of phone. 
	 */
	public Dimension(double height, double width, double depth) 
	{	
		if(height <1 || width <1 || depth < 1 )
		{
			throw new IllegalArgumentException("The height, width, and depth of a dimension needs to be positive.");
		}
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	/**
	 * @returns the height
	 */
	public double getHeight() 
	{
		return height;
	}
	/**
	 * @returns the width
	 */
	public double getWidth() 
	{
		return width;
	}
	/**
	 * @returns the depth
	 */
	public double getDepth() 
	{
		return depth;
	}
	
	/**
	 * Returns the dimensions of a phone. 
	 */
	@Override
	public String toString() 
	{
		return String.format("(%.1f x %.1f x %.1f)",height, width, depth); 
	}
	
	
}
