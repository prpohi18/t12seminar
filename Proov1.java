public class Proov1{
	public static void main(String[] arg){
		Konto k1=new Konto("EE9687");
		Konto k2=new Konto("EE8967");
		System.out.println(k1.kasOlemas());
		System.out.println(k1.lisaSumma(5));
		Kontor k=new Kontor();
		System.out.println(k.kontoSisu("ABC"));
		System.out.println(k.kontoSisu("EE8967"));
		System.out.println(k.ylekanne("EE8967", "EE9687", 2));
		
	}
		
}