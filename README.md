## Janji
Saya Ananda Myzza Marhelio NIM 2100702 mengerjakan soal Latihan 2
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin.

# Tugas LATIHAN1DPBO2023
Buatlah program berbasis OOP menggunakan bahasa pemrograman C++, Java, Python, dan PHP yang mengimplementasikan konsep Multi-level Inheritance  pada kelas - kelas tersebut:
Mahasiswa: NIM, nama, jenis_kelamin, fakultas, prodi
Human: NIK, nama, jenis_kelamin
SivitasAkademik: asal_universitas, email_edu

File README berisi desain program, penjelasan alur, dan dokumentasi saat program dijalankan (screenshot/screen record, pilih salah satu bahasa sebagai contoh)

## Desain Program
Desain yang saya buat menggunakan 3 Class:
* Human
* Sivitas Akademik
* Mahasiswa

### `Class Human` memiliki total tiga atribut:
* **NIK** -> NIK manusia, `string`
* **name** -> Nama manusia, `string`
* **gender** -> Jenis kelamin manusia, `char`

### `Class SivitasAkademik` memiliki total dua atribut dan mewarisi atribut dari `Class Human`:
* **asal_universitas** -> Asal Universitas sivitas akademik, `string`
* **email_edu** -> Email Edu sivitas akademik, `string`

### `Class Mahasiswa` memiliki total tiga atribut dan mewarisi atribut dari `Class SivitasAkademik`:
* **NIM** -> NIM mahasiswa, `string`
* **faculty** -> Fakultas mahasiswa, `string`
* **major** -> Program studi mahasiswa, `string`

_Semua Class diatas dilengkapi dengan setter dan getternya_

### Penjelasan multi-level inheritance

`Class Human` -> `Class SivitasAkademik` -> `Class Mahasiswa`

Karena `Mahasiswa` adalah bagian dari suatu `SivitasAkademik` dan `SivitasAkademik` juga merupakan bagian dari `Human`, `Human` bukan merupakan bagian dari `SivitasAkademik` karena tidak semua `Human` merupakan bagian dari `SivitasAkademik`. Maka pewarisannya adalah `Class Human` ke `Class SivitasAkademik` ke `Class Mahasiswa`.

## Alur Program
**semua program mempunyai alur yang sama, kecuali PHP karena inputan secara hardcore dari codenya**

## Dokumentasi
**Program Java**

![Java program](https://github.com/anandamyzza/LATIHAN2DPBO2023/blob/main/Java/Output%20CMD.png?raw=true)
