package g7;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import c7.C2333b;
import c7.C2335d;
import c7.C2337f;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: g7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3433d<T extends IInterface> {

    /* renamed from: B, reason: collision with root package name */
    private int f41979B;

    /* renamed from: C, reason: collision with root package name */
    private long f41980C;

    /* renamed from: D, reason: collision with root package name */
    private long f41981D;

    /* renamed from: E, reason: collision with root package name */
    private int f41982E;

    /* renamed from: F, reason: collision with root package name */
    private long f41983F;

    /* renamed from: G, reason: collision with root package name */
    private volatile String f41984G;

    /* renamed from: H, reason: collision with root package name */
    s0 f41985H;

    /* renamed from: I, reason: collision with root package name */
    private final Context f41986I;

    /* renamed from: J, reason: collision with root package name */
    private final Looper f41987J;

    /* renamed from: K, reason: collision with root package name */
    private final AbstractC3438i f41988K;

    /* renamed from: L, reason: collision with root package name */
    private final C2337f f41989L;

    /* renamed from: M, reason: collision with root package name */
    final Handler f41990M;

    /* renamed from: N, reason: collision with root package name */
    private final Object f41991N;

    /* renamed from: O, reason: collision with root package name */
    private final Object f41992O;

    /* renamed from: P, reason: collision with root package name */
    private InterfaceC3441l f41993P;

    /* renamed from: Q, reason: collision with root package name */
    protected c f41994Q;

    /* renamed from: R, reason: collision with root package name */
    private IInterface f41995R;

    /* renamed from: S, reason: collision with root package name */
    private final ArrayList f41996S;

    /* renamed from: T, reason: collision with root package name */
    private e0 f41997T;

    /* renamed from: U, reason: collision with root package name */
    private int f41998U;

    /* renamed from: V, reason: collision with root package name */
    private final a f41999V;

    /* renamed from: W, reason: collision with root package name */
    private final b f42000W;

    /* renamed from: X, reason: collision with root package name */
    private final int f42001X;

    /* renamed from: Y, reason: collision with root package name */
    private final String f42002Y;

    /* renamed from: Z, reason: collision with root package name */
    private volatile String f42003Z;

    /* renamed from: a0, reason: collision with root package name */
    private C2333b f42004a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f42005b0;

    /* renamed from: c0, reason: collision with root package name */
    private volatile h0 f42006c0;

    /* renamed from: d0, reason: collision with root package name */
    protected AtomicInteger f42007d0;

    /* renamed from: f0, reason: collision with root package name */
    private static final C2335d[] f41978f0 = new C2335d[0];

    /* renamed from: e0, reason: collision with root package name */
    public static final String[] f41977e0 = {"service_esmobile", "service_googleme"};

    /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    /* renamed from: g7.d$a */
    public interface a {
        void g(int i10);

        void k(Bundle bundle);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    /* renamed from: g7.d$b */
    public interface b {
        void c(C2333b c2333b);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    /* renamed from: g7.d$c */
    public interface c {
        void c(C2333b c2333b);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    /* renamed from: g7.d$d, reason: collision with other inner class name */
    protected class C0534d implements c {
        public C0534d() {
        }

        @Override // g7.AbstractC3433d.c
        public final void c(C2333b c2333b) {
            if (c2333b.G0()) {
                AbstractC3433d abstractC3433d = AbstractC3433d.this;
                abstractC3433d.f(null, abstractC3433d.C());
            } else if (AbstractC3433d.this.f42000W != null) {
                AbstractC3433d.this.f42000W.c(c2333b);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    /* renamed from: g7.d$e */
    public interface e {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected AbstractC3433d(Context context, Looper looper, int i10, a aVar, b bVar, String str) {
        AbstractC3438i abstractC3438iB = AbstractC3438i.b(context);
        C2337f c2337fF = C2337f.f();
        C3445p.k(aVar);
        C3445p.k(bVar);
        this(context, looper, abstractC3438iB, c2337fF, i10, aVar, bVar, str);
    }

    static /* bridge */ /* synthetic */ void c0(AbstractC3433d abstractC3433d, h0 h0Var) {
        abstractC3433d.f42006c0 = h0Var;
        if (abstractC3433d.S()) {
            C3435f c3435f = h0Var.f42059E;
            C3446q.b().c(c3435f == null ? null : c3435f.O0());
        }
    }

    static /* bridge */ /* synthetic */ void d0(AbstractC3433d abstractC3433d, int i10) {
        int i11;
        int i12;
        synchronized (abstractC3433d.f41991N) {
            i11 = abstractC3433d.f41998U;
        }
        if (i11 == 3) {
            abstractC3433d.f42005b0 = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = abstractC3433d.f41990M;
        handler.sendMessage(handler.obtainMessage(i12, abstractC3433d.f42007d0.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean g0(AbstractC3433d abstractC3433d, int i10, int i11, IInterface iInterface) {
        synchronized (abstractC3433d.f41991N) {
            try {
                if (abstractC3433d.f41998U != i10) {
                    return false;
                }
                abstractC3433d.i0(i11, iInterface);
                return true;
            } finally {
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean h0(AbstractC3433d abstractC3433d) throws ClassNotFoundException {
        if (abstractC3433d.f42005b0 || TextUtils.isEmpty(abstractC3433d.E()) || TextUtils.isEmpty(abstractC3433d.B())) {
            return false;
        }
        try {
            Class.forName(abstractC3433d.E());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(int i10, IInterface iInterface) {
        s0 s0Var;
        C3445p.a((i10 == 4) == (iInterface != null));
        synchronized (this.f41991N) {
            try {
                this.f41998U = i10;
                this.f41995R = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
                    e0 e0Var = this.f41997T;
                    if (e0Var != null) {
                        AbstractC3438i abstractC3438i = this.f41988K;
                        String strB = this.f41985H.b();
                        C3445p.k(strB);
                        abstractC3438i.f(strB, this.f41985H.a(), 4225, e0Var, X(), this.f41985H.c());
                        this.f41997T = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    e0 e0Var2 = this.f41997T;
                    if (e0Var2 != null && (s0Var = this.f41985H) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + s0Var.b() + " on " + s0Var.a());
                        AbstractC3438i abstractC3438i2 = this.f41988K;
                        String strB2 = this.f41985H.b();
                        C3445p.k(strB2);
                        abstractC3438i2.f(strB2, this.f41985H.a(), 4225, e0Var2, X(), this.f41985H.c());
                        this.f42007d0.incrementAndGet();
                    }
                    e0 e0Var3 = new e0(this, this.f42007d0.get());
                    this.f41997T = e0Var3;
                    s0 s0Var2 = (this.f41998U != 3 || B() == null) ? new s0(G(), F(), false, 4225, I()) : new s0(y().getPackageName(), B(), true, 4225, false);
                    this.f41985H = s0Var2;
                    if (s0Var2.c() && j() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f41985H.b())));
                    }
                    AbstractC3438i abstractC3438i3 = this.f41988K;
                    String strB3 = this.f41985H.b();
                    C3445p.k(strB3);
                    C2333b c2333bD = abstractC3438i3.d(new l0(strB3, this.f41985H.a(), 4225, this.f41985H.c()), e0Var3, X(), w());
                    if (!c2333bD.G0()) {
                        Log.w("GmsClient", "unable to connect to service: " + this.f41985H.b() + " on " + this.f41985H.a());
                        int iF0 = c2333bD.f0() == -1 ? 16 : c2333bD.f0();
                        if (c2333bD.r0() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", c2333bD.r0());
                        }
                        e0(iF0, bundle, this.f42007d0.get());
                    }
                } else if (i10 == 4) {
                    C3445p.k(iInterface);
                    K(iInterface);
                }
            } finally {
            }
        }
    }

    protected Bundle A() {
        return new Bundle();
    }

    protected String B() {
        return null;
    }

    protected Set<Scope> C() {
        return Collections.emptySet();
    }

    public final T D() {
        T t10;
        synchronized (this.f41991N) {
            try {
                if (this.f41998U == 5) {
                    throw new DeadObjectException();
                }
                r();
                IInterface iInterface = this.f41995R;
                C3445p.l(iInterface, "Client is connected but service is null");
                t10 = (T) iInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t10;
    }

    protected abstract String E();

    protected abstract String F();

    protected String G() {
        return "com.google.android.gms";
    }

    public C3435f H() {
        h0 h0Var = this.f42006c0;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f42059E;
    }

    protected boolean I() {
        return j() >= 211700000;
    }

    public boolean J() {
        return this.f42006c0 != null;
    }

    protected void K(T t10) {
        this.f41981D = System.currentTimeMillis();
    }

    protected void L(C2333b c2333b) {
        this.f41982E = c2333b.f0();
        this.f41983F = System.currentTimeMillis();
    }

    protected void M(int i10) {
        this.f41979B = i10;
        this.f41980C = System.currentTimeMillis();
    }

    protected void N(int i10, IBinder iBinder, Bundle bundle, int i11) {
        this.f41990M.sendMessage(this.f41990M.obtainMessage(1, i11, -1, new f0(this, i10, iBinder, bundle)));
    }

    public boolean O() {
        return false;
    }

    public void P(String str) {
        this.f42003Z = str;
    }

    public void Q(int i10) {
        this.f41990M.sendMessage(this.f41990M.obtainMessage(6, this.f42007d0.get(), i10));
    }

    protected void R(c cVar, int i10, PendingIntent pendingIntent) {
        C3445p.l(cVar, "Connection progress callbacks cannot be null.");
        this.f41994Q = cVar;
        this.f41990M.sendMessage(this.f41990M.obtainMessage(3, this.f42007d0.get(), i10, pendingIntent));
    }

    public boolean S() {
        return false;
    }

    protected final String X() {
        String str = this.f42002Y;
        return str == null ? this.f41986I.getClass().getName() : str;
    }

    public void a(c cVar) {
        C3445p.l(cVar, "Connection progress callbacks cannot be null.");
        this.f41994Q = cVar;
        i0(2, null);
    }

    public void c(String str) {
        this.f41984G = str;
        g();
    }

    public boolean d() {
        boolean z10;
        synchronized (this.f41991N) {
            int i10 = this.f41998U;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public String e() {
        s0 s0Var;
        if (!h() || (s0Var = this.f41985H) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return s0Var.a();
    }

    protected final void e0(int i10, Bundle bundle, int i11) {
        this.f41990M.sendMessage(this.f41990M.obtainMessage(7, i11, -1, new g0(this, i10, bundle)));
    }

    public void f(InterfaceC3439j interfaceC3439j, Set<Scope> set) {
        Bundle bundleA = A();
        String str = Build.VERSION.SDK_INT < 31 ? this.f42003Z : this.f42003Z;
        int i10 = this.f42001X;
        int i11 = C2337f.f31082a;
        Scope[] scopeArr = C3436g.f42036P;
        Bundle bundle = new Bundle();
        C2335d[] c2335dArr = C3436g.f42037Q;
        C3436g c3436g = new C3436g(6, i10, i11, null, null, scopeArr, bundle, null, c2335dArr, c2335dArr, true, 0, false, str);
        c3436g.f42041E = this.f41986I.getPackageName();
        c3436g.f42044H = bundleA;
        if (set != null) {
            c3436g.f42043G = (Scope[]) set.toArray(new Scope[0]);
        }
        if (n()) {
            Account accountU = u();
            if (accountU == null) {
                accountU = new Account("<<default account>>", "com.google");
            }
            c3436g.f42045I = accountU;
            if (interfaceC3439j != null) {
                c3436g.f42042F = interfaceC3439j.asBinder();
            }
        } else if (O()) {
            c3436g.f42045I = u();
        }
        c3436g.f42046J = f41978f0;
        c3436g.f42047K = v();
        if (S()) {
            c3436g.f42050N = true;
        }
        try {
            synchronized (this.f41992O) {
                try {
                    InterfaceC3441l interfaceC3441l = this.f41993P;
                    if (interfaceC3441l != null) {
                        interfaceC3441l.V0(new d0(this, this.f42007d0.get()), c3436g);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            Q(3);
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            N(8, null, null, this.f42007d0.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            N(8, null, null, this.f42007d0.get());
        }
    }

    public void g() {
        this.f42007d0.incrementAndGet();
        synchronized (this.f41996S) {
            try {
                int size = this.f41996S.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((c0) this.f41996S.get(i10)).d();
                }
                this.f41996S.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f41992O) {
            this.f41993P = null;
        }
        i0(1, null);
    }

    public boolean h() {
        boolean z10;
        synchronized (this.f41991N) {
            z10 = this.f41998U == 4;
        }
        return z10;
    }

    public boolean i() {
        return true;
    }

    public int j() {
        return C2337f.f31082a;
    }

    public final C2335d[] k() {
        h0 h0Var = this.f42006c0;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f42057C;
    }

    public void l(e eVar) {
        eVar.a();
    }

    public String m() {
        return this.f41984G;
    }

    public boolean n() {
        return false;
    }

    public void q() {
        int iH = this.f41989L.h(this.f41986I, j());
        if (iH == 0) {
            a(new C0534d());
        } else {
            i0(1, null);
            R(new C0534d(), iH, null);
        }
    }

    protected final void r() {
        if (!h()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected abstract T s(IBinder iBinder);

    protected boolean t() {
        return false;
    }

    public Account u() {
        return null;
    }

    public C2335d[] v() {
        return f41978f0;
    }

    protected Executor w() {
        return null;
    }

    public Bundle x() {
        return null;
    }

    public final Context y() {
        return this.f41986I;
    }

    public int z() {
        return this.f42001X;
    }

    protected AbstractC3433d(Context context, Looper looper, AbstractC3438i abstractC3438i, C2337f c2337f, int i10, a aVar, b bVar, String str) {
        this.f41984G = null;
        this.f41991N = new Object();
        this.f41992O = new Object();
        this.f41996S = new ArrayList();
        this.f41998U = 1;
        this.f42004a0 = null;
        this.f42005b0 = false;
        this.f42006c0 = null;
        this.f42007d0 = new AtomicInteger(0);
        C3445p.l(context, "Context must not be null");
        this.f41986I = context;
        C3445p.l(looper, "Looper must not be null");
        this.f41987J = looper;
        C3445p.l(abstractC3438i, "Supervisor must not be null");
        this.f41988K = abstractC3438i;
        C3445p.l(c2337f, "API availability must not be null");
        this.f41989L = c2337f;
        this.f41990M = new b0(this, looper);
        this.f42001X = i10;
        this.f41999V = aVar;
        this.f42000W = bVar;
        this.f42002Y = str;
    }
}
