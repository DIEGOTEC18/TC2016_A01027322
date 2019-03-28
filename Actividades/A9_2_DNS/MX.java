public class MX {

    private Tuple[] siteList;

    private static MX ourInstance = new MX();

    public static MX getInstance() {
        return ourInstance;
    }

    private MX() {

        siteList = new Tuple[]{new Tuple<>("179.15.220.113", "luream.mx"), new Tuple<>("106.154.225.179", "fespaw.mx"), new Tuple<>("34.155.216.50", "negity.mx"), new Tuple<>("139.86.108.51", "senacp.mx"), new Tuple<>("160.131.121.51", "medawn.mx")};


    }

    public String search(String siteName) throws IPNotFoundException{

        for(int i = 0; i < siteList.length; i++){

            if(siteName.equals(siteList[i].value)){

                return siteList[i].key.toString();

            }

        }

        throw new IPNotFoundException(siteName);

    }

}
