package introToApi;
enum Result{
    PASS,FAIL,NR;
    int marks;
    Result(){
        System.out.println("Inside the Result Constructer");

    }
    void setMarks(int marks){
        this.marks=marks;
    }
    int getMarks(){
        return marks;
    }

}
public class moreonenum248 {
    public static void main(String[] args) {
        Result.PASS.setMarks(50);
        int m1=Result.PASS.getMarks();
        System.out.println(m1);
        int m2=Result.FAIL.getMarks();
        System.out.println(m2);
        System.out.println(Result.NR.getMarks());
        
    }
}
