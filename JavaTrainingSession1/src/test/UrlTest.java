public class UrlTest {

    public static void main(String[] args) {
        String url = "https://c-static-qa.copart.com/v1/AUTH_svc.qdoc00001/PIX192/a824c1cc-efaf-433a-b3dc-62ea1caed243.JPG";
        String fileName = url.substring( url.lastIndexOf('/')+1 );
        System.out.println(fileName);

        System.out.println((char)(65+25)); //65-A; 90-Z


        int i=5;
        System.out.println(i/2);

    }


}
