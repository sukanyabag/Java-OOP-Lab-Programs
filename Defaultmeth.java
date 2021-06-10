interface First{
    default void show(){
        System.out.println("Default method implementation of First interface");
    }
}

interface Second{
    default void show(){
        System.out.println("Default method implementation of Second interface");
    }
}

class Defaultmeth implements First,Second{

    public void show(){
        First.super.show();
        Second.super.show();
    }
    public static void main(String args[]){
        Defaultmeth obj = new Defaultmeth();
        obj.show();
    }
}
