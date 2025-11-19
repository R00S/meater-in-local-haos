package androidx.compose.ui.draw;

import A0.B;
import A0.r;
import Ba.l;
import U0.n;
import U0.s;
import b0.i;
import h0.C3482m;
import h0.C3483n;
import i0.C3604u0;
import k0.InterfaceC3783c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import n0.AbstractC4051b;
import oa.C4153F;
import y0.H;
import y0.InterfaceC5106k;
import y0.InterfaceC5112q;
import y0.J;
import y0.K;
import y0.Z;
import y0.h0;

/* compiled from: PainterModifier.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b+\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015J\u0016\u0010\u0019\u001a\u00020\u0006*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u0006*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ&\u0010 \u001a\u00020\u001f*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J#\u0010&\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010'J#\u0010*\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b*\u0010'J#\u0010+\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010'J\u0013\u0010.\u001a\u00020-*\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010<R\u0014\u0010Z\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010<\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006["}, d2 = {"Landroidx/compose/ui/draw/c;", "LA0/B;", "Lb0/i$c;", "LA0/r;", "Ln0/b;", "painter", "", "sizeToIntrinsics", "Lb0/c;", "alignment", "Ly0/k;", "contentScale", "", "alpha", "Li0/u0;", "colorFilter", "<init>", "(Ln0/b;ZLb0/c;Ly0/k;FLi0/u0;)V", "Lh0/m;", "dstSize", "j2", "(J)J", "LU0/b;", "constraints", "p2", "o2", "(J)Z", "n2", "Ly0/K;", "Ly0/H;", "measurable", "Ly0/J;", "b", "(Ly0/K;Ly0/H;J)Ly0/J;", "Ly0/r;", "Ly0/q;", "", "height", "t", "(Ly0/r;Ly0/q;I)I", "z", "width", "L", "o", "Lk0/c;", "Loa/F;", "d", "(Lk0/c;)V", "", "toString", "()Ljava/lang/String;", "O", "Ln0/b;", "k2", "()Ln0/b;", "t2", "(Ln0/b;)V", "P", "Z", "l2", "()Z", "u2", "(Z)V", "Q", "Lb0/c;", "getAlignment", "()Lb0/c;", "q2", "(Lb0/c;)V", "R", "Ly0/k;", "getContentScale", "()Ly0/k;", "s2", "(Ly0/k;)V", "S", "F", "getAlpha", "()F", "c", "(F)V", "T", "Li0/u0;", "getColorFilter", "()Li0/u0;", "r2", "(Li0/u0;)V", "m2", "useIntrinsicSize", "O1", "shouldAutoInvalidate", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.draw.c, reason: from toString */
/* loaded from: classes.dex */
final class PainterModifier extends i.c implements B, r {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private AbstractC4051b painter;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean sizeToIntrinsics;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata and from toString */
    private b0.c alignment;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5106k contentScale;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata and from toString */
    private float alpha;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata and from toString */
    private C3604u0 colorFilter;

