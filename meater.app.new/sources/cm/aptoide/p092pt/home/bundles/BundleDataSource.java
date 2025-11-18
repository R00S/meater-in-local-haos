package cm.aptoide.p092pt.home.bundles;

import p456rx.C11234e;
import p456rx.Single;

/* loaded from: classes.dex */
public interface BundleDataSource {
    boolean hasMore(Integer num, String str);

    Single<HomeBundlesModel> loadFreshBundleForEvent(String str, String str2);

    C11234e<HomeBundlesModel> loadFreshHomeBundles(String str);

    Single<HomeBundlesModel> loadNextBundleForEvent(String str, int i2, String str2, int i3);

    C11234e<HomeBundlesModel> loadNextHomeBundles(int i2, int i3, String str, boolean z);
}
