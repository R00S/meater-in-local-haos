package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.preferences.secure.SecurePreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.C11231b;
import p456rx.p460m.InterfaceC11252a;

/* compiled from: LaunchManager.kt */
@Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m32267d2 = {"Lcm/aptoide/pt/LaunchManager;", HttpUrl.FRAGMENT_ENCODE_SET, "firstLaunchManager", "Lcm/aptoide/pt/FirstLaunchManager;", "updateLaunchManager", "Lcm/aptoide/pt/UpdateLaunchManager;", "secureSharedPreferences", "Landroid/content/SharedPreferences;", "(Lcm/aptoide/pt/FirstLaunchManager;Lcm/aptoide/pt/UpdateLaunchManager;Landroid/content/SharedPreferences;)V", "launch", "Lrx/Completable;", "runFirstLaunch", "runUpdateLaunch", "updateLaunchSettings", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class LaunchManager {
    private final FirstLaunchManager firstLaunchManager;
    private final SharedPreferences secureSharedPreferences;
    private final UpdateLaunchManager updateLaunchManager;

    public LaunchManager(FirstLaunchManager firstLaunchManager, UpdateLaunchManager updateLaunchManager, SharedPreferences sharedPreferences) {
        C9801m.m32346f(firstLaunchManager, "firstLaunchManager");
        C9801m.m32346f(updateLaunchManager, "updateLaunchManager");
        C9801m.m32346f(sharedPreferences, "secureSharedPreferences");
        this.firstLaunchManager = firstLaunchManager;
        this.updateLaunchManager = updateLaunchManager;
        this.secureSharedPreferences = sharedPreferences;
    }

    private final C11231b runFirstLaunch() {
        if (SecurePreferences.isFirstRun(this.secureSharedPreferences)) {
            C11231b c11231bM39963G = this.firstLaunchManager.runFirstLaunch().m39963G(updateLaunchSettings());
            C9801m.m32345e(c11231bM39963G, "firstLaunchManager.runFi…h(updateLaunchSettings())");
            return c11231bM39963G;
        }
        C11231b c11231bM39946e = C11231b.m39946e();
        C9801m.m32345e(c11231bM39946e, "complete()");
        return c11231bM39946e;
    }

    private final C11231b runUpdateLaunch() {
        boolean zIsFirstRun = SecurePreferences.isFirstRun(this.secureSharedPreferences);
        int latestVersionCode = SecurePreferences.getLatestVersionCode(this.secureSharedPreferences);
        if (!zIsFirstRun && 12060 > latestVersionCode) {
            return this.updateLaunchManager.runUpdateLaunch(latestVersionCode, BuildConfig.VERSION_CODE);
        }
        C11231b c11231bM39946e = C11231b.m39946e();
        C9801m.m32345e(c11231bM39946e, "complete()");
        return c11231bM39946e;
    }

    private final C11231b updateLaunchSettings() {
        C11231b c11231bM39952t = C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.l0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                LaunchManager.m40698updateLaunchSettings$lambda0(this.f10288f);
            }
        });
        C9801m.m32345e(c11231bM39952t, "fromAction {\n      Secur…eSharedPreferences)\n    }");
        return c11231bM39952t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateLaunchSettings$lambda-0, reason: not valid java name */
    public static final void m40698updateLaunchSettings$lambda0(LaunchManager launchManager) {
        C9801m.m32346f(launchManager, "this$0");
        SecurePreferences.setFirstRun(false, launchManager.secureSharedPreferences);
        SecurePreferences.setCurrentVersionCode(BuildConfig.VERSION_CODE, launchManager.secureSharedPreferences);
    }

    public final C11231b launch() {
        C11231b c11231bM39956x = C11231b.m39956x(runFirstLaunch(), runUpdateLaunch());
        C9801m.m32345e(c11231bM39956x, "mergeDelayError(runFirst…nch(), runUpdateLaunch())");
        return c11231bM39956x;
    }
}
