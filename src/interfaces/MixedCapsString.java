package interfaces;

public class MixedCapsString extends SpecialString{
	
	public MixedCapsString(String s) {
		super(s);
		
	}

	@Override
	public String funkifyText(String text) {
		
	text = "tHiS Is aLsO A TeSt";
		
		return text;
	}

}
