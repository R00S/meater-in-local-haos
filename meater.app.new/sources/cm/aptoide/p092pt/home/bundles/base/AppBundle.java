package cm.aptoide.p092pt.home.bundles.base;

import cm.aptoide.p092pt.dataprovider.model.p096v7.Event;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.view.app.Application;
import java.util.List;

/* loaded from: classes.dex */
public class AppBundle implements HomeBundle {
    private final String actionTag;
    private final List<Application> apps;
    private final Event event;
    private final String tag;
    private final String title;
    private final HomeBundle.BundleType type;

    public AppBundle(String str, List<Application> list, HomeBundle.BundleType bundleType, Event event, String str2, String str3) {
        this.title = str;
        this.apps = list;
        this.type = bundleType;
        this.event = event;
        this.tag = str2;
        this.actionTag = str3;
    }

    public String getActionTag() {
        return this.actionTag;
    }

    public List<Application> getApps() {
        return this.apps;
    }

    @Override // cm.aptoide.p092pt.home.bundles.base.HomeBundle
    public List<?> getContent() {
        return this.apps;
    }

    @Override // cm.aptoide.p092pt.home.bundles.base.HomeBundle
    public Event getEvent() {
        return this.event;
    }

    @Override // cm.aptoide.p092pt.home.bundles.base.HomeBundle
    public String getTag() {
        return this.tag;
    }

    @Override // cm.aptoide.p092pt.home.bundles.base.HomeBundle
    public String getTitle() {
        return this.title;
    }

    @Override // cm.aptoide.p092pt.home.bundles.base.HomeBundle
    public HomeBundle.BundleType getType() {
        return this.type;
    }
}
