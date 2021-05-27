
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
		int count2 = 0;
		
		 File fl = new File(".//lm.txt");
		 try {
			Scanner pepiq = new Scanner(fl);
			
			String regex = "\\s";
			String regex2 = "\\b";
		     Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		     Pattern pattern2 = Pattern.compile(regex2, Pattern.MULTILINE);
		     
			
			while(pepiq.hasNextLine()) {
				data = pepiq.nextLine();
				Matcher matcher2 = pattern2.matcher(data);
				while (matcher2.find()) {
					count2++;
				}
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
		 System.out.println("Počet mezer: " + count);
		 System.out.println("Počet slov: " + count2/2);
	}

}
