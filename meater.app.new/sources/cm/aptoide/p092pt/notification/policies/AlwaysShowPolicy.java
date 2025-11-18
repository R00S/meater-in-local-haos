package cm.aptoide.p092pt.notification.policies;

import cm.aptoide.p092pt.notification.Policy;
import p456rx.Single;

/* loaded from: classes.dex */
public class AlwaysShowPolicy implements Policy {
    @Override // cm.aptoide.p092pt.notification.Policy
    public Single<Boolean> shouldShow() {
        return Single.m39913m(Boolean.TRUE);
    }
}
