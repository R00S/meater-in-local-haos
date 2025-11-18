package androidx.compose.foundation;

import Ba.q;
import androidx.compose.ui.platform.C2037q0;
import androidx.compose.ui.platform.C2040s0;
import kotlin.C1560o;
import kotlin.EnumC5037q;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC5034n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import w.L;

/* compiled from: Scroll.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\f\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u0010\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "initial", "Landroidx/compose/foundation/o;", "a", "(ILO/l;II)Landroidx/compose/foundation/o;", "Lb0/i;", "state", "", "enabled", "Lx/n;", "flingBehavior", "reverseScrolling", "c", "(Lb0/i;Landroidx/compose/foundation/o;ZLx/n;Z)Lb0/i;", "isScrollable", "isVertical", "b", "(Lb0/i;Landroidx/compose/foundation/o;ZLx/n;ZZ)Lb0/i;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m {

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/o;", "a", "()Landroidx/compose/foundation/o;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<o> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ int f22469B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(0);
            this.f22469B = i10;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return new o(this.f22469B);
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/s0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/s0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b extends AbstractC3864v implements Ba.l<C2040s0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ o f22470B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ boolean f22471C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC5034n f22472D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f22473E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ boolean f22474F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o oVar, boolean z10, InterfaceC5034n interfaceC5034n, boolean z11, boolean z12) {
            super(1);
            this.f22470B = oVar;
            this.f22471C = z10;
            this.f22472D = interfaceC5034n;
            this.f22473E = z11;
            this.f22474F = z12;
        }

        public final void a(C2040s0 c2040s0) {
            c2040s0.b("scroll");
            c2040s0.getProperties().b("state", this.f22470B);
            c2040s0.getProperties().b("reverseScrolling", Boolean.valueOf(this.f22471C));
            c2040s0.getProperties().b("flingBehavior", this.f22472D);
            c2040s0.getProperties().b("isScrollable", Boolean.valueOf(this.f22473E));
            c2040s0.getProperties().b("isVertical", Boolean.valueOf(this.f22474F));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2040s0 c2040s0) {
            a(c2040s0);
            return C4153F.f46609a;
        }
    }

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb0/i;", "a", "(Lb0/i;LO/l;I)Lb0/i;"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements q<b0.i, InterfaceC1554l, Integer, b0.i> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ o f22475B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ boolean f22476C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC5034n f22477D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f22478E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ boolean f22479F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o oVar, boolean z10, InterfaceC5034n interfaceC5034n, boolean z11, boolean z12) {
            super(3);
            this.f22475B = oVar;
            this.f22476C = z10;
            this.f22477D = interfaceC5034n;
            this.f22478E = z11;
            this.f22479F = z12;
        }

        public final b0.i a(b0.i iVar, InterfaceC1554l interfaceC1554l, int i10) {
            interfaceC1554l.S(1478351300);
            if (C1560o.J()) {
                C1560o.S(1478351300, i10, -1, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:276)");
            }
            b0.i iVarE = b0.i.INSTANCE.e(new ScrollSemanticsElement(this.f22475B, this.f22476C, this.f22477D, this.f22478E, this.f22479F));
            o oVar = this.f22475B;
            b0.i iVarE2 = L.a(iVarE, oVar, this.f22479F ? EnumC5037q.Vertical : EnumC5037q.Horizontal, this.f22478E, this.f22476C, this.f22477D, oVar.getInternalInteractionSource(), null, interfaceC1554l, 0, 64).e(new ScrollingLayoutElement(this.f22475B, this.f22476C, this.f22479F));
            if (C1560o.J()) {
                C1560o.R();
            }
            interfaceC1554l.I();
            return iVarE2;
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ b0.i g(b0.i iVar, InterfaceC1554l interfaceC1554l, Integer num) {
            return a(iVar, interfaceC1554l, num.intValue());
        }
    }

    public static final o a(int i10, InterfaceC1554l interfaceC1554l, int i11, int i12) {
        boolean z10 = true;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if (C1560o.J()) {
            C1560o.S(-1464256199, i11, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:69)");
        }
        Object[] objArr = new Object[0];
        Y.j<o, ?> jVarA = o.INSTANCE.a();
        if ((((i11 & 14) ^ 6) <= 4 || !interfaceC1554l.h(i10)) && (i11 & 6) != 4) {
            z10 = false;
        }
        Object objF = interfaceC1554l.f();
        if (z10 || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new a(i10);
            interfaceC1554l.J(objF);
        }
        o oVar = (o) Y.b.c(objArr, jVarA, null, (Ba.a) objF, interfaceC1554l, 0, 4);
        if (C1560o.J()) {
            C1560o.R();
        }
        return oVar;
    }

    private static final b0.i b(b0.i iVar, o oVar, boolean z10, InterfaceC5034n interfaceC5034n, boolean z11, boolean z12) {
        return b0.h.b(iVar, C2037q0.b() ? new b(oVar, z10, interfaceC5034n, z11, z12) : C2037q0.a(), new c(oVar, z10, interfaceC5034n, z11, z12));
    }

    public static final b0.i c(b0.i iVar, o oVar, boolean z10, InterfaceC5034n interfaceC5034n, boolean z11) {
        return b(iVar, oVar, z11, interfaceC5034n, z10, true);
    }

    public static /* synthetic */ b0.i d(b0.i iVar, o oVar, boolean z10, InterfaceC5034n interfaceC5034n, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            interfaceC5034n = null;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return c(iVar, oVar, z10, interfaceC5034n, z11);
    }
}
