package lv2_oop.bruch;

public class Bruch {

    private int zähler;
    private int nenner;

    public Bruch(int zähler, int nenner){
        this.zähler = zähler;
        this.nenner = nenner;
    }

    public void setZähler(int zähler) {
        this.zähler = zähler;
    }

    public void setNenner(int nenner) {
        this.nenner = nenner;
    }

    public int getZähler() {
        return zähler;
    }

    public int getNenner() {
        return nenner;
    }

    public void print(){
        System.out.println(zähler + " / " + nenner);
    }

    public double toDecimal(){
        return zähler / (nenner* 1.0);
    }

    public Bruch multiplicate(Bruch a) {
        int neuNenner = nenner * a.nenner;
        int neuZähler = zähler * a.zähler;
        return new Bruch(neuZähler, neuNenner);
    }

    public Bruch multiplicate(Bruch a2, Bruch a3){
        return multiplicate(a2).multiplicate(a3);
    }

}
