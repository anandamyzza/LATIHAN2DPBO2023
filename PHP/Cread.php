<?php
/* Saya Ananda Myzza Marhelio NIM 2100702 mengerjakan soal Latihan 2 dalam mata kuliah Desain Pemrograman Berorientasi
Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

require("Mahasiswa.php");

class Cread
{
    private $data = array();

    /* Constructor */
    public function __construct($data = [])
    {
        $this->data = $data;
    }

    /* Public Method */
    /* Create */
    public function create($name, $NIK, $gender, $asal_universitas, $NIM, $faculty, $major, $email_edu, $photo)
    {
        $mhs = new Mahasiswa();

        $mhs->setNIK($NIK);
        $mhs->setName($name);
        $mhs->setGender($gender);
        $mhs->setNIM($NIM);
        $mhs->setAsal_universitas($asal_universitas);
        $mhs->setEmail_edu($email_edu);
        $mhs->setMajor($major);
        $mhs->setFaculty($faculty);
        $mhs->setPhoto($photo);

        array_push($this->data, $mhs);
    }

    /* Read */
    public function read()
    {
        // Print data.
        echo "<table border='3' cellpadding='5'>";
        echo "<tr>
            <th> Name </th>
            <th> NIK </th>
            <th> Gender </th>
            <th> NIM </th>
            <th> University </th>
            <th> Faculty </th>
            <th> Major </th>
            <th> Email </th>
            <th> Photo </th>
            </tr>";
        for ($i = 0; $i < sizeof($this->data); $i++)
        {
            echo "<tr><td>";
            echo $this->data[$i]->getName();
            echo "</td><td>";
            echo $this->data[$i]->getNIK();
            echo "</td><td>";
            echo $this->data[$i]->getGender();
            echo "</td><td>";
            echo $this->data[$i]->getNIM();
            echo "</td><td>";
            echo $this->data[$i]->getAsal_universitas();
            echo "</td><td>";
            echo $this->data[$i]->getFaculty();
            echo "</td><td>";
            echo $this->data[$i]->getMajor();
            echo "</td><td>";
            echo $this->data[$i]->getEmail_edu();
            echo "</td><td>";
            echo "<img src='" . $this->data[$i]->getPhoto(). "'style='width: 100px'>";
            echo "</td></tr>";
        }
        echo "</table>";

    }

    /* Destructor */
    public function __destruct()
    {
    }
}
?>