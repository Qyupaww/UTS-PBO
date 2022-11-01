/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Faisal Rahman
 */
public class BankBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bank bnk = new Bank();
        
        System.out.println("Selamat datang di bank XYZ");
        bnk.getsaldo();
        bnk.simpanUang(500000);
        bnk.ambilUang(690000);
    }
    
    
}
