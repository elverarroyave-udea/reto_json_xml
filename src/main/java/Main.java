import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class Main {

    public static final int PRETTY_PRINT_IDENT_FACTOR = 4;
    public static String XML_STRING = "";

    public static void main(String[] args) {
        System.out.println("Taller Json -- Fundamentos de Sistemas -- Elver Arroyave");

        final String filePath = "src/main/resources/XML_EMAILS_EXAMPLE.xml";
        StringBuilder content = new StringBuilder();

        //  Get xml file with string file
        XML_STRING = Tools.BufferReaderToString(filePath);

        try {
            JSONObject jsonObject = XML.toJSONObject(XML_STRING);
            String jsonPretty = jsonObject.toString(PRETTY_PRINT_IDENT_FACTOR);

            System.out.println(jsonPretty);

        } catch (JSONException e) {
            e.printStackTrace();
            System.out.println(e);
        }

    }
}
