public class Elephant <T> {
    private String elef;

    public Elephant(String elef) {
        this.elef = elef;
    }

    public String getElef() {
        return elef;
    }

    public void setElef(String elef) {
        this.elef = elef;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "elef='" + elef + '\'' +
                '}';
    }

    public void kol(){

    }
}
