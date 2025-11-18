package cm.aptoide.p092pt;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Icon;
import android.os.Build;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.networking.IdsRepository;
import cm.aptoide.p092pt.root.RootAvailabilityManager;
import cm.aptoide.p092pt.util.PreferencesXmlParser;
import cm.aptoide.p092pt.view.MainActivity;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import org.xmlpull.v1.XmlPullParserException;
import p456rx.C11231b;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;

/* compiled from: FirstLaunchManager.kt */
@Metadata(m32266d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0003J\u0006\u0010\u001a\u001a\u00020\u0014J\b\u0010\u001b\u001a\u00020\u0014H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m32267d2 = {"Lcm/aptoide/pt/FirstLaunchManager;", HttpUrl.FRAGMENT_ENCODE_SET, "defaultSharedPreferences", "Landroid/content/SharedPreferences;", "idsRepository", "Lcm/aptoide/pt/networking/IdsRepository;", "followedStoresManager", "Lcm/aptoide/pt/FollowedStoresManager;", "rootAvailabilityManager", "Lcm/aptoide/pt/root/RootAvailabilityManager;", "accountManager", "Lcm/aptoide/accountmanager/AptoideAccountManager;", "shortcutManager", "Lcm/aptoide/pt/AptoideShortcutManager;", "context", "Landroid/content/Context;", "(Landroid/content/SharedPreferences;Lcm/aptoide/pt/networking/IdsRepository;Lcm/aptoide/pt/FollowedStoresManager;Lcm/aptoide/pt/root/RootAvailabilityManager;Lcm/aptoide/accountmanager/AptoideAccountManager;Lcm/aptoide/pt/AptoideShortcutManager;Landroid/content/Context;)V", "createAppShortcut", HttpUrl.FRAGMENT_ENCODE_SET, "createShortcut", "Lrx/Completable;", "generateAptoideUuid", "isShortcutAdded", HttpUrl.FRAGMENT_ENCODE_SET, "shortcutInfo", "Landroid/content/pm/ShortcutInfo;", "runFirstLaunch", "setSharedPreferencesValues", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class FirstLaunchManager {
    private final AptoideAccountManager accountManager;
    private final Context context;
    private final SharedPreferences defaultSharedPreferences;
    private final FollowedStoresManager followedStoresManager;
    private final IdsRepository idsRepository;
    private final RootAvailabilityManager rootAvailabilityManager;
    private final AptoideShortcutManager shortcutManager;

    public FirstLaunchManager(SharedPreferences sharedPreferences, IdsRepository idsRepository, FollowedStoresManager followedStoresManager, RootAvailabilityManager rootAvailabilityManager, AptoideAccountManager aptoideAccountManager, AptoideShortcutManager aptoideShortcutManager, Context context) {
        C9801m.m32346f(sharedPreferences, "defaultSharedPreferences");
        C9801m.m32346f(idsRepository, "idsRepository");
        C9801m.m32346f(followedStoresManager, "followedStoresManager");
        C9801m.m32346f(rootAvailabilityManager, "rootAvailabilityManager");
        C9801m.m32346f(aptoideAccountManager, "accountManager");
        C9801m.m32346f(aptoideShortcutManager, "shortcutManager");
        C9801m.m32346f(context, "context");
        this.defaultSharedPreferences = sharedPreferences;
        this.idsRepository = idsRepository;
        this.followedStoresManager = followedStoresManager;
        this.rootAvailabilityManager = rootAvailabilityManager;
        this.accountManager = aptoideAccountManager;
        this.shortcutManager = aptoideShortcutManager;
        this.context = context;
    }

    private final void createAppShortcut() {
        Intent intent = new Intent(this.context, (Class<?>) MainActivity.class);
        intent.setAction("android.intent.action.MAIN");
        Intent intent2 = new Intent();
        intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
        intent2.putExtra("android.intent.extra.shortcut.NAME", this.context.getResources().getString(C1146R.string.app_name));
        intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(this.context, C1146R.mipmap.ic_launcher));
        intent2.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        this.context.sendBroadcast(intent2);
    }

    private final C11231b createShortcut() {
        C11231b c11231bM39952t = C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.i0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                FirstLaunchManager.m40693createShortcut$lambda3(this.f10062f);
            }
        });
        C9801m.m32345e(c11231bM39952t, "fromAction {\n           …}\n            }\n        }");
        return c11231bM39952t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createShortcut$lambda-3, reason: not valid java name */
    public static final void m40693createShortcut$lambda3(FirstLaunchManager firstLaunchManager) {
        C9801m.m32346f(firstLaunchManager, "this$0");
        if (!firstLaunchManager.shortcutManager.shouldCreateShortcut() || Build.VERSION.SDK_INT >= 26) {
            return;
        }
        firstLaunchManager.createAppShortcut();
    }

    private final C11231b generateAptoideUuid() {
        C11231b c11231bM39952t = C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.f0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                FirstLaunchManager.m40694generateAptoideUuid$lambda1(this.f9305f);
            }
        });
        C9801m.m32345e(c11231bM39952t, "fromAction { idsRepository.uniqueIdentifier }");
        return c11231bM39952t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: generateAptoideUuid$lambda-1, reason: not valid java name */
    public static final void m40694generateAptoideUuid$lambda1(FirstLaunchManager firstLaunchManager) {
        C9801m.m32346f(firstLaunchManager, "this$0");
        firstLaunchManager.idsRepository.getUniqueIdentifier();
    }

    private final boolean isShortcutAdded(Context context, ShortcutInfo shortcutInfo) {
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        if (shortcutManager == null) {
            return false;
        }
        List<ShortcutInfo> pinnedShortcuts = shortcutManager.getPinnedShortcuts();
        C9801m.m32345e(pinnedShortcuts, "shortcutManager.pinnedShortcuts");
        Iterator<ShortcutInfo> it = pinnedShortcuts.iterator();
        while (it.hasNext()) {
            if (C9801m.m32341a(it.next().getId(), shortcutInfo.getId())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: runFirstLaunch$lambda-0, reason: not valid java name */
    public static final void m40695runFirstLaunch$lambda0(Throwable th) {
        CrashReport.getInstance().log(th);
    }

    private final C11231b setSharedPreferencesValues() {
        C11231b c11231bM39952t = C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.h0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() throws Resources.NotFoundException {
                FirstLaunchManager.m40696setSharedPreferencesValues$lambda2(this.f9333f);
            }
        });
        C9801m.m32345e(c11231bM39952t, "fromAction {\n           …)\n            }\n        }");
        return c11231bM39952t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setSharedPreferencesValues$lambda-2, reason: not valid java name */
    public static final void m40696setSharedPreferencesValues$lambda2(FirstLaunchManager firstLaunchManager) throws Resources.NotFoundException {
        C9801m.m32346f(firstLaunchManager, "this$0");
        PreferencesXmlParser preferencesXmlParser = new PreferencesXmlParser();
        XmlResourceParser xml = firstLaunchManager.context.getResources().getXml(C1146R.xml.settings);
        C9801m.m32345e(xml, "context.resources.getXml(R.xml.settings)");
        try {
            for (String[] strArr : preferencesXmlParser.parse(xml)) {
                SharedPreferences.Editor editorEdit = firstLaunchManager.defaultSharedPreferences.edit();
                String str = strArr[0];
                Boolean boolValueOf = Boolean.valueOf(strArr[1]);
                C9801m.m32345e(boolValueOf, "valueOf(keyValue[1])");
                editorEdit.putBoolean(str, boolValueOf.booleanValue()).apply();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    public final C11231b runFirstLaunch() {
        C11231b c11231bM39981n = C11231b.m39956x(setSharedPreferencesValues(), generateAptoideUuid()).m39973a(C11231b.m39956x(this.followedStoresManager.setDefaultFollowedStores(), this.rootAvailabilityManager.updateRootAvailability(), this.accountManager.updateAccount().m39958A(), createShortcut())).m39981n(new InterfaceC11253b() { // from class: cm.aptoide.pt.g0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                FirstLaunchManager.m40695runFirstLaunch$lambda0((Throwable) obj);
            }
        });
        C9801m.m32345e(c11231bM39981n, "mergeDelayError(setShare…rt.getInstance().log(e) }");
        return c11231bM39981n;
    }

    private final void createAppShortcut(Context context) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setAction("android.intent.action.MAIN");
        ShortcutInfo shortcutInfoBuild = new ShortcutInfo.Builder(context, "shortcut_id").setIntent(intent).setShortLabel(context.getResources().getString(C1146R.string.app_name)).setIcon(Icon.createWithResource(context, C1146R.mipmap.ic_launcher)).build();
        C9801m.m32345e(shortcutInfoBuild, "Builder(context, \"shortc…er))\n            .build()");
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        if (shortcutManager == null || !shortcutManager.isRequestPinShortcutSupported() || isShortcutAdded(context, shortcutInfoBuild)) {
            return;
        }
        shortcutManager.requestPinShortcut(shortcutInfoBuild, null);
    }
}
