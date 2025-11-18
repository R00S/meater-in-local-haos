package cm.aptoide.p092pt.home.apps;

import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.view.p107rx.RxAlertDialog;
import p456rx.C11234e;
import p456rx.Single;

/* loaded from: classes.dex */
public interface AppsFragmentView extends View {
    C11234e<App> cancelDownload();

    C11234e<App> cardClick();

    void hidePullToRefresh();

    C11234e<Void> imageClick();

    C11234e<App> installApp();

    C11234e<App> pauseDownload();

    C11234e<Void> refreshApps();

    C11234e<App> resumeDownload();

    void scrollToTop();

    void setDefaultUserImage();

    void setUserImage(String str);

    void showAvatar();

    Single<RxAlertDialog.Result> showIgnoreUpdateDialog();

    void showModel(AppsModel appsModel);

    C11234e<Boolean> showRootWarning();

    void showUnknownErrorMessage();

    C11234e<App> startDownload();

    C11234e<Void> updateAll();

    C11234e<App> updateLongClick();
}
