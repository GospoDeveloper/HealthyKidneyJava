package com.example.gospo.HealthyKidneyApp.model;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

@Entity
public class FormularNutritional {

    public FormularNutritional() {
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "varsta")
    private int varsta;

    @Column(name = "sexul")
    private String sexul;

    @Column(name = "domiciliu")
    private String domiciliu;

    @Column(name = "ocupatia")
    private String ocupatia;

    @Column(name = "greutate")
    private int greutate;

    @Column(name = "inaltime")
    private int inaltime;

    @Column(name = "localizare")
    private String localizare;

    @Column(name = "antecedenteCalculi")
    private String antecedenteCalculi;

    @Column(name = "antecedenteInfectie")
    private String antecedenteInfectie;

    @Column(name = "antecedenteOperatie")
    private String antecedenteOperatie;

    @Column(name = "tipOperatieAntecedente")
    private String tipOperatieAntecedente;
    @Column(name = "primulEpisodLitiaza")
    private String primulEpisodLitiaza;

    @Column(name = "episodActual")
    private String episodActual;

    @Column(name = "antecedenteHeredocolaterale")
    private String antecedenteHeredocolaterale;

    @Column(name = "gradRudenie")
    private String gradRudenie;

    @Column(name = "prezentaInZona")
    private String prezentaInZona;

    @Column(name = "cantitateApa")
    private int cantitateApa;

    @Column(name = "sursaApa")
    private String sursaApa;

    @Column(name = "marcaApa")
    private String marcaApa;
    @Column(name = "carbogazoase")
    private String carbogazoase;

    @Column(name = "cantitateCarbogazoase")
    private String cantitateCarbogazoase;
    @Column(name = "consumSucuriNaturale")
    private String consumSucuriNaturale;
    @Column(name = "cantitateSucuriNaturale")
    private int cantitateSucuriNaturale;
    @Column(name = "cantitateLapte")
    private int cantitateLapte;
    @Column(name = "cantitateMese")
    private int cantitateMese;
    @Column(name = "cantitateLegumeSaptamana")
    private int cantitateLegumeSaptamana;
    @Column(name = "cantitateLegumeZi")
    private int cantitateLegumeZi;
    @Column(name = "cantitateRosiiSaptamana")
    private int cantitateRosiiSaptamana;
    @Column(name = "cantitateCartofiSaptamana")
    private int cantitateCartofiSaptamana;
    @Column(name = "cantitateFructeSaptamana")
    private int cantitateFructeSaptamana;
    @Column(name = "fructeMicDejun")
    private String fructeMicDejun;
    @Column(name = "cantitateCarneSaptamana")
    private int cantitateCarneSaptamana;
    @Column(name = "cantitateOua")
    private int cantitateOua;
    @Column(name = "sare")
    private String sare;
    @Column(name = "cantitateSare")
    private int cantitateSare;
    @Column(name = "cantitatePaine")
    private int cantitatePaine;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getSexul() {
        return sexul;
    }

    public void setSexul(String sexul) {
        this.sexul = sexul;
    }

    public String getDomiciliu() {
        return domiciliu;
    }

    public void setDomiciliu(String domiciliu) {
        this.domiciliu = domiciliu;
    }

    public String getOcupatia() {
        return ocupatia;
    }

    public void setOcupatia(String ocupatia) {
        this.ocupatia = ocupatia;
    }

