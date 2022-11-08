public class Main {
    public static void main(String[] args) {
        System.out.println("Nama    : Qalbi Karunia");
        System.out.println("NIM     : 2100018178");
        System.out.println("Kelas   : D");
        System.out.println("UTS");
        System.out.println("\n");
        Tendik tenagapndk = new Tendik();
        tenagapndk.setNama("Anto");
        tenagapndk.setNip(12345678);
        tenagapndk.setTglLahir("20/11/1989");
        tenagapndk.setAlamat("Semarang");
        tenagapndk.setJk("Laki-Laki");
        tenagapndk.setTahunMasuk(2019);

        Dosen dsn = new Dosen();
        dsn.setJurusan("Informatika");
        dsn.setNidn(24112002);
        dsn.setNama("Udin S.Kom");
        dsn.setNip(213456789);
        dsn.setTglLahir("11/02/1978");
        dsn.setJk("Laki-Laki");
        dsn.setAlamat("Malang");
        dsn.setTahunMasuk(2017);

        System.out.println("Nama Tendik         : "+ tenagapndk.getNama());
        System.out.println("NIP  Tendik         : "+ tenagapndk.getNip());
        System.out.println("Tanggal Lahir       : "+ tenagapndk.getTglLahir());
        System.out.println("Jenis Kelamin       : "+ tenagapndk.getJk());
        System.out.println("Alamat              : "+ tenagapndk.getAlamat());
        System.out.println("Tahun masuk         : "+ tenagapndk.getTahunMasuk());
        System.out.println("Gaji pokok          : "+tenagapndk.gajiTotal());
        System.out.println("Upah lembur(20 jam) : "+ tenagapndk.lembur(20));
        System.out.println("Gaji total          : "+ tenagapndk.gajiTotal(20));

        System.out.println("\n");
        System.out.println("Nama Dosen          : "+ dsn.getNama());
        System.out.println("NIDN                : " +dsn.getNidn());
        System.out.println("Jurusan             : " + dsn.getJurusan());
        System.out.println("NIP  Dosen          : "+ dsn.getNip());
        System.out.println("Tanggal Lahir       : "+ dsn.getTglLahir());
        System.out.println("Jenis Kelamin       : "+ dsn.getJk());
        System.out.println("Alamat              : "+ dsn.getAlamat());
        System.out.println("Tahun masuk         : "+ dsn.getTahunMasuk());
        System.out.println("Gaji pokok          : "+ dsn.gajiTotal());
        System.out.println("Kelas lebih (4 SKS) : "+ dsn.mengajarLebih(4));
        System.out.println("Gaji total          : "+ dsn.gajiTotal(4));

    }
}