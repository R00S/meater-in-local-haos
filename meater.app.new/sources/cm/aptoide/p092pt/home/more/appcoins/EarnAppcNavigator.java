package cm.aptoide.p092pt.home.more.appcoins;

import android.content.Intent;
import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceDialogFragment;
import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceNavigatorWrapper;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.navigator.Result;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11256e;

/* compiled from: EarnAppcNavigator.kt */
@Metadata(m32266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m32267d2 = {"Lcm/aptoide/pt/home/more/appcoins/EarnAppcNavigator;", HttpUrl.FRAGMENT_ENCODE_SET, "fragmentNavigator", "Lcm/aptoide/pt/navigator/FragmentNavigator;", "(Lcm/aptoide/pt/navigator/FragmentNavigator;)V", "getFragmentNavigator", "()Lcm/aptoide/pt/navigator/FragmentNavigator;", "openOutOfSpaceDialog", "Lrx/Completable;", "requiredSpace", HttpUrl.FRAGMENT_ENCODE_SET, "packageName", HttpUrl.FRAGMENT_ENCODE_SET, "outOfSpaceDialogResult", "Lrx/Observable;", "Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceNavigatorWrapper;", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class EarnAppcNavigator {
    private final FragmentNavigator fragmentNavigator;

    public EarnAppcNavigator(FragmentNavigator fragmentNavigator) {
        C9801m.m32346f(fragmentNavigator, "fragmentNavigator");
        this.fragmentNavigator = fragmentNavigator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: openOutOfSpaceDialog$lambda-0, reason: not valid java name */
    public static final void m40911openOutOfSpaceDialog$lambda0(EarnAppcNavigator earnAppcNavigator, long j2, String str) {
        C9801m.m32346f(earnAppcNavigator, "this$0");
        C9801m.m32346f(str, "$packageName");
        earnAppcNavigator.fragmentNavigator.navigateToDialogForResult(OutOfSpaceDialogFragment.INSTANCE.newInstance(j2, str), 1994);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: outOfSpaceDialogResult$lambda-1, reason: not valid java name */
    public static final OutOfSpaceNavigatorWrapper m40912outOfSpaceDialogResult$lambda1(Result result) {
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

    public final FragmentNavigator getFragmentNavigator() {
        return this.fragmentNavigator;
    }

    public final C11231b openOutOfSpaceDialog(final long j2, final String str) {
        C9801m.m32346f(str, "packageName");
        C11231b c11231bM39952t = C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.home.more.appcoins.d1
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                EarnAppcNavigator.m40911openOutOfSpaceDialog$lambda0(this.f9825f, j2, str);
            }
        });
        C9801m.m32345e(c11231bM39952t, "fromAction {\n      fragm…SPACE_REQUEST_CODE)\n    }");
        return c11231bM39952t;
    }

    public final C11234e<OutOfSpaceNavigatorWrapper> outOfSpaceDialogResult() {
        C11234e c11234eM40082X = this.fragmentNavigator.results(1994).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.e1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EarnAppcNavigator.m40912outOfSpaceDialogResult$lambda1((Result) obj);
            }
        });
        C9801m.m32345e(c11234eM40082X, "fragmentNavigator.result…kage() else \"\")\n        }");
        return c11234eM40082X;
    }
}
