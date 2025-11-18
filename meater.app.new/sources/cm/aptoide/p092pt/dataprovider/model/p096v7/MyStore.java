package cm.aptoide.p092pt.dataprovider.model.p096v7;

/* loaded from: classes.dex */
public class MyStore extends BaseV7Response {
    GetStoreWidgets widgets;

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    protected boolean canEqual(Object obj) {
        return obj instanceof MyStore;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MyStore)) {
            return false;
        }
        MyStore myStore = (MyStore) obj;
        if (!myStore.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        GetStoreWidgets widgets = getWidgets();
        GetStoreWidgets widgets2 = myStore.getWidgets();
        return widgets != null ? widgets.equals(widgets2) : widgets2 == null;
    }

    public GetStoreWidgets getWidgets() {
        return this.widgets;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public int hashCode() {
        int iHashCode = super.hashCode() + 59;
        GetStoreWidgets widgets = getWidgets();
        return (iHashCode * 59) + (widgets == null ? 43 : widgets.hashCode());
    }

    public void setWidgets(GetStoreWidgets getStoreWidgets) {
        this.widgets = getStoreWidgets;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public String toString() {
        return "MyStore(widgets=" + getWidgets() + ")";
    }
}
