package cm.aptoide.p092pt.dataprovider.model.p095v3;

import java.util.List;

/* loaded from: classes.dex */
public class BaseV3Response {
    private List<ErrorResponse> errors;
    private String status;

    protected boolean canEqual(Object obj) {
        return obj instanceof BaseV3Response;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BaseV3Response)) {
            return false;
        }
        BaseV3Response baseV3Response = (BaseV3Response) obj;
        if (!baseV3Response.canEqual(this)) {
            return false;
        }
        String status = getStatus();
        String status2 = baseV3Response.getStatus();
        if (status != null ? !status.equals(status2) : status2 != null) {
            return false;
        }
        List<ErrorResponse> errors = getErrors();
        List<ErrorResponse> errors2 = baseV3Response.getErrors();
        return errors != null ? errors.equals(errors2) : errors2 == null;
    }

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

    public int hashCode() {
        String status = getStatus();
        int iHashCode = status == null ? 43 : status.hashCode();
        List<ErrorResponse> errors = getErrors();
        return ((iHashCode + 59) * 59) + (errors != null ? errors.hashCode() : 43);
    }

    public boolean isOk() {
        String str = this.status;
        return str != null && str.equalsIgnoreCase("ok");
    }

    public void setErrors(List<ErrorResponse> list) {
        this.errors = list;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String toString() {
        return "BaseV3Response(status=" + getStatus() + ", errors=" + getErrors() + ")";
    }
}
