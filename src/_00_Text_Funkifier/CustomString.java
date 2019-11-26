package _00_Text_Funkifier;

public class CustomString extends SpecialString{

	public CustomString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String news=s;
		news=news.toUpperCase();
		System.out.println(news);
		return news;
	}
}
