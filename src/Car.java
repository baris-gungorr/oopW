public class Car {
    private String color;
    private int model;
    private double engine;
    private int doors;

    public Car(String color, int model, double engine, int doors) {                //Constructtor
        this.color = color;
        this.model = model;
        this.engine = engine;
        this.doors = doors;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
        if (doors == 2 || doors == 4) {
            this.doors = doors;
        } else {
            System.out.println("Kapı sayısı sadece 2 veya 4 olabilir ");
        }
        }
    public void showınfo(){
        System.out.println("Arabanın Rengi " + this.getColor());
        System.out.println("Arabanın Modeli " + this.getModel());
        System.out.println("Arabanın Motor Hacmi " + this.getEngine());
        System.out.println("Arabanın Kapı Sayısı " + this.getDoors());
    }
   public Car(String color,int model) {
        this(color,model,0,0);
   }
    public Car(){
        /*this.color = "Bilgi yok";
        this.model =  0 ;
        this.engine = 0;
        this.doors = 0; */
        this("Bilgi yok",0,0,0);

    }
}



