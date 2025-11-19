package Q2;

import X1.C1804a;
import X1.y;
import androidx.media3.common.ParserException;
import v2.I;
import v2.InterfaceC4810p;
import v2.InterfaceC4811q;
import v2.O;
import v2.r;
import v2.u;

/* compiled from: OggExtractor.java */
/* loaded from: classes.dex */
public class d implements InterfaceC4810p {

    /* renamed from: d, reason: collision with root package name */
    public static final u f14234d = new u() { // from class: Q2.c
        @Override // v2.u
        public final InterfaceC4810p[] d() {
            return d.f();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private r f14235a;

    /* renamed from: b, reason: collision with root package name */
    private i f14236b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14237c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC4810p[] f() {
        return new InterfaceC4810p[]{new d()};
    }

    private static y g(y yVar) {
        yVar.W(0);
        return yVar;
    }

    private boolean k(InterfaceC4811q interfaceC4811q) {
        f fVar = new f();
        if (fVar.a(interfaceC4811q, true) && (fVar.f14244b & 2) == 2) {
            int iMin = Math.min(fVar.f14251i, 8);
            y yVar = new y(iMin);
            interfaceC4811q.p(yVar.e(), 0, iMin);
            if (b.p(g(yVar))) {
                this.f14236b = new b();
            } else if (j.r(g(yVar))) {
                this.f14236b = new j();
            } else if (h.o(g(yVar))) {
                this.f14236b = new h();
            }
            return true;
        }
        return false;
    }

    @Override // v2.InterfaceC4810p
    public void b(long j10, long j11) {
        i iVar = this.f14236b;
        if (iVar != null) {
            iVar.m(j10, j11);
        }
    }

    @Override // v2.InterfaceC4810p
    public boolean d(InterfaceC4811q interfaceC4811q) {
        try {
            return k(interfaceC4811q);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // v2.InterfaceC4810p
    public void h(r rVar) {
        this.f14235a = rVar;
    }

    @Override // v2.InterfaceC4810p
    public int i(InterfaceC4811q interfaceC4811q, I i10) throws ParserException {
        C1804a.i(this.f14235a);
        if (this.f14236b == null) {
            if (!k(interfaceC4811q)) {
                throw ParserException.a("Failed to determine bitstream type", null);
            }
            interfaceC4811q.m();
        }
        if (!this.f14237c) {
            O oA = this.f14235a.a(0, 1);
            this.f14235a.n();
            this.f14236b.d(this.f14235a, oA);
            this.f14237c = true;
        }
        return this.f14236b.g(interfaceC4811q, i10);
    }

    @Override // v2.InterfaceC4810p
    public void c() {
    }
}
