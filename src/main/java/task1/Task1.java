package task1;

public class Task1 {
    public static void main(String[] args) {
        String name = "Roman";

        byte val_1 = 0; //-128-127
        short val_2 = 200; //-32_768-32_767 //128^2*2
        int val_3 = 60_000; //−2_147_483_648-2_147_483_647
        long val_4 = 4_550_550_555L; //−9_223_372_036_854_775_808-9_223_372_036_854_775_807

        float val_5 = 2.1234567f; //7
        double val_6 = 7.666856416541651; //15

        char symbol_1 = 'A';
        char symbol_2 = 2;
        
        boolean state_1 = true;
        boolean state_2 = false; 

        System.out.println(name + "\n" + val_1 + "\n" + val_2 + "\n" + val_3 + "\n" + val_4 + "\n" + val_5 + "\n" + val_6 + "\n" + symbol_1 + "\n" + symbol_2 + "\n" + state_1 + "\n" + state_2);

        System.out.println(name + val_1);
        System.out.println(val_1 + val_3);
        //System.out.println(state_1 + symbol_2);
        System.out.println(state_1 + name);
        System.out.println(val_6 + val_2);
        System.out.println(name + symbol_2);
        System.out.println(val_2 * 2 * 4 / val_5);
    }

}
