package cm.aptoide.p092pt.download.view.outofspace;

import android.content.Intent;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.navigator.Result;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: OutOfSpaceNavigator.kt */
@Metadata(m32266d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m32267d2 = {"Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceNavigator;", HttpUrl.FRAGMENT_ENCODE_SET, "fragmentNavigator", "Lcm/aptoide/pt/navigator/FragmentNavigator;", "packageName", HttpUrl.FRAGMENT_ENCODE_SET, "(Lcm/aptoide/pt/navigator/FragmentNavigator;Ljava/lang/String;)V", "clearedEnoughSpace", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class OutOfSpaceNavigator {
    private final FragmentNavigator fragmentNavigator;
    private final String packageName;

    public OutOfSpaceNavigator(FragmentNavigator fragmentNavigator, String str) {
        C9801m.m32346f(fragmentNavigator, "fragmentNavigator");
        C9801m.m32346f(str, "packageName");
        this.fragmentNavigator = fragmentNavigator;
        this.packageName = str;
    }

    public final void clearedEnoughSpace() {
        this.fragmentNavigator.popDialogWithResult(new Result(1994, -1, new Intent().setPackage(this.packageName)));
    }
}
