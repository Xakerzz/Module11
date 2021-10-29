import java.io.Serializable;

public class Number<T> implements Serializable {

    private int a;
    private String str;

    public Number() {
        this.str ="WTF";
        this.a = 5;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Number{" +
                "a=" + a +
                ", str='" + str + '\'' +
                '}';
    }
}
