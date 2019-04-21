package service;

import java.util.*;
import entity.*;

public class smartphoneservice {

    private static List<smartphone> data = new LinkedList<smartphone>();

    public void tambahData(smartphone smr) {
        data.add(smr);
        System.out.println("Data sudah tersimpan");
    }

    public void ubahData(smartphone smr) {
        int idx = data.indexOf(smr);
        if(idx >= 0) data.set(idx, smr);
        System.out.println("Data sudah berubah");
    }

    public void hapusData(String id) {
        int idx = data.indexOf(new smartphone(id, "", "",""));
        if(idx >= 0) data.remove(idx);
        System.out.println("Data telah terhapus");
    }

    public void tampilkanData() {
        System.out.println("\n--= Isi Data =--");
        int urutan = 1;
        for(smartphone smr : data) {
            System.out.println("data ke-" + urutan++);
            System.out.println("  ID : " + smr.getid());
            System.out.println("  NAMA : " + smr.getNama());
            System.out.println("  MERK : " + smr.getmerk());
            System.out.println("  MODEL: " + smr.getmodel());
        }
    }

}