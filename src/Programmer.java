/*
Programmer class is for object type programmer, which is used to represent programmers in the pairs.
Each programmer has a set of prefrences (Char[]) and a name (int)
 */

public class Programmer
{

    char[] prefrences;
    int name;

    public Programmer() {
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public char[] getPrefrences() {
        return prefrences;
    }

    public void setPrefrences(char[] prefrences) {
        this.prefrences = prefrences;
    }

    //This method takes an char (a company's name) and a programmer, and finds the index of that
    //company in the programmer's preferences.
    //This is important because the lower the number index in prefrences, the more they prefer it.
    public int getIndex(char a, Programmer b){
        char[] temp = b.getPrefrences();
        int i = 0;
        while(temp[i]!=a){
            i++;
        }
        return i;
    }
}