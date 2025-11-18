package cm.aptoide.p092pt.dataprovider.model.p096v7.store;

import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetStoreWidgets;

/* loaded from: classes.dex */
public abstract class StoreUserAbstraction<T extends BaseV7Response> extends BaseV7Response {
    private Nodes<T> nodes;

    public static class Nodes<T extends BaseV7Response> {
        private T meta;
        private GetStoreTabs tabs;
        private GetStoreWidgets widgets;

        protected boolean canEqual(Object obj) {
            return obj instanceof Nodes;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Nodes)) {
                return false;
            }
            Nodes nodes = (Nodes) obj;
            if (!nodes.canEqual(this)) {
                return false;
            }
            BaseV7Response meta = getMeta();
            BaseV7Response meta2 = nodes.getMeta();
            if (meta != null ? !meta.equals(meta2) : meta2 != null) {
                return false;
            }
            GetStoreTabs tabs = getTabs();
            GetStoreTabs tabs2 = nodes.getTabs();
            if (tabs != null ? !tabs.equals(tabs2) : tabs2 != null) {
                return false;
            }
            GetStoreWidgets widgets = getWidgets();
            GetStoreWidgets widgets2 = nodes.getWidgets();
            return widgets != null ? widgets.equals(widgets2) : widgets2 == null;
        }

        public T getMeta() {
            return this.meta;
        }

        public GetStoreTabs getTabs() {
            return this.tabs;
        }

        public GetStoreWidgets getWidgets() {
            return this.widgets;
        }

        public int hashCode() {
            BaseV7Response meta = getMeta();
            int iHashCode = meta == null ? 43 : meta.hashCode();
            GetStoreTabs tabs = getTabs();
            int iHashCode2 = ((iHashCode + 59) * 59) + (tabs == null ? 43 : tabs.hashCode());
            GetStoreWidgets widgets = getWidgets();
            return (iHashCode2 * 59) + (widgets != null ? widgets.hashCode() : 43);
        }

        public void setMeta(T t) {
            this.meta = t;
        }

        public void setTabs(GetStoreTabs getStoreTabs) {
            this.tabs = getStoreTabs;
        }

        public void setWidgets(GetStoreWidgets getStoreWidgets) {
            this.widgets = getStoreWidgets;
        }

        public String toString() {
            return "StoreUserAbstraction.Nodes(meta=" + getMeta() + ", tabs=" + getTabs() + ", widgets=" + getWidgets() + ")";
        }
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    protected boolean canEqual(Object obj) {
        return obj instanceof StoreUserAbstraction;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StoreUserAbstraction)) {
            return false;
        }
        StoreUserAbstraction storeUserAbstraction = (StoreUserAbstraction) obj;
        if (!storeUserAbstraction.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Nodes<T> nodes = getNodes();
        Nodes<T> nodes2 = storeUserAbstraction.getNodes();
        return nodes != null ? nodes.equals(nodes2) : nodes2 == null;
    }

    public Nodes<T> getNodes() {
        return this.nodes;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public int hashCode() {
        int iHashCode = super.hashCode() + 59;
        Nodes<T> nodes = getNodes();
        return (iHashCode * 59) + (nodes == null ? 43 : nodes.hashCode());
    }

    public void setNodes(Nodes<T> nodes) {
        this.nodes = nodes;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public String toString() {
        return "StoreUserAbstraction(nodes=" + getNodes() + ")";
    }
}
