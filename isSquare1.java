public class isSquare1 {
    public static void main(String[] args){
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(-4));
        System.out.println(isSquare(8));
        System.out.println(isSquare(0));
    }
    static int isSquare(int n){
        if(n<0) return 0;
        for(int i=0; i<=n/2; i++){
            if(i*i==n) return 1;
        }
        return 0;
    }
}
