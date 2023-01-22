package sessoin1;

public class LoginPage {
    public static void main(String[] args) {

        System.out.println(new LoginPage().reverseStringWithLoop("Kevin Lee"));
    }

    public String reverseStringWithLoop(String word){
        String result ="";
        for (int i = word.length()-1; i >= 0 ; i--) {
            result += word.charAt(i);
        }
        return result;

    }
}
