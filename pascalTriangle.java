public class pascalTriangle {
    
    public static void main(String[] args){
        long i, c=1, line=60;
        for(i=1;i<=line;i++){
            System.out.print(c + " ");
            c = c * (line-i) / i;
        }
    }
}
