Aggregation 

- "Have a " relationship
- May have
- special type of association
-Life time of Component object is independent from its container object

E.g A school has one student

class Student {
String name;
Student () {name=null; }
Student (String n) {name=n; }
void setName(String n) {name=n;}
String getName() { return name;}
}
class School{
Student  st;
School (  ) { st=null;}
School (Student s){st=s;}
void studentName(){
System.out.println(st.getName());
}
}
class Test{
public static void main (String a[]){
Student st=new Student("Imran");
School s= new School(st);
s.studentName();
}
}
......................................
Problem : Add Ac as Aggregate object in car

class Engine{
void start() {
System.out.println("Engine Start");
}
}
class Body{
void type() {
System.out.println("Saloon Type");
}
class Ac{
void cool() {
System.out.println("Super Cool");
}
class Car{
Engine e;
Body b;
Ac ac;
Car () { e=new Engine();
         b= new Body();
         ac=null;        
}
Car (Ac p) { e=new Engine();
         b= new Body();
         ac=p;        
}
void specification(){
e.start();
b.type();
if (ac!=null)
    ac.cool();
}
}
class Test{
public static void main(String a[]){
Ac ac= new AC();
Car c= new Car(ac);
c.specification();
}
}
........................................
Same with Data Members

class Engine{
int hrp;
Engine () { }
Engine(int hp) { hrp=hp;}
void start() {
System.out.println("Engine Power "+hrp);
}
}
class Body{
int size;
Body()  {}
Body(int s){size=s;}
void type() {
System.out.println("Saloon Size "+size);
}
}
class Car{
Engine e;
Body b;
int price;
Car () { e=new Engine();
         b= new Body();
}
Car (int p,int hp,int s) { 
e=new Engine(hp);
b= new Body(s); 
price=p; 
}
void specification(){
e.start();
b.type();
System.out.println("Car Price "+price);
}
}

class Test{
public static void main(String a[]){
Car c= new Car(1000,800,5);
c.specification();

}
}
..................................................................................
Difference between aggregation and composition
.............................................................................
Composition is more restrictive. When there is a composition between two objects, the composed object cannot exist without the other object. 
This restriction is not there in aggregation. Though one object can contain the other object, there is no condition that the composed object must exist. The existence of the composed object is entirely optional. In both aggregation and composition, direction is must. The direction specifies, which object contains the other object.

Example: 

A Library contains students and books. Relationship between library and student is aggregation. Relationship between library and book is composition. A student can exist without a library and therefore it is aggregation. A book cannot exist without a library and therefore its a composition.
......................................................................................
