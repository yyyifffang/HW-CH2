import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class test_p14 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("歡迎參加抽抽樂，請輸入數字1~3");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		switch(num)
		{
			case 1:
			{
				System.out.println("你抽到了一到五每天早八");
				break;
			}
			case 2:
			{
				System.out.println("你抽到了每天中午吃銀記");
				break;
			}
			case 3:
			{
				System.out.println("你抽到了學分小偷，每堂專業課老師都很涼");
				break;
			}
			default:
			{
				System.out.println("抽抽樂號碼只有1~3喔");
				break;
			}
			
		}
	}

}
