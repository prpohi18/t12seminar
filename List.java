import java.util.*;

public class List{
	 public static void main (String[] args){
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("kartul");
		list1.add("banaan");
		list1.add("porgand");
        System.out.println(list1);
		list1.add(1, "apelsin");
		System.out.println(list1);
		list1.remove(1);
		System.out.println(list1);
	 }
}

/*  [kartul, banaan, porgand]
	[kartul, apelsin, banaan, porgand]
	[kartul, banaan, porgand]*/
