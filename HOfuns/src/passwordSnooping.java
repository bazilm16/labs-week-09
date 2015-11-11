
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class passwordSnooping {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner src = new Scanner(new File("passwords.txt/x.txt"));
		List<String> passwords = new LinkedList<>();
		while(src.hasNextLine()){
			passwords.add(src.nextLine());
		}
		src.close();
		System.out.println(passwords.get(0));
		Stream<String> stream = (passwords.stream());
		System.out.println(
				stream.map(pw -> pw.toLowerCase()).collect(Collectors.toList()).get(0));
	}

}
