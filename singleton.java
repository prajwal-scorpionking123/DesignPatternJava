class Singleton
{
    static Singleton obj = new Singleton();
    private int a,b,c;
    private Singleton()
    {

    }
    public static Singleton getInstance()
    {
        return obj;
    }
    public void get(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void adddition()
    {
        c=a+b;
        System.out.println("addition of two ="+c);
    }
}
public class Main {
    public static void main(String[] args)
    {
        Singleton s = Singleton.getInstance();
        s.get(20,20);
        s.adddition();
        System.out.println(s.hashCode());
    }
}
