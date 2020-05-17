/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan3;

/**
 *
 * @author winny
 */
public class CobaArrayMultiDimensi {
    public static void main(String[] args) {
        
        //                 0     1     2
        //                0 1   0 1   0 1
        int [][]angka = {{2,1},{3,2},{2,3}};
        
        System.out.println(angka[1][1]);
        
        String [][] tas = {
            {"Contekan", "Pulpen"},
            {"Diary","Cash Bon"},
            {"Duit","Ktp"}
        };
        for (String[] ta : tas) {
            System.out.println(tas [0][1]);
        }
    }
}
