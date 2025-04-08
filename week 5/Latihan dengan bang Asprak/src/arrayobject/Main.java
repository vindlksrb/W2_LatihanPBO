package arrayobject;

import enkapsulasi.mahasiswa;

public class Main 
{

    public static void main(String[] args) 
    {

        //Array Object
        mahasiswa[] student = 
        {
            new mahasiswa ("Adri", 22, 170),
            new mahasiswa ("Calvin", 22, 171),
            new mahasiswa ("Caca", 19, 160)
        };
        for (mahasiswa mhs : student) 
        {
            System.out.println("Nama: " + mhs.getNama() + ", Umur: " + mhs.getUmur() + ", Tinggi Badan: " + mhs.getTinggiBadan());
        }

        System.out.println("========================================");

        mahasiswa[] mhs = new mahasiswa[3];
        mhs[0] = new mahasiswa();
        mhs[0].setNama("Akbar");
        mhs[1] = new mahasiswa();
        mhs[1].setNama("Irfan");
        mhs[2] = new mahasiswa();
        mhs[2].setNama("Billy");

        for (mahasiswa m : mhs){
            System.out.println(m.getNama());
        }
    }
}
