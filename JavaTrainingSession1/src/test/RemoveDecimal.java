public class RemoveDecimal {

    public static void main(String[] args) {

        float Acv = 123.45f;
//        double temp = 123.45;
//			System.out.println(Acv);
        String temp = new Double(Acv).toString();
        System.out.println((temp));
        System.out.println(temp.indexOf('.'));
        String wsLotAcv = temp.substring(0,temp.indexOf('.'));
        System.out.println(wsLotAcv);


        String acv = String.valueOf(Acv);
        String t = acv.substring(0,acv.indexOf('.'));
        System.out.println(t);

    }

}

