<?php
/* Saya Ananda Myzza Marhelio NIM 2100702 mengerjakan soal Latihan 2 dalam mata kuliah Desain Pemrograman Berorientasi
Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

require("SivitasAkademik.php");

class Mahasiswa extends SivitasAkademik // Mahasiswa mewarisi Sivitas Akademik.
{
    /* Attribut Private */
    private $NIM;
    private $faculty;
    private $major;

    /* Constructor */
    public function __construct($NIM = '', $faculty = '', $major = '')
    {
        parent::__construct();
        $this->NIM = $NIM;
        $this->faculty = $faculty;
        $this->major = $major;
    }

    /* Setter dan Getter */
    /* Setter & Getter untuk NIM */
    public function getNIM()
    {
        return $this->NIM;
    }
    public function setNIM($NIM)
    {
        $this->NIM = $NIM;
    }

    /* Setter & Getter untuk Jurusan */
    public function getMajor()
    {
        return $this->major;
    }
    public function setMajor($major)
    {
        $this->major = $major;
    }

    /* Setter & Getter untuk Fakultas */
    public function getFaculty()
    {
        return $this->faculty;
    }
    public function setFaculty($faculty)
    {
        $this->faculty = $faculty;
    }

    /* Setter & Getter untuk Foto */
    public function getPhoto()
    {
        return $this->photo;
    }
    public function setPhoto($photo)
    {
        $this->photo = $photo;
    }

    /* Destructor */
    public function __destruct()
    {
    }
}
