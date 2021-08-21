package phones;
/**
 * @author Brittany Pruneau 
 * 
 * Displays information about desktop phones and smart phones. 
 */
import java.util.Random;

public class TestClient 
{
	public static void main(String[] args) 
	{
		Dimension d1 = new Dimension(143, 208, 119); 
		RotaryPhone rotaryPhone = new RotaryPhone("Model 500", d1, Voltage.V110);
		
		Dimension d2 = new Dimension(178, 228, 127); 
		PushButtonPhone pushButton = new PushButtonPhone("Cortelco 2500 ", d2, Voltage.DUAL);
		
		Dimension d3 = new Dimension(145.6, 68.2, 7.9); 
		SmartPhone sp1 = new SmartPhone("Pixel3", d3, 128);
		
		Dimension d4 = new Dimension(138.4, 67.3, 7.3);
		SmartPhone sp2 = new SmartPhone("iPhone8", d4, 64);

		System.out.println("Various Phones:");
		System.out.println(rotaryPhone);
		System.out.println(pushButton);
		System.out.println(sp1);
		System.out.println(sp2);
		
		String s = rotaryPhone.call(8019574111L); 
		System.out.println(s);
		System.out.println();
		
		
		rotaryPhone.plugIn();
		pushButton.plugIn(); 
		Random r = new Random(); 
		if(r.nextBoolean())
		{
			pushButton.unplug();
		}
		else
		{
			rotaryPhone.unplug();
		}
		
		
		Phone [] phones = {rotaryPhone, pushButton, sp1, sp2};  
		System.out.println("Array Elements:");
		for(Phone p : phones)
		{
			System.out.println(p);
			if(p instanceof RotaryPhone)
			{
				RotaryPhone t = (RotaryPhone)p;
				System.out.println(t.call(8019574111L));
			}
			if(p instanceof PushButtonPhone)
			{
				PushButtonPhone t = (PushButtonPhone)p; 
				System.out.println(t.call(8019574111L));
			}
			if(p instanceof SmartPhone)
			{
				System.out.println(((SmartPhone) p).call(8019574111L));
				System.out.println(((SmartPhone)p).browse());
				System.out.println(((SmartPhone) p).takePicture());
			}
			System.out.println();
		}

	}

}
