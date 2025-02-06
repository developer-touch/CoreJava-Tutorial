import java.util.*;

public class AnnotationProgramming {
	private int a = 10;

	@Override
	public String toString(){
		return "a="+a;
	}
	//@SuppressWarnings(value={"unchecked"})
	//@SuppressWarnings(value={"unchecked","deprecation"})
	@SuppressWarnings({"unchecked","deprecation"})
	//@SuppressWarnings("unchecked")
	//@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		AnnotationProgramming ap = new AnnotationProgramming();
		System.out.println(ap);
		System.out.println("********************************");
		List list = new ArrayList();
		list.add("a");
		System.out.println(list);
		System.out.println("********************************");
		Date date = new Date();
		System.out.println("Cuurent Month : "+date.getMonth());
	}
}
