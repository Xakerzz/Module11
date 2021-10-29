public class MethodTest <T> {


    private T test;

    public MethodTest(T test) {
        this.test = test;
    }


    public MethodTest() {

    }



    public T getTest() {
        return test;
    }

    public void setTest(T test) {
        this.test = test;
    }

    public static <T extends Elephant> Elephant ship(MethodTest<?> stuff){
        System.out.println("Preparing " + stuff);
        Number <T> hhh = new Number<>();
        System.out.println(hhh.getA()+1);
        System.out.println(stuff.toString());
        return new Elephant("Hi");
    }

    @Override
    public String toString() {
        return "MethodTest{" +
                "test=" + test +
                '}';
    }
}


