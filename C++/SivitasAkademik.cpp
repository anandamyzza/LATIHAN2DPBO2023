/* Saya Ananda Myzza Marhelio NIM 2100702 mengerjakan soal Latihan 2 dalam mata kuliah Desain Pemrograman Berorientasi
Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

#include <bits/stdc++.h>
#include "Human.cpp"

using namespace std;

class SivitasAkademik : public Human // Sivitas Akademik mewarisi Human.
{
private: // Variabel Private Sivitas Akademik.
    string asal_universitas;
    string email_edu;

public:
    /* Constructor */
    SivitasAkademik()
    {
        this->asal_universitas = "";
        this->email_edu = "";
    }
    SivitasAkademik(string asal_universitas, string email_edu)
    {
        this->asal_universitas = asal_universitas;
        this->email_edu = email_edu;
    }

    /* Setter & Getter untuk Asal Universitas */
    string getAsal_universitas()
    {
        return this->asal_universitas;
    }

    void setAsal_universitas(string asal_universitas)
    {
        this->asal_universitas = asal_universitas;
    }

    /* Setter & Getter untuk Email Edu */
    string getEmail_edu()
    {
        return this->email_edu;
    }
    void setEmail_edu(string email_edu)
    {
        this->email_edu = email_edu;
    }

    /* Destructor */
    ~SivitasAkademik()
    {
    }
};
