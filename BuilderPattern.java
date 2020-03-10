
public class phonebuilder {
    private String os;
    private  int ram;
    private String processor;
    private double screenSize;
    private int battery;

    public phonebuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public phonebuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public phonebuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public phonebuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public phonebuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }
    public phone getPhone()
    {
        return new phone(os,ram,processor,screenSize,battery);
    }
}

public class phone {
    private String os;
    private  int ram;
    private String processor;
    private double screenSize;
    private int battery;

    public phone(String os, int ram, String processor, double screenSize, int battery) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {
        phone p=new phonebuilder().setOs("Android").setRam(2).getPhone();
        System.out.println(p.toString());
    }
}
