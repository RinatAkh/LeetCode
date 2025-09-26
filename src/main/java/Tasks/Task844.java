package Tasks;

public class Task844 {
    public boolean backspaceCompare(String s, String t) {
        int index1 = s.length() - 1;
        int index2 = t.length() - 1;

        while (index1 >= 0 || index2 >= 0) {
            int i1 = getNextValidCharIndex(s, index1);
            int i2 = getNextValidCharIndex(t, index2);

            if(i1 < 0 && i2 < 0)
                return true;

            if(i1 < 0 || i2 < 0)
                return false;

            if(s.charAt(i1) != t.charAt(i2))
                return false;

            index1 = i1 - 1;
            index2 = i2 - 1;
        }
        return true;
    }

    private int getNextValidCharIndex(String s, int index) {
        int backspaceCount = 0;
        while(index >= 0) {
            if(s.charAt(index) == '#')
                backspaceCount++;
            else if (backspaceCount > 0)
                backspaceCount--;
            else break;
            index--;
        }
        return index;
    }
}
