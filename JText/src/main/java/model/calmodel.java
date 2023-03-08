package model;

public class calmodel {
    private double a,b,kq;

    public calmodel() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getKq() {
        return kq;
    }

    public void setKq(double kq) {
        this.kq = kq;
    }
     
    public void cong(){
        this.kq = this.a + this.b;
    }
    
    public void tru(){
        this.kq = this.a - this.b;
    }
    
    public void nhan(){
        this.kq = this.a * this.b;
    }
    
    public void chia(){
        this.kq = this.a / this.b;
    }
    
    public void luythua(){
        this.kq = Math.pow(this.a, this.b);
    }
    
    public void chiadu(){
        this.kq = this.a % this.b;
    }
}
