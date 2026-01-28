package exam1;

// public class Car implements Interface {
//     String name;

//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     void putOnGus(){
//         this.name=name;
//         System.out.println(name+"に給油します");
//     }
//     void run(){
//         System.out.println("ブーン!車が走ります");
//     }

// }

public class Car {
String name;

public void putOnGus(){
    System.out.println(name+"に給油します");
}

public void run(){
    System.out.println("ブーン！車が走ります");
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public Car(String name) {
    this.name = name;
}



     



}
