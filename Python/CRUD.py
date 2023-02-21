# Saya Ananda Myzza Marhelio NIM 2100702 mengerjakan soal Latihan 2 dalam mata kuliah Desain Pemrograman Berorientasi
# Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

from Mahasiswa import Mahasiswa


class CRUD:
    # Constructor
    def __init__(self, data: list):
        self.__data = data

    # Public Method
    # Create
    def create(self, name, NIK, gender, asal_universitas, NIM, faculty, major, email_edu):
        mhs = Mahasiswa()
        mhs.setNIK(NIK)
        mhs.setName(name)
        mhs.setGender(gender)
        mhs.setNIM(NIM)
        mhs.setAsal_universitas(asal_universitas)
        mhs.setEmail_edu(email_edu)
        mhs.setMajor(major)
        mhs.setFaculty(faculty)
        self.__data.append(mhs)

    # Read
    def read(self):
        # Jika banyaknya data lebih dari sama dengan 0.
        if len(self.__data) > 0:
            # Maka akan dilakukan proses perulangan print data.
            for i, mhs in enumerate(self.__data):
                print(
                    f"{i+1}. Biodata {mhs.getName()} | NIK: {mhs.getNIK()} | Gender: {mhs.getGender()}")
                print(f"NIM        : {mhs.getNIM()}")
                print(f"University : {mhs.getAsal_universitas()}")
                print(f"Faculty    : {mhs.getFaculty()}")
                print(f"Major      : {mhs.getMajor()}")
                print(f"Email      : {mhs.getEmail_edu()}\n")
        # Jika tidak.
        else:
            # Maka data tidak ada.
            print("\nThere is no data exist!\n")

    # Update
    def update(self, index, name, NIK, gender, asal_universitas, faculty, major, email_edu):
        # Jika index lebih dari sama dengan 0 dan index kurang dari jumlah data.
        if 0 <= index < len(self.__data):
            self.__data[index].setNIK(NIK)
            self.__data[index].setName(name)
            self.__data[index].setGender(gender)
            self.__data[index].setAsal_universitas(asal_universitas)
            self.__data[index].setEmail_edu(email_edu)
            self.__data[index].setMajor(major)
            self.__data[index].setFaculty(faculty)
        # Jika tidak.
        else:
            # Maka tidak ada data.
            print("\nData doesn't exist!\n")

    # Delete
    def remove(self, index):
        # Jika index lebih dari sama dengan 0 dan index kurang dari jumlah data.
        if 0 <= index < len(self.__data):
            # Maka data akan dihapus.
            self.__data.pop(index)
        # Jika tidak.
        else:
            # Maka tidak ada data.
            print("\nData doesn't exist!\n")

    # Search
    def search(self, NIM):
        temp = -1  # Inisialisasi.
        # Perulangan untuk mencari index NIM yang dicari.
        for i, mhs in enumerate(self.__data):
            # Jika NIM dalam list sama dengan NIM yang diinput user.
            if mhs.getNIM() == NIM:
                # Maka temp menampung index NIM tersebut.
                temp = i
        # Return nilai temp.
        return temp
