package K9;

import Ba.l;
import I9.A;
import I9.ApplicationInfo;
import I9.v;
import I9.w;
import Ia.m;
import Vb.a;
import android.content.Context;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import k9.InterfaceC3810e;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.P;
import ta.InterfaceC4588d;

/* compiled from: SessionsSettings.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B1\b\u0012\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0005\u0010\u0010B)\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u001dH\u0086@ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0011\u0010%\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\"\u0010&R\u001a\u0010\u001a\u001a\u00020\u00198Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006)"}, d2 = {"LK9/f;", "", "LK9/h;", "localOverrideSettings", "remoteSettings", "<init>", "(LK9/h;LK9/h;)V", "Landroid/content/Context;", "context", "Lta/g;", "blockingDispatcher", "backgroundDispatcher", "Lk9/e;", "firebaseInstallationsApi", "LI9/b;", "appInfo", "(Landroid/content/Context;Lta/g;Lta/g;Lk9/e;LI9/b;)V", "Lcom/google/firebase/f;", "firebaseApp", "(Lcom/google/firebase/f;Lta/g;Lta/g;Lk9/e;)V", "", "samplingRate", "", "e", "(D)Z", "LVb/a;", "sessionRestartTimeout", "f", "(J)Z", "Loa/F;", "g", "(Lta/d;)Ljava/lang/Object;", "a", "LK9/h;", "b", "d", "()Z", "sessionsEnabled", "()D", "c", "()J", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Ea.d<Context, B1.e<E1.d>> f8843d = D1.a.b(w.f6895a.b(), new C1.b(a.f8846B), null, null, 12, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h localOverrideSettings;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h remoteSettings;

    /* compiled from: SessionsSettings.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/datastore/core/CorruptionException;", "ex", "LE1/d;", "a", "(Landroidx/datastore/core/CorruptionException;)LE1/d;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements l<CorruptionException, E1.d> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f8846B = new a();

        a() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E1.d invoke(CorruptionException ex) {
            C3862t.g(ex, "ex");
            Log.w("SessionsSettings", "CorruptionException in settings DataStore in " + v.f6894a.e() + '.', ex);
            return E1.e.a();
        }
    }

    /* compiled from: SessionsSettings.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LK9/f$b;", "", "<init>", "()V", "Landroid/content/Context;", "LB1/e;", "LE1/d;", "dataStore$delegate", "LEa/d;", "b", "(Landroid/content/Context;)LB1/e;", "dataStore", "LK9/f;", "c", "()LK9/f;", "instance", "", "TAG", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K9.f$b, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ m<Object>[] f8847a = {P.i(new I(Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final B1.e<E1.d> b(Context context) {
            return (B1.e) f.f8843d.a(context, f8847a[0]);
        }

        public final f c() {
            Object objJ = com.google.firebase.l.a(com.google.firebase.c.f38095a).j(f.class);
            C3862t.f(objJ, "Firebase.app[SessionsSettings::class.java]");
            return (f) objJ;
        }

        private Companion() {
        }
    }

    /* compiled from: SessionsSettings.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", l = {138, 139}, m = "updateSettings")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f8848B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f8849C;

        /* renamed from: E, reason: collision with root package name */
        int f8851E;

        c(InterfaceC4588d<? super c> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8849C = obj;
            this.f8851E |= Integer.MIN_VALUE;
            return f.this.g(this);
        }
    }

    public f(h localOverrideSettings, h remoteSettings) {
        C3862t.g(localOverrideSettings, "localOverrideSettings");
        C3862t.g(remoteSettings, "remoteSettings");
        this.localOverrideSettings = localOverrideSettings;
        this.remoteSettings = remoteSettings;
    }

    private final boolean e(double samplingRate) {
        return 0.0d <= samplingRate && samplingRate <= 1.0d;
    }

    private final boolean f(long sessionRestartTimeout) {
        return Vb.a.R(sessionRestartTimeout) && Vb.a.M(sessionRestartTimeout);
    }

    public final double b() {
        Double d10 = this.localOverrideSettings.d();
        if (d10 != null) {
            double dDoubleValue = d10.doubleValue();
            if (e(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double d11 = this.remoteSettings.d();
        if (d11 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = d11.doubleValue();
        if (e(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    public final long c() {
        Vb.a aVarB = this.localOverrideSettings.b();
        if (aVarB != null) {
            long rawValue = aVarB.getRawValue();
            if (f(rawValue)) {
                return rawValue;
            }
        }
        Vb.a aVarB2 = this.remoteSettings.b();
        if (aVarB2 != null) {
            long rawValue2 = aVarB2.getRawValue();
            if (f(rawValue2)) {
                return rawValue2;
            }
        }
        a.Companion companion = Vb.a.INSTANCE;
        return Vb.c.o(30, Vb.d.f18247G);
    }

    public final boolean d() {
        Boolean boolA = this.localOverrideSettings.a();
        if (boolA != null) {
            return boolA.booleanValue();
        }
        Boolean boolA2 = this.remoteSettings.a();
        if (boolA2 != null) {
            return boolA2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(ta.InterfaceC4588d<? super oa.C4153F> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof K9.f.c
            if (r0 == 0) goto L13
            r0 = r6
            K9.f$c r0 = (K9.f.c) r0
            int r1 = r0.f8851E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8851E = r1
            goto L18
        L13:
            K9.f$c r0 = new K9.f$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f8849C
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f8851E
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            oa.C4173r.b(r6)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f8848B
            K9.f r2 = (K9.f) r2
            oa.C4173r.b(r6)
            goto L4d
        L3c:
            oa.C4173r.b(r6)
            K9.h r6 = r5.localOverrideSettings
            r0.f8848B = r5
            r0.f8851E = r4
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            K9.h r6 = r2.remoteSettings
            r2 = 0
            r0.f8848B = r2
            r0.f8851E = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            oa.F r6 = oa.C4153F.f46609a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: K9.f.g(ta.d):java.lang.Object");
    }

    private f(Context context, ta.g gVar, ta.g gVar2, InterfaceC3810e interfaceC3810e, ApplicationInfo applicationInfo) {
        this(new b(context), new K9.c(gVar2, interfaceC3810e, applicationInfo, new d(applicationInfo, gVar, null, 4, null), INSTANCE.b(context)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(com.google.firebase.f firebaseApp, ta.g blockingDispatcher, ta.g backgroundDispatcher, InterfaceC3810e firebaseInstallationsApi) {
        C3862t.g(firebaseApp, "firebaseApp");
        C3862t.g(blockingDispatcher, "blockingDispatcher");
        C3862t.g(backgroundDispatcher, "backgroundDispatcher");
        C3862t.g(firebaseInstallationsApi, "firebaseInstallationsApi");
        Context contextK = firebaseApp.k();
        C3862t.f(contextK, "firebaseApp.applicationContext");
        this(contextK, blockingDispatcher, backgroundDispatcher, firebaseInstallationsApi, A.f6755a.b(firebaseApp));
    }
}
