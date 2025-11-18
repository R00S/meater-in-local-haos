package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import cm.aptoide.p092pt.dataprovider.p097ws.RefreshBody;
import com.fasterxml.jackson.annotation.JsonProperty;

/* loaded from: classes.dex */
public class BaseBody implements RefreshBody {
    private String accessToken;

    @JsonProperty("aptoide_uid")
    private String aptoideId;
    private String aptoideMd5sum;
    private String aptoidePackage;
    private int aptoideVercode;
    private String cdn;
    private String country;
    private String lang;
    private boolean mature;

    /* renamed from: q */
    private String f8559q;
    private boolean refresh;

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getAptoideId() {
        return this.aptoideId;
    }

    public String getAptoideMd5sum() {
        return this.aptoideMd5sum;
    }

    public String getAptoidePackage() {
        return this.aptoidePackage;
    }

    public int getAptoideVercode() {
        return this.aptoideVercode;
    }

    public String getCdn() {
        return this.cdn;
    }

    public String getCountry() {
        return this.country;
    }

    public String getLang() {
        return this.lang;
    }

    public String getQ() {
        return this.f8559q;
    }

    public boolean isMature() {
        return this.mature;
    }

    public boolean isRefresh() {
        return this.refresh;
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setAptoideId(String str) {
        this.aptoideId = str;
    }

    public void setAptoideMd5sum(String str) {
        this.aptoideMd5sum = str;
    }

    public void setAptoidePackage(String str) {
        this.aptoidePackage = str;
    }

    public void setAptoideVercode(int i2) {
        this.aptoideVercode = i2;
    }

    public void setCdn(String str) {
        this.cdn = str;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setLang(String str) {
        this.lang = str;
    }

    public void setMature(boolean z) {
        this.mature = z;
    }

    public void setQ(String str) {
        this.f8559q = str;
    }

    @Override // cm.aptoide.p092pt.dataprovider.p097ws.RefreshBody
    public void setRefresh(boolean z) {
        this.refresh = z;
    }
}
