/*
Companies class is for object type Companies, which is used to represent programmers in the pairs.
Each company has a set of prefrences (int[]) and a name (char)
 */

public class Companies {

    int[] prefrences;
    char name;

    public Companies() {
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public int[] getPrefrences() {
        return prefrences;
    }

    public void setPrefrences(int[] prefrences) {
        this.prefrences = prefrences;
    }

    //This method takes an integer (a programmer name) and a company, and finds the index of that
    //programmer in the company's preferences.
    //This is important because the lower the number index in prefrences, the more they prefer it.
    public int getIndex(int a, Companies b){
        int[] temp = b.getPrefrences();
        int i = 0;
        while(temp[i]!=a){
            i++;
        }
        return i;
    }
}
