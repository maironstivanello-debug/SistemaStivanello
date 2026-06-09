/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

/**
 *
 * @author lxn
 */
public class Compras {

    private int mms_idCompra;
    private String mms_status;
    private int mms_idFornecedor;
    private String mms_dataCompra;
    private double mms_valorTotal;

    public int getMms_idCompra() {
        return mms_idCompra;
    }

    public void setMms_idCompra(int mms_idCompra) {
        this.mms_idCompra = mms_idCompra;
    }

    public String getMms_status() {
        return mms_status;
    }

    public void setMms_status(String mms_status) {
        this.mms_status = mms_status;
    }

    public int getMms_idFornecedor() {
        return mms_idFornecedor;
    }

    public void setMms_idFornecedor(int mms_idFornecedor) {
        this.mms_idFornecedor = mms_idFornecedor;
    }

    public String getMms_dataCompra() {
        return mms_dataCompra;
    }

    public void setMms_dataCompra(String mms_dataCompra) {
        this.mms_dataCompra = mms_dataCompra;
    }

    public double getMms_valorTotal() {
        return mms_valorTotal;
    }

    public void setMms_valorTotal(double mms_valorTotal) {
        this.mms_valorTotal = mms_valorTotal;
    }
}
