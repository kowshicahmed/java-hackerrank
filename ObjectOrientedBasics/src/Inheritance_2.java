public class Inheritance_2 {
}
class Arithmetic {
    String name;

    public Arithmetic() {
        this.name = "Arithmetic";
    }

    public String add(int a, int b) {
        return Integer.toString(a+b);
    }

    public String getName() {
        return name;
    }
}

class Adder extends Arithmetic {
    Arithmetic Class;

    public Adder() {
        super();
        Class = new Arithmetic();
    }
}
