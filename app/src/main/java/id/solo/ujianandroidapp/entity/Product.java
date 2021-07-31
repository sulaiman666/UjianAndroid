package id.solo.ujianandroidapp.entity;

import com.google.gson.annotations.SerializedName;

public class Product {
    @SerializedName("id")
    private long id;
    @SerializedName("namaProduk")
    private String namaProduk;
    @SerializedName("hargaProduk")
    private String hargaProduk;
    @SerializedName("deskripsiProduk")
    private String deskripsiProduk;
    @SerializedName("kategoriProduk")
    private String kategoriProduk;
    @SerializedName("linkProduk")
    private String linkProduk;

    public Product(long id, String namaProduk, String hargaProduk, String deskripsiProduk, String kategoriProduk, String linkProduk) {
        this.id = id;
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
        this.deskripsiProduk = deskripsiProduk;
        this.kategoriProduk = kategoriProduk;
        this.linkProduk = linkProduk;
    }

    public Product() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public String getHargaProduk() {
        return hargaProduk;
    }

    public void setHargaProduk(String hargaProduk) {
        this.hargaProduk = hargaProduk;
    }

    public String getDeskripsiProduk() {
        return deskripsiProduk;
    }

    public void setDeskripsiProduk(String deskripsiProduk) {
        this.deskripsiProduk = deskripsiProduk;
    }

    public String getKategoriProduk() {
        return kategoriProduk;
    }

    public void setKategoriProduk(String kategoriProduk) {
        this.kategoriProduk = kategoriProduk;
    }

    public String getLinkProduk() {
        return linkProduk;
    }

    public void setLinkProduk(String linkProduk) {
        this.linkProduk = linkProduk;
    }
}
