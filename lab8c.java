class Staff {
    int code;
    String name;

    Staff(int c, String n) {
        code = c;
        name = n;
        
    }

    void display() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
    }
}

class Teacher extends Staff {
    String subject;
    int exp;

    Teacher(int c, String n, String s, int e) {
        super(c, n);
        subject = s;
        exp = e;
    }

    void display() {
        super.display();
        System.out.println("Subject: " + subject);
        System.out.println("Experience: " + exp);
    }
}

class Typist extends Staff {
    int speed;

    Typist(int c, String n, int s) {
        super(c, n);
        speed = s;
    }

    void display() {
        super.display();
        System.out.println("Typing Speed: " + speed);
    }
}

class Regular extends Typist {
    int salary;

    Regular(int c, String n, int s, int sal) {
        super(c, n, s);
        salary = sal;
    }

    void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }
}

class Casual extends Typist {
    int daily_wages;

    Casual(int c, String n, int s, int dw) {
        super(c, n, s);
        daily_wages = dw;
    }

    void display() {
        super.display();
        System.out.println("Daily Wages: " + daily_wages);
    }
}

class Officer extends Staff {
    String dept;
    int grade;

    Officer(int c, String n, String d, int g) {
        super(c, n);
        dept = d;
        grade = g;
    }

    void display() {
        super.display();
        System.out.println("Department: " + dept);
        System.out.println("Grade: " + grade);
    }
}

public class lab8c {
    public static void main(String[] args) {

        Teacher t = new Teacher(1, "Manan", "Maths", 5);
        Officer o = new Officer(2, "Riya", "HR", 3);
        Regular r = new Regular(3, "Amit", 60, 25000);
        Casual c = new Casual(4, "Neha", 50, 500);

        System.out.println("Teacher :");
        t.display();

        System.out.println("Officer :");
        o.display();

        System.out.println("Regular Typist :");
        r.display();

        System.out.println("Casual Typist :");
        c.display();
    }
}
