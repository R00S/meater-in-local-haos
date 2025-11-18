package B;

import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.m1;
import kotlin.x1;
import oa.C4153F;

/* compiled from: LazyGridItemProvider.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LB/I;", "state", "Lkotlin/Function1;", "LB/C;", "Loa/F;", "content", "Lkotlin/Function0;", "LB/l;", "a", "(LB/I;LBa/l;LO/l;I)LBa/a;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n {

    /* compiled from: LazyGridItemProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LB/j;", "a", "()LB/j;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.a<C0881j> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ x1<Ba.l<C, C4153F>> f1291B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(x1<? extends Ba.l<? super C, C4153F>> x1Var) {
            super(0);
            this.f1291B = x1Var;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0881j invoke() {
            return new C0881j(this.f1291B.getValue());
        }
    }

    /* compiled from: LazyGridItemProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LB/m;", "a", "()LB/m;"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.a<m> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ x1<C0881j> f1292B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ I f1293C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(x1<C0881j> x1Var, I i10) {
            super(0);
            this.f1292B = x1Var;
            this.f1293C = i10;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m invoke() {
            C0881j value = this.f1292B.getValue();
            return new m(this.f1293C, value, new kotlin.H(this.f1293C.u(), value));
        }
    }

    public static final Ba.a<l> a(I i10, Ba.l<? super C, C4153F> lVar, InterfaceC1554l interfaceC1554l, int i11) {
        if (C1560o.J()) {
            C1560o.S(-1898306282, i11, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProviderLambda (LazyGridItemProvider.kt:40)");
        }
        x1 x1VarM = m1.m(lVar, interfaceC1554l, (i11 >> 3) & 14);
        boolean z10 = (((i11 & 14) ^ 6) > 4 && interfaceC1554l.R(i10)) || (i11 & 6) == 4;
        Object objF = interfaceC1554l.f();
        if (z10 || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new kotlin.jvm.internal.E(m1.e(m1.l(), new c(m1.e(m1.l(), new b(x1VarM)), i10))) { // from class: B.n.a
                @Override // Ia.n
                public Object get() {
                    return ((x1) this.receiver).getValue();
                }
            };
            interfaceC1554l.J(objF);
        }
        Ia.n nVar = (Ia.n) objF;
        if (C1560o.J()) {
            C1560o.R();
        }
        return nVar;
    }
}
