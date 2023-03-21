1. Create a new abstract class named “Waffle”

2. Create a new concrete method named prepareWaffle() – Print the following within this method:

”WAFFLE CONE PREPARATION

Mix all the waffle ingredients

Pour this liquid into a pan and cook

The mould machine shapes it into a waffle cone

WAFFLE CONE IS READY”

3. Create two abstract methods –

1. prepareFilling(String flavour)

2. prepareTopping(String topping)

4. Now, create the class Main. This class should extend the Waffle class. Define three methods within this Main class.

            1. prepareFilling(String flavour)

            2. prepareTopping(String topping)

            3. main() method

5. Logic for the method prepareFilling(String flavour): – Print the following within this method:

”ICE CREAM PREPARATION

Mix and boil the ingredients – milk, sugar, flavour

Refrigerate this liquid cream into a pan

Fill the waffle cone with this flavour flavoured ice cream”

6. Logic for the method prepareTopping(String topping): – Print the following within this method:

”Dip the ice cream over the chocolate cream

Dip again over the topping

Pack it and hand it to the customer”

7. Now, let’s write logic for the main() method. Use Scanner class to get the flavour and topping from the user. Create an object for the class and call the prepareWaffle(), prepareFilling(flavour) and prepareTopping(topping) method one by one.

Input Format

chocolate

nuts

Output Format

WAFFLE CONE PREPARATION

Mix all the waffle ingredients

Pour this liquid into a pan and cook

The mould machine shapes it into a waffle cone

WAFFLE CONE IS READY!

ICE CREAM PREPARATION

Mix and boil the ingredients - milk, sugar, chocolate      

Refrigerate this liquid cream into a pan

Fill the waffle cone with this chocolate flavoured ice cream

Dip the ice cream over the chocolate cream

Dip again over the nuts

Pack it and hand it to the customer

import java.lang.*;
import java.util.*;

abstract class Waffle{
    public void prepareWaffle(){
        System.out.println("WAFFLE CONE PREPARATION");
        System.out.println("Mix all the waffle ingredients");
        System.out.println("Pour this liquid into a pan and cook");
        System.out.println("The mould machine shapes it into a waffle cone");
        System.out.println("WAFFLE CONE IS READY!");
    }
    abstract void prepareFilling(String flavour);
    abstract void prepareTopping(String topping);
}
public class Main extends Waffle{
    public void prepareFilling(String flavour){
        System.out.println("ICE CREAM PREPARATION");
        System.out.println("Mix and boil the ingredients - milk, sugar, "+flavour+ " Refrigerate this liquid cream into a pan");
        System.out.println("Fill the waffle cone with this "+flavour+" flavoured ice cream");
    }
    public void prepareTopping(String topping){
        System.out.println("Dip the ice cream over the chocolate cream");
        System.out.println("Dip again over the "+topping);
        System.out.println("Pack it and hand it to the customer");


    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String flav=s.next();
        String topp=s.next();
        
        Waffle obj=new Main();
        obj.prepareWaffle();
        obj.prepareFilling(flav);
        obj.prepareTopping(topp);
        
        
    }
    
}

