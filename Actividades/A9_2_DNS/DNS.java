public class DNS {

    private COM com;
    private NET net;
    private MX mx;
    private GOB gob;

    public DNS(){

        com = COM.getInstance();
        net = NET.getInstance();
        mx = MX.getInstance();
        gob = GOB.getInstance();

    }

    public void search(String siteName){

        String[] siteArray = siteName.split("\\.");

        //System.out.println(siteArray[2]);

        switch (siteArray[1]){

            case "gob":

                try {

                    System.out.println(gob.search(siteName));

                } catch (IPNotFoundException e){

                    System.out.println(e.toString());

                }

                break;

            case "net":

                try {

                    System.out.println(net.search(siteName));

                } catch (IPNotFoundException e){

                    System.out.println(e.toString());

                }

                break;

            case "mx":

                try {

                    System.out.println(mx.search(siteName));

                } catch (IPNotFoundException e){

                    System.out.println(e.toString());

                }

                break;

            case "com":

                try {

                    System.out.println(com.search(siteName));

                } catch (IPNotFoundException e){

                    System.out.println(e.toString());

                }

                break;

            default:

                System.out.println(siteName + " does not exist in any domain list in this DNS.");

                break;

        }

    }

}
