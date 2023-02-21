<?php
/* Saya Ananda Myzza Marhelio NIM 2100702 mengerjakan soal Latihan 2 dalam mata kuliah Desain Pemrograman Berorientasi
Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

require("Cread.php");

$data = array(); // Array untuk menampung data yang user input.
$list = new Cread($data); // Instansiasi Cread.

/* Create/Add Data Mahasiswa */
echo "Data Mahasiswa";
$list->create("Ananda Myzza", "1309", "Pria", "Universitas Pendidikan Indonesia", "2100702", "FPMIPA", "Computer Science", "anandamyzza@upi.edu", "img/sleeazy.jpg");
$list->create("Jean Gunnhildr", "1403", "Wanita", "University of Mondstadt", "2100314", "CSF", "Cultural Science", "jeangunnhildr@mond.edu", "img/Jean.jfif");
$list->create("Eula Lawrence", "2510", "Wanita", "University of Mondstadt", "2101025", "CSF", "Cultural Science", "eula@mond.edu", "img/Eula.jpg");
$list->create("Lisa Minci", "0906", "Wanita", "Sumeru Akademiya", "2100069", "WRF", "Ley Line Science", "lalisaminci@akademiya.edu", "img/Lisa.jpg");

// Read data mahasiswa
$list->read();

?>