package cm.aptoide.p092pt.dataprovider.model.p096v7;

import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.ListAppVersions;

/* loaded from: classes.dex */
public class GetApp extends BaseV7Response {
    private Nodes nodes;

    public static class Nodes {
        private GroupDatalist groups;
        private GetAppMeta meta;
        private ListAppVersions versions;

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
            GetAppMeta meta = getMeta();
            GetAppMeta meta2 = nodes.getMeta();
            if (meta != null ? !meta.equals(meta2) : meta2 != null) {
                return false;
            }
            ListAppVersions versions = getVersions();
            ListAppVersions versions2 = nodes.getVersions();
            if (versions != null ? !versions.equals(versions2) : versions2 != null) {
                return false;
            }
            GroupDatalist groups = getGroups();
            GroupDatalist groups2 = nodes.getGroups();
            return groups != null ? groups.equals(groups2) : groups2 == null;
        }

        public GroupDatalist getGroups() {
            return this.groups;
        }

        public GetAppMeta getMeta() {
            return this.meta;
        }

        public ListAppVersions getVersions() {
            return this.versions;
        }

        public int hashCode() {
            GetAppMeta meta = getMeta();
            int iHashCode = meta == null ? 43 : meta.hashCode();
            ListAppVersions versions = getVersions();
            int iHashCode2 = ((iHashCode + 59) * 59) + (versions == null ? 43 : versions.hashCode());
            GroupDatalist groups = getGroups();
            return (iHashCode2 * 59) + (groups != null ? groups.hashCode() : 43);
        }

        public void setGroups(GroupDatalist groupDatalist) {
            this.groups = groupDatalist;
        }

        public void setMeta(GetAppMeta getAppMeta) {
            this.meta = getAppMeta;
        }

        public void setVersions(ListAppVersions listAppVersions) {
            this.versions = listAppVersions;
        }

        public String toString() {
            return "GetApp.Nodes(meta=" + getMeta() + ", versions=" + getVersions() + ", groups=" + getGroups() + ")";
        }
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    protected boolean canEqual(Object obj) {
        return obj instanceof GetApp;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetApp)) {
            return false;
        }
        GetApp getApp = (GetApp) obj;
        if (!getApp.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Nodes nodes = getNodes();
        Nodes nodes2 = getApp.getNodes();
        return nodes != null ? nodes.equals(nodes2) : nodes2 == null;
    }

    public Nodes getNodes() {
        return this.nodes;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public int hashCode() {
        int iHashCode = super.hashCode() + 59;
        Nodes nodes = getNodes();
        return (iHashCode * 59) + (nodes == null ? 43 : nodes.hashCode());
    }

    public void setNodes(Nodes nodes) {
        this.nodes = nodes;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public String toString() {
        return "GetApp(nodes=" + getNodes() + ")";
    }
}
