package cm.aptoide.p092pt.dataprovider.p097ws.p100v3;

import cm.aptoide.p092pt.dataprovider.model.p095v3.ErrorResponse;
import java.util.List;

/* loaded from: classes.dex */
public class GenericResponseV3 {
    private String error;
    private String errorDescription;
    private List<ErrorResponse> errors;
    private String status;

    public String getError() {
        return this.error;
    }

    public String getErrorDescription() {
        return this.errorDescription;
    }

    public List<ErrorResponse> getErrors() {
        return this.errors;
    }

    public String getStatus() {
        return this.status;
    }

    public void setError(String str) {
        this.error = str;
    }

    public void setErrorDescription(String str) {
        this.errorDescription = str;
    }

    public void setErrors(List<ErrorResponse> list) {
        this.errors = list;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
