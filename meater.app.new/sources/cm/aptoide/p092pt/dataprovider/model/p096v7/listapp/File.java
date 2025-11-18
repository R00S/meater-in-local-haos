package cm.aptoide.p092pt.dataprovider.model.p096v7.listapp;

import cm.aptoide.p092pt.dataprovider.model.p096v7.Malware;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

/* loaded from: classes.dex */
public class File {

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    private Date added;
    private long filesize;
    private Malware malware;
    private String md5sum;
    private String path;
    private String pathAlt;
    private int vercode;
    private String vername;

    protected boolean canEqual(Object obj) {
        return obj instanceof File;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof File)) {
            return false;
        }
        File file = (File) obj;
        if (!file.canEqual(this)) {
            return false;
        }
        String vername = getVername();
        String vername2 = file.getVername();
        if (vername != null ? !vername.equals(vername2) : vername2 != null) {
            return false;
        }
        if (getVercode() != file.getVercode()) {
            return false;
        }
        String md5sum = getMd5sum();
        String md5sum2 = file.getMd5sum();
        if (md5sum != null ? !md5sum.equals(md5sum2) : md5sum2 != null) {
            return false;
        }
        String path = getPath();
        String path2 = file.getPath();
        if (path != null ? !path.equals(path2) : path2 != null) {
            return false;
        }
        String pathAlt = getPathAlt();
        String pathAlt2 = file.getPathAlt();
        if (pathAlt != null ? !pathAlt.equals(pathAlt2) : pathAlt2 != null) {
            return false;
        }
        if (getFilesize() != file.getFilesize()) {
            return false;
        }
        Malware malware = getMalware();
        Malware malware2 = file.getMalware();
        return malware != null ? malware.equals(malware2) : malware2 == null;
    }

    public Date getAdded() {
        return this.added;
    }

    public long getFilesize() {
        return this.filesize;
    }

    public Malware getMalware() {
        return this.malware;
    }

    public String getMd5sum() {
        return this.md5sum;
    }

    public String getPath() {
        return this.path;
    }

    public String getPathAlt() {
        return this.pathAlt;
    }

    public int getVercode() {
        return this.vercode;
    }

    public String getVername() {
        return this.vername;
    }

    public int hashCode() {
        String vername = getVername();
        int iHashCode = (((vername == null ? 43 : vername.hashCode()) + 59) * 59) + getVercode();
        String md5sum = getMd5sum();
        int iHashCode2 = (iHashCode * 59) + (md5sum == null ? 43 : md5sum.hashCode());
        String path = getPath();
        int iHashCode3 = (iHashCode2 * 59) + (path == null ? 43 : path.hashCode());
        String pathAlt = getPathAlt();
        int iHashCode4 = (iHashCode3 * 59) + (pathAlt == null ? 43 : pathAlt.hashCode());
        long filesize = getFilesize();
        int i2 = (iHashCode4 * 59) + ((int) (filesize ^ (filesize >>> 32)));
        Malware malware = getMalware();
        return (i2 * 59) + (malware != null ? malware.hashCode() : 43);
    }

    public void setAdded(Date date) {
        this.added = date;
    }

    public void setFilesize(long j2) {
        this.filesize = j2;
    }

    public void setMalware(Malware malware) {
        this.malware = malware;
    }

    public void setMd5sum(String str) {
        this.md5sum = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPathAlt(String str) {
        this.pathAlt = str;
    }

    public void setVercode(int i2) {
        this.vercode = i2;
    }

    public void setVername(String str) {
        this.vername = str;
    }

    public String toString() {
        return "File(vername=" + getVername() + ", vercode=" + getVercode() + ", md5sum=" + getMd5sum() + ", path=" + getPath() + ", pathAlt=" + getPathAlt() + ", filesize=" + getFilesize() + ", malware=" + getMalware() + ")";
    }
}
