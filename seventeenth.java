class seventeenth{
public static void main(String[]args)
{
int num=12345;
int n=num,r;
System.out.println("input is"+" "+num);
System.out.print("output is"+" ");
while(n>0){
r=n%10;
System.out.print(r);
n=n/10;
}
}
}