public class DesignPolygon {
    
    public void polygon(int n, char ch) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n; k++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public void polygon(int x, int y) {
        for(int i=1; i<=x; i++) {
            for(int k=1; k <= y; k++){
                System.out.print("@");
            }
            System.out.println();
        }
    }

    public void polygon() {
        for (int i =1; i<=3; i++) {
            for(int j = 1; j<=i; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        DesignPolygon obj = new DesignPolygon();
        obj.polygon(4, 'x');
        System.out.println();
        obj.polygon(3,6);
        System.out.println();
        obj.polygon();
    }




}
