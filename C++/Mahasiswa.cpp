/* Saya Ananda Myzza Marhelio NIM 2100702 mengerjakan soal Latihan 2 dalam mata kuliah Desain Pemrograman Berorientasi
Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

#include <bits/stdc++.h>
#include "SivitasAkademik.cpp"

using namespace std;

class Mahasiswa : public SivitasAkademik // Mahasiswa mewarisi Sivitas Akademik.
{
private: // Variabel Private Mahasiswa.
    string NIM;
    string faculty;
    string major;

public:
    /* Constructor */
    Mahasiswa()
    {
        this->NIM = "";
        this->faculty = "";
        this->major = "";
    }
    Mahasiswa(string NIM, string faculty, string major)
    {
        this->NIM = NIM;
        this->faculty = faculty;
        this->major = major;
    }

    /* Setter & Getter untuk NIM */
    string getNIM()
    {
        return this->NIM;
    }
    void setNIM(string NIM)
    {
        this->NIM = NIM;
    }

    /* Setter & Getter untuk Jurusan */
    string getMajor()
    {
        return this->major;
    }
    void setMajor(string major)
    {
        this->major = major;
    }

    /* Setter & Getter untuk Fakultas */
    string getFaculty()
    {
        return this->faculty;
    }
    void setFaculty(string faculty)
    {
        this->faculty = faculty;
    }

    /* Destructor */
    ~Mahasiswa()
    {
    }
};
