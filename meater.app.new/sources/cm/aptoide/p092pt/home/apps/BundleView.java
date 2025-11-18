package cm.aptoide.p092pt.home.apps;

import cm.aptoide.p092pt.home.bundles.ads.AdHomeEvent;
import cm.aptoide.p092pt.home.bundles.base.AppHomeEvent;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.presenter.View;
import java.util.List;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface BundleView extends View {
    C11234e<AdHomeEvent> adClicked();

    C11234e<AppHomeEvent> appClicked();

    C11234e<HomeEvent> bundleScrolled();

    void hideLoading();

    void hideRefresh();

    void hideShowMore();

    C11234e<HomeEvent> moreClicked();

    C11234e<Object> reachesBottom();

    C11234e<Void> refreshes();

    C11234e<Void> retryClicked();

    void showBundles(List<HomeBundle> list);

    void showGenericError();

    void showLoadMore();

    void showLoading();

    void showMoreHomeBundles(List<HomeBundle> list);

    void showNetworkError();

    void updateEditorialCards();

    C11234e<HomeEvent> visibleBundles();
}
