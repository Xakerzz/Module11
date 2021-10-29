
public class MainTestGeneric {

    public static  void main(String[] args) {
        MethodTest<Elephant> crateForElephant = new MethodTest<>();
        Elephant elephant = crateForElephant.getTest();
        crateForElephant.setTest(new Elephant("KOKA"));

       MethodTest<Elephant> cfr = new MethodTest<>();
       Elephant elephant1 = cfr.getTest();
       cfr.setTest(new Elephant("KOKA"));
       System.out.println(cfr.getTest().equals(crateForElephant.getTest()));
        System.out.println(cfr.toString().equals(crateForElephant.toString()));
if (cfr.toString().equals(crateForElephant.toString())){
    System.out.println(true);
    System.out.println(cfr.getTest() + " " + crateForElephant.getTest());
    System.out.println(cfr.getTest().equals(crateForElephant.getTest()));
}
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
MethodTest<Number> fgt = new MethodTest<>();
Number number = fgt.getTest();
fgt.setTest(new Number());

        System.out.println(MethodTest.ship(fgt));

    }




}
