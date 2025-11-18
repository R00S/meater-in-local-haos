package cm.aptoide.p092pt.dataprovider.p097ws.p101v7.analyticsbody;

import java.util.List;

/* loaded from: classes.dex */
public class Data {
    private String abTestGroup;
    private App app;
    private Integer campaignId;
    private String network;
    private List<Obb> obb;
    private DataOrigin origin;
    private String previousContext;
    private String previousTag;
    private Result result;
    private Root root;
    private String store;
    private String teleco;

    public enum DataOrigin {
        INSTALL,
        UPDATE,
        DOWNGRADE,
        UPDATE_ALL
    }

    public String getAbTestGroup() {
        return this.abTestGroup;
    }

    public App getApp() {
        return this.app;
    }

    public Integer getCampaignId() {
        return this.campaignId;
    }

    public String getNetwork() {
        return this.network;
    }

    public List<Obb> getObb() {
        return this.obb;
    }

    public DataOrigin getOrigin() {
        return this.origin;
    }

    public String getPreviousContext() {
        return this.previousContext;
    }

    public String getPreviousTag() {
        return this.previousTag;
    }

    public Result getResult() {
        return this.result;
    }

    public Root getRoot() {
        return this.root;
    }

    public String getStore() {
        return this.store;
    }

    public String getTeleco() {
        return this.teleco;
    }

    public void setAbTestGroup(String str) {
        this.abTestGroup = str;
    }

    public void setApp(App app) {
        this.app = app;
    }

    public void setCampaignId(int i2) {
        this.campaignId = Integer.valueOf(i2);
    }

    public void setNetwork(String str) {
        this.network = str;
    }

    public void setObb(List<Obb> list) {
        this.obb = list;
    }

    public void setOrigin(DataOrigin dataOrigin) {
        this.origin = dataOrigin;
    }

    public void setPreviousContext(String str) {
        this.previousContext = str;
    }

    public void setPreviousTag(String str) {
        this.previousTag = str;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public void setRoot(Root root) {
        this.root = root;
    }

    public void setStore(String str) {
        this.store = str;
    }

    public void setTeleco(String str) {
        this.teleco = str;
    }
}
