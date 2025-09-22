package Pattern;

public class pattern_12 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=2;k<=2*4-(2*i-1);k++){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print(1+i-l);
            }
            System.out.print("\n");
        }
    }
}
