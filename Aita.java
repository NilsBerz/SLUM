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
    private String vecums;  //if tas un tas vecums un dzimums tad ir jers un ttl
    private String statuss;
    private String izslDat;
    private String ganampulkaID;
    private String piezimes;
    private String matesID;
    private String tevaID;
    private String bernaID;
    private boolean lecinatas;
    private boolean grusnas;
    private boolean atnesusas;
    private String svars; 
    private String developerThingamajig;    //strings kura vares likt kkadaslietas
                                            //saistiba ar atlasi konkretam lietam
                                            //par aitaam, similar to DB 101 string there
    //kad svershanas
    //kas ar vilnu
    //boolean cirpshana ??
    

    public Aita(String id,String ganampulkaID, String dzimta, String vards, String skirne, 
            String dzimDat, String vecums, String statuss, 
            String izslDat,String matesID,
            String tevaID,String bernaID, String piezimes,boolean lec, boolean grus, boolean atnes,
            String svars, String developerThingamajig) {    //18
        this.id = id;
        this.dzimta = dzimta;
        this.vards = vards;
        this.skirne = skirne;
        this.dzimDat = dzimDat;
        this.vecums = vecums;
        this.statuss = statuss;
        this.izslDat = izslDat;
        this.ganampulkaID = ganampulkaID;
        this.piezimes = piezimes;
        this.matesID = matesID;
        this.tevaID = tevaID;
        this.bernaID = bernaID;
        this.lecinatas = lec;
        this.grusnas = grus;
        this.atnesusas = atnes;
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
    
     public String getGanampulkaID() {
        return ganampulkaID;
    }
    
     public String getMatesID() {
        return matesID;
    }
     
    public String getTevaID() {
        return tevaID;
    }
      
    public String getPiezimes() {
        return piezimes;
    }
    public boolean getlecinatas(){
        return lecinatas;
    }
    public boolean getGrusnas(){
        return grusnas;
}
    public boolean getAtnesusas(){
        return atnesusas;
    }

    public String getBernaID() {
        return bernaID;
    }

    public boolean isLecinatas() {
        return lecinatas;
    }

    public boolean isGrusnas() {
        return grusnas;
    }

    public boolean isAtnesusas() {
        return atnesusas;
    }

    public String getSvars() {
        return svars;
    }

    public String getDeveloperThingamajig() {
        return developerThingamajig;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDzimta(String dzimta) {
        this.dzimta = dzimta;
    }

    public void setVards(String vards) {
        this.vards = vards;
    }

    public void setSkirne(String skirne) {
        this.skirne = skirne;
    }

    public void setDzimDat(String dzimDat) {
        this.dzimDat = dzimDat;
    }

    public void setVecums(String vecums) {
        this.vecums = vecums;
    }

    public void setStatuss(String statuss) {
        this.statuss = statuss;
    }

    public void setIzslDat(String izslDat) {
        this.izslDat = izslDat;
    }

    public void setGanampulkaID(String ganampulkaID) {
        this.ganampulkaID = ganampulkaID;
    }

    public void setPiezimes(String piezimes) {
        this.piezimes = piezimes;
    }

    public void setMatesID(String matesID) {
        this.matesID = matesID;
    }

    public void setTevaID(String tevaID) {
        this.tevaID = tevaID;
    }

    public void setBernaID(String bernaID) {
        this.bernaID = bernaID;
    }

    public void setLecinatas(boolean lecinatas) {
        this.lecinatas = lecinatas;
    }

    public void setGrusnas(boolean grusnas) {
        this.grusnas = grusnas;
    }

    public void setAtnesusas(boolean atnesusas) {
        this.atnesusas = atnesusas;
    }

    public void setSvars(String svars) {
        this.svars = svars;
    }

    public void setDeveloperThingamajig(String developerThingamajig) {
        this.developerThingamajig = developerThingamajig;
    }

}
