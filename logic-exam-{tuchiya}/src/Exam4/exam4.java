package Exam4;
public class exam4 {
    public static void main(String[] args) {
         
        boolean uruudosi=uruu(2000);
        if (uruudosi==true){
            System.out.println(year+"はうるう年です");
        }else{
            System.out.println(year+"はうるう年ではありません");
        }

    }
    public static boolean uruu(int year){
        if(year/4==0){
            // System.out.println(year+"はうるう年です");
             boolean nenn=true;
             return nenn;
          
        }else if (year/100==0){
            // System.out.println(year+"はうるう年ではありません");
             boolean nenn1=false;
             return nenn1;
        }else if(year/400==0){
            //  System.out.println(year+"はうるう年です");
            boolean nenn2=true;
            return nenn2;
            
        }else{
            // System.out.println(year+"はうるう年ではありません");
            boolean nenn3=false;
            return nenn3;
        }
    }

}
