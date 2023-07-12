package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionLambda {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<>();
		al.add(12);
		al.add(1);
		al.add(43);
		al.add(32);
		al.add(18);
		al.add(22);
		System.out.println(al);
		Collections.sort(al, new MyComparator());
		System.out.println(al);
		
		//using comparator to sort and terenary condition 
		Comparator<Integer> c=(al1,al2)->(al1<al2)?-1:(al1>al2)?1:0;
		Collections.sort(al, c);
		System.out.println("Direct comparato using" +al);

		
		
	}

}
class MyComparator implements Comparator<Integer>{

	
	public int compare(Integer o1, Integer o2) {
		if(o1<o2) {		return -1;}
		else if (o1>02){	return 1;}
		else return 0;
	}

	}
