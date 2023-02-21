<?php
/* Saya Ananda Myzza Marhelio NIM 2100702 mengerjakan soal Latihan 2 dalam mata kuliah Desain Pemrograman Berorientasi
Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

require("Human.php");

class SivitasAkademik extends Human // Sivitas Akademik mewarisi Human.
{
    /* Attribut Private */
    private $asal_universitas;
    private $email_edu;

    /* Constructor */
    public function __construct($asal_universitas = '', $email_edu = '')
    {
        parent::__construct();
        $this->asal_universitas = $asal_universitas;
        $this->email_edu = $email_edu;
    }

    /* Setter dan Getter */
    /* Setter & Getter untuk Asal Universitas */
    public function getAsal_universitas()
    {
        return $this->asal_universitas;
    }
    public function setAsal_universitas($asal_universitas)
    {
        $this->asal_universitas = $asal_universitas;
    }

    /* Setter & Getter untuk Email Edu */
    public function getEmail_edu()
    {
        return $this->email_edu;
    }
    public function setEmail_edu($email_edu)
    {
        $this->email_edu = $email_edu;
    }

    /* Destructor */
    public function __destruct()
    {
    }
}
