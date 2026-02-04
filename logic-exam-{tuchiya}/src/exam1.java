public class exam1 {
    public static void main(String[] args) {

        for (int i=1; i<=9;i++){
            System.out.println();
            for (int y=1; y<=9; y++){
                if (i*y<10){
                    String ika="0"+i*y;
                    System.out.print(" "+ika);

                }else{
                     System.out.print(" "+i*y);
                }
                // System.out.print(" "+i*y);
            }
        }
    }
}
