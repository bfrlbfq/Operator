import java.util.Scanner;

/*
	Ϊ�˳�������ݸ��ӵ������Ǿ����������¼�����ݡ�
	���ʹ�ü���¼��������?Ŀǰ��͸��Ҽ�ס�ˡ�
	A:����
		import java.util.Scanner;
		��class������
	B:��������
		Scanner sc = new Scanner(System.in);
	C:��ȡ����
		int i = sc.nextInt();
*/
public class Operator
{
	public static void main(String[] args)
	{		//��������¼�����
			Scanner sc=new Scanner(System.in);
			
			System.out.println("������һ������");
			   int i=sc.nextInt();
			System.out.println("��������һ������");		 
			   int j=sc.nextInt();
			   
			   int sum=i+j;
			   int max=(i>j)?i:j;
			   boolean fg=(i==j);
				
			   System.out.println("����ǣ�"+sum);
			   System.out.println("max�ǣ�"+max);	
			   System.out.println(fg);
	}
}