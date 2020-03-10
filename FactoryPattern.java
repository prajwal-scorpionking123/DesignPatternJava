public interface os {
    public void specs();
}

public class IOS implements os {
    public void specs()
    {
        System.out.println("Most secure operating system");
    }
}
public class Android implements os{

    @Override
    public void specs() {
       System.out.println("Powerful OS");
    }
}
public class Windows implements os {

    @Override
    public void specs() {
        System.out.println("I am going to die");
    }
}
public class OsFactory {
    public os getInstance(String str)
    {
        if(str.equals("open"))
        {
            return new Android();
        }
        else if(str.equals("closed"))
        {
            return new IOS();
        }
        else {
            return new Windows();
        }
    }
}
public class Main {

    public static void main(String[] args) {
        OsFactory ops = new OsFactory();
        os obj = ops.getInstance("open");
        os obj1= ops.getInstance("closed");
        obj.specs();
        obj1.specs();
    }
}
