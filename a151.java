public class a151 {
    public String reverseWords(String s) {
        s=s.trim();
        String a="";
        String arr[]=s.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i].equals("")) continue;
            a+=arr[i];
            if(i!=0) a+=" ";
        }
        return a;
    }
}
