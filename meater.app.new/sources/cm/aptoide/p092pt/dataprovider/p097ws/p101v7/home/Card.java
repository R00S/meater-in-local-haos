package cm.aptoide.p092pt.dataprovider.p097ws.p101v7.home;

import cm.aptoide.p092pt.dataprovider.model.p096v7.Review;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.App;

/* loaded from: classes.dex */
public class Card {
    private App app;
    private String type;
    private String uid;
    private Review.User user;

    public App getApp() {
        return this.app;
    }

    public String getType() {
        return this.type;
    }

    public String getUid() {
        return this.uid;
    }

    public Review.User getUser() {
        return this.user;
    }

    public boolean hasUser() {
        return this.user != null;
    }

    public void setApp(App app) {
        this.app = app;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setUser(Review.User user) {
        this.user = user;
    }
}
