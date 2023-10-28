/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TIRegPagi22205009latihan23NilaiTerbesardanTerkecil;
import java.util.Scanner;
/**
 *
 * @author Axioo
 * NAMA     : Asmalik Hudri
 * Prodi    : Teknik Informatika
 * NIM      : 22205009
 * Deskripsi Program    : Program ini berisi program untuk menampilkan
 * nilai terbesar dan terkecil yang inputannya berasal dari user
 * 
 */


/**
*
* @author Axioo
*/
public class TIRegPagi22205009latihan23NilaiTerbesardanTerkecil {

    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        String namaPetugas = scanner.nextLine();


        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int banyaknyaNilaiMahasiswa = scanner.nextInt();

        int[] nilaiMahasiswa = new int[banyaknyaNilaiMahasiswa];
        for (int i = 0; i < banyaknyaNilaiMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + " = ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }
        int nilaiTerbesar = Integer.MIN_VALUE;
        int nilaiTerkecil = Integer.MAX_VALUE;

        System.out.println("\n====Hasil Nilai Mahasiswa====");
        for (int i = 0; i < banyaknyaNilaiMahasiswa; i++) {
            if (nilaiMahasiswa[i] > nilaiTerbesar) {
                nilaiTerbesar = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMahasiswa[i];
            }
            System.out.println("Nilai mahasiswa ke- " +(i+1) + " = "+nilaiMahasiswa[i]);
        }
        
        System.out.println("\nNilai Terbesar adalah " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);
        System.out.println("\nPetugas: " + namaPetugas);

        scanner.close();
    }
}

        