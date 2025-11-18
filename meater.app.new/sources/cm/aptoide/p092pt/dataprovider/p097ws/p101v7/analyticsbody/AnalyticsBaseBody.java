package cm.aptoide.p092pt.dataprovider.p097ws.p101v7.analyticsbody;

import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;

/* loaded from: classes.dex */
public class AnalyticsBaseBody extends BaseBody {
    private final String aptoidePackage;

    public AnalyticsBaseBody(String str) {
        this.aptoidePackage = str;
    }

    @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody
    public String getAptoidePackage() {
        return this.aptoidePackage;
    }
}
