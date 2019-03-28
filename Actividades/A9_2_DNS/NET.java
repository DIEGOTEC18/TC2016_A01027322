public class NET {

    private Tuple[] siteList;

    private static NET ourInstance = new NET();

    public static NET getInstance() {
        return ourInstance;
    }

    private NET() {

        siteList = new Tuple[]{new Tuple<>("179.15.220.113", "luream.net"), new Tuple<>("106.154.225.179", "fespaw.net"), new Tuple<>("34.155.216.50", "negity.net"), new Tuple<>("139.86.108.51", "senacp.net"), new Tuple<>("160.131.121.51", "medawn.net")};

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
