package cm.aptoide.p092pt.view.app;

import cm.aptoide.p092pt.presenter.View;
import java.util.List;
import p456rx.C11234e;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public interface ListStoreAppsView extends View {
    void addApps(List<Application> list);

    C11234e<Application> getAppClick();

    C11418b<Void> getRefreshEvent();

    C11234e<Void> getRetryEvent();

    void hideLoading();

    void hideRefreshLoading();

    C11234e<Object> reachesBottom();

    void setApps(List<Application> list);

    void showGenericError();

    void showLoading();

    void showNetworkError();

    void showStartingLoading();
}
