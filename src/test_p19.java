import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p19 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("請問你年滿20了嗎？");
		System.out.println("輸入Y or N");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char letter=str.charAt(0);
		
		if(letter=='y' || letter=='Y')
		{
			System.out.println("年滿18即可自行開戶");
		}
		else if(letter=='n' || letter=='N')
		{
			System.out.println("未滿18需家長或法定代理人陪同");
		}
		else
		{
			System.out.println("請輸入Y or N");
		}
	}
}
