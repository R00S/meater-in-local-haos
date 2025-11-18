package cm.aptoide.p092pt.home.bundles.ads;

import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;

/* loaded from: classes.dex */
public class AdHomeEvent extends HomeEvent {
    private final AdClick adClick;
    private final int position;

    public AdHomeEvent(AdClick adClick, int i2, HomeBundle homeBundle, int i3, HomeEvent.Type type) {
        super(homeBundle, i3, type);
        this.adClick = adClick;
        this.position = i2;
    }

    public AdClick getAdClick() {
        return this.adClick;
    }

    public int getPosition() {
        return this.position;
    }
}
