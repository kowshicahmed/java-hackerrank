
public class AbsClass {

}

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }

}

class MyBook extends Book {
    @Override
    void setTitle(String s) {
        super.title = s;
    }

    @Override
    String getTitle() {
        return super.getTitle();
    }
}

//Write MyBook class here


