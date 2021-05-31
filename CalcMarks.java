public class CalcMarks {
    public static void main(String[] args) {

        A a = new A(57, 72, 100);
    
           System.out.println(a.getPercentage());
    
           B b = new B(63, 98, 45, 88);
    
           System.out.println(b.getPercentage());
    
    }
    
    }
    
    abstract class  Marks {
    
       public abstract float getPercentage();
    
    }
    
    class A extends Marks{
    
       int score_1, score_2, score_3;
    
       A(int sx, int sy, int sz){
    
           score_1= sx;
    
           score_2 = sy;
    
           score_3 = sz;
    
       }
    
       public float getPercentage(){
    
           float total_marks=((score_1+score_2+score_3)/(float)300)*100;
    
           return total_marks;
    
       }
    
    }
    
    class B extends Marks{
    
       int score_1, score_2, score_3, score_4;
    
       B(int sx, int sy, int sz, int sj){
    
           score_1 = sx;
    
           score_2 = sy;
    
           score_3 = sz;
    
           score_4 = sj;
    
       }
    
       public float getPercentage(){
    
           float total_marks=((score_1+score_2+score_3+score_4)/(float)400)*100;
    
           return total_marks;
    
       }
    
}
