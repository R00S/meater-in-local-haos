package kotlin;

import Ba.p;
import Ba.q;
import Y.d;
import Y.f;
import Y.g;
import Y.i;
import Y.j;
import java.util.List;
import java.util.Map;
import kotlin.C1503H0;
import kotlin.C1509K0;
import kotlin.C1560o;
import kotlin.C1576w;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.collections.M;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;

/* compiled from: LazySaveableStateHolder.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/Function1;", "LY/d;", "Loa/F;", "content", "a", "(LBa/q;LO/l;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: C.E, reason: from Kotlin metadata */
/* loaded from: classes.dex */
public final class Function1 {

    /* compiled from: LazySaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: C.E$a */
    static final class a extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ D f1992B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ q<d, InterfaceC1554l, Integer, C4153F> f1993C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(D d10, q<? super d, ? super InterfaceC1554l, ? super Integer, C4153F> qVar) {
            super(2);
            this.f1992B = d10;
            this.f1993C = qVar;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(1863926504, i10, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)");
            }
            this.f1992B.i(f.a(interfaceC1554l, 0));
            this.f1993C.g(this.f1992B, interfaceC1554l, 0);
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

    /* compiled from: LazySaveableStateHolder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: C.E$b */
    static final class b extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ q<d, InterfaceC1554l, Integer, C4153F> f1994B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f1995C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(q<? super d, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, int i10) {
            super(2);
            this.f1994B = qVar;
            this.f1995C = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            Function1.a(this.f1994B, interfaceC1554l, C1509K0.a(this.f1995C | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: LazySaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LC/D;", "a", "()LC/D;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: C.E$c */
    static final class c extends AbstractC3864v implements Ba.a<D> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ g f1996B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g gVar) {
            super(0);
            this.f1996B = gVar;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D invoke() {
            return new D(this.f1996B, M.h());
        }
    }

    public static final void a(q<? super d, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, InterfaceC1554l interfaceC1554l, int i10) {
        int i11;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(674185128);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1554lR.l(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(674185128, i11, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)");
            }
            g gVar = (g) interfaceC1554lR.o(i.d());
            Object[] objArr = {gVar};
            j<D, Map<String, List<Object>>> jVarA = D.INSTANCE.a(gVar);
            boolean zL = interfaceC1554lR.l(gVar);
            Object objF = interfaceC1554lR.f();
            if (zL || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new c(gVar);
                interfaceC1554lR.J(objF);
            }
            D d10 = (D) Y.b.c(objArr, jVarA, null, (Ba.a) objF, interfaceC1554lR, 0, 4);
            C1576w.a(i.d().d(d10), W.c.d(1863926504, true, new a(d10, qVar), interfaceC1554lR, 54), interfaceC1554lR, C1503H0.f12626i | 48);
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new b(qVar, i10));
        }
    }
}
