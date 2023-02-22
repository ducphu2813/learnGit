import java.util.Scanner;
public class HinhChuNhat{
    private double x;
    private double y;

    public HinhChuNhat(){
        this.x=x;
        this.y=y;
    }
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x=x;
    }
    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y=y;
    }
    public double Dientich(){
        return x*y;
    }
    public double Chuvi(){
        return (x+y) *2;
    }
    public String toString() {
        return "chieu dai= " + this.x + ", rong= " + this.y + "," + " chu vi= " + Chuvi() + " dien tich= " + Dientich();
    }

public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    HinhChuNhat hcn=new HinhChuNhat();

    System.out.println("Nhap chieu dai: ");
    hcn.setX(scanner.nextDouble());
    System.out.println("Nhap chieu rong: ");
    hcn.setY(scanner.nextDouble());
    System.out.println("Chu vi hinh chu nhat: " + hcn.Chuvi());
    System.out.println("Dien tich hinh chu nhat: " + hcn.Dientich());
    System.out.println("toString: "+hcn.toString());
    }
}