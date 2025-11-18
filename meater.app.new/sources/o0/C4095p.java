package o0;

import U0.t;
import h0.C3482m;
import i0.C3604u0;
import kotlin.C1538d1;
import kotlin.InterfaceC1557m0;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.r1;
import n0.AbstractC4051b;
import oa.C4153F;

/* compiled from: VectorPainter.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R1\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR+\u0010!\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010'\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R+\u0010.\u001a\u00020(2\u0006\u0010\u0014\u001a\u00020(8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0016\u00101\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00104\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00107\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R(\u0010=\u001a\u0004\u0018\u00010\u000f2\b\u00108\u001a\u0004\u0018\u00010\u000f8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010@\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u00138@@@X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b>\u0010\u0018\"\u0004\b?\u0010\u001aR$\u0010F\u001a\u00020A2\u0006\u00108\u001a\u00020A8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010G\u001a\u00020\u00138VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Lo0/p;", "Ln0/b;", "Lo0/c;", "root", "<init>", "(Lo0/c;)V", "Lk0/f;", "Loa/F;", "j", "(Lk0/f;)V", "", "alpha", "", "a", "(F)Z", "Li0/u0;", "colorFilter", "b", "(Li0/u0;)Z", "Lh0/m;", "<set-?>", "g", "LO/p0;", "p", "()J", "u", "(J)V", "size", "h", "n", "()Z", "q", "(Z)V", "autoMirror", "Lo0/l;", "i", "Lo0/l;", "getVector$ui_release", "()Lo0/l;", "vector", "", "LO/m0;", "o", "()I", "s", "(I)V", "invalidateCount", "k", "F", "currentAlpha", "l", "Li0/u0;", "currentColorFilter", "m", "I", "drawCount", "value", "getIntrinsicColorFilter$ui_release", "()Li0/u0;", "r", "(Li0/u0;)V", "intrinsicColorFilter", "getViewportSize-NH-jbRc$ui_release", "v", "viewportSize", "", "getName$ui_release", "()Ljava/lang/String;", "t", "(Ljava/lang/String;)V", "name", "intrinsicSize", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: o0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4095p extends AbstractC4051b {

    /* renamed from: n, reason: collision with root package name */
    public static final int f46240n = 8;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 size;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 autoMirror;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final C4091l vector;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1557m0 invalidateCount;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private float currentAlpha;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private C3604u0 currentColorFilter;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int drawCount;

    /* compiled from: VectorPainter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: o0.p$a */
    static final class a extends AbstractC3864v implements Ba.a<C4153F> {
        a() {
            super(0);
        }

        public final void a() {
            if (C4095p.this.drawCount == C4095p.this.o()) {
                C4095p c4095p = C4095p.this;
                c4095p.s(c4095p.o() + 1);
            }
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    public C4095p() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int o() {
        return this.invalidateCount.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(int i10) {
        this.invalidateCount.g(i10);
    }

    @Override // n0.AbstractC4051b
    protected boolean a(float alpha) {
        this.currentAlpha = alpha;
        return true;
    }

    @Override // n0.AbstractC4051b
    protected boolean b(C3604u0 colorFilter) {
        this.currentColorFilter = colorFilter;
        return true;
    }

    @Override // n0.AbstractC4051b
    public long h() {
        return p();
    }

    @Override // n0.AbstractC4051b
    protected void j(k0.f fVar) {
        C4091l c4091l = this.vector;
        C3604u0 c3604u0K = this.currentColorFilter;
        if (c3604u0K == null) {
            c3604u0K = c4091l.k();
        }
        if (n() && fVar.getLayoutDirection() == t.Rtl) {
            long jP1 = fVar.p1();
            k0.d drawContext = fVar.getDrawContext();
            long jC = drawContext.C();
            drawContext.G().h();
            try {
                drawContext.getTransform().e(-1.0f, 1.0f, jP1);
                c4091l.i(fVar, this.currentAlpha, c3604u0K);
            } finally {
                drawContext.G().t();
                drawContext.E(jC);
            }
        } else {
            c4091l.i(fVar, this.currentAlpha, c3604u0K);
        }
        this.drawCount = o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean n() {
        return ((Boolean) this.autoMirror.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long p() {
        return ((C3482m) this.size.getValue()).getPackedValue();
    }

    public final void q(boolean z10) {
        this.autoMirror.setValue(Boolean.valueOf(z10));
    }

    public final void r(C3604u0 c3604u0) {
        this.vector.n(c3604u0);
    }

    public final void t(String str) {
        this.vector.p(str);
    }

    public final void u(long j10) {
        this.size.setValue(C3482m.c(j10));
    }

    public final void v(long j10) {
        this.vector.q(j10);
    }

    public C4095p(C4082c c4082c) {
        this.size = r1.c(C3482m.c(C3482m.INSTANCE.b()), null, 2, null);
        this.autoMirror = r1.c(Boolean.FALSE, null, 2, null);
        C4091l c4091l = new C4091l(c4082c);
        c4091l.o(new a());
        this.vector = c4091l;
        this.invalidateCount = C1538d1.a(0);
        this.currentAlpha = 1.0f;
        this.drawCount = -1;
    }

    public /* synthetic */ C4095p(C4082c c4082c, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? new C4082c() : c4082c);
    }
}
