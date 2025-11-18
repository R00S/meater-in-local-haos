package cm.aptoide.p092pt.download.view;

import android.view.View;
import androidx.fragment.app.Fragment;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.utils.GenericDialogs;
import com.google.android.material.snackbar.Snackbar;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11256e;

/* compiled from: DownloadDialogProvider.kt */
@Metadata(m32266d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\fJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0019"}, m32267d2 = {"Lcm/aptoide/pt/download/view/DownloadDialogProvider;", HttpUrl.FRAGMENT_ENCODE_SET, "fragment", "Landroidx/fragment/app/Fragment;", "themeManager", "Lcm/aptoide/pt/themes/ThemeManager;", "(Landroidx/fragment/app/Fragment;Lcm/aptoide/pt/themes/ThemeManager;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "getThemeManager", "()Lcm/aptoide/pt/themes/ThemeManager;", "showDialog", "Lrx/Observable;", "Lcm/aptoide/pt/utils/GenericDialogs$EResponse;", "title", HttpUrl.FRAGMENT_ENCODE_SET, "message", "showDowngradeDialog", HttpUrl.FRAGMENT_ENCODE_SET, "showDowngradingSnackBar", HttpUrl.FRAGMENT_ENCODE_SET, "showGenericError", "Lrx/Completable;", "showOutOfSpaceError", "showRootInstallWarningPopup", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class DownloadDialogProvider {
    private final Fragment fragment;
    private final ThemeManager themeManager;

    public DownloadDialogProvider(Fragment fragment, ThemeManager themeManager) {
        C9801m.m32346f(fragment, "fragment");
        C9801m.m32346f(themeManager, "themeManager");
        this.fragment = fragment;
        this.themeManager = themeManager;
    }

    private final C11234e<GenericDialogs.EResponse> showDialog(String str, String str2) {
        C11234e<GenericDialogs.EResponse> c11234eM40065I0 = GenericDialogs.createGenericOkMessage(this.fragment.getContext(), str, str2, this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId).m40065I0(C11250a.m40156b());
        C9801m.m32345e(c11234eM40065I0, "createGenericOkMessage(f…dSchedulers.mainThread())");
        return c11234eM40065I0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showDowngradeDialog$lambda-1, reason: not valid java name */
    public static final Boolean m40752showDowngradeDialog$lambda1(GenericDialogs.EResponse eResponse) {
        return Boolean.valueOf(eResponse == GenericDialogs.EResponse.YES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showRootInstallWarningPopup$lambda-0, reason: not valid java name */
    public static final Boolean m40753showRootInstallWarningPopup$lambda0(GenericDialogs.EResponse eResponse) {
        return Boolean.valueOf(eResponse == GenericDialogs.EResponse.YES);
    }

    public final Fragment getFragment() {
        return this.fragment;
    }

    public final ThemeManager getThemeManager() {
        return this.themeManager;
    }

    public final C11234e<Boolean> showDowngradeDialog() {
        C11234e c11234eM40082X = GenericDialogs.createGenericContinueCancelMessage(this.fragment.requireContext(), null, this.fragment.getResources().getString(C1146R.string.downgrade_warning_dialog), this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return DownloadDialogProvider.m40752showDowngradeDialog$lambda1((GenericDialogs.EResponse) obj);
            }
        });
        C9801m.m32345e(c11234eM40082X, "createGenericContinueCan…icDialogs.EResponse.YES }");
        return c11234eM40082X;
    }

    public final void showDowngradingSnackBar() {
        View view = this.fragment.getView();
        if (view != null) {
            Snackbar.m24763Z(view, C1146R.string.downgrading_msg, -1).mo24744P();
        }
    }

    public final C11231b showGenericError() {
        String string = this.fragment.getString(C1146R.string.error_occured);
        C9801m.m32345e(string, "fragment.getString(R.string.error_occured)");
        C11231b c11231bM40083X0 = showDialog(HttpUrl.FRAGMENT_ENCODE_SET, string).m40083X0();
        C9801m.m32345e(c11231bM40083X0, "showDialog(\"\",\n        f…occured)).toCompletable()");
        return c11231bM40083X0;
    }

    public final C11231b showOutOfSpaceError() {
        String string = this.fragment.getString(C1146R.string.out_of_space_dialog_title);
        C9801m.m32345e(string, "fragment.getString(R.str…ut_of_space_dialog_title)");
        String string2 = this.fragment.getString(C1146R.string.out_of_space_dialog_message);
        C9801m.m32345e(string2, "fragment.getString(R.str…_of_space_dialog_message)");
        C11231b c11231bM40083X0 = showDialog(string, string2).m40083X0();
        C9801m.m32345e(c11231bM40083X0, "showDialog(fragment.getS…message)).toCompletable()");
        return c11231bM40083X0;
    }

    public final C11234e<Boolean> showRootInstallWarningPopup() {
        C11234e c11234eM40082X = GenericDialogs.createGenericYesNoCancelMessage(this.fragment.requireContext(), null, this.fragment.getResources().getString(C1146R.string.root_access_dialog), this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.b
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return DownloadDialogProvider.m40753showRootInstallWarningPopup$lambda0((GenericDialogs.EResponse) obj);
            }
        });
        C9801m.m32345e(c11234eM40082X, "createGenericYesNoCancel…icDialogs.EResponse.YES }");
        return c11234eM40082X;
    }
}
