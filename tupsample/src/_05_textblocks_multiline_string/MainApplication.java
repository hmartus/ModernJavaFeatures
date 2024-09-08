package _05_textblocks_multiline_string;

public class MainApplication {
    /*
        {
            "name": "TUP",
            "username": "usertup"
        }
    */
    public static void main(String[] args) {
        String myJSON = "{\n" +
                "   \"name\": \"TUP\", \n" +
                "   \"username\": \"usertup\", \n" +
                "}";

        System.out.println(myJSON);
        System.out.println("-------------------------------");
        String myJSON2 = """
                {
                    "name": "TUP-usingMultiLineString",
                    "username": "usertup"
                }
                """;
        System.out.println(myJSON2);
    }
}
