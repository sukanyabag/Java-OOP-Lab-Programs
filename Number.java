

class Number{
      public static void main(String[] args) {
        int x = 2, y = 50, count = 0;
        do{
            ++x;
            y -= x++;
            count++;
            
        }while(x <= 10);
        System.out.println(y+ ", " +count);

        int a = 10, b = 15;
        while(++a < --b){
            System.out.println(b);
            System.out.println(a);
        }
    }

    public void checkVowel(){
        char c = 'a';

        if(c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c =='i' || c == 'O' || c =='o' || c == 'U' || c == 'u'){
            System.out.println("It is a vowel");
        }
        else{
            System.out.println("It is not a vowel");
        }
    }
}