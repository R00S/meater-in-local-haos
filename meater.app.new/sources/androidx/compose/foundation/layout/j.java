package androidx.compose.foundation.layout;

import A0.B;
import b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import y0.H;
import y0.InterfaceC5112q;
import y0.J;
import y0.K;
import y0.Z;

/* compiled from: Intrinsic.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\n\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u00020\f*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J#\u0010\u0017\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J#\u0010\u0018\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/j;", "LA0/B;", "Lb0/i$c;", "<init>", "()V", "Ly0/K;", "Ly0/H;", "measurable", "LU0/b;", "constraints", "j2", "(Ly0/K;Ly0/H;J)J", "Ly0/J;", "b", "(Ly0/K;Ly0/H;J)Ly0/J;", "Ly0/r;", "Ly0/q;", "", "height", "t", "(Ly0/r;Ly0/q;I)I", "width", "L", "z", "o", "", "k2", "()Z", "enforceIncoming", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
abstract class j extends i.c implements B {

    /* compiled from: Intrinsic.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Z f22264B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Z z10) {
            super(1);
            this.f22264B = z10;
        }

        public final void a(Z.a aVar) {
            Z.a.n(aVar, this.f22264B, U0.n.INSTANCE.a(), 0.0f, 2, null);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    public int L(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return interfaceC5112q.f0(i10);
    }

    @Override // A0.B
    public final J b(K k10, H h10, long j10) {
        long jJ2 = j2(k10, h10, j10);
        if (getEnforceIncoming()) {
            jJ2 = U0.c.g(j10, jJ2);
        }
        Z zT = h10.T(jJ2);
        return K.E1(k10, zT.getWidth(), zT.getHeight(), null, new a(zT), 4, null);
    }

    public abstract long j2(K k10, H h10, long j10);

    /* renamed from: k2 */
    public abstract boolean getEnforceIncoming();

    public int o(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return interfaceC5112q.q(i10);
    }

    @Override // A0.B
    public int t(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return interfaceC5112q.Q(i10);
    }

    @Override // A0.B
    public int z(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return interfaceC5112q.S(i10);
    }
}
