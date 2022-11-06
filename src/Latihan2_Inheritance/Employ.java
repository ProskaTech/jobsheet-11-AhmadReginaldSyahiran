package Latihan2_Inheritance;

public class Employ extends Person {
    private String noKaryawan;

    //Konstruktor
    public Employ (String noKaryawan, String name, int age){
        super(name, age);
        this.noKaryawan = noKaryawan;
    }

    //method
    public void info(){
        System.out.println("No. karyawan : " + this.noKaryawan);
        super.info();
    }
}
