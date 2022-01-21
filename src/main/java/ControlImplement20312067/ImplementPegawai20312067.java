/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlImplement20312067;

import Connection20312067.Konek20312067;
import ControlInterface20312067.InterfacePegawai20312067;
import Model20312067.MPegawai20312067;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramanda Ajisaka Asyraf
 */
public class ImplementPegawai20312067 implements InterfacePegawai20312067 {

   @Override
    public MPegawai20312067 simpan20312067(MPegawai20312067 o20312067) throws SQLException {
        PreparedStatement st = (PreparedStatement) Konek20312067.sambung().prepareStatement("INSERT INTO tbl_pegawai_20312067 VALUES(?,?,?)");
        st.setString(1, o20312067.getNip_20312067());
        st.setString(2, o20312067.getNama_20312067());
        st.setString(3, o20312067.getBagian_20312067());

        st.executeUpdate();
        return o20312067;
    }

    @Override
    public void ubah20312067(MPegawai20312067 o20312067) throws SQLException {
        PreparedStatement st = (PreparedStatement) Konek20312067.sambung().prepareStatement("UPDATE tbl_pegawai_20312067 set Nama_20312067 = ?, Bagian_20312067 = ?  WHERE Nip_20312067 = ?");
        st.setString(1, o20312067.getNama_20312067());
        st.setString(2, o20312067.getBagian_20312067());
        st.setString(3, o20312067.getNip_20312067());
        st.executeUpdate();
    }

    @Override
    public void hapus20312067(String nip20312067) throws SQLException {
        PreparedStatement st = (PreparedStatement) Konek20312067.sambung().prepareStatement("DELETE FROM tbl_pegawai_20312067 WHERE Nip_20312067 = ?");
        st.setString(1, nip20312067);
        st.executeUpdate();
    }

    @Override
    public List<MPegawai20312067> tampil20312067() throws SQLException {
        Statement stm = (Statement) Konek20312067.sambung().createStatement();
        ResultSet rst = stm.executeQuery("SELECT * FROM tbl_pegawai_20312067");
        List<MPegawai20312067> listpegawai20312067 = new ArrayList<>();
        while(rst.next()){
            MPegawai20312067 pegawai = new MPegawai20312067();
            pegawai.setNip_20312067(rst.getString("Nip_20312067"));
            pegawai.setNama_20312067(rst.getString("Nama_20312067"));
            pegawai.setBagian_20312067(rst.getString("Bagian_20312067"));
            listpegawai20312067.add(pegawai);
        }
        return listpegawai20312067;
        }
    
}
