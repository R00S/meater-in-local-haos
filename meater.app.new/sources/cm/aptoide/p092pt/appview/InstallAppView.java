package cm.aptoide.p092pt.appview;

import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.app.view.AppCoinsViewModel;
import cm.aptoide.p092pt.presenter.View;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface InstallAppView extends View {
    C11234e<Void> cancelDownload();

    C11234e<DownloadModel.Action> installAppClick();

    void openApp(String str);

    C11234e<Void> pauseDownload();

    C11234e<DownloadModel.Action> resumeDownload();

    C11234e<Boolean> showDowngradeMessage();

    void showDowngradingMessage();

    void showDownloadAppModel(DownloadModel downloadModel, AppCoinsViewModel appCoinsViewModel, boolean z);

    void showGenericErrorDialog();

    void showInvalidAppInfoErrorDialog();

    C11234e<Boolean> showRootInstallWarningPopup();
}
