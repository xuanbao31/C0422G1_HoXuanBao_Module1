package ss4_OOP.bai_tap;

public class Fan { final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color="blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {//getter
        return this.on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public Fan(){    ///Constructor không tham số
    }




    public String toString(){
        if (this.isOn()){
            return "speed: "+ this.getSpeed() + "  color "+this.getSpeed()+" radius "+this.getRadius()+"Fan is On";
        }else {
            return " color "+this.getColor()+" radius "+this.getRadius()+"Fan is off";
        }
    }
}

