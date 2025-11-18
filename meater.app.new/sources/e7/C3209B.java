package e7;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import c7.C2333b;
import c7.C2335d;
import com.apptionlabs.meater_app.data.Config;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import g7.C3443n;
import g7.C3445p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import s.C4391a;
import z7.C5209k;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: e7.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3209B implements c.a, c.b {

    /* renamed from: C, reason: collision with root package name */
    private final a.f f40591C;

    /* renamed from: D, reason: collision with root package name */
    private final C3212b f40592D;

    /* renamed from: E, reason: collision with root package name */
    private final r f40593E;

    /* renamed from: H, reason: collision with root package name */
    private final int f40596H;

    /* renamed from: I, reason: collision with root package name */
    private final U f40597I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f40598J;

    /* renamed from: N, reason: collision with root package name */
    final /* synthetic */ C3216f f40602N;

    /* renamed from: B, reason: collision with root package name */
    private final Queue f40590B = new LinkedList();

    /* renamed from: F, reason: collision with root package name */
    private final Set f40594F = new HashSet();

    /* renamed from: G, reason: collision with root package name */
    private final Map f40595G = new HashMap();

    /* renamed from: K, reason: collision with root package name */
    private final List f40599K = new ArrayList();

    /* renamed from: L, reason: collision with root package name */
    private C2333b f40600L = null;

    /* renamed from: M, reason: collision with root package name */
    private int f40601M = 0;

    public C3209B(C3216f c3216f, com.google.android.gms.common.api.b bVar) {
        this.f40602N = c3216f;
        a.f fVarK = bVar.k(c3216f.f40686O.getLooper(), this);
        this.f40591C = fVarK;
        this.f40592D = bVar.g();
        this.f40593E = new r();
        this.f40596H = bVar.j();
        if (fVarK.n()) {
            this.f40597I = bVar.l(c3216f.f40677F, c3216f.f40686O);
        } else {
            this.f40597I = null;
        }
    }

    static /* bridge */ /* synthetic */ void C(C3209B c3209b, D d10) {
        if (c3209b.f40599K.contains(d10) && !c3209b.f40598J) {
            if (c3209b.f40591C.h()) {
                c3209b.i();
            } else {
                c3209b.F();
            }
        }
    }

    static /* bridge */ /* synthetic */ void D(C3209B c3209b, D d10) {
        C2335d[] c2335dArrG;
        if (c3209b.f40599K.remove(d10)) {
            c3209b.f40602N.f40686O.removeMessages(15, d10);
            c3209b.f40602N.f40686O.removeMessages(16, d10);
            C2335d c2335d = d10.f40604b;
            ArrayList arrayList = new ArrayList(c3209b.f40590B.size());
            for (b0 b0Var : c3209b.f40590B) {
                if ((b0Var instanceof J) && (c2335dArrG = ((J) b0Var).g(c3209b)) != null && com.google.android.gms.common.util.b.b(c2335dArrG, c2335d)) {
                    arrayList.add(b0Var);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                b0 b0Var2 = (b0) arrayList.get(i10);
                c3209b.f40590B.remove(b0Var2);
                b0Var2.b(new UnsupportedApiCallException(c2335d));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C2335d d(C2335d[] c2335dArr) {
        if (c2335dArr != null && c2335dArr.length != 0) {
            C2335d[] c2335dArrK = this.f40591C.k();
            if (c2335dArrK == null) {
                c2335dArrK = new C2335d[0];
            }
            C4391a c4391a = new C4391a(c2335dArrK.length);
            for (C2335d c2335d : c2335dArrK) {
                c4391a.put(c2335d.f0(), Long.valueOf(c2335d.h0()));
            }
            for (C2335d c2335d2 : c2335dArr) {
                Long l10 = (Long) c4391a.get(c2335d2.f0());
                if (l10 == null || l10.longValue() < c2335d2.h0()) {
                    return c2335d2;
                }
            }
        }
        return null;
    }

    private final void e(C2333b c2333b) {
        Iterator it = this.f40594F.iterator();
        while (it.hasNext()) {
            ((c0) it.next()).b(this.f40592D, c2333b, C3443n.a(c2333b, C2333b.f31067F) ? this.f40591C.e() : null);
        }
        this.f40594F.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(Status status) {
        C3445p.c(this.f40602N.f40686O);
        h(status, null, false);
    }

    private final void h(Status status, Exception exc, boolean z10) {
        C3445p.c(this.f40602N.f40686O);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f40590B.iterator();
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next();
            if (!z10 || b0Var.f40654a == 2) {
                if (status != null) {
                    b0Var.a(status);
                } else {
                    b0Var.b(exc);
                }
                it.remove();
            }
        }
    }

    private final void i() {
        ArrayList arrayList = new ArrayList(this.f40590B);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b0 b0Var = (b0) arrayList.get(i10);
            if (!this.f40591C.h()) {
                return;
            }
            if (p(b0Var)) {
                this.f40590B.remove(b0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        E();
        e(C2333b.f31067F);
        o();
        Iterator it = this.f40595G.values().iterator();
        if (it.hasNext()) {
            ((P) it.next()).getClass();
            throw null;
        }
        i();
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(int i10) {
        E();
        this.f40598J = true;
        this.f40593E.e(i10, this.f40591C.m());
        C3212b c3212b = this.f40592D;
        C3216f c3216f = this.f40602N;
        c3216f.f40686O.sendMessageDelayed(Message.obtain(c3216f.f40686O, 9, c3212b), Config.MC_BROADCAST_INTERVAL_WIFI);
        C3212b c3212b2 = this.f40592D;
        C3216f c3216f2 = this.f40602N;
        c3216f2.f40686O.sendMessageDelayed(Message.obtain(c3216f2.f40686O, 11, c3212b2), Config.MC_STATS_INTERVAL_MAX);
        this.f40602N.f40679H.c();
        Iterator it = this.f40595G.values().iterator();
        while (it.hasNext()) {
            ((P) it.next()).f40631a.run();
        }
    }

    private final void m() {
        this.f40602N.f40686O.removeMessages(12, this.f40592D);
        C3212b c3212b = this.f40592D;
        C3216f c3216f = this.f40602N;
        c3216f.f40686O.sendMessageDelayed(c3216f.f40686O.obtainMessage(12, c3212b), this.f40602N.f40673B);
    }

    private final void n(b0 b0Var) {
        b0Var.d(this.f40593E, a());
        try {
            b0Var.c(this);
        } catch (DeadObjectException unused) {
            g(1);
            this.f40591C.c("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void o() {
        if (this.f40598J) {
            C3216f c3216f = this.f40602N;
            c3216f.f40686O.removeMessages(11, this.f40592D);
            C3216f c3216f2 = this.f40602N;
            c3216f2.f40686O.removeMessages(9, this.f40592D);
            this.f40598J = false;
        }
    }

    private final boolean p(b0 b0Var) throws Resources.NotFoundException {
        if (!(b0Var instanceof J)) {
            n(b0Var);
            return true;
        }
        J j10 = (J) b0Var;
        C2335d c2335dD = d(j10.g(this));
        if (c2335dD == null) {
            n(b0Var);
            return true;
        }
        Log.w("GoogleApiManager", this.f40591C.getClass().getName() + " could not execute call because it requires feature (" + c2335dD.f0() + ", " + c2335dD.h0() + ").");
        if (!this.f40602N.f40687P || !j10.f(this)) {
            j10.b(new UnsupportedApiCallException(c2335dD));
            return true;
        }
        D d10 = new D(this.f40592D, c2335dD, null);
        int iIndexOf = this.f40599K.indexOf(d10);
        if (iIndexOf >= 0) {
            D d11 = (D) this.f40599K.get(iIndexOf);
            this.f40602N.f40686O.removeMessages(15, d11);
            C3216f c3216f = this.f40602N;
            c3216f.f40686O.sendMessageDelayed(Message.obtain(c3216f.f40686O, 15, d11), Config.MC_BROADCAST_INTERVAL_WIFI);
            return false;
        }
        this.f40599K.add(d10);
        C3216f c3216f2 = this.f40602N;
        c3216f2.f40686O.sendMessageDelayed(Message.obtain(c3216f2.f40686O, 15, d10), Config.MC_BROADCAST_INTERVAL_WIFI);
        C3216f c3216f3 = this.f40602N;
        c3216f3.f40686O.sendMessageDelayed(Message.obtain(c3216f3.f40686O, 16, d10), Config.MC_STATS_INTERVAL_MAX);
        C2333b c2333b = new C2333b(2, null);
        if (q(c2333b)) {
            return false;
        }
        this.f40602N.e(c2333b, this.f40596H);
        return false;
    }

    private final boolean q(C2333b c2333b) {
        synchronized (C3216f.f40671S) {
            try {
                C3216f c3216f = this.f40602N;
                if (c3216f.f40683L == null || !c3216f.f40684M.contains(this.f40592D)) {
                    return false;
                }
                this.f40602N.f40683L.s(c2333b, this.f40596H);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r(boolean z10) {
        C3445p.c(this.f40602N.f40686O);
        if (!this.f40591C.h() || !this.f40595G.isEmpty()) {
            return false;
        }
        if (!this.f40593E.g()) {
            this.f40591C.c("Timing out service connection.");
            return true;
        }
        if (!z10) {
            return false;
        }
        m();
        return false;
    }

    public final void E() {
        C3445p.c(this.f40602N.f40686O);
        this.f40600L = null;
    }

    public final void F() {
        C3445p.c(this.f40602N.f40686O);
        if (this.f40591C.h() || this.f40591C.d()) {
            return;
        }
        try {
            C3216f c3216f = this.f40602N;
            int iB = c3216f.f40679H.b(c3216f.f40677F, this.f40591C);
            if (iB == 0) {
                C3216f c3216f2 = this.f40602N;
                a.f fVar = this.f40591C;
                F f10 = new F(c3216f2, fVar, this.f40592D);
                if (fVar.n()) {
                    ((U) C3445p.k(this.f40597I)).x1(f10);
                }
                try {
                    this.f40591C.a(f10);
                    return;
                } catch (SecurityException e10) {
                    I(new C2333b(10), e10);
                    return;
                }
            }
            C2333b c2333b = new C2333b(iB, null);
            Log.w("GoogleApiManager", "The service for " + this.f40591C.getClass().getName() + " is not available: " + c2333b.toString());
            I(c2333b, null);
        } catch (IllegalStateException e11) {
            I(new C2333b(10), e11);
        }
    }

    public final void G(b0 b0Var) {
        C3445p.c(this.f40602N.f40686O);
        if (this.f40591C.h()) {
            if (p(b0Var)) {
                m();
                return;
            } else {
                this.f40590B.add(b0Var);
                return;
            }
        }
        this.f40590B.add(b0Var);
        C2333b c2333b = this.f40600L;
        if (c2333b == null || !c2333b.v0()) {
            F();
        } else {
            I(this.f40600L, null);
        }
    }

    final void H() {
        this.f40601M++;
    }

    public final void I(C2333b c2333b, Exception exc) {
        C3445p.c(this.f40602N.f40686O);
        U u10 = this.f40597I;
        if (u10 != null) {
            u10.y1();
        }
        E();
        this.f40602N.f40679H.c();
        e(c2333b);
        if ((this.f40591C instanceof i7.e) && c2333b.f0() != 24) {
            this.f40602N.f40674C = true;
            C3216f c3216f = this.f40602N;
            c3216f.f40686O.sendMessageDelayed(c3216f.f40686O.obtainMessage(19), 300000L);
        }
        if (c2333b.f0() == 4) {
            f(C3216f.f40670R);
            return;
        }
        if (this.f40590B.isEmpty()) {
            this.f40600L = c2333b;
            return;
        }
        if (exc != null) {
            C3445p.c(this.f40602N.f40686O);
            h(null, exc, false);
            return;
        }
        if (!this.f40602N.f40687P) {
            f(C3216f.f(this.f40592D, c2333b));
            return;
        }
        h(C3216f.f(this.f40592D, c2333b), null, true);
        if (this.f40590B.isEmpty() || q(c2333b) || this.f40602N.e(c2333b, this.f40596H)) {
            return;
        }
        if (c2333b.f0() == 18) {
            this.f40598J = true;
        }
        if (!this.f40598J) {
            f(C3216f.f(this.f40592D, c2333b));
            return;
        }
        C3216f c3216f2 = this.f40602N;
        c3216f2.f40686O.sendMessageDelayed(Message.obtain(c3216f2.f40686O, 9, this.f40592D), Config.MC_BROADCAST_INTERVAL_WIFI);
    }

    public final void J(C2333b c2333b) {
        C3445p.c(this.f40602N.f40686O);
        a.f fVar = this.f40591C;
        fVar.c("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(c2333b));
        I(c2333b, null);
    }

    public final void K(c0 c0Var) {
        C3445p.c(this.f40602N.f40686O);
        this.f40594F.add(c0Var);
    }

    public final void L() {
        C3445p.c(this.f40602N.f40686O);
        if (this.f40598J) {
            F();
        }
    }

    public final void M() {
        C3445p.c(this.f40602N.f40686O);
        f(C3216f.f40669Q);
        this.f40593E.f();
        for (C3220j c3220j : (C3220j[]) this.f40595G.keySet().toArray(new C3220j[0])) {
            G(new a0(c3220j, new C5209k()));
        }
        e(new C2333b(4));
        if (this.f40591C.h()) {
            this.f40591C.l(new C3208A(this));
        }
    }

    public final void N() {
        C3445p.c(this.f40602N.f40686O);
        if (this.f40598J) {
            o();
            C3216f c3216f = this.f40602N;
            f(c3216f.f40678G.g(c3216f.f40677F) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f40591C.c("Timing out connection while resuming.");
        }
    }

    final boolean Q() {
        return this.f40591C.h();
    }

    public final boolean a() {
        return this.f40591C.n();
    }

    @ResultIgnorabilityUnspecified
    public final boolean b() {
        return r(true);
    }

    @Override // e7.InterfaceC3222l
    public final void c(C2333b c2333b) {
        I(c2333b, null);
    }

    @Override // e7.InterfaceC3215e
    public final void g(int i10) {
        if (Looper.myLooper() == this.f40602N.f40686O.getLooper()) {
            l(i10);
        } else {
            this.f40602N.f40686O.post(new RunnableC3234y(this, i10));
        }
    }

    @Override // e7.InterfaceC3215e
    public final void k(Bundle bundle) {
        if (Looper.myLooper() == this.f40602N.f40686O.getLooper()) {
            j();
        } else {
            this.f40602N.f40686O.post(new RunnableC3233x(this));
        }
    }

    public final int s() {
        return this.f40596H;
    }

    final int t() {
        return this.f40601M;
    }

    public final C2333b u() {
        C3445p.c(this.f40602N.f40686O);
        return this.f40600L;
    }

    public final a.f w() {
        return this.f40591C;
    }

    public final Map y() {
        return this.f40595G;
    }
}
