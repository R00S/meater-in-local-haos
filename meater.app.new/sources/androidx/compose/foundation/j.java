package androidx.compose.foundation;

import Ba.q;
import androidx.compose.ui.platform.C2037q0;
import androidx.compose.ui.platform.C2040s0;
import kotlin.AbstractC1501G0;
import kotlin.C1560o;
import kotlin.C1576w;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import w.InterfaceC4948A;
import w.InterfaceC4949B;
import w.z;
import z.InterfaceC5160i;

/* compiled from: Indication.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006\"\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Lb0/i;", "Lz/i;", "interactionSource", "Lw/z;", "indication", "b", "(Lb0/i;Lz/i;Lw/z;)Lb0/i;", "LO/G0;", "a", "LO/G0;", "()LO/G0;", "LocalIndication", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1501G0<z> f22156a = C1576w.f(a.f22157B);

    /* compiled from: Indication.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw/z;", "a", "()Lw/z;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<z> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f22157B = new a();

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z invoke() {
            return g.f21966a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/s0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/s0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b extends AbstractC3864v implements Ba.l<C2040s0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC5160i f22158B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ z f22159C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC5160i interfaceC5160i, z zVar) {
            super(1);
            this.f22158B = interfaceC5160i;
            this.f22159C = zVar;
        }

        public final void a(C2040s0 c2040s0) {
            c2040s0.b("indication");
            c2040s0.getProperties().b("interactionSource", this.f22158B);
            c2040s0.getProperties().b("indication", this.f22159C);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2040s0 c2040s0) {
            a(c2040s0);
            return C4153F.f46609a;
        }
    }

    /* compiled from: Indication.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb0/i;", "a", "(Lb0/i;LO/l;I)Lb0/i;"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements q<b0.i, InterfaceC1554l, Integer, b0.i> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ z f22160B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ InterfaceC5160i f22161C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(z zVar, InterfaceC5160i interfaceC5160i) {
            super(3);
            this.f22160B = zVar;
            this.f22161C = interfaceC5160i;
        }

        public final b0.i a(b0.i iVar, InterfaceC1554l interfaceC1554l, int i10) {
            interfaceC1554l.S(-353972293);
            if (C1560o.J()) {
                C1560o.S(-353972293, i10, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:182)");
            }
            InterfaceC4948A interfaceC4948AB = this.f22160B.b(this.f22161C, interfaceC1554l, 0);
            boolean zR = interfaceC1554l.R(interfaceC4948AB);
            Object objF = interfaceC1554l.f();
            if (zR || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new k(interfaceC4948AB);
                interfaceC1554l.J(objF);
            }
            k kVar = (k) objF;
            if (C1560o.J()) {
                C1560o.R();
            }
            interfaceC1554l.I();
            return kVar;
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ b0.i g(b0.i iVar, InterfaceC1554l interfaceC1554l, Integer num) {
            return a(iVar, interfaceC1554l, num.intValue());
        }
    }

    public static final AbstractC1501G0<z> a() {
        return f22156a;
    }

    public static final b0.i b(b0.i iVar, InterfaceC5160i interfaceC5160i, z zVar) {
        if (zVar == null) {
            return iVar;
        }
        if (zVar instanceof InterfaceC4949B) {
            return iVar.e(new IndicationModifierElement(interfaceC5160i, (InterfaceC4949B) zVar));
        }
        return b0.h.b(iVar, C2037q0.b() ? new b(interfaceC5160i, zVar) : C2037q0.a(), new c(zVar, interfaceC5160i));
    }
}
