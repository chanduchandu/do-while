class eleven{
public static void main(String[]args){
int i,j;
int[][]x=new int[3][3];
int a[]=new int[9];
int max=a[0];
for(i=0;i<args.length;i++){
a[i]=Integer.parseInt(args[i]);
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
x[i][j]=a[0+(i*3 + j)];
System.out.print(x[i][j]+" ");
}
System.out.println();
}
for(i=0;i<a.length;i++)
{
	if(a[i]>max){
		max=a[i];
	}	
}
System.out.println(max);
}
}