import java.util.Scanner;
class twenty{
public static void main(String[]args)
{
int num1,num2,total,choice;
char ch;
do{
System.out.println("1. Add "+"2. Sub");
Scanner sc=new Scanner(System.in);
System.out.println("enter choice  value");
choice=sc.nextInt();
System.out.println("enter 1st value");
num1=sc.nextInt();
System.out.println("enter 2nd value");
num2=sc.nextInt();
switch(choice){
case 1:
total=num1+num2;
System.out.println(total);
break;
case 2:
total=num1-num2;
System.out.println(total);
break;
default:
System.out.println("enter correct values");
}
System.out.println("Do you want to continue (y/n)");
ch=sc.next().charAt(0);
}
while(ch=='y');
}}