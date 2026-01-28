public class Student {
    int energy=Student(50);


    void sleep(){
        this.energy=energy+50;
        System.out.println("寝ました。エネルギーが"+energy+"になりました。");
        if (energy<=100){
            System.out.println("フルパワー！");
        }
    }
    void study(){
        this.energy=energy-30;
        System.out.println("勉強しました。エネルギーが"+energy+"になりました。");
        if (energy=<0){
            System.out.println("寝てください");
        }
    }

}
