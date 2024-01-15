import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class belajarArray {
    public static void main(String[] args) throws IOException {
        int[] angkasaya = new int[4];
        angkasaya[0] = 4;
        angkasaya[1] = 5;
        angkasaya[2] = 9;
        angkasaya[3] = 14;

        System.out.println(angkasaya[1]);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukan jumlah data yang diinput : ");
        int jum_data = Integer.parseInt(reader.readLine());
        String[] nama = new String[jum_data];
        for(int indexsaya=0;indexsaya < nama.length;indexsaya++){
            System.out.println("Masukan nama yang ke - " + (indexsaya+1) + " = ");
            String nama_input = reader.readLine();
            nama[indexsaya] = nama_input;
            }
        for (int input = 0; input < nama.length;input++){
            System.out.println("Data nama yang ke "+(input+1)+":");
            System.out.println("Nama :" +nama[input]);
        }


    }
}
