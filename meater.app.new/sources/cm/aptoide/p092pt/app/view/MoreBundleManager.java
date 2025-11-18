package cm.aptoide.p092pt.app.view;

import cm.aptoide.p092pt.home.bundles.BundlesRepository;
import cm.aptoide.p092pt.home.bundles.HomeBundlesModel;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class MoreBundleManager {
    private final BundlesRepository bundlesRepository;

    public MoreBundleManager(BundlesRepository bundlesRepository) {
        this.bundlesRepository = bundlesRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleEmptyBundles, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Single<HomeBundlesModel> m7283b(String str, String str2, HomeBundlesModel homeBundlesModel) {
        return isOnlyEmptyBundles(homeBundlesModel) ? loadNextBundles(str, str2) : Single.m39913m(homeBundlesModel);
    }

    private boolean isOnlyEmptyBundles(HomeBundlesModel homeBundlesModel) {
        return (homeBundlesModel.hasErrors() || homeBundlesModel.isLoading() || !homeBundlesModel.getList().isEmpty()) ? false : true;
    }

    public boolean hasMore(String str) {
        return this.bundlesRepository.hasMore(str);
    }

    public Single<HomeBundlesModel> loadBundle(final String str, final String str2) {
        return this.bundlesRepository.loadBundles(str, str2).m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.zd
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8202f.m7282a(str, str2, (HomeBundlesModel) obj);
            }
        });
    }

    public Single<HomeBundlesModel> loadFreshBundles(String str, String str2) {
        return this.bundlesRepository.loadFreshBundles(str, str2);
    }

    public Single<HomeBundlesModel> loadNextBundles(final String str, final String str2) {
        return this.bundlesRepository.loadNextBundles(str, str2).m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.yd
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8178f.m7283b(str, str2, (HomeBundlesModel) obj);
            }
        });
    }
}
