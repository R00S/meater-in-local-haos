package J5;

import E4.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: CrashTracking.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LJ5/a;", "", "<init>", "()V", "", "ex", "Loa/F;", "a", "(Ljava/lang/Throwable;)V", "", "b", "Z", "allowCrashlytics", "Lcom/google/firebase/crashlytics/a;", "c", "Lcom/google/firebase/crashlytics/a;", "crashlytics", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7631a = new a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final boolean allowCrashlytics = true;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final com.google.firebase.crashlytics.a crashlytics;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7634d;

    static {
        com.google.firebase.crashlytics.a aVarB = com.google.firebase.crashlytics.a.b();
        aVarB.f(true);
        aVarB.g(i.D().G());
        C3862t.f(aVarB, "apply(...)");
        crashlytics = aVarB;
        f7634d = 8;
    }

    private a() {
    }

    public static final void a(Throwable ex) {
        C3862t.g(ex, "ex");
        if (allowCrashlytics) {
            crashlytics.e(ex);
        }
    }
}
