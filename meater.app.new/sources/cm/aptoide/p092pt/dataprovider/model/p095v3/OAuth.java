package cm.aptoide.p092pt.dataprovider.model.p095v3;

import cm.aptoide.p092pt.networking.AuthenticationPersistence;
import com.fasterxml.jackson.annotation.JsonProperty;

/* loaded from: classes.dex */
public class OAuth extends BaseV3Response {
    private String accessToken;
    private String error;

    @JsonProperty("error_description")
    private String errorDescription;

    @JsonProperty(AuthenticationPersistence.ACCOUNT_REFRESH_TOKEN)
    private String refreshToken;

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getError() {
        return this.error;
    }

    public String getErrorDescription() {
        return this.errorDescription;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p095v3.BaseV3Response
    public boolean hasErrors() {
        return super.hasErrors() || this.error != null;
    }
}
