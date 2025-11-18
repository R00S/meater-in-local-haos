package cm.aptoide.p092pt.reactions;

import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.home.bundles.editorial.EditorialHomeEvent;

/* loaded from: classes.dex */
public class ReactionsHomeEvent extends EditorialHomeEvent {
    private final String reaction;

    public ReactionsHomeEvent(String str, String str2, HomeBundle homeBundle, int i2, HomeEvent.Type type, String str3) {
        super(str, str2, homeBundle, i2, type);
        this.reaction = str3;
    }

    public String getReaction() {
        return this.reaction;
    }
}
