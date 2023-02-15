public class Human
{
    // Variabel Private Human.
    private String NIK;
    private String name;
    private char gender;
    
    // Constructor Human.
    public Human()
    {
        this.NIK = "";
        this.name = "";
        this.gender = '-';
    }

    public Human(String NIK, String name)
    {
        this.name = NIK;
        this.name = name;
        this.gender = gender;
    }

    // Setter & Getter NIK
    public String getNIK()
    {
        return this.NIK;
    }

    public void setNIK(String NIK)
    {
        this.NIK = NIK;
    }

    // Setter & Getter Name
    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    // Setter & Getter Gender
    public char getGender()
    {
        return this.gender;
    }

    public void setGender(char gender)
    {
        this.gender = gender;
    }
}