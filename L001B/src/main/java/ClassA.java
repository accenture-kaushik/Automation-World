
public class ClassA{
	
	public static int i = 0;
	public void printValueOfIinA() {
		ClassC_ModifiedValue obj = new ClassC_ModifiedValue();
//		obj.changingValueOfIinC();
//		changingValueOfIinC();
		System.out.println("I Value in Class A : " + i);
		obj.changingValueOfIinC();
		
	}

}
