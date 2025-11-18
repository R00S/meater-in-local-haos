package cm.aptoide.p092pt.home;

import cm.aptoide.p092pt.database.room.RoomAppComingSoonRegistration;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.C11231b;
import p456rx.C11234e;

/* compiled from: AppComingSoonRegistrationManager.kt */
@Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m32267d2 = {"Lcm/aptoide/pt/home/AppComingSoonRegistrationManager;", HttpUrl.FRAGMENT_ENCODE_SET, "appComingSoonRegistrationPersistence", "Lcm/aptoide/pt/home/AppComingSoonRegistrationPersistence;", "(Lcm/aptoide/pt/home/AppComingSoonRegistrationPersistence;)V", "cancelScheduledNotification", "Lrx/Completable;", "packageName", HttpUrl.FRAGMENT_ENCODE_SET, "isNotificationScheduled", "Lrx/Observable;", HttpUrl.FRAGMENT_ENCODE_SET, "registerUserNotification", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class AppComingSoonRegistrationManager {
    private final AppComingSoonRegistrationPersistence appComingSoonRegistrationPersistence;

    public AppComingSoonRegistrationManager(AppComingSoonRegistrationPersistence appComingSoonRegistrationPersistence) {
        C9801m.m32346f(appComingSoonRegistrationPersistence, "appComingSoonRegistrationPersistence");
        this.appComingSoonRegistrationPersistence = appComingSoonRegistrationPersistence;
    }

    public final C11231b cancelScheduledNotification(String str) {
        C9801m.m32346f(str, "packageName");
        C11231b c11231bUnregisterForAppNotification = this.appComingSoonRegistrationPersistence.unregisterForAppNotification(new RoomAppComingSoonRegistration(str));
        C9801m.m32345e(c11231bUnregisterForAppNotification, "appComingSoonRegistratio…egistration(packageName))");
        return c11231bUnregisterForAppNotification;
    }

    public final C11234e<Boolean> isNotificationScheduled(String str) {
        C9801m.m32346f(str, "packageName");
        C11234e<Boolean> c11234eIsRegisteredForApp = this.appComingSoonRegistrationPersistence.isRegisteredForApp(str);
        C9801m.m32345e(c11234eIsRegisteredForApp, "appComingSoonRegistratio…steredForApp(packageName)");
        return c11234eIsRegisteredForApp;
    }

    public final C11231b registerUserNotification(String str) {
        C9801m.m32346f(str, "packageName");
        C11231b c11231bRegisterForAppNotification = this.appComingSoonRegistrationPersistence.registerForAppNotification(new RoomAppComingSoonRegistration(str));
        C9801m.m32345e(c11231bRegisterForAppNotification, "appComingSoonRegistratio…egistration(packageName))");
        return c11231bRegisterForAppNotification;
    }
}
