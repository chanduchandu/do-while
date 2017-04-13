import java.util.Scanner;
class third
{
public static void main(String []args)
{
third th=new third();
System.out.println(th.decToBin());
}
public int decToBin(){
int dec=0;

Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int p=0;
int x=(int)(Math.log10(a)+1);
System.out.println(x);
//int a=Integer.parseInt(binary);
for(int i=0;i<x;i++)
{
int b=a%10;

if(b==0){
p++;
}
else
{
dec+=b*Math.pow(2,p);
p++;
}
a=a/10;
}
return dec;
}

}