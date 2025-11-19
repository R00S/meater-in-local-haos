package A;

import androidx.compose.ui.platform.C2037q0;
import androidx.compose.ui.platform.C2040s0;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;

/* compiled from: WindowInsetsPadding.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lb0/i;", "a", "(Lb0/i;)Lb0/i;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h0 {

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/s0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/s0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends AbstractC3864v implements Ba.l<C2040s0, C4153F> {
        public a() {
            super(1);
        }

        public final void a(C2040s0 c2040s0) {
            c2040s0.b("safeContentPadding");
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2040s0 c2040s0) {
            a(c2040s0);
            return C4153F.f46609a;
        }
    }

    /* compiled from: WindowInsetsPadding.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb0/i;", "a", "(Lb0/i;LO/l;I)Lb0/i;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends AbstractC3864v implements Ba.q<b0.i, InterfaceC1554l, Integer, b0.i> {
        public b() {
            super(3);
        }

        public final b0.i a(b0.i iVar, InterfaceC1554l interfaceC1554l, int i10) {
            interfaceC1554l.S(359872873);
            if (C1560o.J()) {
                C1560o.S(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
            }
            e0 e0VarC = e0.INSTANCE.c(interfaceC1554l, 6);
            boolean zR = interfaceC1554l.R(e0VarC);
            Object objF = interfaceC1554l.f();
            if (zR || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new E(e0VarC.getSafeContent());
                interfaceC1554l.J(objF);
            }
            E e10 = (E) objF;
            if (C1560o.J()) {
                C1560o.R();
            }
            interfaceC1554l.I();
            return e10;
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ b0.i g(b0.i iVar, InterfaceC1554l interfaceC1554l, Integer num) {
            return a(iVar, interfaceC1554l, num.intValue());
        }
    }

    public static final b0.i a(b0.i iVar) {
        return b0.h.b(iVar, C2037q0.b() ? new a() : C2037q0.a(), new b());
    }
}
