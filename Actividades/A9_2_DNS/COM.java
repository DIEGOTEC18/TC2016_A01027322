public class COM {

    private Tuple[] siteList;

    private static COM ourInstance = new COM();

    public static COM getInstance() {
        return ourInstance;
    }

    private COM() {

        siteList = new Tuple[]{new Tuple<>("179.15.220.113", "luream.com"), new Tuple<>("106.154.225.179", "fespaw.com"), new Tuple<>("34.155.216.50", "negity.com"), new Tuple<>("139.86.108.51", "senacp.com"), new Tuple<>("160.131.121.51", "medawn.com")};

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
