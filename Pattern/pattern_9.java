package Pattern;

public class pattern_9 {
    public static void main(String[] args) {
        for(int i= 0;i<5;i++){
            for(int j=0;j<=5-i-1;j++){
                System.out.print(" ");
            }
            for(int m =1; m<=2*i+1;m++){
                System.out.print("*");
            }
            for (int n=0;n<=5-i-1;n++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }

        for(int k=0;k<5;k++){
            for(int l =0;l<=k;l++){
                System.out.print(" ");
            }
            for(int o= 1;o<=(2*5-(2*k+1));o++){
                System.out.print("*");
            }
            for(int p = 0;p<=k;p++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }

    }
}
