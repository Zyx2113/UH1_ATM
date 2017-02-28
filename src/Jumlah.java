
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arthur Muntu Untu
 */
public class Jumlah {
    int saldo;
    public void ambil (int tab, int t)
    {
        if (t%100!=0)
            JOptionPane.showMessageDialog(null,
            "Mesing ATM 322 tidak menerima uang logam \nSilahkan ulangi kembali!",
            "Transaksi Gagal",0);
        else{
            if (t>tab)
            JOptionPane.showMessageDialog(null,
            "Saldo Anda tidak mencukupi \nSilahkan lakukan penyetoran",
            "Transaksi Gagal",0);
        else if (t<50000)
            JOptionPane.showMessageDialog(null,
            "Besaran minimal pengambilan tunai adalah Rp 50000,00",
            "Transaksi Gagal",0);
        else
        {
            saldo = tab-t;
            JOptionPane.showMessageDialog(null,
            "Saldo Anda saat ini sebesar : " + saldo);
            if (tab<=50000)
                JOptionPane.showMessageDialog(null,
            "Saldo minimal harus Rp 50000,00, segera lakukan penyetoran"
            + "untuk menghindari penutupan akun",
            "Caution!",2);
        }
    }
   }
    public int getsaldo()
    {
        return saldo;
    }
}
