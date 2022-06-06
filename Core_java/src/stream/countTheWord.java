package stream;
import java.util.*;

public class countTheWord {
public static void main(String[] args) {
		
		List<String> namelist = new ArrayList<>();
		namelist.add("Akhilesh");
		namelist.add("Disha");
		namelist.add("HarshHingu");
		namelist.add("Kshitij");
		namelist.add("Pragati");
		namelist.add("Nimisha");
		namelist.add("Emu");
		
		Long count = namelist.stream().filter(s -> s.length() > 5).count();
		System.out.println("Total name with more than 5 lenth is : "+count);  
	}
}
