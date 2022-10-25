import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p10 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("猜猜我的生日，提示11月份的天蠍座");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		if(num==1105)
		{
			System.out.println("恭喜你猜對了");
		}
		else
		{
			System.out.println("你猜錯了，再見");
		}
	}

}
