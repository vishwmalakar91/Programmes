//final class A //error: cannot inherit from final A
class A {
	final int i = 10;

	// final void m1(){ //m1() in B cannot override m1() in A
	void m1() {
		// i=20; error if uncommmet - cannot assign a value to final variable i
	}
}

class B extends A {
	void m1() {
	};
}