/* We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A 
 and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an 
 abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method 
 with the same name which returns the percentage of the students. The constructor of student A takes the 
 marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. 
 Create an object for eac of the two classes and print the percentage of marks for both the students.
 */

abstract class marks {
    public abstract float getPercentage();
}

class A extends marks {
    int ma1, ma2, ma3;
    A(int m1,int m2,int m3) {
        ma1=m1;
        ma2=m2;
        ma3=m3;

    }
    public float getPercentage() {
        float tot=((ma1+ma2+ma3)/(float)300)*100;
        return tot;
    }
}
class B extends marks {
    int ma1, ma2, ma3, ma4;
    B(int m1,int m2,int m3,int m4) {
        ma1=m1;
        ma2=m2;
        ma3=m3;
        ma4=m4;
    }
    public float getPercentage() {
        float tot=((ma1+ma2+ma3+ma4)/(float)400)*100;
        return tot;
    }
}
public class Main {
    public static void main(String[] args) {

        A obj=new A(45,56,78);
        System.out.println(obj.getPercentage());
        B obj1=new B(45,56,78,90);
        System.out.println(obj1.getPercentage());
    }
}

//OR using void stmt
abstract class marks {
    public abstract void getPercentage();
}

class A extends marks {
    int ma1, ma2, ma3;
    A(int m1,int m2,int m3) {
        ma1=m1;
        ma2=m2;
        ma3=m3;

    }
    public void getPercentage() {
        float tot=((ma1+ma2+ma3)/(float)300)*100;
        System.out.println(tot);
    }
}
class B extends marks {
    int ma1, ma2, ma3, ma4;
    B(int m1,int m2,int m3,int m4) {
        ma1=m1;
        ma2=m2;
        ma3=m3;
        ma4=m4;
    }
    public void getPercentage() {
        float tot=((ma1+ma2+ma3+ma4)/(float)400)*100;
        System.out.println(tot);
    }
}
public class Main {
    public static void main(String[] args) {

        A obj=new A(45,56,78);
        obj.getPercentage();
        B obj1=new B(45,56,78,90);
        obj1.getPercentage();
    }
}



// output:
// 59.666668
// 67.25

