package singletonPattern;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonObject object = SingletonObject.getInstance();
		object.showMessage();
	}

}
