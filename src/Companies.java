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

    public int getValue(int a, Companies b){
        int i =0;
        int points = b.getPrefrences().length;
        int[] temp = b.getPrefrences();
        while(temp[i]!=a){
            i++;
            points--;
        }
        return points;
    }

    public int getIndex(int a, Companies b){
        int[] temp = b.getPrefrences();
        int i = 0;
        while(temp[i]!=a){
            i++;
        }
        return i;
    }
}
