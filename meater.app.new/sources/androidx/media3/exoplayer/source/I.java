package androidx.media3.exoplayer.source;

import U1.s;
import U1.v;
import X1.C1804a;
import a2.g;
import android.net.Uri;
import androidx.media3.datasource.a;
import androidx.media3.exoplayer.source.r;
import l8.C3916i;
import m8.AbstractC4009y;

/* compiled from: SingleSampleMediaSource.java */
@Deprecated
/* loaded from: classes.dex */
public final class I extends AbstractC2137a {

    /* renamed from: h, reason: collision with root package name */
    private final a2.g f27666h;

    /* renamed from: i, reason: collision with root package name */
    private final a.InterfaceC0371a f27667i;

    /* renamed from: j, reason: collision with root package name */
    private final U1.s f27668j;

    /* renamed from: k, reason: collision with root package name */
    private final long f27669k;

    /* renamed from: l, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f27670l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f27671m;

    /* renamed from: n, reason: collision with root package name */
    private final U1.G f27672n;

    /* renamed from: o, reason: collision with root package name */
    private final U1.v f27673o;

    /* renamed from: p, reason: collision with root package name */
    private a2.n f27674p;

    /* compiled from: SingleSampleMediaSource.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final a.InterfaceC0371a f27675a;

        /* renamed from: b, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.b f27676b = new androidx.media3.exoplayer.upstream.a();

        /* renamed from: c, reason: collision with root package name */
        private boolean f27677c = true;

        /* renamed from: d, reason: collision with root package name */
        private Object f27678d;

        /* renamed from: e, reason: collision with root package name */
        private String f27679e;

        public b(a.InterfaceC0371a interfaceC0371a) {
            this.f27675a = (a.InterfaceC0371a) C1804a.e(interfaceC0371a);
        }

        public I a(v.k kVar, long j10) {
            return new I(this.f27679e, kVar, this.f27675a, j10, this.f27676b, this.f27677c, this.f27678d);
        }

        public b b(androidx.media3.exoplayer.upstream.b bVar) {
            if (bVar == null) {
                bVar = new androidx.media3.exoplayer.upstream.a();
            }
            this.f27676b = bVar;
            return this;
        }
    }

    @Override // androidx.media3.exoplayer.source.r
    public q a(r.b bVar, r2.b bVar2, long j10) {
        return new H(this.f27666h, this.f27667i, this.f27674p, this.f27668j, this.f27669k, this.f27670l, t(bVar), this.f27671m);
    }

    @Override // androidx.media3.exoplayer.source.r
    public U1.v h() {
        return this.f27673o;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void p(q qVar) {
        ((H) qVar).p();
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2137a
    protected void y(a2.n nVar) {
        this.f27674p = nVar;
        z(this.f27672n);
    }

    private I(String str, v.k kVar, a.InterfaceC0371a interfaceC0371a, long j10, androidx.media3.exoplayer.upstream.b bVar, boolean z10, Object obj) {
        this.f27667i = interfaceC0371a;
        this.f27669k = j10;
        this.f27670l = bVar;
        this.f27671m = z10;
        U1.v vVarA = new v.c().f(Uri.EMPTY).c(kVar.f17352a.toString()).d(AbstractC4009y.H(kVar)).e(obj).a();
        this.f27673o = vVarA;
        s.b bVarG0 = new s.b().s0((String) C3916i.a(kVar.f17353b, "text/x-unknown")).i0(kVar.f17354c).u0(kVar.f17355d).q0(kVar.f17356e).g0(kVar.f17357f);
        String str2 = kVar.f17358g;
        this.f27668j = bVarG0.e0(str2 == null ? str : str2).M();
        this.f27666h = new g.b().i(kVar.f17352a).b(1).a();
        this.f27672n = new n2.u(j10, true, false, false, null, vVarA);
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2137a
    protected void A() {
    }

    @Override // androidx.media3.exoplayer.source.r
    public void i() {
    }
}
