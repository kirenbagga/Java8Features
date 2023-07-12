package FunctionalInterface;

@FunctionalInterface
public interface ParentOne {

	public void add(int a, int b);
	//public void m2(int a, int b); once we annotate @FunctionalInterface it must contain only one abstract method

	static void  sub(){}
	default void m1(){}
}
