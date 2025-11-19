package A;

import kotlin.C1509K0;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import y0.l0;

/* compiled from: BoxWithConstraints.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lb0/i;", "modifier", "Lb0/c;", "contentAlignment", "", "propagateMinConstraints", "Lkotlin/Function1;", "LA/e;", "Loa/F;", "content", "a", "(Lb0/i;Lb0/c;ZLBa/q;LO/l;II)V", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: A.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0796d {

    /* compiled from: BoxWithConstraints.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly0/l0;", "LU0/b;", "constraints", "Ly0/J;", "a", "(Ly0/l0;J)Ly0/J;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A.d$a */
    static final class a extends AbstractC3864v implements Ba.p<l0, U0.b, y0.J> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ y0.I f75B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.q<InterfaceC0797e, InterfaceC1554l, Integer, C4153F> f76C;

        /* compiled from: BoxWithConstraints.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: A.d$a$a, reason: collision with other inner class name */
        static final class C0001a extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ Ba.q<InterfaceC0797e, InterfaceC1554l, Integer, C4153F> f77B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ BoxWithConstraintsScopeImpl f78C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0001a(Ba.q<? super InterfaceC0797e, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl) {
                super(2);
                this.f77B = qVar;
                this.f78C = boxWithConstraintsScopeImpl;
            }

            public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(-1945019079, i10, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:68)");
                }
                this.f77B.g(this.f78C, interfaceC1554l, 0);
                if (C1560o.J()) {
                    C1560o.R();
                }
            }

            @Override // Ba.p
            public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
                a(interfaceC1554l, num.intValue());
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(y0.I i10, Ba.q<? super InterfaceC0797e, ? super InterfaceC1554l, ? super Integer, C4153F> qVar) {
            super(2);
            this.f75B = i10;
            this.f76C = qVar;
        }

        public final y0.J a(l0 l0Var, long j10) {
            return this.f75B.e(l0Var, l0Var.o1(C4153F.f46609a, W.c.b(-1945019079, true, new C0001a(this.f76C, new BoxWithConstraintsScopeImpl(l0Var, j10, null)))), j10);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ y0.J invoke(l0 l0Var, U0.b bVar) {
            return a(l0Var, bVar.getValue());
        }
    }

    /* compiled from: BoxWithConstraints.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A.d$b */
    static final class b extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ b0.i f79B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ b0.c f80C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f81D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ba.q<InterfaceC0797e, InterfaceC1554l, Integer, C4153F> f82E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f83F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f84G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(b0.i iVar, b0.c cVar, boolean z10, Ba.q<? super InterfaceC0797e, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, int i10, int i11) {
            super(2);
            this.f79B = iVar;
            this.f80C = cVar;
            this.f81D = z10;
            this.f82E = qVar;
            this.f83F = i10;
            this.f84G = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C0796d.a(this.f79B, this.f80C, this.f81D, this.f82E, interfaceC1554l, C1509K0.a(this.f83F | 1), this.f84G);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    public static final void a(b0.i iVar, b0.c cVar, boolean z10, Ba.q<? super InterfaceC0797e, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        int i12;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(1781813501);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC1554lR.R(iVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC1554lR.R(cVar) ? 32 : 16;
        }
        int i15 = i11 & 4;
        if (i15 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC1554lR.c(z10) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= interfaceC1554lR.l(qVar) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (i13 != 0) {
                iVar = b0.i.INSTANCE;
            }
            if (i14 != 0) {
                cVar = b0.c.INSTANCE.o();
            }
            if (i15 != 0) {
                z10 = false;
            }
            if (C1560o.J()) {
                C1560o.S(1781813501, i12, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:64)");
            }
            y0.I iH = androidx.compose.foundation.layout.d.h(cVar, z10);
            boolean zR = ((i12 & 7168) == 2048) | interfaceC1554lR.R(iH);
            Object objF = interfaceC1554lR.f();
            if (zR || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new a(iH, qVar);
                interfaceC1554lR.J(objF);
            }
            y0.j0.a(iVar, (Ba.p) objF, interfaceC1554lR, i12 & 14, 0);
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        b0.i iVar2 = iVar;
        b0.c cVar2 = cVar;
        boolean z11 = z10;
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new b(iVar2, cVar2, z11, qVar, i10, i11));
        }
    }
}
