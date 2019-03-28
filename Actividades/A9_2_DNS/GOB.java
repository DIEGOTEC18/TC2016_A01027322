public class GOB {

    private Tuple[] siteList;

    private static GOB ourInstance = new GOB();

    public static GOB getInstance() {
        return ourInstance;
    }

    private GOB() {

        siteList = new Tuple[]{new Tuple<>("179.15.220.113", "luream.gob"), new Tuple<>("106.154.225.179", "fespaw.gob"), new Tuple<>("34.155.216.50", "negity.gob"), new Tuple<>("139.86.108.51", "senacp.gob"), new Tuple<>("160.131.121.51", "medawn.gob")};

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
