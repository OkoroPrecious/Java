package Chapter_5;

public class AsteriskTriangle_B {
    public static void main (String[] args){
        for(int count = 11; count >= 0; count--){
            for(int i = 0; i < count - 1; i++)
                System.out.print("*");
            System.out.println();
        }
    }
}
