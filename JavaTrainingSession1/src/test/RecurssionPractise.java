public class RecurssionPractise {

    public int bunnyEars(int bunnies) {
        if(bunnies==0){
            return 0;
        }
        return 2 + bunnyEars(bunnies-1);
    }

    public static void main(String[] args) {
        RecurssionPractise rp = new RecurssionPractise();
        System.out.println(rp.bunnyEars(3));
    }

}
