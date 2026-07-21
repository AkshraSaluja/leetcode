public class a443 {
    public int compress(char[] chars) {
        int i = 0;
        int n = chars.length;
        StringBuilder sb = new StringBuilder();
        while (i < n) {
            char curr = chars[i];
            int count = 0;
            while (i < n && chars[i] == curr) {
                i++;
                count++;
            }
            sb.append(curr);
            if (count > 1) {
                sb.append(count);
            }
        }
        for (int j = 0; j < sb.length(); j++) {
            chars[j] = sb.charAt(j);
        }

        return sb.length();
    }

}