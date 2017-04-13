class eighteenth{
public static void main(String[]args)
{
	if(args.length==0){
System.out.println("please enter an integer number");}
int num=Integer.parseInt(args[0]);
int n=num,sum=0;
while(n>0){
int r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(sum==num)
System.out.println(num+" "+"is a palindrome");
else
System.out.println(num+" "+"is not a palindrome");
}
}