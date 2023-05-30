package program.modell;

import java.io.Serializable;

public class Kartya implements Serializable{
    private String kerdes, valasz;

    public Kartya(String kerdes, String valasz) {
        this.kerdes = kerdes;
        this.valasz = valasz;
    }

    public String getKerdes() {
        return kerdes;
    }

    public void setKerdes(String kerdes) {
        this.kerdes = kerdes;
    }

    public String getValasz() {
        return valasz;
    }

    public void setValasz(String valasz) {
        this.valasz = valasz;
    }
}
