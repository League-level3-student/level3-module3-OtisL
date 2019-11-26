package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String news="";
		for(int i=0; i<s.length(); i++) {
			if(i%2==0) {
				news+=s.substring(i,i+1).toLowerCase();
			}else {
				news+=s.substring(i,i+1).toUpperCase();
			}
		}
		return news;
	}

}
