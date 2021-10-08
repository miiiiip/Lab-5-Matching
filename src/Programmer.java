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

    public int getIndex(char a, Programmer b){
        char[] temp = b.getPrefrences();
        int i = 0;
        while(temp[i]!=a){
            i++;
        }
        return i;
    }
}