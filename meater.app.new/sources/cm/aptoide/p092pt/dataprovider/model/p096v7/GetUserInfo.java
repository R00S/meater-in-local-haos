package cm.aptoide.p092pt.dataprovider.model.p096v7;

/* loaded from: classes.dex */
public class GetUserInfo extends BaseV7Response {
    private Nodes nodes;

    public static class Nodes {
        private GetUserMeta meta;
        private GetUserSettings settings;

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
            GetUserMeta meta = getMeta();
            GetUserMeta meta2 = nodes.getMeta();
            if (meta != null ? !meta.equals(meta2) : meta2 != null) {
                return false;
            }
            GetUserSettings settings = getSettings();
            GetUserSettings settings2 = nodes.getSettings();
            return settings != null ? settings.equals(settings2) : settings2 == null;
        }

        public GetUserMeta getMeta() {
            return this.meta;
        }

        public GetUserSettings getSettings() {
            return this.settings;
        }

        public int hashCode() {
            GetUserMeta meta = getMeta();
            int iHashCode = meta == null ? 43 : meta.hashCode();
            GetUserSettings settings = getSettings();
            return ((iHashCode + 59) * 59) + (settings != null ? settings.hashCode() : 43);
        }

        public void setMeta(GetUserMeta getUserMeta) {
            this.meta = getUserMeta;
        }

        public void setSettings(GetUserSettings getUserSettings) {
            this.settings = getUserSettings;
        }

        public String toString() {
            return "GetUserInfo.Nodes(meta=" + getMeta() + ", settings=" + getSettings() + ")";
        }
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    protected boolean canEqual(Object obj) {
        return obj instanceof GetUserInfo;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetUserInfo)) {
            return false;
        }
        GetUserInfo getUserInfo = (GetUserInfo) obj;
        if (!getUserInfo.canEqual(this)) {
            return false;
        }
        Nodes nodes = getNodes();
        Nodes nodes2 = getUserInfo.getNodes();
        return nodes != null ? nodes.equals(nodes2) : nodes2 == null;
    }

    public Nodes getNodes() {
        return this.nodes;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public int hashCode() {
        Nodes nodes = getNodes();
        return 59 + (nodes == null ? 43 : nodes.hashCode());
    }

    public void setNodes(Nodes nodes) {
        this.nodes = nodes;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public String toString() {
        return "GetUserInfo(nodes=" + getNodes() + ")";
    }
}
