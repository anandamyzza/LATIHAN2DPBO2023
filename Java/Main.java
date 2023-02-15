import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> list = new ArrayList<>();
        CRUD crud = new CRUD(list);
        int operation, index;
        String name, NIK, NIM, univ, major, faculty, email, gender, find;
        Scanner scanner = new Scanner(System.in);

        // prompt the user for CRUD operations
        do {
            System.out.print("Choose an operation (1: create, 2: read, 3: update, 4: delete, 5: exit): ");
            operation = scanner.nextInt();

            // perform the selected operation based on user input
            switch (operation)
            {
                case 1:
                    System.out.print("Enter Name: ");
                    name = scanner.next();
                    System.out.print("Enter NIK: ");
                    NIK = scanner.next();
                    System.out.print("Enter Gender: ");
                    gender = scanner.next();
                    System.out.print("Enter NIM: ");
                    NIM = scanner.next();
                    System.out.print("Enter University: ");
                    univ = scanner.next();
                    System.out.print("Enter Major: ");
                    major = scanner.next();
                    System.out.print("Enter Faculty: ");
                    faculty = scanner.next();
                    System.out.print("Enter Email: ");
                    email = scanner.next();
                    crud.create(name, NIK, gender, NIM, univ, faculty, major, email);
                    break;
                case 2:
                    crud.read();
                    break;
                case 3:
                    // Search the NIM first, if there is then proceed to update the data, if not, then error handling.
                    System.out.print("Enter NIM: ");
                    find = scanner.next();
                    index = crud.search(find);

                    if (index == -1)
                    {
                        System.out.println("Data don't exist!\n");
                    } else {
                        System.out.print("Enter Nam: ");
                        name = scanner.next();
                        System.out.print("Enter NIK: ");
                        NIK = scanner.next();
                        System.out.print("Enter Gender: ");
                        gender = scanner.next();
                        System.out.print("Enter NIM: ");
                        NIM = scanner.next();
                        System.out.print("Enter University: ");
                        univ = scanner.next();
                        System.out.print("Enter Major: ");
                        major = scanner.next();
                        System.out.print("Enter Faculty: ");
                        faculty = scanner.next();
                        System.out.print("Enter Email: ");
                        email = scanner.next();
                        crud.update(index, name, NIK, gender, NIM, univ, faculty, major, email);
                    }
                    break;
                case 4:
                    System.out.print("Enter NIM: ");
                    find = scanner.next();
                    index = crud.search(find);
                    crud.remove(index);
                    break;
                case 5:
                    System.out.println("BYE.");
                    break;
            }
        } while (operation != 5);
    }
}
