package interfaces;

public abstract class SpecialString implements TextFunkifier{
	protected String s;
	
	public SpecialString(String s) {
		this.s = funkifyText(s);
	}

	public String toString() {
		return s;
	}
}
