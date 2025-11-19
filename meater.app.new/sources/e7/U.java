package e7;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import c7.C2333b;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import g7.C3434e;
import g7.C3445p;
import java.util.Set;
import x7.BinderC5066d;
import x7.C5074l;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public final class U extends BinderC5066d implements c.a, c.b {

    /* renamed from: I, reason: collision with root package name */
    private static final a.AbstractC0458a f40635I = w7.e.f51977c;

    /* renamed from: B, reason: collision with root package name */
    private final Context f40636B;

    /* renamed from: C, reason: collision with root package name */
    private final Handler f40637C;

    /* renamed from: D, reason: collision with root package name */
    private final a.AbstractC0458a f40638D;

    /* renamed from: E, reason: collision with root package name */
    private final Set f40639E;

    /* renamed from: F, reason: collision with root package name */
    private final C3434e f40640F;

    /* renamed from: G, reason: collision with root package name */
    private w7.f f40641G;

    /* renamed from: H, reason: collision with root package name */
    private T f40642H;

    public U(Context context, Handler handler, C3434e c3434e) {
        a.AbstractC0458a abstractC0458a = f40635I;
        this.f40636B = context;
        this.f40637C = handler;
        this.f40640F = (C3434e) C3445p.l(c3434e, "ClientSettings must not be null");
        this.f40639E = c3434e.e();
        this.f40638D = abstractC0458a;
    }

    static /* bridge */ /* synthetic */ void w1(U u10, C5074l c5074l) {
        C2333b c2333bF0 = c5074l.f0();
        if (c2333bF0.G0()) {
            g7.O o10 = (g7.O) C3445p.k(c5074l.h0());
            C2333b c2333bF02 = o10.f0();
            if (!c2333bF02.G0()) {
                String strValueOf = String.valueOf(c2333bF02);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                u10.f40642H.a(c2333bF02);
                u10.f40641G.g();
                return;
            }
            u10.f40642H.b(o10.h0(), u10.f40639E);
        } else {
            u10.f40642H.a(c2333bF0);
        }
        u10.f40641G.g();
    }

    @Override // e7.InterfaceC3222l
    public final void c(C2333b c2333b) {
        this.f40642H.a(c2333b);
    }

    @Override // e7.InterfaceC3215e
    public final void g(int i10) {
        this.f40642H.d(i10);
    }

    @Override // e7.InterfaceC3215e
    public final void k(Bundle bundle) {
        this.f40641G.o(this);
    }

    @Override // x7.InterfaceC5068f
    public final void l0(C5074l c5074l) {
        this.f40637C.post(new S(this, c5074l));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.common.api.a$f, w7.f] */
    public final void x1(T t10) {
        w7.f fVar = this.f40641G;
        if (fVar != null) {
            fVar.g();
        }
        this.f40640F.i(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0458a abstractC0458a = this.f40638D;
        Context context = this.f40636B;
        Handler handler = this.f40637C;
        C3434e c3434e = this.f40640F;
        this.f40641G = abstractC0458a.a(context, handler.getLooper(), c3434e, c3434e.f(), this, this);
        this.f40642H = t10;
        Set set = this.f40639E;
        if (set == null || set.isEmpty()) {
            this.f40637C.post(new Q(this));
        } else {
            this.f40641G.p();
        }
    }

    public final void y1() {
        w7.f fVar = this.f40641G;
        if (fVar != null) {
            fVar.g();
        }
    }
}
