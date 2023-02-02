// Write a Java program to illustrate the concept of class with single and multi-level
// inheritance.

class Employee {
    int baseSalary;
    Employee() {
        baseSalary = 10000;
    }
}

class Developer extends Employee {
    int dev_bonus;
    Developer() {
        dev_bonus = 30000;
    }
    void printSalary() {
        System.out.println("The salary of a developer is " + (baseSalary + dev_bonus));
    }
}

class DevOps extends Developer {
    int devops_bonus;
    DevOps() {
        devops_bonus = 20000;
    }
    void printSalary() {
        System.out.println("The salary of a DevOps is " + (baseSalary + dev_bonus + devops_bonus));
    }
}

class Main {
    public static void main(String[] args) {
        Developer D = new Developer();
        D.printSalary();

        DevOps De = new DevOps();
        De.printSalary();   
    }
}