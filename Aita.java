/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aitapunktsexe;

/**
 *
 * @author Family
 */
public class Aita {
    private String id;
    private String dzimta;
    private String vards;
    private String skirne;
    private String dzimDat;
    private String vecums;
    private String statuss;
    private String izslDat;

    public Aita(String id, String dzimta, String vards, String skirne, String dzimDat, String vecums, String statuss, String izslDat) {
        this.id = id;
        this.dzimta = dzimta;
        this.vards = vards;
        this.skirne = skirne;
        this.dzimDat = dzimDat;
        this.vecums = vecums;
        this.statuss = statuss;
        this.izslDat = izslDat;
    }

    public String getId() {
        return id;
    }

    public String getDzimta() {
        return dzimta;
    }

    public String getVards() {
        return vards;
    }

    public String getSkirne() {
        return skirne;
    }

    public String getDzimDat() {
        return dzimDat;
    }

    public String getVecums() {
        return vecums;
    }

    public String getStatuss() {
        return statuss;
    }

    public String getIzslDat() {
        return izslDat;
    }
    
    
    
}
