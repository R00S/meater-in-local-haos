package androidx.compose.foundation;

import A0.A0;
import A0.B0;
import Ba.q;
import androidx.compose.ui.platform.C2037q0;
import androidx.compose.ui.platform.C2040s0;
import kotlin.C1560o;
import kotlin.C5042v;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.K;
import oa.C4153F;
import w.InterfaceC4949B;
import w.z;
import z.C5161j;
import z.InterfaceC5162k;

/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aX\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u008a\u0001\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0018\u001a\u00020\u0001*\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Lb0/i;", "", "enabled", "", "onClickLabel", "LF0/i;", "role", "Lkotlin/Function0;", "Loa/F;", "onClick", "c", "(Lb0/i;ZLjava/lang/String;LF0/i;LBa/a;)Lb0/i;", "Lz/k;", "interactionSource", "Lw/z;", "indication", "a", "(Lb0/i;Lz/k;Lw/z;ZLjava/lang/String;LF0/i;LBa/a;)Lb0/i;", "onLongClickLabel", "onLongClick", "onDoubleClick", "e", "(Lb0/i;Lz/k;Lw/z;ZLjava/lang/String;LF0/i;Ljava/lang/String;LBa/a;LBa/a;LBa/a;)Lb0/i;", "LA0/A0;", "g", "(LA0/A0;)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb0/i;", "a", "(Lb0/i;LO/l;I)Lb0/i;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements q<b0.i, InterfaceC1554l, Integer, b0.i> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ boolean f21928B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ String f21929C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ F0.i f21930D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f21931E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, String str, F0.i iVar, Ba.a<C4153F> aVar) {
            super(3);
            this.f21928B = z10;
            this.f21929C = str;
            this.f21930D = iVar;
            this.f21931E = aVar;
        }

        public final b0.i a(b0.i iVar, InterfaceC1554l interfaceC1554l, int i10) {
            InterfaceC5162k interfaceC5162k;
            interfaceC1554l.S(-756081143);
            if (C1560o.J()) {
                C1560o.S(-756081143, i10, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:112)");
            }
            z zVar = (z) interfaceC1554l.o(j.a());
            if (zVar instanceof InterfaceC4949B) {
                interfaceC1554l.S(617140216);
                interfaceC1554l.I();
                interfaceC5162k = null;
            } else {
                interfaceC1554l.S(617248189);
                Object objF = interfaceC1554l.f();
                if (objF == InterfaceC1554l.INSTANCE.a()) {
                    objF = C5161j.a();
                    interfaceC1554l.J(objF);
                }
                interfaceC5162k = (InterfaceC5162k) objF;
                interfaceC1554l.I();
            }
            b0.i iVarA = d.a(b0.i.INSTANCE, interfaceC5162k, zVar, this.f21928B, this.f21929C, this.f21930D, this.f21931E);
            if (C1560o.J()) {
                C1560o.R();
            }
            interfaceC1554l.I();
            return iVarA;
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ b0.i g(b0.i iVar, InterfaceC1554l interfaceC1554l, Integer num) {
            return a(iVar, interfaceC1554l, num.intValue());
        }
    }

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb0/i;", "a", "(Lb0/i;LO/l;I)Lb0/i;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends AbstractC3864v implements q<b0.i, InterfaceC1554l, Integer, b0.i> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ z f21932B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ boolean f21933C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ String f21934D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ F0.i f21935E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ba.a f21936F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(z zVar, boolean z10, String str, F0.i iVar, Ba.a aVar) {
            super(3);
            this.f21932B = zVar;
            this.f21933C = z10;
            this.f21934D = str;
            this.f21935E = iVar;
            this.f21936F = aVar;
        }

        public final b0.i a(b0.i iVar, InterfaceC1554l interfaceC1554l, int i10) {
            interfaceC1554l.S(-1525724089);
            if (C1560o.J()) {
                C1560o.S(-1525724089, i10, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
            }
            Object objF = interfaceC1554l.f();
            if (objF == InterfaceC1554l.INSTANCE.a()) {
                objF = C5161j.a();
                interfaceC1554l.J(objF);
            }
            InterfaceC5162k interfaceC5162k = (InterfaceC5162k) objF;
            b0.i iVarE = j.b(b0.i.INSTANCE, interfaceC5162k, this.f21932B).e(new ClickableElement(interfaceC5162k, null, this.f21933C, this.f21934D, this.f21935E, this.f21936F, null));
            if (C1560o.J()) {
                C1560o.R();
            }
            interfaceC1554l.I();
            return iVarE;
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ b0.i g(b0.i iVar, InterfaceC1554l interfaceC1554l, Integer num) {
            return a(iVar, interfaceC1554l, num.intValue());
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/s0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/s0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c extends AbstractC3864v implements Ba.l<C2040s0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ boolean f21937B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ String f21938C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ F0.i f21939D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ba.a f21940E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, String str, F0.i iVar, Ba.a aVar) {
            super(1);
            this.f21937B = z10;
            this.f21938C = str;
            this.f21939D = iVar;
            this.f21940E = aVar;
        }

        public final void a(C2040s0 c2040s0) {
            c2040s0.b("clickable");
            c2040s0.getProperties().b("enabled", Boolean.valueOf(this.f21937B));
            c2040s0.getProperties().b("onClickLabel", this.f21938C);
            c2040s0.getProperties().b("role", this.f21939D);
            c2040s0.getProperties().b("onClick", this.f21940E);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2040s0 c2040s0) {
            a(c2040s0);
            return C4153F.f46609a;
        }
    }

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb0/i;", "a", "(Lb0/i;LO/l;I)Lb0/i;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.d$d, reason: collision with other inner class name */
    public static final class C0306d extends AbstractC3864v implements q<b0.i, InterfaceC1554l, Integer, b0.i> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ z f21941B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ boolean f21942C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ String f21943D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ F0.i f21944E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ba.a f21945F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ String f21946G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ Ba.a f21947H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ Ba.a f21948I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0306d(z zVar, boolean z10, String str, F0.i iVar, Ba.a aVar, String str2, Ba.a aVar2, Ba.a aVar3) {
            super(3);
            this.f21941B = zVar;
            this.f21942C = z10;
            this.f21943D = str;
            this.f21944E = iVar;
            this.f21945F = aVar;
            this.f21946G = str2;
            this.f21947H = aVar2;
            this.f21948I = aVar3;
        }

        public final b0.i a(b0.i iVar, InterfaceC1554l interfaceC1554l, int i10) {
            interfaceC1554l.S(-1525724089);
            if (C1560o.J()) {
                C1560o.S(-1525724089, i10, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
            }
            Object objF = interfaceC1554l.f();
            if (objF == InterfaceC1554l.INSTANCE.a()) {
                objF = C5161j.a();
                interfaceC1554l.J(objF);
            }
            InterfaceC5162k interfaceC5162k = (InterfaceC5162k) objF;
            b0.i iVarE = j.b(b0.i.INSTANCE, interfaceC5162k, this.f21941B).e(new CombinedClickableElement(interfaceC5162k, null, this.f21942C, this.f21943D, this.f21944E, this.f21945F, this.f21946G, this.f21947H, this.f21948I, null));
            if (C1560o.J()) {
                C1560o.R();
            }
            interfaceC1554l.I();
            return iVarE;
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ b0.i g(b0.i iVar, InterfaceC1554l interfaceC1554l, Integer num) {
            return a(iVar, interfaceC1554l, num.intValue());
        }
    }

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/A0;", "node", "", "a", "(LA0/A0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends AbstractC3864v implements Ba.l<A0, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ K f21949B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(K k10) {
            super(1);
            this.f21949B = k10;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke(A0.A0 r4) {
            /*
                r3 = this;
                kotlin.jvm.internal.K r0 = r3.f21949B
                boolean r1 = r0.f43974B
                r2 = 1
                if (r1 != 0) goto L17
                java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode"
                kotlin.jvm.internal.C3862t.e(r4, r1)
                x.v r4 = (kotlin.C5042v) r4
                boolean r4 = r4.getEnabled()
                if (r4 == 0) goto L15
                goto L17
            L15:
                r4 = 0
                goto L18
            L17:
                r4 = r2
            L18:
                r0.f43974B = r4
                kotlin.jvm.internal.K r4 = r3.f21949B
                boolean r4 = r4.f43974B
                r4 = r4 ^ r2
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.d.e.invoke(A0.A0):java.lang.Boolean");
        }
    }

    public static final b0.i a(b0.i iVar, InterfaceC5162k interfaceC5162k, z zVar, boolean z10, String str, F0.i iVar2, Ba.a<C4153F> aVar) {
        return iVar.e(zVar instanceof InterfaceC4949B ? new ClickableElement(interfaceC5162k, (InterfaceC4949B) zVar, z10, str, iVar2, aVar, null) : zVar == null ? new ClickableElement(interfaceC5162k, null, z10, str, iVar2, aVar, null) : interfaceC5162k != null ? j.b(b0.i.INSTANCE, interfaceC5162k, zVar).e(new ClickableElement(interfaceC5162k, null, z10, str, iVar2, aVar, null)) : b0.h.c(b0.i.INSTANCE, null, new b(zVar, z10, str, iVar2, aVar), 1, null));
    }

    public static /* synthetic */ b0.i b(b0.i iVar, InterfaceC5162k interfaceC5162k, z zVar, boolean z10, String str, F0.i iVar2, Ba.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return a(iVar, interfaceC5162k, zVar, z10, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : iVar2, aVar);
    }

    public static final b0.i c(b0.i iVar, boolean z10, String str, F0.i iVar2, Ba.a<C4153F> aVar) {
        return b0.h.b(iVar, C2037q0.b() ? new c(z10, str, iVar2, aVar) : C2037q0.a(), new a(z10, str, iVar2, aVar));
    }

    public static /* synthetic */ b0.i d(b0.i iVar, boolean z10, String str, F0.i iVar2, Ba.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            iVar2 = null;
        }
        return c(iVar, z10, str, iVar2, aVar);
    }

    public static final b0.i e(b0.i iVar, InterfaceC5162k interfaceC5162k, z zVar, boolean z10, String str, F0.i iVar2, String str2, Ba.a<C4153F> aVar, Ba.a<C4153F> aVar2, Ba.a<C4153F> aVar3) {
        return iVar.e(zVar instanceof InterfaceC4949B ? new CombinedClickableElement(interfaceC5162k, (InterfaceC4949B) zVar, z10, str, iVar2, aVar3, str2, aVar, aVar2, null) : zVar == null ? new CombinedClickableElement(interfaceC5162k, null, z10, str, iVar2, aVar3, str2, aVar, aVar2, null) : interfaceC5162k != null ? j.b(b0.i.INSTANCE, interfaceC5162k, zVar).e(new CombinedClickableElement(interfaceC5162k, null, z10, str, iVar2, aVar3, str2, aVar, aVar2, null)) : b0.h.c(b0.i.INSTANCE, null, new C0306d(zVar, z10, str, iVar2, aVar3, str2, aVar, aVar2), 1, null));
    }

    public static final boolean g(A0 a02) {
        K k10 = new K();
        B0.c(a02, C5042v.INSTANCE, new e(k10));
        return k10.f43974B;
    }
}
