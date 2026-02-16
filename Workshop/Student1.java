public class Student {
int id;
String name;
Student(){
this(101,"Rishikesh");
System.out.println("Default Constructor Called");
}
Student(int id,String name){
this.id=id;
this.name=name;
System.out.println(Parameterised Constructor Called");
}
void display(){
System.out.println(id + " " +name);
}
public staticvoid main(String args[]){
Student s = new Student;
s.display();
}
}