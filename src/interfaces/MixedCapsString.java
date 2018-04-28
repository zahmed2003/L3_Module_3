package interfaces;

public class MixedCapsString extends SpecialString{
	
	public MixedCapsString(String s) {
		super(s);
		
	}

	@Override
	public String funkifyText(String text) {
		
	for(int i = 0; i < text.length(); i++)
	{
		if(i%2 != 0)
		{
			text = text.substring(0, i) + Character.toUpperCase(text.charAt(i)) + text.substring(i + 1);
		}
	}
		
		return text;
	}

}
