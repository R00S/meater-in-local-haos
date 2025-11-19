package e7;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import c7.C2333b;
import c7.C2336e;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import g7.AbstractC3438i;
import g7.C3442m;
import g7.C3446q;
import g7.C3448t;
import g7.C3449u;
import g7.InterfaceC3450v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import s.C4392b;
import z7.AbstractC5208j;
import z7.C5209k;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: e7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3216f implements Handler.Callback {

    /* renamed from: Q, reason: collision with root package name */
    public static final Status f40669Q = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: R, reason: collision with root package name */
    private static final Status f40670R = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: S, reason: collision with root package name */
    private static final Object f40671S = new Object();

    /* renamed from: T, reason: collision with root package name */
    private static C3216f f40672T;

    /* renamed from: D, reason: collision with root package name */
    private C3448t f40675D;

    /* renamed from: E, reason: collision with root package name */
    private InterfaceC3450v f40676E;

    /* renamed from: F, reason: collision with root package name */
    private final Context f40677F;

    /* renamed from: G, reason: collision with root package name */
    private final C2336e f40678G;

    /* renamed from: H, reason: collision with root package name */
    private final g7.H f40679H;

    /* renamed from: O, reason: collision with root package name */
    private final Handler f40686O;

    /* renamed from: P, reason: collision with root package name */
    private volatile boolean f40687P;

    /* renamed from: B, reason: collision with root package name */
    private long f40673B = 10000;

    /* renamed from: C, reason: collision with root package name */
    private boolean f40674C = false;

    /* renamed from: I, reason: collision with root package name */
    private final AtomicInteger f40680I = new AtomicInteger(1);

    /* renamed from: J, reason: collision with root package name */
    private final AtomicInteger f40681J = new AtomicInteger(0);

    /* renamed from: K, reason: collision with root package name */
    private final Map f40682K = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: L, reason: collision with root package name */
    private C3228s f40683L = null;

    /* renamed from: M, reason: collision with root package name */
    private final Set f40684M = new C4392b();

    /* renamed from: N, reason: collision with root package name */
    private final Set f40685N = new C4392b();

    private C3216f(Context context, Looper looper, C2336e c2336e) {
        this.f40687P = true;
        this.f40677F = context;
        p7.j jVar = new p7.j(looper, this);
        this.f40686O = jVar;
        this.f40678G = c2336e;
        this.f40679H = new g7.H(c2336e);
        if (com.google.android.gms.common.util.i.a(context)) {
            this.f40687P = false;
        }
        jVar.sendMessage(jVar.obtainMessage(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status f(C3212b c3212b, C2333b c2333b) {
        return new Status(c2333b, "API: " + c3212b.b() + " is not available on this device. Connection failed with: " + String.valueOf(c2333b));
    }

    @ResultIgnorabilityUnspecified
    private final C3209B g(com.google.android.gms.common.api.b bVar) {
        Map map = this.f40682K;
        C3212b c3212bG = bVar.g();
        C3209B c3209b = (C3209B) map.get(c3212bG);
        if (c3209b == null) {
            c3209b = new C3209B(this, bVar);
            this.f40682K.put(c3212bG, c3209b);
        }
        if (c3209b.a()) {
            this.f40685N.add(c3212bG);
        }
        c3209b.F();
        return c3209b;
    }

    private final InterfaceC3450v h() {
        if (this.f40676E == null) {
            this.f40676E = C3449u.a(this.f40677F);
        }
        return this.f40676E;
    }

    private final void i() {
        C3448t c3448t = this.f40675D;
        if (c3448t != null) {
            if (c3448t.f0() > 0 || d()) {
                h().a(c3448t);
            }
            this.f40675D = null;
        }
    }

    private final void j(C5209k c5209k, int i10, com.google.android.gms.common.api.b bVar) {
        K kB;
        if (i10 == 0 || (kB = K.b(this, i10, bVar.g())) == null) {
            return;
        }
        AbstractC5208j abstractC5208jA = c5209k.a();
        final Handler handler = this.f40686O;
        handler.getClass();
        abstractC5208jA.b(new Executor() { // from class: e7.v
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, kB);
    }

    @ResultIgnorabilityUnspecified
    public static C3216f t(Context context) {
        C3216f c3216f;
        synchronized (f40671S) {
            try {
                if (f40672T == null) {
                    f40672T = new C3216f(context.getApplicationContext(), AbstractC3438i.c().getLooper(), C2336e.m());
                }
                c3216f = f40672T;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3216f;
    }

    public final void A(com.google.android.gms.common.api.b bVar, int i10, AbstractC3225o abstractC3225o, C5209k c5209k, InterfaceC3224n interfaceC3224n) {
        j(c5209k, abstractC3225o.d(), bVar);
        this.f40686O.sendMessage(this.f40686O.obtainMessage(4, new O(new Z(i10, abstractC3225o, c5209k, interfaceC3224n), this.f40681J.get(), bVar)));
    }

    final void B(C3442m c3442m, int i10, long j10, int i11) {
        this.f40686O.sendMessage(this.f40686O.obtainMessage(18, new L(c3442m, i10, j10, i11)));
    }

    public final void C(C2333b c2333b, int i10) throws Resources.NotFoundException {
        if (e(c2333b, i10)) {
            return;
        }
        Handler handler = this.f40686O;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, c2333b));
    }

    public final void D() {
        Handler handler = this.f40686O;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void E(com.google.android.gms.common.api.b bVar) {
        Handler handler = this.f40686O;
        handler.sendMessage(handler.obtainMessage(7, bVar));
    }

    public final void a(C3228s c3228s) {
        synchronized (f40671S) {
            try {
                if (this.f40683L != c3228s) {
                    this.f40683L = c3228s;
                    this.f40684M.clear();
                }
                this.f40684M.addAll(c3228s.t());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final void b(C3228s c3228s) {
        synchronized (f40671S) {
            try {
                if (this.f40683L == c3228s) {
                    this.f40683L = null;
                    this.f40684M.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final boolean d() {
        if (this.f40674C) {
            return false;
        }
        g7.r rVarA = C3446q.b().a();
        if (rVarA != null && !rVarA.r0()) {
            return false;
        }
        int iA = this.f40679H.a(this.f40677F, 203400000);
        return iA == -1 || iA == 0;
    }

    @ResultIgnorabilityUnspecified
    final boolean e(C2333b c2333b, int i10) throws Resources.NotFoundException {
        return this.f40678G.w(this.f40677F, c2333b, i10);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        C3209B c3209b = null;
        switch (i10) {
            case 1:
                this.f40673B = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f40686O.removeMessages(12);
                for (C3212b c3212b : this.f40682K.keySet()) {
                    Handler handler = this.f40686O;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c3212b), this.f40673B);
                }
                return true;
            case 2:
                c0 c0Var = (c0) message.obj;
                Iterator it = c0Var.a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C3212b c3212b2 = (C3212b) it.next();
                        C3209B c3209b2 = (C3209B) this.f40682K.get(c3212b2);
                        if (c3209b2 == null) {
                            c0Var.b(c3212b2, new C2333b(13), null);
                        } else if (c3209b2.Q()) {
                            c0Var.b(c3212b2, C2333b.f31067F, c3209b2.w().e());
                        } else {
                            C2333b c2333bU = c3209b2.u();
                            if (c2333bU != null) {
                                c0Var.b(c3212b2, c2333bU, null);
                            } else {
                                c3209b2.K(c0Var);
                                c3209b2.F();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (C3209B c3209b3 : this.f40682K.values()) {
                    c3209b3.E();
                    c3209b3.F();
                }
                return true;
            case 4:
            case 8:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                O o10 = (O) message.obj;
                C3209B c3209bG = (C3209B) this.f40682K.get(o10.f40630c.g());
                if (c3209bG == null) {
                    c3209bG = g(o10.f40630c);
                }
                if (!c3209bG.a() || this.f40681J.get() == o10.f40629b) {
                    c3209bG.G(o10.f40628a);
                } else {
                    o10.f40628a.a(f40669Q);
                    c3209bG.M();
                }
                return true;
            case 5:
                int i11 = message.arg1;
                C2333b c2333b = (C2333b) message.obj;
                Iterator it2 = this.f40682K.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C3209B c3209b4 = (C3209B) it2.next();
                        if (c3209b4.s() == i11) {
                            c3209b = c3209b4;
                        }
                    }
                }
                if (c3209b == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                } else if (c2333b.f0() == 13) {
                    c3209b.f(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f40678G.e(c2333b.f0()) + ": " + c2333b.h0()));
                } else {
                    c3209b.f(f(c3209b.f40592D, c2333b));
                }
                return true;
            case 6:
                if (this.f40677F.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C3213c.c((Application) this.f40677F.getApplicationContext());
                    ComponentCallbacks2C3213c.b().a(new C3232w(this));
                    if (!ComponentCallbacks2C3213c.b().e(true)) {
                        this.f40673B = 300000L;
                    }
                }
                return true;
            case 7:
                g((com.google.android.gms.common.api.b) message.obj);
                return true;
            case 9:
                if (this.f40682K.containsKey(message.obj)) {
                    ((C3209B) this.f40682K.get(message.obj)).L();
                }
                return true;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                Iterator it3 = this.f40685N.iterator();
                while (it3.hasNext()) {
                    C3209B c3209b5 = (C3209B) this.f40682K.remove((C3212b) it3.next());
                    if (c3209b5 != null) {
                        c3209b5.M();
                    }
                }
                this.f40685N.clear();
                return true;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (this.f40682K.containsKey(message.obj)) {
                    ((C3209B) this.f40682K.get(message.obj)).N();
                }
                return true;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (this.f40682K.containsKey(message.obj)) {
                    ((C3209B) this.f40682K.get(message.obj)).b();
                }
                return true;
            case 14:
                C3229t c3229t = (C3229t) message.obj;
                C3212b c3212bA = c3229t.a();
                if (this.f40682K.containsKey(c3212bA)) {
                    c3229t.b().c(Boolean.valueOf(((C3209B) this.f40682K.get(c3212bA)).r(false)));
                } else {
                    c3229t.b().c(Boolean.FALSE);
                }
                return true;
            case 15:
                D d10 = (D) message.obj;
                if (this.f40682K.containsKey(d10.f40603a)) {
                    C3209B.C((C3209B) this.f40682K.get(d10.f40603a), d10);
                }
                return true;
            case 16:
                D d11 = (D) message.obj;
                if (this.f40682K.containsKey(d11.f40603a)) {
                    C3209B.D((C3209B) this.f40682K.get(d11.f40603a), d11);
                }
                return true;
            case 17:
                i();
                return true;
            case 18:
                L l10 = (L) message.obj;
                if (l10.f40623c == 0) {
                    h().a(new C3448t(l10.f40622b, Arrays.asList(l10.f40621a)));
                } else {
                    C3448t c3448t = this.f40675D;
                    if (c3448t != null) {
                        List listH0 = c3448t.h0();
                        if (c3448t.f0() != l10.f40622b || (listH0 != null && listH0.size() >= l10.f40624d)) {
                            this.f40686O.removeMessages(17);
                            i();
                        } else {
                            this.f40675D.r0(l10.f40621a);
                        }
                    }
                    if (this.f40675D == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(l10.f40621a);
                        this.f40675D = new C3448t(l10.f40622b, arrayList);
                        Handler handler2 = this.f40686O;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), l10.f40623c);
                    }
                }
                return true;
            case 19:
                this.f40674C = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
    }

    public final int k() {
        return this.f40680I.getAndIncrement();
    }

    final C3209B s(C3212b c3212b) {
        return (C3209B) this.f40682K.get(c3212b);
    }

    public final void z(com.google.android.gms.common.api.b bVar, int i10, com.google.android.gms.common.api.internal.a aVar) {
        this.f40686O.sendMessage(this.f40686O.obtainMessage(4, new O(new Y(i10, aVar), this.f40681J.get(), bVar)));
    }
}
