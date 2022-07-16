class MyClass {

	int height;

	MyClass() {
		System.out.println("Bricks");
		height = 5;
	}

	MyClass(int i) {
		System.out.println("Building new house that is " + i + " feet tall");
		height = i;
	}

	void info() {
		System.out.println("house is " + height + " feet tall");
	}

	void info(String s) {
		System.out.println(s + "house is " + height + " feet tall");
	}

	public static void main(String[] args) {
		MyClass t = new MyClass(10);
		t.info();
		t.info("overload method : ");
		MyClass t1 = new MyClass();
		t1.info();
	}
}