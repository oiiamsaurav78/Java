package introToApi;

enum Week{
    MON , TUE,WED,THU,FRI,SAT,SUN
}
public class enum247 {
    enum Result{
        PASS,FAIL,NR
    }
    public static void main(String[] args) {
        Week w= Week.MON;
        System.out.println(w);
        Result r=Result.PASS;
        System.out.println(r);    
        int w1= Week.FRI.ordinal();
        System.out.println(w1);
        Week []wr=Week.values();
        for (Week w2:wr){
            System.out.println(w2+" : "+ w2.ordinal());
            
        }
    }
    

    
}
