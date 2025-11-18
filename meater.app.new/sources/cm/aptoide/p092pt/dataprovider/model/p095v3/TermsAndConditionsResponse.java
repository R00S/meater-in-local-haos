package cm.aptoide.p092pt.dataprovider.model.p095v3;

import com.fasterxml.jackson.annotation.JsonProperty;

/* loaded from: classes.dex */
public class TermsAndConditionsResponse extends BaseV3Response {

    @JsonProperty("privacy")
    private boolean privacy;

    @JsonProperty("tos")
    private boolean tos;

    public boolean isPrivacy() {
        return this.privacy;
    }

    public boolean isTos() {
        return this.tos;
    }

    public void setPrivacy(boolean z) {
        this.privacy = z;
    }

    public void setTos(boolean z) {
        this.tos = z;
    }
}
