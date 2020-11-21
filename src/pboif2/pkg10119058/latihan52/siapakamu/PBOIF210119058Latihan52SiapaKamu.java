/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan52.siapakamu;

/**
 *
 * @author
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk menampilkan siapa kamu.
 */
public class PBOIF210119058Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Mahasiswa m = new Mahasiswa();
       Dosen d = new Dosen();
       
       d.setNip("41227829930");
       System.out.println("NIP DOSEN : " + d.getNip());
       d.siapaKamu();
       d.mengajarApa();
       System.out.println();
       m.setNim("10110269");
       System.out.println("NIM MAHASISWA : " + m.getNim());
       m.siapaKamu();
       m.kelasApa();
    }
    
}
