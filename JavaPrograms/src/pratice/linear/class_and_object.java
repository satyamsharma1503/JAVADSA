package pratice.linear;

public class class_and_object {
    public static void main(String[] args){
    Pen p1 = new Pen();
    p1.setColor("red");
    System.out.println(p1.color);
        p1.setTip("5");
        System.out.println(p1.tip);
    }
    static class Pen{
        String color;
        String tip;
        void setColor(String newColor){
            color= newColor;
        }

        void setTip(String newTip){
            tip = newTip;
        }
    }
}
