package ss18_String_Regex.Bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static final String STRING_Regex = "^[CAP][0-9]{4}[GHIKLM]";

    public void String(){

    }
public boolean validate(String regex){
    Pattern pattern=Pattern.compile(STRING_Regex);
    Matcher matcher=pattern.matcher(regex);
    return matcher.matches();
}
}
