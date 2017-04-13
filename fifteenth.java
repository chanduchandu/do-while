class fifteenth{
public static void main(String[]args){
int num=56765;
int n=num;
int sum=0,r;
for(;n>0;){
r=n%10;
sum=sum+r;
n=n/10;
}
System.out.println(num+"->"+sum);
}
}