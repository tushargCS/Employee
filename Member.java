//    Q3. Create a class named 'Member' having the following members:
//
//        Data members
//        1 - Name
//        2 - Age
//        3 - Phone number
//        4 - Address
//        5 - Salary
//        It also has a method named 'printSalary' which prints the salary of the members.
//        Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes
//        have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number,
//        address and salary to an employee and a manager by making an object of both of these classes and print the same.

class Member{
    int age;
  String name;
    long pno;
    String address;
    int salary;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPno() {
        return pno;
    }

    public void setPno(long pno) {
        this.pno = pno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void printSalary(){
        System.out.println(salary);
    }
}
class Employee_12 extends Member{
    String specilization;

    public static void main(String[] args) {
        Member obj= new Employee_12();
        System.out.println(obj.age);
    }

}
class Manager extends Member{
    String department;

    public static void main(String[] args) {
        Member obj= new Manager();
        System.out.println(obj.age);
    }
}
