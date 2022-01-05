class Solution {
    public static int solution(String s) {

        String pat="";     // string pattern
        int patLen;        // pattern size
        int cur;           // current index
        int comp=1;        // compression level
        StringBuilder compRes= new StringBuilder();   // compression result string
        int minLen = s.length();      // minimum length

        for(patLen = 1 ; patLen <= s.length() ; patLen++) {
            for(cur=0 ; cur<s.length() ; ) {
                try {
                    if (cur == 0) {
                        pat = s.substring(cur, patLen);
                        cur = patLen;
                    } else if (pat.equals(s.substring(cur, cur+patLen))) {
                        comp++;
                        cur += patLen;
                    } else {
                        compRes.append((comp > 1) ? comp+""+pat : pat);
                        comp = 1;
                        pat = s.substring(cur, cur+patLen);
                        cur += patLen;
                    }
                } catch (Exception e) {
                    compRes.append((comp > 1) ? comp+""+pat : pat);
                    compRes.append(s.substring(cur));
                    break;
                }
                if(cur == s.length())
                    compRes.append((comp > 1) ? comp+""+pat : pat);
            }
            if(minLen > compRes.length())
                minLen = compRes.length();
            compRes = new StringBuilder();
            comp = 1;
        }
        return minLen;
    }
}