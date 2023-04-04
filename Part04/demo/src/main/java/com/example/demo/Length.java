package Part03;

public class Length {
    static int Details_count = 0;
    static int Detail_count1 = 1;
    static int Detail_count2 = 1;
    static int Detail_count3 = 1;

    public Length(String[] args){
        for(int i = 0; i < (6); i++){
            Detail_count1++;
        }
        for(int i = 0; i < (6); i++){
            Detail_count2++;
        }
        for(int i = 0; i < (6); i++){
            Detail_count3++;
        }
    }
}
