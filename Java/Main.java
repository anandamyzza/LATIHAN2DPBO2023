import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        // Deklarasi dan Inisialisasi variabel.
        Mahasiswa temp = new Mahasiswa();
        ArrayList<Mahasiswa> list = new ArrayList<>();

        // Input hard code data mahasiswa 1.
        temp.setNIK("5351309030007");
        temp.setName("Ananda Myzza");
        temp.setGender('L');
        temp.setAsal_universitas("UPI");
        temp.setEmail_edu("anandamyzza@upi.edu");
        temp.setNIM("2100702");
        temp.setMajor("Ilmu Komputer");
        temp.setFaculty("FPMIPA");
        list.add(temp); // Add data ke dalam list.

        // Input hard code data mahasiswa 2.
        temp = new Mahasiswa(); // Reset mahasiswa.
        temp.setNIK("5352007030006");
        temp.setName("Dicky Fathurohman");
        temp.setGender('L');
        temp.setAsal_universitas("UPI");
        temp.setEmail_edu("dickifathurohman@upi.edu");
        temp.setNIM("2103842");
        temp.setMajor("Ilmu Komputer");
        temp.setFaculty("FPMIPA");
        list.add(temp); // Add data ke dalam list.

        // Print Hasil Akhir Daftar Data Mahasiswa.
        System.out.println("Data Mahasiswa:\n");
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(Integer.toString(i + 1) + ". Biodata " + list.get(i).getName() + " | NIK: " + list.get(i).getNIK() + " | Jenis Kelamin: " + list.get(i).getGender());
            System.out.println("NIM: " + list.get(i).getNIM());
            System.out.println("Universitas: " + list.get(i).getAsal_universitas());
            System.out.println("Fakultas: " + list.get(i).getFaculty());
            System.out.println("Prodi: " + list.get(i).getMajor());
            System.out.println("Email: " + list.get(i).getEmail_edu());

            // Print New Line selain di akhir.
            if(i < list.size() - 1)
            {
                System.out.println();
            }
        }
    }
}