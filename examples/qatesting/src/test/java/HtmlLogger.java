import java.io.FileNotFoundException;
import java.io.PrintStream;

public class HtmlLogger {
    private static HtmlLogger ourInstance;
    private PrintStream htmlStream;
    private String htmlFile;

    public static HtmlLogger getInstance() {
        if (ourInstance == null) {
            ourInstance = new HtmlLogger("test_resutl.html");
        }
        return ourInstance;
    }

    public void startLogger() {
        htmlStream.println("<!DOCTYPE html>" +
                "<html>" +
                "<head>" +
                "<title>MyTest Result</title>" +
                "</head>" +
                "<body>");
    }

    public void testSuccess(String method, String msg) {
        htmlStream.println("<section>" +
                "<header>" +
                "<h2 style='color: green;'>Test method " + method + "</h2>" +
                "</header>" +
                "<div>" + msg + "</div>" +
                "</section>"
        );
    }

    public void testFail(String method, String errMsg) {
        htmlStream.println("<section>" +
                "<header>" +
                "<h2 style='color: red;'>Test method " + method + "</h2>" +
                "</header>" +
                "<div>Error: " + errMsg + "</div>" +
                "</section>"
        );
    }

    public void endLogger() {
        htmlStream.println("</body></html>");
        htmlStream.close();
        htmlStream = null;
    }

    private HtmlLogger(String html_file) {
        this.htmlFile = html_file;
        try {
            htmlStream = new PrintStream(htmlFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
