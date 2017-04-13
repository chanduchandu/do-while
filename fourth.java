import java.util.Scanner;
class fourth
{
	public static void main(String []args){
int i;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(i=2;i<n;i++)
{
if(n%i==0)
{
System.out.println(i);
break;
}
}
}}