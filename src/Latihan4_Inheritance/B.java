package Latihan4_Inheritance;

public class B extends A{
    private int b;

    public void setB(int nilai){
        b = nilai;
    }

    public int getB(){
        return b;
    }

    public void tampilkanNilai(){
        System.out.println("Nilai b = " + getB());
    }
}
