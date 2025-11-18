package I9;

import J9.b;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import c9.InterfaceC2346a;
import e9.C3260d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: SessionEvents.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJO\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LI9/A;", "", "<init>", "()V", "LJ9/b;", "subscriber", "LI9/d;", "d", "(LJ9/b;)LI9/d;", "Lcom/google/firebase/f;", "firebaseApp", "LI9/y;", "sessionDetails", "LK9/f;", "sessionsSettings", "", "LJ9/b$a;", "subscribers", "", "firebaseInstallationId", "firebaseAuthenticationToken", "LI9/z;", "a", "(Lcom/google/firebase/f;LI9/y;LK9/f;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)LI9/z;", "LI9/b;", "b", "(Lcom/google/firebase/f;)LI9/b;", "Lc9/a;", "Lc9/a;", "c", "()Lc9/a;", "SESSION_EVENT_ENCODER", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public static final A f6755a = new A();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final InterfaceC2346a SESSION_EVENT_ENCODER;

    static {
        InterfaceC2346a interfaceC2346aI = new C3260d().j(C1191c.f6815a).k(true).i();
        C3862t.f(interfaceC2346aI, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        SESSION_EVENT_ENCODER = interfaceC2346aI;
    }

    private A() {
    }

    private final EnumC1192d d(J9.b subscriber) {
        return subscriber == null ? EnumC1192d.COLLECTION_SDK_NOT_INSTALLED : subscriber.b() ? EnumC1192d.COLLECTION_ENABLED : EnumC1192d.COLLECTION_DISABLED;
    }

    public final SessionEvent a(com.google.firebase.f firebaseApp, SessionDetails sessionDetails, K9.f sessionsSettings, Map<b.a, ? extends J9.b> subscribers, String firebaseInstallationId, String firebaseAuthenticationToken) {
        C3862t.g(firebaseApp, "firebaseApp");
        C3862t.g(sessionDetails, "sessionDetails");
        C3862t.g(sessionsSettings, "sessionsSettings");
        C3862t.g(subscribers, "subscribers");
        C3862t.g(firebaseInstallationId, "firebaseInstallationId");
        C3862t.g(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new SessionEvent(EnumC1197i.SESSION_START, new SessionInfo(sessionDetails.getSessionId(), sessionDetails.getFirstSessionId(), sessionDetails.getSessionIndex(), sessionDetails.getSessionStartTimestampUs(), new DataCollectionStatus(d(subscribers.get(b.a.PERFORMANCE)), d(subscribers.get(b.a.CRASHLYTICS)), sessionsSettings.b()), firebaseInstallationId, firebaseAuthenticationToken), b(firebaseApp));
    }

    public final ApplicationInfo b(com.google.firebase.f firebaseApp) throws PackageManager.NameNotFoundException {
        C3862t.g(firebaseApp, "firebaseApp");
        Context contextK = firebaseApp.k();
        C3862t.f(contextK, "firebaseApp.applicationContext");
        String packageName = contextK.getPackageName();
        PackageInfo packageInfo = contextK.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        String strC = firebaseApp.n().c();
        C3862t.f(strC, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        C3862t.f(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        C3862t.f(RELEASE, "RELEASE");
        t tVar = t.LOG_ENVIRONMENT_PROD;
        C3862t.f(packageName, "packageName");
        String str = packageInfo.versionName;
        String str2 = str == null ? strValueOf : str;
        String MANUFACTURER = Build.MANUFACTURER;
        C3862t.f(MANUFACTURER, "MANUFACTURER");
        v vVar = v.f6894a;
        Context contextK2 = firebaseApp.k();
        C3862t.f(contextK2, "firebaseApp.applicationContext");
        ProcessDetails processDetailsD = vVar.d(contextK2);
        Context contextK3 = firebaseApp.k();
        C3862t.f(contextK3, "firebaseApp.applicationContext");
        return new ApplicationInfo(strC, MODEL, "2.0.8", RELEASE, tVar, new AndroidApplicationInfo(packageName, str2, strValueOf, MANUFACTURER, processDetailsD, vVar.c(contextK3)));
    }

    public final InterfaceC2346a c() {
        return SESSION_EVENT_ENCODER;
    }
}
