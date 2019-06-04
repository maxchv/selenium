public class StringHelper {

    public String joinStrings(String... args){
        String result = args[0];
        for (int i = 1; i < args.length; i++) {
            result += ',';
            result += args[i];
        }
        return result;
    }

    public String[] spiltStrings(String str, String separator){
        return str.split(separator);
    }
}
