class thirteenth{
public static void main(String[]args)
{
int j,i,count=0;
for(j=10;j<=99;j++){
for(i=2;i<j;i++){
if(j%i==0){
count++;
}}
if(count==0){
System.out.println(j);}
count=0;
}

}}