public class Robot {

    String name;
    Robot(String robotName) {
        this.name = robotName;
    }
    void sayHello() {
        System.out.println("Hello !");
    }

    void sayYourName() {
        System.out.println("My name is " + this.name);
    }


}
