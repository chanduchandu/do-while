import java.util.Scanner;
class  first
{
	public static void main(String[] args) 
	{
		int n,i=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int r[]=new int[40];
		while(n>0){
			r[i++]=n%2;
			n=n/2;
		}
		for(int j=i-1;j>=0;j--)
		System.out.print(r[j]);
	}
}
