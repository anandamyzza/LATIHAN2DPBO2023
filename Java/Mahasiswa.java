public class Mahasiswa extends SivitasAkademik // Mahasiswa mewarisi Sivitas Akademik.
{
    // Variabel Private Mahasiswa.
    private String NIM;
    private String faculty;
    private String major;

    // Constructor Mahasiswa.
    public Mahasiswa()
    {
        this.NIM = "";
        this.faculty = "";
        this.major = "";
    }

    public Mahasiswa(String NIM, String faculty, String major)
    {
        this.NIM = NIM;
        this.faculty = faculty;
        this.major = major;
    }

    // Setter & Getter NIM
    public String getNIM()
    {
        return this.NIM;
    }

    public void setNIM(String NIM)
    {
        this.NIM = NIM;
    }

    // Setter & Getter Major
    public String getMajor()
    {
        return this.major;
    }

    public void setMajor(String major)
    {
        this.major = major;
    }

    // Setter & Getter Faculty
    public String getFaculty()
    {
        return this.faculty;
    }

    public void setFaculty(String faculty)
    {
        this.faculty = faculty;
    }
}
