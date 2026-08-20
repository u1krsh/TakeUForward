
import java.util.*;


public class practice {
    static int gdc(int a, int b){
        int res = 1;
        int pa=2,pb =2;
        while(a>1&&b>1){
            while(pa*pa<=a && a%pa !=0) pa++;
                int fac;
                if(pa*pa>a){
                    fac =a;
                }
                else{
                    fac = pa;
                }



            while(pb*pb<=b && b%pb != 0 ) pb++;
            int fb;
            if(pb*pb >b){
                fb = b;
            }
            else{
                fb = pb;
            }

            if (fac==fb){
                res *= fac;
                a = a/fac;
                b= b/fb;
            }
            else if(fac<fb){
                a =a /fac;
            }
            else{
                b = b/fb;
            }
        }
        return res;
    }



    public static void main(String[] args) {
        System.out.println(gdc(6,12));;
    }

}