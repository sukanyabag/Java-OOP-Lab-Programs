public class Series2 {

    public long fact(int f){
        long factorial = 1;
        for(int i = 1; i <= f; i++)
            factorial = factorial * i;
        return factorial;
    }

    public void sumSeries1(int x, int n){
        double sum = 0;
        for(int i = 1; i <= n; i++){
            sum += (double)x / fact(i);
        }
        System.out.println("Sum of series 1 is = " + sum);
    }

    public void sumSeries2(int x, int n){
        double sum = 0;
        for(int i = 1; i <= n; i++){
            sum += (Math.pow(x, i)) / fact(i + 1);
        }
        System.out.println("Sum of series 2 is = " + sum);
    }

    public void sumSeries3(int x, int n){
        double sum = 0;
        for(int i = 1; i <= n; i++){
            sum += (Math.pow(-1, i + 1)) * ((Math.pow(x, i)) / fact(i + 1));
        }
        System.out.println("Sum of series 3 is = " + sum);
    }

    public static void main(String[] args) {
        Series2 obj = new Series2();
        obj.sumSeries1(2, 6);
        obj.sumSeries2(2, 6);
        obj.sumSeries3(2, 6);
    }
}
