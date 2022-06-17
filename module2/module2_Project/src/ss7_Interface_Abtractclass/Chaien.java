package ss7_Interface_Abtractclass;

public class Chaien extends Doremon  {
    private String xuka;


    public Chaien(String xuka) {
        this.xuka = xuka;
    }

    public String getXuka() {
        return xuka;
    }

    public void setXuka(String xuka) {
        this.xuka = xuka;
    }

    @Override
    public String toString() {
        return "Chaien{" +
                "xuka='" + xuka + '\'' +
                '}';
    }

    @Override
    public String Nobita() {
        return "123";
    }
}
