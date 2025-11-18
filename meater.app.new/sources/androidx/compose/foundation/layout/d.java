package androidx.compose.foundation.layout;

import A0.InterfaceC0828g;
import b0.c;
import java.util.HashMap;
import java.util.List;
import kotlin.C1;
import kotlin.C1509K0;
import kotlin.C1550j;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1578x;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import y0.H;
import y0.I;
import y0.J;
import y0.K;
import y0.Z;

/* compiled from: Box.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a3\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\t\u0010\n\u001aC\u0010\u0016\u001a\u00020\u0015*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\"0\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001c\"0\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c\"\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\"\u001a\u0010%\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010$\"\u001a\u0010)\u001a\u0004\u0018\u00010&*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\"\u0018\u0010,\u001a\u00020\u0000*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"", "propagateMinConstraints", "Ljava/util/HashMap;", "Lb0/c;", "Ly0/I;", "Lkotlin/collections/HashMap;", "d", "(Z)Ljava/util/HashMap;", "alignment", "h", "(Lb0/c;Z)Ly0/I;", "Ly0/Z$a;", "Ly0/Z;", "placeable", "Ly0/H;", "measurable", "LU0/t;", "layoutDirection", "", "boxWidth", "boxHeight", "Loa/F;", "i", "(Ly0/Z$a;Ly0/Z;Ly0/H;LU0/t;IILb0/c;)V", "Lb0/i;", "modifier", "a", "(Lb0/i;LO/l;I)V", "Ljava/util/HashMap;", "cache1", "b", "cache2", "c", "Ly0/I;", "DefaultBoxMeasurePolicy", "getEmptyBoxMeasurePolicy", "()Ly0/I;", "EmptyBoxMeasurePolicy", "Landroidx/compose/foundation/layout/c;", "f", "(Ly0/H;)Landroidx/compose/foundation/layout/c;", "boxChildDataNode", "g", "(Ly0/H;)Z", "matchesParentSize", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap<b0.c, I> f22232a = d(true);

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap<b0.c, I> f22233b = d(false);

    /* renamed from: c, reason: collision with root package name */
    private static final I f22234c = new e(b0.c.INSTANCE.o(), false);

    /* renamed from: d, reason: collision with root package name */
    private static final I f22235d = b.f22238a;

    /* compiled from: Box.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ b0.i f22236B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f22237C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b0.i iVar, int i10) {
            super(2);
            this.f22236B = iVar;
            this.f22237C = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            d.a(this.f22236B, interfaceC1554l, C1509K0.a(this.f22237C | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    public static final void a(b0.i iVar, InterfaceC1554l interfaceC1554l, int i10) {
        int i11;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-211209833);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1554lR.R(iVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(-211209833, i11, -1, "androidx.compose.foundation.layout.Box (Box.kt:236)");
            }
            I i12 = f22235d;
            int iA = C1550j.a(interfaceC1554lR, 0);
            b0.i iVarE = b0.h.e(interfaceC1554lR, iVar);
            InterfaceC1578x interfaceC1578xF = interfaceC1554lR.F();
            InterfaceC0828g.Companion companion = InterfaceC0828g.INSTANCE;
            Ba.a<InterfaceC0828g> aVarA = companion.a();
            if (interfaceC1554lR.w() == null) {
                C1550j.c();
            }
            interfaceC1554lR.t();
            if (interfaceC1554lR.n()) {
                interfaceC1554lR.T(aVarA);
            } else {
                interfaceC1554lR.H();
            }
            InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554lR);
            C1.b(interfaceC1554lA, i12, companion.c());
            C1.b(interfaceC1554lA, interfaceC1578xF, companion.e());
            C1.b(interfaceC1554lA, iVarE, companion.d());
            Ba.p<InterfaceC0828g, Integer, C4153F> pVarB = companion.b();
            if (interfaceC1554lA.n() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                interfaceC1554lA.J(Integer.valueOf(iA));
                interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
            }
            interfaceC1554lR.P();
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new a(iVar, i10));
        }
    }

    private static final HashMap<b0.c, I> d(boolean z10) {
        HashMap<b0.c, I> map = new HashMap<>(9);
        c.Companion companion = b0.c.INSTANCE;
        e(map, z10, companion.o());
        e(map, z10, companion.m());
        e(map, z10, companion.n());
        e(map, z10, companion.h());
        e(map, z10, companion.e());
        e(map, z10, companion.f());
        e(map, z10, companion.d());
        e(map, z10, companion.b());
        e(map, z10, companion.c());
        return map;
    }

    private static final void e(HashMap<b0.c, I> map, boolean z10, b0.c cVar) {
        map.put(cVar, new e(cVar, z10));
    }

    private static final c f(H h10) {
        Object parentData = h10.getParentData();
        if (parentData instanceof c) {
            return (c) parentData;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(H h10) {
        c cVarF = f(h10);
        if (cVarF != null) {
            return cVarF.getMatchParentSize();
        }
        return false;
    }

    public static final I h(b0.c cVar, boolean z10) {
        I i10 = (z10 ? f22232a : f22233b).get(cVar);
        return i10 == null ? new e(cVar, z10) : i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Z.a aVar, Z z10, H h10, U0.t tVar, int i10, int i11, b0.c cVar) {
        b0.c alignment;
        c cVarF = f(h10);
        Z.a.j(aVar, z10, ((cVarF == null || (alignment = cVarF.getAlignment()) == null) ? cVar : alignment).a(U0.s.a(z10.getWidth(), z10.getHeight()), U0.s.a(i10, i11), tVar), 0.0f, 2, null);
    }

    /* compiled from: Box.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly0/K;", "", "Ly0/H;", "<anonymous parameter 0>", "LU0/b;", "constraints", "Ly0/J;", "e", "(Ly0/K;Ljava/util/List;J)Ly0/J;"}, k = 3, mv = {1, 8, 0})
    static final class b implements I {

        /* renamed from: a, reason: collision with root package name */
        public static final b f22238a = new b();

        b() {
        }

        @Override // y0.I
        public final J e(K k10, List<? extends H> list, long j10) {
            return K.E1(k10, U0.b.n(j10), U0.b.m(j10), null, a.f22239B, 4, null);
        }

        /* compiled from: Box.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            public static final a f22239B = new a();

            a() {
                super(1);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
                a(aVar);
                return C4153F.f46609a;
            }

            public final void a(Z.a aVar) {
            }
        }
    }
}
