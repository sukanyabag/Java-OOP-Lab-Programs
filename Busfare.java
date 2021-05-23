public class Busfare {
    String bus_num;
    String pg_name;
    int distance;
    double fare;

    Busfare(String number, String name, int km){
        bus_num = number;
        pg_name = name;
        distance = km;
    }
    
    public double calcFare(int km){
        double amt = 0;
        if(km <= 10)
           amt = km*5;
        else if(km > 10 && km <= 20)
              amt = calcFare(10) + (km - 10) * 10;
              else if(km > 20 && km <= 30)
                   amt = calcFare(20) + (km - 20) * 15;
                   else if(km > 30 && km <= 40)
                       amt = calcFare(30) + (km - 30) * 20;
                       else if(km > 40)
                         amt = calcFare(40) + (km - 40) * 25;
        return amt;

           
    }
    public void show(){
        System.out.println("Bus No.\tName\tKm.Travelled\tFare");
        System.out.println(this.bus_num + "\t" + this.pg_name + "\t" + this.distance + "\t" + this.fare);

    }

    public static void main(String args[]) {
        Busfare pg1 = new Busfare("SD-47", "Passenger 1", 47);
        pg1.fare = pg1.calcFare(pg1.distance);
        pg1.show();
    }
}
