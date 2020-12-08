/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;

/**
 *
 * @author nel
 */
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class data {
    ArrayList<String> nim = new ArrayList();    
    ArrayList<String> nama = new ArrayList();
    ArrayList<Date> tanggal = new ArrayList();
    ArrayList<Integer> gender = new ArrayList();
    int pilihan;
    Scanner input=new Scanner(System.in);
    
    void pilihan() throws ParseException{
        OUTER:
        while (true) {
            System.out.println("************************");
            System.out.println("Main Menu");
            System.out.println("************************");
            System.out.println("1. Tambah Data\n"
                    + "2. Hapus Data\n"
                    + "3. Cari Data\n"
                    + "4. Tampil Data\n"
                    + "5. Keluar");
            System.out.print("Pilih Nomor Menu : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    //Tambah Data
                    System.out.println("************************");
                    System.out.print("Input jumlah Data : ");   
                    int jumlah = input.nextInt();
                    for(int a = 0; a < jumlah; a++)
                    {
                        System.out.println("************************");
                        System.out.println("Data ke-"+(a+1));
                        System.out.print("Masukkan NIM              : ");                        
                        String value = input.next();
                        nim.add(value);
                        
                        System.out.print("Masukkan Nama             : ");
                        Scanner inputx = new Scanner(System.in);
                        String value1;
                        value1 = inputx.nextLine();
                        nama.add(value1);

                        System.out.print("Masukkan Tanggal Lahir    : ");
                        Scanner input1 = new Scanner(System.in);
                        String sDate1;
                        sDate1 = input1.nextLine(); 
                        SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy"); 
                        Date date1=formatter1.parse(sDate1);
                        tanggal.add(date1);

                        System.out.print("Jenis Kelamin (0:P 1:W)   : ");
                        int value3 = input.nextInt();
                        gender.add(value3);                        
                    }
                    break;
                    
                case 2:
                    //Hapus Data
                    System.out.println("************************");
                    if(nim.size() <= 0){
                        System.out.println("\nData Masih Kosong");
                    } else {
                        for(int i=0; i<nim.size(); i++){
                           System.out.println("Data ke-"+(i+1)+" "+nim.get(i));
                       }
                        System.out.print("\nPilih Data Yang Mau Dihapus : ");                    
                        String value5 = input.next();
                        int baris = nim.indexOf(value5);
                        nim.remove(baris);
                        nama.remove(baris);
                        tanggal.remove(baris);
                        gender.remove(baris);   
                        System.out.println("Data Berhasil Dihapus \n");
                    }
                    break;
                    
                case 3:
                    //Cari Data
                    System.out.println("************************");
                    if(nim.size() <= 0){
                        System.out.println("\nData Masih Kosong");
                    } else {
                        System.out.println("\nCari Data \n"
                        + "1. Berdasarkan Gender\n"
                        + "2. Berdasarkan NIM");
                        System.out.print("Masukkan Data : ");
                        int tipe = input.nextInt();
                        switch (tipe) {
                            case 1:
                                System.out.print("Masukkan Gender (0/1) : ");
                                int tipeX = input.nextInt();
                                for(int i = 0; i<nim.size(); i++){
                                    if (gender.get(i) == tipeX) {
                                        System.out.println("************************");
                                        System.out.println("NIM           : "+nim.get(i));
                                        System.out.println("Nama          : "+nama.get(i));
                                        System.out.println("Tanggal Lahir : "+tanggal.get(i));
                                        System.out.println("Jenis Kelamin : "+gender.get(i)+"\n");
                                    } else if (gender.get(i) == tipeX){
                                        System.out.println("************************");
                                        System.out.println("NIM           : "+nim.get(i));
                                        System.out.println("Nama          : "+nama.get(i));
                                        System.out.println("Tanggal Lahir : "+tanggal.get(i));
                                        System.out.println("Jenis Kelamin : "+gender.get(i)+"\n");
                                    }
                                }
                                break;
                            case 2:
                                System.out.print("Masukkan NIM : ");
                                String tipeY = input.next();
                                int cariNim = Collections.binarySearch(nim, tipeY);
                                String nim1 = nim.get(cariNim);
                                String nama1 = nama.get(cariNim);
                                Date tanggal1 = tanggal.get(cariNim);
                                int gender1 = gender.get(cariNim);
                                System.out.println("************************");
                                System.out.println("NIM           : "+nim1);
                                System.out.println("Nama          : "+nama1);
                                System.out.println("Tanggal Lahir : "+tanggal1);
                                System.out.println("Jenis Kelamin : "+gender1+"\n");
                                break;
                            default:
                                System.out.println("Maaf, Perintah Tidak Dikenali.");
                                break;
                        }
                            }
                            break;
                    
                case 4:
                    //Lihat Data
                    System.out.println("************************");
                    if(nim.size() <= 0){
                        System.out.println("\nData Masih Kosong");
                    } else {
                        System.out.println("\nMenampilkan Semua Data Mahasiswa");
                        for(int i = 0; i<nim.size(); i++){
                            System.out.println("************************");
                            System.out.println("NIM           : "+nim.get(i));
                            System.out.println("Nama          : "+nama.get(i));
                            System.out.println("Tanggal Lahir : "+tanggal.get(i));                        
                            if (gender.get(i) ==0 ) {
                                String genders = "Pria";
                                System.out.println("Gender        : "+genders+"\n");
                            } else if (gender.get(i) == 1) {
                                String genders = "Wanita";
                                System.out.println("Gender        : "+genders+"\n");
                            }                                                
                        }
                        System.out.println("Jumlah Mahasiswa : " + nim.size());
                        System.out.println("************************");
                    }
                    break;
                    
                case 5:
                    break;
                default:
                    break;
            }
            if (pilihan <= 0 | pilihan > 4){
                System.out.println("Terima Kasih");
                break;
            }
        }
}
}
