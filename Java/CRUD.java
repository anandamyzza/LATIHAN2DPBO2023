import java.util.ArrayList;

public class CRUD {
    private ArrayList<Mahasiswa> data;

    public CRUD(ArrayList<Mahasiswa> data)
    {
        this.data = data;
    }

    /* Create */
    public void create(String name, String NIK, String gender, String NIM, String asal_universitas, String faculty, String major, String email_edu)
    {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNIK(NIK);
        mhs.setName(name);
        mhs.setGender(gender);
        mhs.setAsal_universitas(asal_universitas);
        mhs.setEmail_edu(email_edu);
        mhs.setNIM(NIM);
        mhs.setMajor(major);
        mhs.setFaculty(faculty);
        data.add(mhs); // Add data ke dalam list.
    }

    /* Read */
    public void read() {
        if(data.size() > -1)
        {
            for(int i = 0; i < data.size(); i++)
            {
                System.out.println(Integer.toString(i + 1) + ". Biodata " + data.get(i).getName() + " | NIK: " + data.get(i).getNIK() + " | Jenis Kelamin: " + data.get(i).getGender());
                System.out.println("NIM: " + data.get(i).getNIM());
                System.out.println("Universitas: " + data.get(i).getAsal_universitas());
                System.out.println("Fakultas: " + data.get(i).getFaculty());
                System.out.println("Prodi: " + data.get(i).getMajor());
                System.out.println("Email: " + data.get(i).getEmail_edu());

                // Print New Line selain di akhir.
                System.out.println();
            }
        }
        else
        {
            System.out.println("Data doesn't exist!\n");
        }
        
    }

    /* Update */
    public void update(int index, String name, String NIK, String gender, String NIM, String asal_universitas, String faculty, String major, String email_edu) {
        if (index >= 0 && index < data.size())
        {
            data.get(index).setNIK(NIK);
            data.get(index).setName(name);
            data.get(index).setGender(gender);
            data.get(index).setAsal_universitas(asal_universitas);
            data.get(index).setEmail_edu(email_edu);
            data.get(index).setNIM(NIM);
            data.get(index).setMajor(major);
            data.get(index).setFaculty(faculty);
        }
        else
        {
            System.out.println("Data doesn't exist!\n");
        }
    }

    /* Delete */
    public void remove(int index)
    {
        if (index >= 0 && index < data.size())
        {
            data.remove(index);
        }
        else
        {
            System.out.println("Data doesn't exist!\n");
        }
    }

    public int search(String NIM)
    {
        int temp = -1;
        for (int i = 0; i < data.size(); i++)
        {
            if (data.get(i).getNIM().equals(NIM))
            {
                temp = i;
            }
        }

        return temp;
    }
}