    public int getGreutate() {
        return greutate;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    public int getInaltime() {
        return inaltime;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public String getAntecedenteCalculi() {
        return antecedenteCalculi;
    }

    public void setAntecedenteCalculi(String antecedenteCalculi) {
        this.antecedenteCalculi = antecedenteCalculi;
    }

    public String getAntecedenteInfectie() {
        return antecedenteInfectie;
    }

    public void setAntecedenteInfectie(String antecedenteInfectie) {
        this.antecedenteInfectie = antecedenteInfectie;
    }

    public String getAntecedenteOperatie() {
        return antecedenteOperatie;
    }

    public void setAntecedenteOperatie(String antecedenteOperatie) {
        this.antecedenteOperatie = antecedenteOperatie;
    }

    public String getTipOperatieAntecedente() {
        return tipOperatieAntecedente;
    }

    public void setTipOperatieAntecedente(String tipOperatieAntecedente) {
        this.tipOperatieAntecedente = tipOperatieAntecedente;
    }

    public String getPrimulEpisodLitiaza() {
        return primulEpisodLitiaza;
    }

    public void setPrimulEpisodLitiaza(String primulEpisodLitiaza) {
        this.primulEpisodLitiaza = primulEpisodLitiaza;
    }

    public String getEpisodActual() {
        return episodActual;
    }

    public void setEpisodActual(String episodActual) {
        this.episodActual = episodActual;
    }

    public String getAntecedenteHeredocolaterale() {
        return antecedenteHeredocolaterale;
    }

    public void setAntecedenteHeredocolaterale(String antecedenteHeredocolaterale) {
        this.antecedenteHeredocolaterale = antecedenteHeredocolaterale;
    }

    public String getGradRudenie() {
        return gradRudenie;
    }

    public void setGradRudenie(String gradRudenie) {
        this.gradRudenie = gradRudenie;
    }

    public String getPrezentaInZona() {
        return prezentaInZona;
    }

    public void setPrezentaInZona(String prezentaInZona) {
        this.prezentaInZona = prezentaInZona;
    }

    public int getCantitateApa() {
        return cantitateApa;
    }

    public void setCantitateApa(int cantitateApa) {
        this.cantitateApa = cantitateApa;
    }

    public String getSursaApa() {
        return sursaApa;
    }

    public void setSursaApa(String sursaApa) {
        this.sursaApa = sursaApa;
    }

    public String getMarcaApa() {
        return marcaApa;
    }

    public void setMarcaApa(String marcaApa) {
        this.marcaApa = marcaApa;
    }

    public String getCarbogazoase() {
        return carbogazoase;
    }

    public void setCarbogazoase(String carbogazoase) {
        this.carbogazoase = carbogazoase;
    }

    public String getCantitateCarbogazoase() {
        return cantitateCarbogazoase;
    }

    public void setCantitateCarbogazoase(String cantitateCarbogazoase) {
        this.cantitateCarbogazoase = cantitateCarbogazoase;
    }

    public String getConsumSucuriNaturale() {
        return consumSucuriNaturale;
    }

    public void setConsumSucuriNaturale(String consumSucuriNaturale) {
        this.consumSucuriNaturale = consumSucuriNaturale;
    }

    public int getCantitateSucuriNaturale() {
        return cantitateSucuriNaturale;
    }

    public void setCantitateSucuriNaturale(int cantitateSucuriNaturale) {
        this.cantitateSucuriNaturale = cantitateSucuriNaturale;
    }

    public int getCantitateLapte() {
        return cantitateLapte;
    }

    public void setCantitateLapte(int cantitateLapte) {
        this.cantitateLapte = cantitateLapte;
    }

    public int getCantitateMese() {
        return cantitateMese;
    }

    public void setCantitateMese(int cantitateMese) {
        this.cantitateMese = cantitateMese;
    }

    public int getCantitateLegumeSaptamana() {
        return cantitateLegumeSaptamana;
    }

    public void setCantitateLegumeSaptamana(int cantitateLegumeSaptamana) {
        this.cantitateLegumeSaptamana = cantitateLegumeSaptamana;
    }

    public int getCantitateLegumeZi() {
        return cantitateLegumeZi;
    }

    public void setCantitateLegumeZi(int cantitateLegumeZi) {
        this.cantitateLegumeZi = cantitateLegumeZi;
    }

    public int getCantitateRosiiSaptamana() {
        return cantitateRosiiSaptamana;
    }

    public void setCantitateRosiiSaptamana(int cantitateRosiiSaptamana) {
        this.cantitateRosiiSaptamana = cantitateRosiiSaptamana;
    }

    public int getCantitateCartofiSaptamana() {
        return cantitateCartofiSaptamana;
    }

    public void setCantitateCartofiSaptamana(int cantitateCartofiSaptamana) {
        this.cantitateCartofiSaptamana = cantitateCartofiSaptamana;
    }

    public int getCantitateFructeSaptamana() {
        return cantitateFructeSaptamana;
    }

    public void setCantitateFructeSaptamana(int cantitateFructeSaptamana) {
        this.cantitateFructeSaptamana = cantitateFructeSaptamana;
    }

    public String getFructeMicDejun() {
        return fructeMicDejun;
    }

    public void setFructeMicDejun(String fructeMicDejun) {
        this.fructeMicDejun = fructeMicDejun;
    }

    public int getCantitateCarneSaptamana() {
        return cantitateCarneSaptamana;
    }

    public void setCantitateCarneSaptamana(int cantitateCarneSaptamana) {
        this.cantitateCarneSaptamana = cantitateCarneSaptamana;
    }

    public int getCantitateOua() {
        return cantitateOua;
    }

    public void setCantitateOua(int cantitateOua) {
        this.cantitateOua = cantitateOua;
    }

    public String getSare() {
        return sare;
    }

    public void setSare(String sare) {
        this.sare = sare;
    }

    public int getCantitateSare() {
        return cantitateSare;
    }

    public void setCantitateSare(int cantitateSare) {
        this.cantitateSare = cantitateSare;
    }

    public int getCantitatePaine() {
        return cantitatePaine;
    }

    public void setCantitatePaine(int cantitatePaine) {
        this.cantitatePaine = cantitatePaine;
    }

    public String getLocalizare() {
        return localizare;
    }

    public void setLocalizare(String localizare) {
        this.localizare = localizare;
    }
}
