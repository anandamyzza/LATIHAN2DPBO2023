## Janji
Saya Ananda Myzza Marhelio NIM 2100702 mengerjakan soal Latihan 2 dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# Deskripsi Tugas Latihan 1 DPBO 2023
Buatlah program berbasis OOP menggunakan bahasa pemrograman C++, Java, Python, dan PHP yang mengimplementasikan konsep Multi-level Inheritance  pada kelas - kelas tersebut:
* **Mahasiswa**: NIM, nama, jenis_kelamin, fakultas, prodi
* **Human**: NIK, nama, jenis_kelamin
* **SivitasAkademik**: asal_universitas, email_edu

## Desain Program
Terdapat 4 class di program ini, yaitu:
1. **Class Human** memiliki 3 atribut yaitu NIK (Nomor Induk Kependudukan), name (Nama), gender (Jenis Kelamin), dan 1 atribut tambahan di bahasa PHP, photo (Foto Profil). **Human** merupakan **_parent_** dari **SivitasAkademik** karena **SivitasAkademik** adalah sebuah komunitas yang pada dasarnya melibatkan manusia (Dosen, mahasiswa, staff, dll) sehingga memiliki objek yang sama dengan **Human** yaitu manusia. Setiap atribut pada class ini diberi setter dan getter.
2. **Class SivitasAkademik** memiliki 2 atribut yaitu asal_universitas (Asal Universitas) dan email_edu (Email Pendidikan). Karena **SivitasAkademik** merupakan komunitas yang melibatkan manusia (**Human**), namun tidak semua manusia (**Human**) merupakan bagian dari suatu **SivitasAkademik**, sehingga **Class SivitasAkademik** menjadi **_child_** dari **Class Human**. Setiap atribut pada class ini diberi setter dan getter.
3. **Class Mahasiswa** memiliki 3 atribut yaitu NIM (Nomor Induk Mahasiswa), faculty (Fakultas), dan major (Program Studi). **Mahasiswa** merupakan **_child_** dari **Class SivitasAkademik** karena menurut definisi dari **SivitasAkademik**, **Mahasiswa** yang memiliki objek yang sama dengan **Human** yaitu manusia, merupakan salah satu bagian dari komunitas (**SivitasAkademik**) tersebut. Dari penjelasan berikut, maka **Mahasiswa** yang merupakan **_child_** dari **Class SivitasAkademik* juga menjadi **_grandchild_** dari **Human**. Setiap atribut pada class ini diberi setter dan getter.
4. **Class CRUD** _(C++, Java, Python)_ dan **Class Cread** _(PHP)_ merupakan class yang dibuat untuk metode Create (Menambahkan data, create()), Read (Menampilkan data, read()), Update (Mengubah data, update()), dan Delete (Menghapus data, remove()), serta 1 metode tambahan untuk membantu proses update dan delete yaitu search (Mencari data berdasarkan NIM, search()). Khusus untuk bahasa PHP, hanya memiliki metode create() dan read() saja dengan nama **Class Cread**. Class ini memiliki 1 atribut dinamakan data yang merupakan List of Object dari Class Mahasiswa.

### UML Desain
![UML drawio](https://user-images.githubusercontent.com/100767177/220305241-610a3cbf-6829-4a9e-a2ad-73e30ce4195a.png)

## Alur Program
C++, Java, dan Python memiliki alur program yang sama, yaitu sebagai berikut:
1. Pengguna akan dihadapi dengan menu yang terdiri dari 5 pilihan.

![Screenshot_20230215_220851](https://user-images.githubusercontent.com/100767177/219066797-dac1d494-b1b9-4539-a832-dafe12df1267.png)

2. Pilihan 1 akan menampilkan tampilan formulir yang harus diisi oleh pengguna.
3. Pilihan 2 akan menampilkan data mahasiswa yang sudah diinput pengguna, terdapat tampilan lain apabila tidak ada data sama sekali.
4. Pilihan 3, pengguna akan diminta menginput NIM mahasiswa yang ingin diubah datanya, terdapat tampilan lain apabila NIM yang dicari tidak ada.
5. Pilihan 4, pengguna akan diminta menginput NIM mahasiswa yang ingin dihapus datanya, terdapat tampilan lain apabila NIM yang dicari tidak ada.
6. Pilihan 5, program akan terhenti.
7. Jika memilih selain pilihan 1-5, maka akan muncul tampilan `Invalid Operation.`.

*Note: Di bahasa PHP, inputan dilakukan secara hardcode.*

## Dokumentasi
#### 1. PHP
![Dokumentasi](https://user-images.githubusercontent.com/100767177/220293924-baacd4e2-3ab8-416d-8468-3d752d3ad172.png)

#### 2. Java
![Java](https://raw.githubusercontent.com/anandamyzza/LATIHAN2DPBO2023/main/Java/Output%20CMD.png)

#### 2. Python
![Dokumentasi_1](https://user-images.githubusercontent.com/100767177/220294339-ce994aad-20b5-4432-b563-aec86fbc7c3f.png)
![Dokumentasi_2](https://user-images.githubusercontent.com/100767177/220294369-47d3e4d9-40b2-4bc5-9d9d-f84daa4a34a1.png)
