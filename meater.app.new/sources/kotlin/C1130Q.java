package kotlin;

import A0.B;
import A0.C0830i;
import A0.InterfaceC0829h;
import Ba.l;
import U0.k;
import b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import y0.H;
import y0.J;
import y0.K;
import y0.Z;

/* compiled from: InteractiveComponentSize.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"LI/Q;", "Lb0/i$c;", "LA0/h;", "LA0/B;", "<init>", "()V", "Ly0/K;", "Ly0/H;", "measurable", "LU0/b;", "constraints", "Ly0/J;", "b", "(Ly0/K;Ly0/H;J)Ly0/J;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1130Q extends i.c implements InterfaceC0829h, B {

    /* compiled from: InteractiveComponentSize.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.Q$a */
    static final class a extends AbstractC3864v implements l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ int f5917B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z f5918C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f5919D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, Z z10, int i11) {
            super(1);
            this.f5917B = i10;
            this.f5918C = z10;
            this.f5919D = i11;
        }

        public final void a(Z.a aVar) {
            Z.a.h(aVar, this.f5918C, Da.a.c((this.f5917B - this.f5918C.getWidth()) / 2.0f), Da.a.c((this.f5919D - this.f5918C.getHeight()) / 2.0f), 0.0f, 4, null);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    @Override // A0.B
    public J b(K k10, H h10, long j10) {
        boolean z10 = getIsAttached() && ((Boolean) C0830i.a(this, C1126M.b())).booleanValue();
        long j11 = C1126M.f5901c;
        Z zT = h10.T(j10);
        int iMax = z10 ? Math.max(zT.getWidth(), k10.i1(k.e(j11))) : zT.getWidth();
        int iMax2 = z10 ? Math.max(zT.getHeight(), k10.i1(k.d(j11))) : zT.getHeight();
        return K.E1(k10, iMax, iMax2, null, new a(iMax, zT, iMax2), 4, null);
    }
}
