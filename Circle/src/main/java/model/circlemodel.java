
package model;

public class circlemodel {
    private double r,kq;

    public circlemodel() {
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getKq() {
        return kq;
    }

    public void setKq(double kq) {
        this.kq = kq;
    }
    
    public void cv(){
        this.kq = Math.PI * r * 2;
    }
    
    public void dt(){
        this.kq = Math.PI * r * r;
    }
}
