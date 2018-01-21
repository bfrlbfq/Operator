import java.util.Scanner;

/*
	为了程序的数据更加的灵活，我们决定加入键盘录入数据。
	如何使用键盘录入数据呢?目前你就给我记住了。
	A:导包
		import java.util.Scanner;
		在class的上面
	B:创建对象
		Scanner sc = new Scanner(System.in);
	C:获取数据
		int i = sc.nextInt();
*/
public class Operator
{
	public static void main(String[] args)
	{		//创建键盘录入对象
			Scanner sc=new Scanner(System.in);
			
			System.out.println("请输入一个数：");
			   int i=sc.nextInt();
			System.out.println("请在输入一个数：");		 
			   int j=sc.nextInt();
			   
			   int sum=i+j;
			   int max=(i>j)?i:j;
			   boolean fg=(i==j);
				
			   System.out.println("结果是："+sum);
			   System.out.println("max是："+max);	
			   System.out.println(fg);
	}
}