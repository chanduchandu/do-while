class eight{
public static void main(String []args){
int max=0,i,j,count=0,c=0;
int []a=new int[]{12,23,45,12,12,56,56,67,56,22,22,22,22,21};
int b=a.length;
int []r=new int[b];
for(i=0;i<b;i++){
for(j=i+1;j<b;j++){
if(a[i]==a[j]){
count++;
}
}
if(count>c){
max=i;      
c=count;}
count=0;
}
System.out.println(a[max]);
}}

