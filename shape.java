class shape{
void draw(){
System.out.println("Drawing shape");
}
void erase(){
System.out.println("Erasing shape");
}
public static void main(String[]args){
shape c=new circle();
shape t=new triangle();
shape s=new square();
c.erase();
c.draw();
t.erase();
t.draw();
s.erase();
s.draw();
}
}
class circle extends shape{
void draw(){
System.out.println("Drawing circle");
}
void erase(){
System.out.println("Erasing circle");
}
}
class triangle extends shape{
void draw(){
System.out.println("Drawing triangle");
}
void erase(){
System.out.println("Erasing triangle");
}
}
class square extends shape{
void draw(){
System.out.println("Drawing square");
}
void erase(){
System.out.println("Erasing square");
}
}