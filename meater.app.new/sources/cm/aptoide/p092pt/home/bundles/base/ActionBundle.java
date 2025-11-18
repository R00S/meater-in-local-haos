package cm.aptoide.p092pt.home.bundles.base;

import cm.aptoide.p092pt.dataprovider.model.p096v7.Event;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ActionBundle implements HomeBundle {
    private final ActionItem actionItem;
    private final Event event;
    private final String tag;
    private final String title;
    private final HomeBundle.BundleType type;

    public ActionBundle(String str, HomeBundle.BundleType bundleType, Event event, String str2, ActionItem actionItem) {
        this.title = str;
        this.type = bundleType;
        this.event = event;
        this.tag = str2;
        this.actionItem = actionItem;
    }

    public ActionItem getActionItem() {
        return this.actionItem;
    }

    @Override // cm.aptoide.p092pt.home.bundles.base.HomeBundle
    public List<?> getContent() {
        if (this.actionItem != null) {
            return Collections.emptyList();
        }
        return null;
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
