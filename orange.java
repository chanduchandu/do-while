class fruit{
String name="guava";
String taste="good";
int size=3;
void eat(){
System.out.println("guava is sweet and umaami");
}
}
class apple extends fruit{
String name="apple";

void eat(){
System.out.println("apple is sweet");
}
}
class orange extends fruit{
String name="orange";

void eat(){
System.out.println("orange is sweet");
}
public static void main(String []args){
orange o=new orange();
System.out.println(o.name);
System.out.println(o.taste);
System.out.println(o.size);
o.eat();
}
}