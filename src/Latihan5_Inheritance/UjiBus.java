package Latihan5_Inheritance;

public class UjiBus {
    public static void main(String[] args) {

        //membuat objek busmini dari kelas bus
        Bus busMini = new Bus();
        
        //memasukkan nilai jumlah penumpang dan
        //penumpang maksimal ke dalam obkel busmini
        busMini.penumpang = 5;
        busMini.maxPenumpang =15;

        //memanggil method cetak pada kelas Bus
        busMini.cetak();

        //menambahkan jumlah penumpang pada bus mini
        busMini.penumpang = busMini.penumpang + 5;
        //memanggil method cetak pada kelas bus
        busMini.cetak();

        //mengurangi jumlah penumpang pada busmini
        busMini.penumpang = busMini.penumpang -2;
        busMini.cetak();

        //Menambahkan jumlah penumpang pada busmini
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
    }
}
