<?php
/* Saya Ananda Myzza Marhelio NIM 2100702 mengerjakan soal Latihan 2 dalam mata kuliah Desain Pemrograman Berorientasi
Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

class Human
{
    /* Attribut Private */
    private $NIK;
    private $name;
    private $gender;
    private $photo;

    /* Constructor */
    public function __construct($NIK = '', $name = '', $gender = '', $photo = '')
    {
        $this->NIK = $NIK;
        $this->name = $name;
        $this->gender = $gender;
        $this->photo = $photo;
    }

    /* Setter dan Getter */
    /* Setter & Getter untuk NIK */
    public function getNIK()
    {
        return $this->NIK;
    }
    public function setNIK($NIK)
    {
        $this->NIK = $NIK;
    }

    /* Setter & Getter untuk Nama */
    public function getName()
    {
        return $this->name;
    }
    public function setName($name)
    {
        $this->name = $name;
    }

    /* Setter & Getter untuk Gender */
    public function getGender()
    {
        return $this->gender;
    }
    public function setGender($gender)
    {
        $this->gender = $gender;
    }

    /* Destructor */
    public function __destruct()
    {
    }
}
?>
