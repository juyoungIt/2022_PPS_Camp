import java.util.ArrayList;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        ArrayList<String> arrS = new ArrayList<String>();
        ArrayList<String> arrT = new ArrayList<String>();
        StringBuilder strS = new StringBuilder();
        StringBuilder strT = new StringBuilder();

        for(int i=0 ; i<s.length() ; i++)
            arrS.add(s.charAt(i)+"");
        for(int i=0 ; i<t.length() ; i++)
            arrT.add(t.charAt(i)+"");

        for(int i=0 ; i<arrS.size() ; i++) {
            if(arrS.get(i).equals("#")) {
                try {
                    arrS.remove(i);
                    arrS.remove(i-1);
                    i -= 2;
                }
                catch(Exception e) {
                    i = -1;
                }
            }
        }

        for(int i=0 ; i<arrT.size() ; i++) {
            if(arrT.get(i).equals("#")) {
                try {
                    arrT.remove(i);
                    arrT.remove(i-1);
                    i -= 2;
                }
                catch(Exception e) {
                    i = -1;
                }
            }
        }

        for (String arr : arrS) strS.append(arr);
        for (String value : arrT) strT.append(value);

        if(strS.toString().equals(strT.toString()))
            return true;
        else
            return false;
        
    }
}