
package model;

public class hcnmodel {
    private double cd;
    private double cr;
    private double kq;

    public hcnmodel() {
    }

    public void cv(){
        this.kq = 2*(this.cd+this.cr);
    }
    
    public void dt(){
        this.kq = this.cd*this.cr;
    }
    
    public double getCd() {
        return cd;
    }

    public void setCd(double cd) {
        this.cd = cd;
    }

    public double getCr() {
        return cr;
    }

    public void setCr(double cr) {
        this.cr = cr;
    }

    public double getKq() {
        return kq;
    }

    public void setKq(double kq) {
        this.kq = kq;
    }
    
    
}
