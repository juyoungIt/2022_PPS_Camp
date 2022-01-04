import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        ArrayList<Integer> gArr = new ArrayList<Integer>(g.length);
        ArrayList<Integer> sArr = new ArrayList<Integer>(s.length);
        int served = 0;

        for(int i=0 ; i<g.length ; i++)
            gArr.add(g[i]);
        for(int i=0 ; i<s.length ; i++)
            sArr.add(s[i]);

        Collections.sort(gArr);
        Collections.sort(sArr);

        System.out.println(gArr);
        System.out.println(sArr);

        while(sArr.size() > 0 && gArr.size() > 0) {
            System.out.println("result = " + sArr.size());
            if(sArr.get(0) >= gArr.get(0)) {
                sArr.remove(0);
                gArr.remove(0);
                served++;
            }
            else
                sArr.remove(0);
        }

        return served;
    }
}