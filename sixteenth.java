class sixteenth{
public static void main(String[]args){
if(args.length==0){
System.out.println("please enter an integer number");}
int n=Integer.parseInt(args[0]);
int i,j;
for(i=0;i<n;i++){
for(j=0;j<=i;j++){
System.out.print("*"+" ");
//System.out.println(" ");
}
System.out.println("");
}
}
}