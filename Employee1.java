//Q3 Write a program by creating an 'Employee' class having the following methods and print the final salary.
//
//        1 - 'getInfo()' which takes the salary, number of hours of work per day of the employee as parameter
//        2 - 'AddSal()' which adds $10 to the salary of the employee if it is less than $500.
//        3 - 'AddWork()' which adds $5 to the salary of the employee if the number of hours
//        of work per day is more than 6 hours.
        import java.util.Scanner;
public class Employee1 {
    int salary;
    int Workinghours;
    public void getInfo(){
        Scanner obj= new Scanner(System.in);
        System.out.println("enter the salary");
        salary= obj.nextInt();
        System.out.println("ENTER THE WORKING HOURS PER DAY");
        Workinghours= obj.nextInt();
    }
    public void AddSalary(){
        if(salary<500){
            salary=salary+780;
        }
    }
    public void AddWork(){
          if(Workinghours>6){
              salary=salary+390;

              System.out.println(salary);
          }
    }

    public static void main(String[] args) {
    Employee1 sc=new Employee1();
    sc.getInfo();
    sc.AddSalary();
    sc.AddWork();

    }
    }
