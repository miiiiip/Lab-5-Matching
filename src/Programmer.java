public class Programmer
{

    char prefrences[];
    public Programmer() {
    }

    public char[] getPrefrences() {
        return prefrences;
    }

    public void setPrefrences(char[] prefrences) {
        this.prefrences = prefrences;
    }

    public int getValue(char a, Programmer b){
        int i =0;
        int points = b.getPrefrences().length;
        char[] temp = b.getPrefrences();
        while(temp[i]!=a){
            i++;
            points--;
        }
        return points;
    }
    public int getIndex(int a, Programmer b){
        char[] temp = b.getPrefrences();
        int i = 0;
        while(temp[i]!=a){
            i++;
        }
        return i;
    }
}