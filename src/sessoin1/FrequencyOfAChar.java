package sessoin1;

public class FrequencyOfAChar {

    public static void main(String[] args) {
        String str = "absscaaaaaaabdddd";
        char ch = 'a';

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)){
                ++frequency;
            }

        }
        System.out.println("Frenquency of " +ch+" is = " + frequency);

    }

}
