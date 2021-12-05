public class Test1 {
    public static void main(String[] args) {
        Student1 obj= new Student1("tushar",23);
        Student1 obj1= new Student1("uma",67);
        Student1 obj2= new Student1("kapil",35);

        if(obj.percentage>obj1.percentage && obj.percentage>obj2.percentage){
            System.out.println("name of topper "+obj.name);
            System.out.println("percentage "+obj.percentage);
        }
       else if(obj1.percentage> obj.percentage && obj1.percentage> obj2.percentage){
            System.out.println("name of topper "+obj1.name);
            System.out.println("percentage "+obj1.percentage);
        }
       else if(obj2.percentage> obj.percentage && obj2.percentage>obj1.percentage) {
            System.out.println("name of topper "+obj2.name);
            System.out.println("percentage "+obj2.percentage);

        }    }}


class Student1{
    String name;
    double percentage;
    public Student1(String n,double percentage) {
        name = n;
        this.percentage = percentage;
    }

}
