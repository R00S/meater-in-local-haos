package cm.aptoide.p092pt;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.C11231b;

/* compiled from: UpdateLaunchManager.kt */
@Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m32267d2 = {"Lcm/aptoide/pt/UpdateLaunchManager;", HttpUrl.FRAGMENT_ENCODE_SET, "followedStoresManager", "Lcm/aptoide/pt/FollowedStoresManager;", "(Lcm/aptoide/pt/FollowedStoresManager;)V", "getFollowedStoresManager", "()Lcm/aptoide/pt/FollowedStoresManager;", "runUpdateLaunch", "Lrx/Completable;", "previousVersionCode", HttpUrl.FRAGMENT_ENCODE_SET, "currentVersionCode", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class UpdateLaunchManager {
    private final FollowedStoresManager followedStoresManager;

    public UpdateLaunchManager(FollowedStoresManager followedStoresManager) {
        C9801m.m32346f(followedStoresManager, "followedStoresManager");
        this.followedStoresManager = followedStoresManager;
    }

    public final FollowedStoresManager getFollowedStoresManager() {
        return this.followedStoresManager;
    }

    public final C11231b runUpdateLaunch(int i2, int i3) {
        C11231b c11231bM39946e = C11231b.m39946e();
        if (i2 < 10013) {
            c11231bM39946e = c11231bM39946e.m39973a(this.followedStoresManager.setDefaultFollowedStores());
        }
        C9801m.m32345e(c11231bM39946e, "completable");
        return c11231bM39946e;
    }
}
