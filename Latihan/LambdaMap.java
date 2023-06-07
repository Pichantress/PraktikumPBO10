/**
 * File : LambdaMap.java
 * Deskripsi : Implementasi lambda pada Map, digunakan sebagai parameter
 *             pada method
 */

import java.util.*;

public class LambdaMap {
    public static void main(String[] args){
        // kunci -> integer, nilai -> string
        Map<String, String> mahasiswaMap = new HashMap<String,String>();
        // menempatkan elemen kunci dan nilai
        mahasiswaMap.put("24060120120018", "Wahyu Arif Maulana");
        mahasiswaMap.put("24194302482942", "Wahyu");
        mahasiswaMap.put("24218237480289", "Arif");
        mahasiswaMap.put("24381723891794", "Maulana");

        mahasiswaMap.forEach((key, name) -> System.out.println("NIM : "+key+" Nama: "+name));
    }
}
