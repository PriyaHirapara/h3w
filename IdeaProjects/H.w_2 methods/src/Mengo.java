import com.sun.deploy.net.MessageHeader;

public class Mengo extends Fruit {
   // static Fruit fruit = new Fruit();
    static Mengo mengo = new Mengo();
    public  static void main (String args []) {
       // Mengo mengo = new Mengo(); // creat object

        System.out.println(mengo.a); // re-used perent class instance variable
        mengo.add(); // re-used parent class instance method()
        mengo.minus(); // re-userd parent class instance methods()
    }

        public static void someName(){
        mengo.minus();
        }
         public static void surname(){
        mengo.sub();
         }

}
