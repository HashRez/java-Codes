public class pattern2 {
    public static void main(String[] args) {
    int i,j;
    int n=7;
    for(i=1;i<=n;i++){
        for(int k=n-1;k>=i;k--){
            System.out.print(" ");
        }
        for(j=1;j<=n;j++){
            System.out.print("*");
        }
        // for(int p=1;p<i;p++){
        //     System.out.print(" ");
        // }
        System.out.println();
    }
}}
    

