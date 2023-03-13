/*
1. pre defined method 
2. user defined 
3. instance - using public and obj
4. static - called directly - name()
5. accessor -- get - getter 
6. mutator - setter - set
7. abstract 
*/
public class Stu{
    private int roll=8988;
    private String name="yuva";
    
    public int getRoll(){        //accessor/getter method--- returns(int, string) ---get keyword 
        return roll;
    }
    public void setRoll(int roll){          //setter/modifier/mutator method--- does not return (void) -- set keyword 
        this.roll=roll;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    
    public void Display(){
        System.out.println(roll);
        System.out.println(name);

    }
    public static void main(String args[]) {
        Stu obj=new Stu();
        obj.Display();
    } 
}
