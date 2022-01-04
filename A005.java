import java.util.ArrayList;

class Solution {
    
    public static int solution(String skill, String[] skill_trees) {
        ArrayList<Integer> skillStack = new ArrayList<Integer>(skill.length());
        int curSkill = 0;    // current used skill
        boolean isValid;
        int validCount = 0;

        for (String skill_tree : skill_trees) {
            isValid = true;
            skillStack.clear();
            for(int i=0 ; i<skill.length() ; i++)
                skillStack.add((int)skill.charAt(i));
            for (int j = 0; j < skill_tree.length(); j++) {
                curSkill = skill_tree.charAt(j);
                if(isStack(skillStack, curSkill)) {
                    if(skillStack.size() == 0)
                        break;
                    if (!(curSkill == skillStack.get(0))) {
                        isValid = false;
                        break;
                    }
                    else
                        skillStack.remove(0);
                }
            }
            if (isValid)
                validCount++;
        }
        return validCount;
    }

    static boolean isStack(ArrayList<Integer> skillStack, int letter) {
        if(skillStack.contains(letter))
            return true;
        else
            return false;
    }
}