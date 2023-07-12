package LambdaExpression;

public class LambdaTest  {

	public static void main(String[] args) {
		
		//need demo class for implementing interface
		Demo d=new Demo(); //child reference to hold child object
		LambdaFunctionalInterface d2=new Demo();//parent reference to hold child object
		System.out.println( "using demo class for implement "+d.areaOfSquare(3));		
		System.out.println( "using demo class for implement " +d2.areaOfSquare(6));
		
		//lambda expression (no need to write  Demo class) length of the code reduced
		LambdaFunctionalInterface a=(n)->{return n*n;};
		System.out.println( "excluding demo class for implement "+a.areaOfSquare(2));
		
		//add interface
		AddInteface ad=(x,y)->System.out.println("add interface "+(x+y));
		ad.add(12, 20);
		ad.add(10, 20);
		

	}


	
	
	
} 
class Demo implements  LambdaFunctionalInterface{

	@Override
	public int areaOfSquare(int n) {
		// TODO Auto-generated method stub
		return n*n;
	}}

