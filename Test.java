public class Test
{
    @SuppressWarnings("unlikely-arg-type")
    public static boolean isPalindrome(String str) {
        
        StringBuilder s = new StringBuilder(str.toLowerCase());
        for (int i = s.length() - 1; i >= 0; i--)
            if (!Character.isLetterOrDigit(s.charAt(i)))
                s.deleteCharAt(i);

        
        StringBuilder temp = new StringBuilder(s);
        int low = 0;
        int high = temp.length() - 1;
        while(low < high)
        {
            char ch = temp.charAt(high);
            temp.setCharAt(high, temp.charAt(low));
            temp.setCharAt(low, ch);
            low++;
            high--;
        }
        return temp.toString().equals(s);
    } 
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}