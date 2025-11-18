package cm.aptoide.p092pt.download.view;

import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.fragment.app.Fragment;
import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceDialogFragment;
import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceNavigatorWrapper;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.navigator.Result;
import cm.aptoide.p092pt.utils.AptoideUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11256e;

/* compiled from: DownloadNavigator.kt */
@Metadata(m32266d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m32267d2 = {"Lcm/aptoide/pt/download/view/DownloadNavigator;", HttpUrl.FRAGMENT_ENCODE_SET, "fragment", "Landroidx/fragment/app/Fragment;", "packageManager", "Landroid/content/pm/PackageManager;", "fragmentNavigator", "Lcm/aptoide/pt/navigator/FragmentNavigator;", "(Landroidx/fragment/app/Fragment;Landroid/content/pm/PackageManager;Lcm/aptoide/pt/navigator/FragmentNavigator;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "getFragmentNavigator", "()Lcm/aptoide/pt/navigator/FragmentNavigator;", "getPackageManager", "()Landroid/content/pm/PackageManager;", "openApp", "Lrx/Completable;", "packageName", HttpUrl.FRAGMENT_ENCODE_SET, "openOutOfSpaceDialog", "requiredSpace", HttpUrl.FRAGMENT_ENCODE_SET, "outOfSpaceDialogResult", "Lrx/Observable;", "Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceNavigatorWrapper;", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class DownloadNavigator {
    private final Fragment fragment;
    private final FragmentNavigator fragmentNavigator;
    private final PackageManager packageManager;

    public DownloadNavigator(Fragment fragment, PackageManager packageManager, FragmentNavigator fragmentNavigator) {
        C9801m.m32346f(fragment, "fragment");
        C9801m.m32346f(packageManager, "packageManager");
        C9801m.m32346f(fragmentNavigator, "fragmentNavigator");
        this.fragment = fragment;
        this.packageManager = packageManager;
        this.fragmentNavigator = fragmentNavigator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: openApp$lambda-0, reason: not valid java name */
    public static final void m40754openApp$lambda0(String str, DownloadNavigator downloadNavigator) {
        C9801m.m32346f(str, "$packageName");
        C9801m.m32346f(downloadNavigator, "this$0");
        AptoideUtils.SystemU.openApp(str, downloadNavigator.packageManager, downloadNavigator.fragment.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: openOutOfSpaceDialog$lambda-1, reason: not valid java name */
    public static final void m40755openOutOfSpaceDialog$lambda1(DownloadNavigator downloadNavigator, long j2, String str) {
        C9801m.m32346f(downloadNavigator, "this$0");
        C9801m.m32346f(str, "$packageName");
        downloadNavigator.fragmentNavigator.navigateToDialogForResult(OutOfSpaceDialogFragment.INSTANCE.newInstance(j2, str), 1994);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: outOfSpaceDialogResult$lambda-2, reason: not valid java name */
    public static final OutOfSpaceNavigatorWrapper m40756outOfSpaceDialogResult$lambda2(Result result) {
        String str;
        C9801m.m32346f(result, "result");
        boolean z = result.getResultCode() == -1;
        if (result.getData() != null) {
            Intent data = result.getData();
            C9801m.m32343c(data);
            str = data.getPackage();
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return new OutOfSpaceNavigatorWrapper(z, str);
    }

    public final Fragment getFragment() {
        return this.fragment;
    }

    public final FragmentNavigator getFragmentNavigator() {
        return this.fragmentNavigator;
    }

    public final PackageManager getPackageManager() {
        return this.packageManager;
    }

    public final C11231b openApp(final String str) {
        C9801m.m32346f(str, "packageName");
        C11231b c11231bM39952t = C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.download.view.e
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                DownloadNavigator.m40754openApp$lambda0(str, this);
            }
        });
        C9801m.m32345e(c11231bM39952t, "fromAction {\n      Aptoi…, fragment.context)\n    }");
        return c11231bM39952t;
    }

    public final C11231b openOutOfSpaceDialog(final long j2, final String str) {
        C9801m.m32346f(str, "packageName");
        C11231b c11231bM39952t = C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.download.view.c
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                DownloadNavigator.m40755openOutOfSpaceDialog$lambda1(this.f8676f, j2, str);
            }
        });
        C9801m.m32345e(c11231bM39952t, "fromAction {\n      fragm…SPACE_REQUEST_CODE)\n    }");
        return c11231bM39952t;
    }

    public final C11234e<OutOfSpaceNavigatorWrapper> outOfSpaceDialogResult() {
        C11234e c11234eM40082X = this.fragmentNavigator.results(1994).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return DownloadNavigator.m40756outOfSpaceDialogResult$lambda2((Result) obj);
            }
        });
        C9801m.m32345e(c11234eM40082X, "fragmentNavigator.result…kage() else \"\")\n        }");
        return c11234eM40082X;
    }
}
