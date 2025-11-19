package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import l8.InterfaceC3914g;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.w3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2610w3<T> {

    /* renamed from: h, reason: collision with root package name */
    private static final Object f34415h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private static volatile E3 f34416i;

    /* renamed from: j, reason: collision with root package name */
    private static I3 f34417j;

    /* renamed from: k, reason: collision with root package name */
    private static final AtomicInteger f34418k;

    /* renamed from: a, reason: collision with root package name */
    private final F3 f34419a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34420b;

    /* renamed from: c, reason: collision with root package name */
    private Object f34421c;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f34422d;

    /* renamed from: e, reason: collision with root package name */
    private volatile T f34423e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f34424f;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f34425g;

    static {
        new AtomicReference();
        f34417j = new I3(new L3() { // from class: com.google.android.gms.internal.measurement.x3
            @Override // com.google.android.gms.internal.measurement.L3
            public final boolean a() {
                return AbstractC2610w3.n();
            }
        });
        f34418k = new AtomicInteger();
    }

    static /* synthetic */ AbstractC2610w3 a(F3 f32, String str, Boolean bool, boolean z10) {
        return new A3(f32, str, bool, true);
    }

    static /* synthetic */ AbstractC2610w3 b(F3 f32, String str, Double d10, boolean z10) {
        return new D3(f32, str, d10, true);
    }

    static /* synthetic */ AbstractC2610w3 c(F3 f32, String str, Long l10, boolean z10) {
        return new B3(f32, str, l10, true);
    }

    static /* synthetic */ AbstractC2610w3 d(F3 f32, String str, String str2, boolean z10) {
        return new C3(f32, str, str2, true);
    }

    private final T f(E3 e32) {
        InterfaceC3914g<Context, Boolean> interfaceC3914g;
        F3 f32 = this.f34419a;
        if (!f32.f33725e && ((interfaceC3914g = f32.f33729i) == null || interfaceC3914g.apply(e32.a()).booleanValue())) {
            C2555p3 c2555p3A = C2555p3.a(e32.a());
            F3 f33 = this.f34419a;
            Object objC = c2555p3A.c(f33.f33725e ? null : h(f33.f33723c));
            if (objC != null) {
                return g(objC);
            }
        }
        return null;
    }

    private final String h(String str) {
        if (str != null && str.isEmpty()) {
            return this.f34420b;
        }
        return str + this.f34420b;
    }

    private final T j(E3 e32) {
        Object objC;
        InterfaceC2515k3 interfaceC2515k3A = this.f34419a.f33722b != null ? C2594u3.b(e32.a(), this.f34419a.f33722b) ? this.f34419a.f33728h ? C2491h3.a(e32.a().getContentResolver(), C2586t3.a(C2586t3.b(e32.a(), this.f34419a.f33722b.getLastPathSegment())), new Runnable() { // from class: com.google.android.gms.internal.measurement.v3
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2610w3.m();
            }
        }) : C2491h3.a(e32.a().getContentResolver(), this.f34419a.f33722b, new Runnable() { // from class: com.google.android.gms.internal.measurement.v3
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2610w3.m();
            }
        }) : null : G3.b(e32.a(), this.f34419a.f33721a, new Runnable() { // from class: com.google.android.gms.internal.measurement.v3
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2610w3.m();
            }
        });
        if (interfaceC2515k3A == null || (objC = interfaceC2515k3A.c(k())) == null) {
            return null;
        }
        return g(objC);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void l(final android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.E3 r0 = com.google.android.gms.internal.measurement.AbstractC2610w3.f34416i
            if (r0 != 0) goto L4e
            if (r3 != 0) goto L7
            goto L4e
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.measurement.AbstractC2610w3.f34415h
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.E3 r1 = com.google.android.gms.internal.measurement.AbstractC2610w3.f34416i     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L4a
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.measurement.E3 r1 = com.google.android.gms.internal.measurement.AbstractC2610w3.f34416i     // Catch: java.lang.Throwable -> L22
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L18
            goto L19
        L18:
            r3 = r2
        L19:
            if (r1 == 0) goto L24
            android.content.Context r2 = r1.a()     // Catch: java.lang.Throwable -> L22
            if (r2 == r3) goto L44
            goto L24
        L22:
            r3 = move-exception
            goto L46
        L24:
            if (r1 == 0) goto L2f
            com.google.android.gms.internal.measurement.C2491h3.e()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.G3.d()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.C2555p3.d()     // Catch: java.lang.Throwable -> L22
        L2f:
            com.google.android.gms.internal.measurement.y3 r1 = new com.google.android.gms.internal.measurement.y3     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            l8.s r1 = l8.t.a(r1)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.e3 r2 = new com.google.android.gms.internal.measurement.e3     // Catch: java.lang.Throwable -> L22
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.AbstractC2610w3.f34416i = r2     // Catch: java.lang.Throwable -> L22
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.measurement.AbstractC2610w3.f34418k     // Catch: java.lang.Throwable -> L22
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L22
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            goto L4a
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r3     // Catch: java.lang.Throwable -> L48
        L48:
            r3 = move-exception
            goto L4c
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            return
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r3
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC2610w3.l(android.content.Context):void");
    }

    public static void m() {
        f34418k.incrementAndGet();
    }

    static /* synthetic */ boolean n() {
        return true;
    }

    private final T o() {
        return (T) this.f34421c;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007c A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:8:0x001c, B:10:0x0020, B:12:0x0029, B:14:0x0039, B:20:0x0055, B:22:0x0060, B:35:0x0080, B:38:0x0088, B:39:0x008d, B:40:0x0091, B:25:0x0067, B:34:0x007c, B:28:0x006e, B:31:0x0075, B:41:0x0095), top: B:47:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T e() {
        /*
            r8 = this;
            boolean r0 = r8.f34424f
            if (r0 != 0) goto L11
            com.google.android.gms.internal.measurement.I3 r0 = com.google.android.gms.internal.measurement.AbstractC2610w3.f34417j
            java.lang.String r1 = r8.f34420b
            boolean r0 = r0.a(r1)
            java.lang.String r1 = "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error."
            l8.m.r(r0, r1)
        L11:
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.AbstractC2610w3.f34418k
            int r0 = r0.get()
            int r1 = r8.f34422d
            if (r1 >= r0) goto L99
            monitor-enter(r8)
            int r1 = r8.f34422d     // Catch: java.lang.Throwable -> L4e
            if (r1 >= r0) goto L95
            com.google.android.gms.internal.measurement.E3 r1 = com.google.android.gms.internal.measurement.AbstractC2610w3.f34416i     // Catch: java.lang.Throwable -> L4e
            l8.l r2 = l8.l.a()     // Catch: java.lang.Throwable -> L4e
            r3 = 0
            if (r1 == 0) goto L50
            l8.s r2 = r1.b()     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L4e
            l8.l r2 = (l8.l) r2     // Catch: java.lang.Throwable -> L4e
            boolean r4 = r2.c()     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L50
            java.lang.Object r3 = r2.b()     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.internal.measurement.q3 r3 = (com.google.android.gms.internal.measurement.InterfaceC2563q3) r3     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.internal.measurement.F3 r4 = r8.f34419a     // Catch: java.lang.Throwable -> L4e
            android.net.Uri r5 = r4.f33722b     // Catch: java.lang.Throwable -> L4e
            java.lang.String r6 = r4.f33721a     // Catch: java.lang.Throwable -> L4e
            java.lang.String r4 = r4.f33724d     // Catch: java.lang.Throwable -> L4e
            java.lang.String r7 = r8.f34420b     // Catch: java.lang.Throwable -> L4e
            java.lang.String r3 = r3.a(r5, r6, r4, r7)     // Catch: java.lang.Throwable -> L4e
            goto L50
        L4e:
            r0 = move-exception
            goto L97
        L50:
            if (r1 == 0) goto L54
            r4 = 1
            goto L55
        L54:
            r4 = 0
        L55:
            java.lang.String r5 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            l8.m.r(r4, r5)     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.internal.measurement.F3 r4 = r8.f34419a     // Catch: java.lang.Throwable -> L4e
            boolean r4 = r4.f33726f     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L6e
            java.lang.Object r4 = r8.f(r1)     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L67
            goto L80
        L67:
            java.lang.Object r4 = r8.j(r1)     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L7c
            goto L80
        L6e:
            java.lang.Object r4 = r8.j(r1)     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L75
            goto L80
        L75:
            java.lang.Object r4 = r8.f(r1)     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L7c
            goto L80
        L7c:
            java.lang.Object r4 = r8.o()     // Catch: java.lang.Throwable -> L4e
        L80:
            boolean r1 = r2.c()     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L91
            if (r3 != 0) goto L8d
            java.lang.Object r4 = r8.o()     // Catch: java.lang.Throwable -> L4e
            goto L91
        L8d:
            java.lang.Object r4 = r8.g(r3)     // Catch: java.lang.Throwable -> L4e
        L91:
            r8.f34423e = r4     // Catch: java.lang.Throwable -> L4e
            r8.f34422d = r0     // Catch: java.lang.Throwable -> L4e
        L95:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4e
            goto L99
        L97:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4e
            throw r0
        L99:
            T r0 = r8.f34423e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC2610w3.e():java.lang.Object");
    }

    abstract T g(Object obj);

    public final String k() {
        return h(this.f34419a.f33724d);
    }

    private AbstractC2610w3(F3 f32, String str, T t10, boolean z10) {
        this.f34422d = -1;
        String str2 = f32.f33721a;
        if (str2 == null && f32.f33722b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && f32.f33722b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.f34419a = f32;
        this.f34420b = str;
        this.f34421c = t10;
        this.f34424f = z10;
        this.f34425g = false;
    }
}
