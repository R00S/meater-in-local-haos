package A;

import androidx.compose.ui.platform.C2037q0;
import androidx.compose.ui.platform.C2040s0;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;

/* compiled from: WindowInsetsPadding.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\" \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lb0/i;", "LA/d0;", "insets", "c", "(Lb0/i;LA/d0;)Lb0/i;", "Lkotlin/Function1;", "Loa/F;", "block", "b", "(Lb0/i;LBa/l;)Lb0/i;", "Lz0/l;", "a", "Lz0/l;", "()Lz0/l;", "ModifierLocalConsumedWindowInsets", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final z0.l<d0> f122a = z0.e.a(a.f123B);

    /* compiled from: WindowInsetsPadding.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LA/d0;", "a", "()LA/d0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<d0> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f123B = new a();

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            return f0.a(0, 0, 0, 0);
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/s0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/s0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b extends AbstractC3864v implements Ba.l<C2040s0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.l f124B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ba.l lVar) {
            super(1);
            this.f124B = lVar;
        }

        public final void a(C2040s0 c2040s0) {
            c2040s0.b("onConsumedWindowInsetsChanged");
            c2040s0.getProperties().b("block", this.f124B);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2040s0 c2040s0) {
            a(c2040s0);
            return C4153F.f46609a;
        }
    }

    /* compiled from: WindowInsetsPadding.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb0/i;", "a", "(Lb0/i;LO/l;I)Lb0/i;"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.q<b0.i, InterfaceC1554l, Integer, b0.i> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.l<d0, C4153F> f125B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Ba.l<? super d0, C4153F> lVar) {
            super(3);
            this.f125B = lVar;
        }

        public final b0.i a(b0.i iVar, InterfaceC1554l interfaceC1554l, int i10) {
            interfaceC1554l.S(-1608161351);
            if (C1560o.J()) {
                C1560o.S(-1608161351, i10, -1, "androidx.compose.foundation.layout.onConsumedWindowInsetsChanged.<anonymous> (WindowInsetsPadding.kt:125)");
            }
            boolean zR = interfaceC1554l.R(this.f125B);
            Ba.l<d0, C4153F> lVar = this.f125B;
            Object objF = interfaceC1554l.f();
            if (zR || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new C0803k(lVar);
                interfaceC1554l.J(objF);
            }
            C0803k c0803k = (C0803k) objF;
            if (C1560o.J()) {
                C1560o.R();
            }
            interfaceC1554l.I();
            return c0803k;
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ b0.i g(b0.i iVar, InterfaceC1554l interfaceC1554l, Integer num) {
            return a(iVar, interfaceC1554l, num.intValue());
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/s0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/s0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class d extends AbstractC3864v implements Ba.l<C2040s0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ d0 f126B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(d0 d0Var) {
            super(1);
            this.f126B = d0Var;
        }

        public final void a(C2040s0 c2040s0) {
            c2040s0.b("windowInsetsPadding");
            c2040s0.getProperties().b("insets", this.f126B);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2040s0 c2040s0) {
            a(c2040s0);
            return C4153F.f46609a;
        }
    }

    /* compiled from: WindowInsetsPadding.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb0/i;", "a", "(Lb0/i;LO/l;I)Lb0/i;"}, k = 3, mv = {1, 8, 0})
    static final class e extends AbstractC3864v implements Ba.q<b0.i, InterfaceC1554l, Integer, b0.i> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ d0 f127B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(d0 d0Var) {
            super(3);
            this.f127B = d0Var;
        }

        public final b0.i a(b0.i iVar, InterfaceC1554l interfaceC1554l, int i10) {
            interfaceC1554l.S(-1415685722);
            if (C1560o.J()) {
                C1560o.S(-1415685722, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.kt:61)");
            }
            boolean zR = interfaceC1554l.R(this.f127B);
            d0 d0Var = this.f127B;
            Object objF = interfaceC1554l.f();
            if (zR || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new E(d0Var);
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

    public static final z0.l<d0> a() {
        return f122a;
    }

    public static final b0.i b(b0.i iVar, Ba.l<? super d0, C4153F> lVar) {
        return b0.h.b(iVar, C2037q0.b() ? new b(lVar) : C2037q0.a(), new c(lVar));
    }

    public static final b0.i c(b0.i iVar, d0 d0Var) {
        return b0.h.b(iVar, C2037q0.b() ? new d(d0Var) : C2037q0.a(), new e(d0Var));
    }
}
