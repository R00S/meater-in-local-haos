package cm.aptoide.p092pt.dataprovider.model.p096v7;

/* loaded from: classes.dex */
public class ListAppCoinsCampaigns extends BaseV7EndlessDataListResponse<AppCoinsCampaign> {
    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessDataListResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    protected boolean canEqual(Object obj) {
        return obj instanceof ListAppCoinsCampaigns;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessDataListResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ListAppCoinsCampaigns) && ((ListAppCoinsCampaigns) obj).canEqual(this) && super.equals(obj);
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessDataListResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public int hashCode() {
        return 59 + super.hashCode();
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessDataListResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public String toString() {
        return "ListApps()";
    }
}
