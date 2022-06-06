package stream;
import java.util.*;
public class minMaxusingStream {
	public static void main(String arsgs[]) {
		
			
			List<Integer> numb = new ArrayList<>();
			numb.add(21);
			numb.add(33);
			numb.add(-41);
			numb.add(57);
			numb.add(30);
			numb.add(30);
			numb.add(72);
			numb.add(-45);
			
			System.out.println(numb);
			
			Integer minNum = numb.stream().min((s1,s2) -> s1.compareTo(s2)).get();
			System.out.println("Minimum number in the list is : " +minNum);				
			
			Integer maxNum = numb.stream().max((s1,s2) -> s1.compareTo(s2)).get();
			System.out.println("Maximum Number in the list is : "+ maxNum);				

			
	}

}
