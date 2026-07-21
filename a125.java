public class a125 {
    public boolean isPalindrome(String s) {
        int low=0,high=s.length()-1;
        while(low<high){
            if(!Character.isLetterOrDigit(s.charAt(low))) low++;
            else if(!Character.isLetterOrDigit(s.charAt(high))) high--;
            else{
              char a=Character.toLowerCase(s.charAt(low));
              char b=Character.toLowerCase(s.charAt(high));
              if(a==b) {
                low++;high--;
              }
              else return false;
            }
        }
        return true;
    }
}
