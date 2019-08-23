
//we can declare static variables and methods in an abstract method
public abstract class OopsAbstraction {
static int i=20;
public static void staticShow(){
    System.out.println("show static abtract");
}

    public void show(){
        System.out.println("show abtract");
    }

 abstract int RateOfInterest();
}

class ChaseBank extends OopsAbstraction{
    public int RateOfInterest() {
        return 77;
    }
}

class BOA extends OopsAbstraction{
    public int RateOfInterest(){
        return 97;
    }
}


class TestBank{
    public static void main(String[] args) {
        OopsAbstraction ob;
        ob = new ChaseBank();
        System.out.println(OopsAbstraction.i);
        OopsAbstraction.staticShow();
        ob.show();
        System.out.println(ob.RateOfInterest());

        ob = new BOA();
        System.out.println(ob.RateOfInterest());
    }

}
