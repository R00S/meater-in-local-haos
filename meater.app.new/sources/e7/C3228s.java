package e7;

import android.app.Activity;
import android.content.res.Resources;
import c7.C2333b;
import c7.C2336e;
import g7.C3445p;
import s.C4392b;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: e7.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3228s extends g0 {

    /* renamed from: G, reason: collision with root package name */
    private final C4392b f40732G;

    /* renamed from: H, reason: collision with root package name */
    private final C3216f f40733H;

    C3228s(InterfaceC3219i interfaceC3219i, C3216f c3216f, C2336e c2336e) {
        super(interfaceC3219i, c2336e);
        this.f40732G = new C4392b();
        this.f40733H = c3216f;
        this.f40695B.x("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, C3216f c3216f, C3212b c3212b) {
        InterfaceC3219i interfaceC3219iC = C3218h.c(activity);
        C3228s c3228s = (C3228s) interfaceC3219iC.p("ConnectionlessLifecycleHelper", C3228s.class);
        if (c3228s == null) {
            c3228s = new C3228s(interfaceC3219iC, c3216f, C2336e.m());
        }
        C3445p.l(c3212b, "ApiKey cannot be null");
        c3228s.f40732G.add(c3212b);
        c3216f.a(c3228s);
    }

    private final void v() {
        if (this.f40732G.isEmpty()) {
            return;
        }
        this.f40733H.a(this);
    }

    @Override // e7.C3218h
    public final void h() {
        super.h();
        v();
    }

    @Override // e7.g0, e7.C3218h
    public final void j() {
        super.j();
        v();
    }

    @Override // e7.g0, e7.C3218h
    public final void k() {
        super.k();
        this.f40733H.b(this);
    }

    @Override // e7.g0
    protected final void m(C2333b c2333b, int i10) throws Resources.NotFoundException {
        this.f40733H.C(c2333b, i10);
    }

    @Override // e7.g0
    protected final void n() {
        this.f40733H.D();
    }

    final C4392b t() {
        return this.f40732G;
    }
}
