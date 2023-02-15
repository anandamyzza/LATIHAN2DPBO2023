public class SivitasAkademik extends Human // Sivitas Akademik mewarisi Human.
{
    // Variabel Private Sivitas Akademik.
    private String asal_universitas;
    private String email_edu;
    
    // Constructor Sivitas Akademik.
    public SivitasAkademik()
    {
        this.asal_universitas = "";
        this.email_edu = "";
    }

    public SivitasAkademik(String asal_universitas, String email_edu)
    {
        this.asal_universitas = asal_universitas;
        this.email_edu = email_edu;
    }

    // Setter & Getter Asal Universitas
    public String getAsal_universitas()
    {
        return this.asal_universitas;
    }

    public void setAsal_universitas(String asal_universitas)
    {
        this.asal_universitas = asal_universitas;
    }

    // Setter & Getter Email Edu
    public String getEmail_edu()
    {
        return this.email_edu;
    }

    public void setEmail_edu(String email_edu)
    {
        this.email_edu = email_edu;
    }
}