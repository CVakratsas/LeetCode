public class Flower {
    String name;
    int daysOfLiving;
    double height;

    public Flower(String name, int daysOfLiving, double height) {
        this.daysOfLiving = daysOfLiving;
        this.height = height;
        this.name = name;
    }

    public void printInfo(){
        System.out.println("This flower lives " + daysOfLiving + " days");
    }
}
