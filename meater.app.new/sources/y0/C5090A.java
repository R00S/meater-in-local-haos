package y0;

import A0.InterfaceC0828g;
import java.util.List;
import kotlin.C1;
import kotlin.C1550j;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: Layout.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "Lkotlin/Function0;", "Loa/F;", "contents", "a", "(Ljava/util/List;)LBa/p;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: y0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5090A {

    /* compiled from: Layout.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: y0.A$a */
    static final class a extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ List<Ba.p<InterfaceC1554l, Integer, C4153F>> f52923B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends Ba.p<? super InterfaceC1554l, ? super Integer, C4153F>> list) {
            super(2);
            this.f52923B = list;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-1953651383, i10, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:182)");
            }
            List<Ba.p<InterfaceC1554l, Integer, C4153F>> list = this.f52923B;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Ba.p<InterfaceC1554l, Integer, C4153F> pVar = list.get(i11);
                int iA = C1550j.a(interfaceC1554l, 0);
                InterfaceC0828g.Companion companion = InterfaceC0828g.INSTANCE;
                Ba.a<InterfaceC0828g> aVarF = companion.f();
                if (interfaceC1554l.w() == null) {
                    C1550j.c();
                }
                interfaceC1554l.t();
                if (interfaceC1554l.n()) {
                    interfaceC1554l.T(aVarF);
                } else {
                    interfaceC1554l.H();
                }
                InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554l);
                Ba.p<InterfaceC0828g, Integer, C4153F> pVarB = companion.b();
                if (interfaceC1554lA.n() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                    interfaceC1554lA.J(Integer.valueOf(iA));
                    interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
                }
                pVar.invoke(interfaceC1554l, 0);
                interfaceC1554l.P();
            }
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

    public static final Ba.p<InterfaceC1554l, Integer, C4153F> a(List<? extends Ba.p<? super InterfaceC1554l, ? super Integer, C4153F>> list) {
        return W.c.b(-1953651383, true, new a(list));
    }
}
