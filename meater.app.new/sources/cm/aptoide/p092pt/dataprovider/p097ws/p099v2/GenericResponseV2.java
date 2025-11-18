package cm.aptoide.p092pt.dataprovider.p097ws.p099v2;

import java.util.List;

/* loaded from: classes.dex */
public class GenericResponseV2 {
    List<ErrorResponse> errors;
    String status;

    public List<ErrorResponse> getErrors() {
        return this.errors;
    }

    public String getStatus() {
        return this.status;
    }

    public boolean hasErrors() {
        List<ErrorResponse> list = this.errors;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isOk() {
        String str = this.status;
        return str != null && str.equalsIgnoreCase("ok");
    }
}
