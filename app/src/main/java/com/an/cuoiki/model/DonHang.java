package com.an.cuoiki.model;

import java.util.List;

public class DonHang {
    private int id;
    private int iduser;
    private String diachi;
    private String sodienthoai;
    private String tongtienl;
    private List<Item> item;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getTongtienl() {
        return tongtienl;
    }

    public void setTongtienl(String tongtienl) {
        this.tongtienl = tongtienl;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }
}
