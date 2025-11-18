package cm.aptoide.p092pt.home.bundles;

import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.home.bundles.misc.ErrorHomeBundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceCallableC11255d;

/* loaded from: classes.dex */
public class BundlesRepository {
    private static final String HOME_BUNDLE_KEY = "Home_Bundle";
    private Map<String, List<HomeBundle>> cachedBundles;
    private int limit;
    private Map<String, Integer> offset;
    private final BundleDataSource remoteBundleDataSource;

    public BundlesRepository(BundleDataSource bundleDataSource, Map<String, List<HomeBundle>> map, Map<String, Integer> map2, int i2) {
        this.remoteBundleDataSource = bundleDataSource;
        this.cachedBundles = map;
        this.offset = map2;
        this.limit = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HomeBundlesModel cloneList(HomeBundlesModel homeBundlesModel) {
        return (homeBundlesModel.hasErrors() || homeBundlesModel.isLoading()) ? homeBundlesModel : new HomeBundlesModel(new ArrayList(homeBundlesModel.getList()), homeBundlesModel.isLoading(), homeBundlesModel.getOffset(), homeBundlesModel.isComplete());
    }

    private int getOffset(String str) {
        if (this.offset.containsKey(str)) {
            return this.offset.get(str).intValue();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadFreshBundles$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8047b(String str, HomeBundlesModel homeBundlesModel) {
        updateCache(homeBundlesModel, true, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadFreshHomeBundles$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8048c(HomeBundlesModel homeBundlesModel) {
        updateCache(homeBundlesModel, true, HOME_BUNDLE_KEY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadNextBundles$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8049d(String str, HomeBundlesModel homeBundlesModel) {
        updateCache(homeBundlesModel, false, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadNextHomeBundles$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8050e(HomeBundlesModel homeBundlesModel) {
        updateCache(homeBundlesModel, false, HOME_BUNDLE_KEY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$remove$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8051f(HomeBundle homeBundle) {
        this.cachedBundles.get(HOME_BUNDLE_KEY).remove(homeBundle);
        return C11231b.m39946e();
    }

    private void updateCache(HomeBundlesModel homeBundlesModel, boolean z, String str) {
        if (homeBundlesModel.hasErrors() || homeBundlesModel.isLoading() || !homeBundlesModel.isComplete()) {
            return;
        }
        this.offset.put(str, Integer.valueOf(homeBundlesModel.getOffset()));
        if (z || !this.cachedBundles.containsKey(str)) {
            this.cachedBundles.put(str, new ArrayList(homeBundlesModel.getList()));
            return;
        }
        List<HomeBundle> list = this.cachedBundles.get(str);
        if (list.get(list.size() - 1) instanceof ErrorHomeBundle) {
            list.remove(list.size() - 1);
        }
        list.addAll(homeBundlesModel.getList());
        this.cachedBundles.put(str, list);
    }

    public boolean hasMore() {
        return this.remoteBundleDataSource.hasMore(Integer.valueOf(getOffset(HOME_BUNDLE_KEY)), HOME_BUNDLE_KEY);
    }

    public Single<HomeBundlesModel> loadBundles(String str, String str2) {
        return !this.cachedBundles.containsKey(str) ? loadNextBundles(str, str2) : Single.m39913m(new HomeBundlesModel(this.cachedBundles.put(str, new ArrayList(this.cachedBundles.get(str))), false, getOffset(str), true));
    }

    public Single<HomeBundlesModel> loadFreshBundles(final String str, String str2) {
        return this.remoteBundleDataSource.loadFreshBundleForEvent(str2, str).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.bundles.f
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9585f.m8047b(str, (HomeBundlesModel) obj);
            }
        }).m39923n(new C3003d(this));
    }

    public C11234e<HomeBundlesModel> loadFreshHomeBundles() {
        return this.remoteBundleDataSource.loadFreshHomeBundles(HOME_BUNDLE_KEY).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.bundles.c
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9549f.m8048c((HomeBundlesModel) obj);
            }
        }).m40082X(new C3003d(this));
    }

    public C11234e<HomeBundlesModel> loadHomeBundles() {
        return !this.cachedBundles.containsKey(HOME_BUNDLE_KEY) ? loadNextHomeBundles(true) : C11234e.m40025S(new HomeBundlesModel(this.cachedBundles.put(HOME_BUNDLE_KEY, new ArrayList(this.cachedBundles.get(HOME_BUNDLE_KEY))), false, getOffset(HOME_BUNDLE_KEY), true));
    }

    public Single<HomeBundlesModel> loadNextBundles(final String str, String str2) {
        return this.remoteBundleDataSource.loadNextBundleForEvent(str2, getOffset(str), str, this.limit).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.bundles.b
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9546f.m8049d(str, (HomeBundlesModel) obj);
            }
        }).m39923n(new C3003d(this));
    }

    public C11234e<HomeBundlesModel> loadNextHomeBundles(boolean z) {
        return this.remoteBundleDataSource.loadNextHomeBundles(getOffset(HOME_BUNDLE_KEY), this.limit, HOME_BUNDLE_KEY, z).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.bundles.a
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9511f.m8050e((HomeBundlesModel) obj);
            }
        }).m40082X(new C3003d(this));
    }

    public C11231b remove(final HomeBundle homeBundle) {
        return C11231b.m39949i(new InterfaceCallableC11255d() { // from class: cm.aptoide.pt.home.bundles.e
            @Override // p456rx.p460m.InterfaceCallableC11255d, java.util.concurrent.Callable
            public final Object call() {
                return this.f9551f.m8051f(homeBundle);
            }
        });
    }

    public void setHomeLoadMoreError() {
        List<HomeBundle> list = this.cachedBundles.get(HOME_BUNDLE_KEY);
        if (list.isEmpty() || (list.get(list.size() - 1) instanceof ErrorHomeBundle)) {
            return;
        }
        list.add(new ErrorHomeBundle());
    }

    public boolean hasMore(String str) {
        return this.remoteBundleDataSource.hasMore(Integer.valueOf(getOffset(str)), str);
    }
}
