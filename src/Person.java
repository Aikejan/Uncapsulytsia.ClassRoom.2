import java.util.Scanner;

public class Person {
    private String fullName;
    private int age;
    private String emsill;
    private int salary;
    public Person(){

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if(age>0) {
            this.age = age;
        }else {
            System.out.println(" Age is negativ");
        }
    }

    public String getEmsill() {
        return emsill;
    }

    public void setEmsill(String emsill) {

        if (emsill.contains("@")) {
            this.emsill = emsill;
        } else {
            System.out.println("email must contains email");
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 500) {
            this.salary = salary;
        }else {
            System.out.println("Salary less than 500");
        }
    }

    @Override
    public String toString() {
        return "fullName: " + fullName +
                "\n age: " + age +
                " \nemsill: " + emsill +
                " salary: " + salary;
    }
}

