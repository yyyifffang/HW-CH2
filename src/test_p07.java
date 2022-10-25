import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test_p07
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("猜猜看我的生日，提示11月的天蠍座");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		if(num==1105)
		{
			System.out.println("恭喜你猜對了");
			System.out.println("但是沒有獎品");
		}
			System.out.println("猜猜樂結束");
	}	
}