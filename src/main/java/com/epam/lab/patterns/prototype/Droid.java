package com.epam.lab.patterns.prototype;

/**
 *
 */
public abstract class Droid implements Cloneable {
    private String droidID;
    protected String droidType;

    abstract String act();

    public String getDroidID() {
        return droidID;
    }

    public void setDroidID(String droidID) {
        this.droidID = droidID;
    }

    public String getDroidType() {
        return droidType;
    }

    public void setDroidType(String droidType) {
        this.droidType = droidType;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            return e.getMessage();
        }
        return clone;
    }
}
