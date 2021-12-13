// Write a program to create a class named shape. It should contain 2 methods- draw() and erase() which should print “Drawing Shape” and “Erasing Shape” respectively.
// For this class we have three sub classes- Circle, Triangle and Square and each class override the parent class functions- draw () and erase (). 
// The draw() method should print “Drawing Circle”, “Drawing Triangle”, “Drawing Square” respectively.
// The erase() method should print “Erasing Circle”, “Erasing Triangle”, “Erasing Square” respectively.
// Create objects of Circle, Triangle and Square in the following way and observe the polymorphic nature of the class by calling draw() and erase() method using each object.
// Shape c=new Circle();
// Shape t=new Triangle();
// Shape s=new Square();



class Shape{
public void draw(){
System.out.println("drawing shape");
}
public void erase(){
System.out.println("erasing shape");
}
}

class Circle extends Shape(){public void draw(){
System.out.println("drawing circle");
}
public void erase(){
System.out.println("erasing circle");
}}
class Triangle extends Shape(){public void draw(){
System.out.println("drawing triangle");
}
public void erase(){
System.out.println("erasing triangle");
}}
class Square extends Shape(){public void draw(){
System.out.println("drawing square");
}
public void erase(){
System.out.println("erasing square");
}}
class Test{
public static void main(String [] args){
Shape c=new Circle();
c.draw();
c.erace();
Shape t=new Triangle();
t.erace();
t.draw();
Shape s=new Square();
s.erace();
s.draw();
}

}
