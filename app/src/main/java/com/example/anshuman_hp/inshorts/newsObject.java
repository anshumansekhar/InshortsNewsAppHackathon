package com.example.anshuman_hp.inshorts;

/**
 * Created by Anshuman-HP on 08-09-2017.
 */

public class newsObject {
    int ID;
    String TITLE;
    String URL;
    String PUBLISHER;
    String CATEGORY;
    String HOSTNAME;
    long TIMESTAMP;


    public newsObject() {
    }

    public newsObject(int ID, String TITLE, String URL, String PUBLISHER, String CATEGORY, String HOSTNAME, long TIMESTAMP) {
        this.ID = ID;
        this.TITLE = TITLE;
        this.URL = URL;
        this.PUBLISHER = PUBLISHER;
        this.CATEGORY = CATEGORY;
        this.HOSTNAME = HOSTNAME;
        this.TIMESTAMP = TIMESTAMP;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getPUBLISHER() {
        return PUBLISHER;
    }

    public void setPUBLISHER(String PUBLISHER) {
        this.PUBLISHER = PUBLISHER;
    }

    public String getCATEGORY() {
        return CATEGORY;
    }

    public void setCATEGORY(String CATEGORY) {
        this.CATEGORY = CATEGORY;
    }

    public String getHOSTNAME() {
        return HOSTNAME;
    }

    public void setHOSTNAME(String HOSTNAME) {
        this.HOSTNAME = HOSTNAME;
    }

    public long getTIMESTAMP() {
        return TIMESTAMP;
    }

    public void setTIMESTAMP(long TIMESTAMP) {
        this.TIMESTAMP = TIMESTAMP;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
