import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test_p12 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入月份");
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		if(num==3 || num==4 || num==5)
			System.out.println(num+"月是春天");
		else if(num==6 || num==7 ||num==8)
			System.out.println(num+"月是夏天");
		else if(num==9 || num==10 || num==11)
			System.out.println(num+"月是秋天");
		else if(num==12 || num==1 || num==2)
			System.out.println(num+"月是冬天");
		else
			System.out.println("請輸入月份1~12");
		
	}

}
