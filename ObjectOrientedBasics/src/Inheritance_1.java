import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Inheritance_1 {
}


class Animal{
    void walk()
    {
        System.out.println("I am walking");
    }
}
class Bird extends Animal
{
    void fly()
    {
        System.out.println("I am flying");
    }
    void sing()
    {
        System.out.println("I am singing");
    }
}

