package ii_dry.iv_use_constants_and_configuration_files;

//before DRY
class Config1 {
    public void connect() {
        //modifying name, requires modification in entire codebase
        System.out.println("Connecting to http://example.com");
    }
}

//after DRY
class Config {
    public static final String BASE_URL = "http://example.com";
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Connecting to : " + Config.BASE_URL);
    }
}
