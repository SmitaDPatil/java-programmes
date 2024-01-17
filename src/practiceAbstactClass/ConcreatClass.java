package practiceAbstactClass;

public class ConcreatClass extends Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcreatClass cc =new ConcreatClass();
		cc.test();
		cc.test1();
		cc.test2();
		Sample.test4();
        cc.test3();
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}
	public void test3() {
		
		System.out.println("own method from concrete class");
	}

}
