import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test_p16 {
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入F或M");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char letter =str.charAt(0);
		
		switch(letter)
		{
			case'F':
			{
				System.out.println("F是女生");
				break;
			}
			case'M':
			{
				System.out.println("M是男生");
				break;
			}
			default:
			{
				System.out.println("請輸入F或M");
				break;
			}
		}
		
	}

}
