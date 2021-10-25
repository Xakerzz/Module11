import java.util.Arrays;

public class NewOfArray {
    public static void main(String[] args) {
       char [] charArray  = new char[5];
       charArray[0]= 'r';
       charArray[1]= 'a';
       charArray[2]= 'w';
       charArray[3]= 'c';
       charArray[4]= 'h';
       Arrays.sort(charArray);

       Arrays.fill(charArray,'f');
        System.out.println(charArray);
    }
}
