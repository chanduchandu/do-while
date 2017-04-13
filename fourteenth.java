class fourteenth{
public static void main(String[]args)
{
if(args.length==0){
System.out.println("please enter an integer number");}
int num=Integer.parseInt(args[0]);
int count=0,i;
if(num==0){
System.out.println(num+" "+"is neither prime nor composite ");
}
if(num==1){
System.out.println(num+" "+"is neither prime nor composite ");
}
if(num>1){
for(i=2;i<num;i++){
if(num%i==0){
count++;
}}
if(count==0)
System.out.println(num+" "+"is a prime number");
else
System.out.println(num+" "+"is not a prime number");
}
}}