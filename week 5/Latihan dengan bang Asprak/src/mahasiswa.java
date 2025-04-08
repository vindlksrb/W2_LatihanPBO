

public class mahasiswa 
{
    //variabel instansce
    String nama= "Calvin";
    int umur = 22;
    
    //variabel static/kelas
    static String universitas = "Universitas Pertamina";
    public void tampilkanInfo() 
    {
        String nama = "Adri";
        System.out.println("Nama: " + nama);
    }
    public mahasiswa()
    {

    }
    public mahasiswa (String nama, int umur) 
    {
        this.nama = nama;
        this.umur = umur;
    }

    public void sayHello(String nama)
    {

    }

    public void sayHello(String nama, int umur)
    {
        System.out.println("Nama : " + nama);
    }
}
