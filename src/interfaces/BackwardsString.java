package interfaces;

public class BackwardsString extends SpecialString{
	
	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String text) {
		
		text = new StringBuilder(text).reverse().toString();
		
		return text;
	}

}
