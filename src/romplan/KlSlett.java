/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romplan;

/**
 *
 * @author patrick
 */
public class KlSlett {
    // Objektvariabler
    private int time;
    private int minutt;

    public KlSlett(int time, int minutt) {
        this.time = time;
        this.minutt = minutt;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getMinutt() {
        return minutt;
    }

    public void setMinutt(int minutt) {
        this.minutt = minutt;
    }

    @Override
    public String toString() {
        return "KlSlett{" + "time=" + time + ", minutt=" + minutt + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.time;
        hash = 79 * hash + this.minutt;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final KlSlett other = (KlSlett) obj;
        if (this.time != other.time) {
            return false;
        }
        if (this.minutt != other.minutt) {
            return false;
        }
        return true;
    }
    
    
    
}
