
public class Main {
    public static void main(String[] args) {

    }

    public int strStr(String haystack, String needle) {

        for(int i = 0; i< haystack.length(); i++){

            if(haystack.startsWith(needle, i)){
                return i;
            }
        }
        return -1;

    }

}