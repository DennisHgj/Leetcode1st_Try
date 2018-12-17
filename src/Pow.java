public class Pow {
    public static double myPow(double x, int n){
        double result= 0.0;
        if (n<0){
            x=1/x;
            n=-n;
        }else if (n==0){
            result=1.00000;
            return result;
        }
        double y=x;
        for (int i = 1;i<n;i++){
            x=x*y;
        }
        result=x;
        return result;
    }

    public static void main(String[] args) {
        double a = myPow(2,0);
        System.out.println(a);
    }
}
