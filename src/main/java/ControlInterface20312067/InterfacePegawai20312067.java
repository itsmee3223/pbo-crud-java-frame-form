/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ControlInterface20312067;

import Model20312067.MPegawai20312067;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Ramanda Ajisaka Asyraf
 */
public interface InterfacePegawai20312067 {
    MPegawai20312067 simpan20312067(MPegawai20312067 o20312067) throws SQLException;
    void ubah20312067(MPegawai20312067 o20312067) throws SQLException;
    void hapus20312067(String nip20312067) throws SQLException;
    List<MPegawai20312067> tampil20312067() throws SQLException;
}
