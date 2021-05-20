import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data;
		int count = 0;
		int mezeracount = 0;
		
		 File fl = new File("C:\\Users\\bohac\\Downloads\\lm.txt");
		 try {
			Scanner pepiq = new Scanner(fl);
			
			String regex = "\\s";
		     Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		     
			
			while(pepiq.hasNextLine()) {
				data = pepiq.nextLine();
				for(char a: data.toCharArray()) {
					Matcher matcher = pattern.matcher(data);
					while (matcher.find()) {
						count++;
				}
				data="";
			}
		}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		 System.out.println(count);
	}

}