    /* compiled from: PainterModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.draw.c$a */
    static final class a extends AbstractC3864v implements l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Z f22707B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Z z10) {
            super(1);
            this.f22707B = z10;
        }

        public final void a(Z.a aVar) {
            Z.a.l(aVar, this.f22707B, 0, 0, 0.0f, 4, null);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    public PainterModifier(AbstractC4051b abstractC4051b, boolean z10, b0.c cVar, InterfaceC5106k interfaceC5106k, float f10, C3604u0 c3604u0) {
        this.painter = abstractC4051b;
        this.sizeToIntrinsics = z10;
        this.alignment = cVar;
        this.contentScale = interfaceC5106k;
        this.alpha = f10;
        this.colorFilter = c3604u0;
    }

    private final long j2(long dstSize) {
        if (!m2()) {
            return dstSize;
        }
        long jA = C3483n.a(!o2(this.painter.h()) ? C3482m.i(dstSize) : C3482m.i(this.painter.h()), !n2(this.painter.h()) ? C3482m.g(dstSize) : C3482m.g(this.painter.h()));
        return (C3482m.i(dstSize) == 0.0f || C3482m.g(dstSize) == 0.0f) ? C3482m.INSTANCE.b() : h0.b(jA, this.contentScale.a(jA, dstSize));
    }

    private final boolean m2() {
        return this.sizeToIntrinsics && this.painter.h() != 9205357640488583168L;
    }

    private final boolean n2(long j10) {
        if (!C3482m.f(j10, C3482m.INSTANCE.a())) {
            float fG = C3482m.g(j10);
            if (!Float.isInfinite(fG) && !Float.isNaN(fG)) {
                return true;
            }
        }
        return false;
    }

    private final boolean o2(long j10) {
        if (!C3482m.f(j10, C3482m.INSTANCE.a())) {
            float fI = C3482m.i(j10);
            if (!Float.isInfinite(fI) && !Float.isNaN(fI)) {
                return true;
            }
        }
        return false;
    }

    private final long p2(long constraints) {
        boolean z10 = false;
        boolean z11 = U0.b.h(constraints) && U0.b.g(constraints);
        if (U0.b.j(constraints) && U0.b.i(constraints)) {
            z10 = true;
        }
        if ((!m2() && z11) || z10) {
            return U0.b.d(constraints, U0.b.l(constraints), 0, U0.b.k(constraints), 0, 10, null);
        }
        long jH = this.painter.h();
        long jJ2 = j2(C3483n.a(U0.c.i(constraints, o2(jH) ? Math.round(C3482m.i(jH)) : U0.b.n(constraints)), U0.c.h(constraints, n2(jH) ? Math.round(C3482m.g(jH)) : U0.b.m(constraints))));
        return U0.b.d(constraints, U0.c.i(constraints, Math.round(C3482m.i(jJ2))), 0, U0.c.h(constraints, Math.round(C3482m.g(jJ2))), 0, 10, null);
    }

    @Override // A0.B
    public int L(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        if (!m2()) {
            return interfaceC5112q.f0(i10);
        }
        long jP2 = p2(U0.c.b(0, i10, 0, 0, 13, null));
        return Math.max(U0.b.m(jP2), interfaceC5112q.f0(i10));
    }

    @Override // b0.i.c
    /* renamed from: O1 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // A0.B
    public J b(K k10, H h10, long j10) {
        Z zT = h10.T(p2(j10));
        return K.E1(k10, zT.getWidth(), zT.getHeight(), null, new a(zT), 4, null);
    }

    public final void c(float f10) {
        this.alpha = f10;
    }

    @Override // A0.r
    public void d(InterfaceC3783c interfaceC3783c) {
        long jH = this.painter.h();
        long jA = C3483n.a(o2(jH) ? C3482m.i(jH) : C3482m.i(interfaceC3783c.C()), n2(jH) ? C3482m.g(jH) : C3482m.g(interfaceC3783c.C()));
        long jB = (C3482m.i(interfaceC3783c.C()) == 0.0f || C3482m.g(interfaceC3783c.C()) == 0.0f) ? C3482m.INSTANCE.b() : h0.b(jA, this.contentScale.a(jA, interfaceC3783c.C()));
        long jA2 = this.alignment.a(s.a(Math.round(C3482m.i(jB)), Math.round(C3482m.g(jB))), s.a(Math.round(C3482m.i(interfaceC3783c.C())), Math.round(C3482m.g(interfaceC3783c.C()))), interfaceC3783c.getLayoutDirection());
        float fH = n.h(jA2);
        float fI = n.i(jA2);
        interfaceC3783c.getDrawContext().getTransform().b(fH, fI);
        try {
            this.painter.g(interfaceC3783c, jB, this.alpha, this.colorFilter);
            interfaceC3783c.getDrawContext().getTransform().b(-fH, -fI);
            interfaceC3783c.C1();
        } catch (Throwable th) {
            interfaceC3783c.getDrawContext().getTransform().b(-fH, -fI);
            throw th;
        }
    }

    /* renamed from: k2, reason: from getter */
    public final AbstractC4051b getPainter() {
        return this.painter;
    }

    /* renamed from: l2, reason: from getter */
    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    @Override // A0.B
    public int o(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        if (!m2()) {
            return interfaceC5112q.q(i10);
        }
        long jP2 = p2(U0.c.b(0, i10, 0, 0, 13, null));
        return Math.max(U0.b.m(jP2), interfaceC5112q.q(i10));
    }

    public final void q2(b0.c cVar) {
        this.alignment = cVar;
    }

    public final void r2(C3604u0 c3604u0) {
        this.colorFilter = c3604u0;
    }

    public final void s2(InterfaceC5106k interfaceC5106k) {
        this.contentScale = interfaceC5106k;
    }

    @Override // A0.B
    public int t(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        if (!m2()) {
            return interfaceC5112q.Q(i10);
        }
        long jP2 = p2(U0.c.b(0, 0, 0, i10, 7, null));
        return Math.max(U0.b.n(jP2), interfaceC5112q.Q(i10));
    }

    public final void t2(AbstractC4051b abstractC4051b) {
        this.painter = abstractC4051b;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    public final void u2(boolean z10) {
        this.sizeToIntrinsics = z10;
    }

    @Override // A0.B
    public int z(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        if (!m2()) {
            return interfaceC5112q.S(i10);
        }
        long jP2 = p2(U0.c.b(0, 0, 0, i10, 7, null));
        return Math.max(U0.b.n(jP2), interfaceC5112q.S(i10));
    }
}
