/* Saya Ananda Myzza Marhelio NIM 2100702 mengerjakan soal Latihan 2 dalam mata kuliah Desain Pemrograman Berorientasi
Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

#include <bits/stdc++.h>

using namespace std;

class Human
{
private: // Variabel Private Human.
    string NIK;
    string name;
    string gender;

public:
    /* Constructor */
    Human()
    {
        this->NIK = "";
        this->name = "";
        this->gender = "";
    }
    Human(string NIK, string name, string gender)
    {
        this->NIK = NIK;
        this->name = name;
        this->gender = gender;
    }

    /* Setter & Getter untuk NIK */
    string getNIK()
    {
        return this->NIK;
    }
    void setNIK(string NIK)
    {
        this->NIK = NIK;
    }

    /* Setter & Getter untuk Nama */
    string getName()
    {
        return this->name;
    }
    void setName(string name)
    {
        this->name = name;
    }

    /* Setter & Getter untuk Gender */
    string getGender()
    {
        return this->gender;
    }
    void setGender(string gender)
    {
        this->gender = gender;
    }

    /* Destructor */
    ~Human()
    {
    }
};
