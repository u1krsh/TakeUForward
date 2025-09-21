//  *
// ***
//*****
//*******
//*********

        package Pattern;

public class pattern_7 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j =0;j<=5-i-1;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i+1);k++){
                System.out.print("*");
            }
            for(int l=0;l<=5-i-1;l++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
