package cm.aptoide.p092pt.dataprovider.model.p096v7;

import cm.aptoide.p092pt.dataprovider.model.p096v7.GetAppMeta;

/* loaded from: classes.dex */
public class FullReview extends Review {
    private AppData data;

    public static class AppData {
        private GetAppMeta.App app;

        protected boolean canEqual(Object obj) {
            return obj instanceof AppData;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AppData)) {
                return false;
            }
            AppData appData = (AppData) obj;
            if (!appData.canEqual(this)) {
                return false;
            }
            GetAppMeta.App app = getApp();
            GetAppMeta.App app2 = appData.getApp();
            return app != null ? app.equals(app2) : app2 == null;
        }

        public GetAppMeta.App getApp() {
            return this.app;
        }

        public int hashCode() {
            GetAppMeta.App app = getApp();
            return 59 + (app == null ? 43 : app.hashCode());
        }

        public void setApp(GetAppMeta.App app) {
            this.app = app;
        }

        public String toString() {
            return "FullReview.AppData(app=" + getApp() + ")";
        }
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.Review
    protected boolean canEqual(Object obj) {
        return obj instanceof FullReview;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.Review
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FullReview)) {
            return false;
        }
        FullReview fullReview = (FullReview) obj;
        if (!fullReview.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        AppData data = getData();
        AppData data2 = fullReview.getData();
        return data != null ? data.equals(data2) : data2 == null;
    }

    public AppData getData() {
        return this.data;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.Review
    public int hashCode() {
        int iHashCode = super.hashCode() + 59;
        AppData data = getData();
        return (iHashCode * 59) + (data == null ? 43 : data.hashCode());
    }

    public void setData(AppData appData) {
        this.data = appData;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.Review
    public String toString() {
        return "FullReview(data=" + getData() + ")";
    }
}
