public class OopsEncapsulation {


     public static void main(String[] args) {

        Emp e = new Emp();

        e.setEmpid(10);

         System.out.println(e.getEmpid());
    }
}


class Emp{
    private int empid;
    private String name;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}