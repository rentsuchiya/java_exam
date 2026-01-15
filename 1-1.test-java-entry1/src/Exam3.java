public class Exam3 {
   public static void main(String[] args) {
    
   int item1price = 200*3;
   int item2price = 250*4;
   int subprice = item1price+item2price;
   int tax = (int) (subprice*0.1);
   int totalprice = subprice+tax;
   
   System.out.println("小計");
   System.out.println(subprice);
   System.out.println("消費税");
   System.out.println(tax);
   System.out.println("合計金額");
   System.out.println(totalprice);
   }

}
