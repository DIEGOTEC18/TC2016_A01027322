public class Point {

    private double x;
    private double y;

    //Se llama automáticamente
    public Point(){

        System.out.println("Constructor sin parámetros");

    }

    public Point(double x, double y){

        this.x = x;
        this.y = y;

    }

    public double getX(){

        return x;

    }

    public double getY(){

        return y;

    }

    public double getDistance(Point myPoint){

        double distance = 0.0;

        distance = Math.sqrt(Math.pow(myPoint.getX() - x, 2) + Math.pow(myPoint.getY() - y, 2));

        return distance;

    }

}
