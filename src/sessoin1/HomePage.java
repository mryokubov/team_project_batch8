package sessoin1;

public class HomePage {
    public String reverseString(String word){
        StringBuilder stringBuilder = new StringBuilder(word);
        String reverseWord = stringBuilder.reverse().toString();


        return reverseWord;
    }
    public static void main(String[] args) {
        HomePage homePage  = new HomePage();
        System.out.println( homePage.reverseString("maryna"));


    }
}
