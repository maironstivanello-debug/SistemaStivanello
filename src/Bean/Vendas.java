/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

/**
 *
 * @author lxn
 */
public class Vendas {

    private int mms_idVenda;
    private int mms_idCliente;
    private String mms_dataVenda;
    private String mms_status;
    private double mms_valorTotal;

    public int getMms_idVenda() {
        return mms_idVenda;
    }

    public void setMms_idVenda(int mms_idVenda) {
        this.mms_idVenda = mms_idVenda;
    }

    public int getMms_idCliente() {
        return mms_idCliente;
    }

    public void setMms_idCliente(int mms_idCliente) {
        this.mms_idCliente = mms_idCliente;
    }

    public String getMms_dataVenda() {
        return mms_dataVenda;
    }

    public void setMms_dataVenda(String mms_dataVenda) {
        this.mms_dataVenda = mms_dataVenda;
    }

    public String getMms_status() {
        return mms_status;
    }

    public void setMms_status(String mms_status) {
        this.mms_status = mms_status;
    }

    public double getMms_valorTotal() {
        return mms_valorTotal;
    }

    public void setMms_valorTotal(double mms_valorTotal) {
        this.mms_valorTotal = mms_valorTotal;
    }
}