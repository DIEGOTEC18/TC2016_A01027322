public class IPNotFoundException extends Exception {

    private String siteName;

    public IPNotFoundException(String siteName){

        this.siteName = siteName;

    }

    public String toString(){

        return new String("404 Not Found\n" + siteName + " doesn't exist!");

    }

}
