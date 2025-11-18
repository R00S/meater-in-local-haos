package cm.aptoide.p092pt.download.view.outofspace;

import cm.aptoide.p092pt.presenter.View;
import java.util.List;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import p456rx.C11234e;

/* compiled from: OutOfSpaceDialogView.kt */
@Metadata(m32266d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0017\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\tH&¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0003H&J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005H&¨\u0006\u0014"}, m32267d2 = {"Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceDialogView;", "Lcm/aptoide/pt/presenter/View;", "dismiss", HttpUrl.FRAGMENT_ENCODE_SET, "dismissDialogClick", "Lrx/Observable;", "Ljava/lang/Void;", "requiredSpaceToInstall", "removedAppsize", HttpUrl.FRAGMENT_ENCODE_SET, "setupViews", "requiredSpace", "(Ljava/lang/Long;)V", "showGeneralOutOfSpaceError", "showInstalledApps", "installedApps", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/download/view/outofspace/InstalledApp;", "uninstallClick", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public interface OutOfSpaceDialogView extends View {
    void dismiss();

    C11234e<Void> dismissDialogClick();

    void requiredSpaceToInstall(long removedAppsize);

    void setupViews(Long requiredSpace);

    void showGeneralOutOfSpaceError();

    void showInstalledApps(List<InstalledApp> installedApps);

    C11234e<String> uninstallClick();
}
