public class Length
{
    int x1,x2,y1,y2;

    public Length(){

    }
    @Override
    public String toString() {
        return "Length{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                '}';
    }
    public double  calculate(){
        return Math.sqrt((x2-x1)^2 +(y2-y1)^2);
    }
}
