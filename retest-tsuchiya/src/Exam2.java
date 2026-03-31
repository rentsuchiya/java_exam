public class Exam2 {
    public static void main(String[] args) {
        
        int add=addition(5,3);
        int sub=subtraction(5,3);
        int multi=multiplication(5,3);
        int div=division(5,3);
        int rem=remainder(5,3);

        System.out.println("足し算結果："+add);
        System.out.println("引き算結果："+sub);
        System.out.println("掛け算結果："+multi);
        System.out.println("割り算結果："+div);
        System.out.println("剰余算結果："+rem);
    }
    public static int addition(int num1,int num2){
        return num1+num2;
    }
    public static int subtraction(int num1,int num2){
        return num1-num2;
    }
    public static int multiplication(int num1,int num2){
        return num1*num2;
    }
    public static int division(int num1,int num2){
        return num1/num2;
    }
    public static int remainder(int num1,int num2){
        return num1%num2;
    }

}
