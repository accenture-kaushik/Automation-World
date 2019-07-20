import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassB{
	
	ClassA obj;
	
	@BeforeTest
	public void setUp() {
		obj = new ClassA();	
	}
	
	
	@Test
	public void printValueOfIinB() {
		
		obj.printValueOfIinA();
		System.out.println("I Value in Class B : " + obj.i);
		
	}

}
