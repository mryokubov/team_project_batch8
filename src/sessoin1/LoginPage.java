package sessoin1;

public class LoginPage {

    public String reverseStringWithLoop(String word){
        String result ="";
        for (int i = word.length()-1; i >= 0 ; i--) {
            result += word.charAt(i);
        }
        return result;

    }
}
