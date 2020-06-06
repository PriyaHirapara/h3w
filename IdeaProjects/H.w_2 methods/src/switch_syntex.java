public class switch_syntex {
    public static void main (String args []) {
        String grade = "a";
        int name = 10;
        switch (grade) {
            case "a":
                System.out.println("grade A : " + 2000);
                switch (name){
                            case 40:
                                System.out.println("pass");
                                break;
                            case 50:
                                System.out.println("fail");
                                break;
                            case 70:
                                System.out.println("dis");
                                break;
                            default:
                                System.out.println(" i cant give you any name");
                        }
                break;
            case "b":
                System.out.println("grade B : " + 4000);
                break;
            case "c" :
                System.out.println("grade c : " + 3000);
                break;
            default:
                System.out.println(" grade z :" + 100);


        }

    }}
