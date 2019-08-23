public class Pattern1 {


    public static void main(String[] args) {
int n=3;
int z=n;

        for (int i=1; i<=n+1; i++){
            for(int j=0; j<z;j++){
                System.out.print(" ");
            }
            z=z-1;

            for(int k=n; k>z  ; k--){
                System.out.print((char)(i+64));
            }
//            for (int l=n-1; l<z;l--){
//                System.out.println((char)(i+64));
//            }
            System.out.println();
        }

    }


}
