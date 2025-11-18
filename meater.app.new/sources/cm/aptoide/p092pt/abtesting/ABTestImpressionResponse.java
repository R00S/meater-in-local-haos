package cm.aptoide.p092pt.abtesting;

import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;

/* loaded from: classes.dex */
public class ABTestImpressionResponse extends BaseBody {
    private String assignment;
    private boolean cache;
    private String context;
    private String payload;
    private String status;

    public String getAssignment() {
        return this.assignment;
    }

    public String getContext() {
        return this.context;
    }

    public String getPayload() {
        return this.payload;
    }

    public String getStatus() {
        return this.status;
    }

    public boolean isCache() {
        return this.cache;
    }

    public void setAssignment(String str) {
        this.assignment = str;
    }

    public void setCache(boolean z) {
        this.cache = z;
    }

    public void setContext(String str) {
        this.context = str;
    }

    public void setPayload(String str) {
        this.payload = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
