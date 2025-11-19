package kotlin;

import A0.InterfaceC0828g;
import Ba.l;
import Ba.p;
import F0.o;
import F0.v;
import F0.x;
import U0.d;
import U0.h;
import androidx.compose.ui.platform.C2013e0;
import b0.i;
import f0.C3303d;
import i0.C3602t0;
import i0.Y0;
import i0.c1;
import kotlin.AbstractC1501G0;
import kotlin.C1;
import kotlin.C1503H0;
import kotlin.C1550j;
import kotlin.C1560o;
import kotlin.C1576w;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1578x;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import u0.C4631Q;
import u0.InterfaceC4622H;
import ua.C4696b;
import w.C4959d;
import y0.I;
import z.InterfaceC5162k;

/* compiled from: Surface.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ah\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u008c\u0001\u0010\u0016\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a8\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0019H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\"\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0007H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Lb0/i;", "modifier", "Li0/c1;", "shape", "Li0/t0;", "color", "contentColor", "LU0/h;", "tonalElevation", "shadowElevation", "Lw/d;", "border", "Lkotlin/Function0;", "Loa/F;", "content", "a", "(Lb0/i;Li0/c1;JJFFLw/d;LBa/p;LO/l;II)V", "onClick", "", "enabled", "Lz/k;", "interactionSource", "b", "(LBa/a;Lb0/i;ZLi0/c1;JJFFLw/d;Lz/k;LBa/p;LO/l;III)V", "backgroundColor", "", "e", "(Lb0/i;Li0/c1;JLw/d;F)Lb0/i;", "elevation", "f", "(JFLO/l;I)J", "LO/G0;", "LO/G0;", "getLocalAbsoluteTonalElevation", "()LO/G0;", "LocalAbsoluteTonalElevation", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.Y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1272Y {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1501G0<h> f8066a = C1576w.d(null, a.f8067B, 1, null);

    /* compiled from: Surface.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LU0/h;", "a", "()F"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.Y$a */
    static final class a extends AbstractC3864v implements Ba.a<h> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f8067B = new a();

        a() {
            super(0);
        }

        public final float a() {
            return h.u(0);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ h invoke() {
            return h.p(a());
        }
    }

    /* compiled from: Surface.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.Y$b */
    static final class b extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ i f8068B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ c1 f8069C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ long f8070D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ float f8071E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ float f8072F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8073G;

        /* compiled from: Surface.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LF0/x;", "Loa/F;", "a", "(LF0/x;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: K.Y$b$a */
        static final class a extends AbstractC3864v implements l<x, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            public static final a f8074B = new a();

            a() {
                super(1);
            }

            public final void a(x xVar) {
                v.A(xVar, true);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(x xVar) {
                a(xVar);
                return C4153F.f46609a;
            }
        }

        /* compiled from: Surface.kt */
        @f(c = "androidx.compose.material3.SurfaceKt$Surface$1$3", f = "Surface.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/H;", "Loa/F;", "<anonymous>", "(Lu0/H;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: K.Y$b$b, reason: collision with other inner class name */
        static final class C0160b extends kotlin.coroutines.jvm.internal.l implements p<InterfaceC4622H, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f8075B;

            C0160b(InterfaceC4588d<? super C0160b> interfaceC4588d) {
                super(2, interfaceC4588d);
            }

            @Override // Ba.p
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC4622H interfaceC4622H, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((C0160b) create(interfaceC4622H, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new C0160b(interfaceC4588d);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f8075B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(i iVar, c1 c1Var, long j10, float f10, C4959d c4959d, float f11, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar) {
            super(2);
            this.f8068B = iVar;
            this.f8069C = c1Var;
            this.f8070D = j10;
            this.f8071E = f10;
            this.f8072F = f11;
            this.f8073G = pVar;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-70914509, i10, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:108)");
            }
            i iVarC = C4631Q.c(o.c(C1272Y.e(this.f8068B, this.f8069C, C1272Y.f(this.f8070D, this.f8071E, interfaceC1554l, 0), null, ((d) interfaceC1554l.o(C2013e0.d())).X0(this.f8072F)), false, a.f8074B), C4153F.f46609a, new C0160b(null));
            p<InterfaceC1554l, Integer, C4153F> pVar = this.f8073G;
            I iH = androidx.compose.foundation.layout.d.h(b0.c.INSTANCE.o(), true);
            int iA = C1550j.a(interfaceC1554l, 0);
            InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
            i iVarE = b0.h.e(interfaceC1554l, iVarC);
            InterfaceC0828g.Companion companion = InterfaceC0828g.INSTANCE;
            Ba.a<InterfaceC0828g> aVarA = companion.a();
            if (interfaceC1554l.w() == null) {
                C1550j.c();
            }
            interfaceC1554l.t();
            if (interfaceC1554l.getInserting()) {
                interfaceC1554l.T(aVarA);
            } else {
                interfaceC1554l.H();
            }
            InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554l);
            C1.b(interfaceC1554lA, iH, companion.c());
            C1.b(interfaceC1554lA, interfaceC1578xF, companion.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB = companion.b();
            if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                interfaceC1554lA.J(Integer.valueOf(iA));
                interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
            }
            C1.b(interfaceC1554lA, iVarE, companion.d());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f22255a;
            pVar.invoke(interfaceC1554l, 0);
            interfaceC1554l.P();
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

    /* compiled from: Surface.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.Y$c */
    static final class c extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ i f8076B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ c1 f8077C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ long f8078D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ float f8079E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ InterfaceC5162k f8080F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ boolean f8081G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f8082H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ float f8083I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8084J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(i iVar, c1 c1Var, long j10, float f10, C4959d c4959d, InterfaceC5162k interfaceC5162k, boolean z10, Ba.a<C4153F> aVar, float f11, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar) {
            super(2);
            this.f8076B = iVar;
            this.f8077C = c1Var;
            this.f8078D = j10;
            this.f8079E = f10;
            this.f8080F = interfaceC5162k;
            this.f8081G = z10;
            this.f8082H = aVar;
            this.f8083I = f11;
            this.f8084J = pVar;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(1279702876, i10, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:209)");
            }
            i iVarB = androidx.compose.foundation.d.b(C1272Y.e(C1251C.b(this.f8076B), this.f8077C, C1272Y.f(this.f8078D, this.f8079E, interfaceC1554l, 0), null, ((d) interfaceC1554l.o(C2013e0.d())).X0(this.f8083I)), this.f8080F, C1263O.c(false, 0.0f, 0L, interfaceC1554l, 0, 7), this.f8081G, null, null, this.f8082H, 24, null);
            p<InterfaceC1554l, Integer, C4153F> pVar = this.f8084J;
            I iH = androidx.compose.foundation.layout.d.h(b0.c.INSTANCE.o(), true);
            int iA = C1550j.a(interfaceC1554l, 0);
            InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
            i iVarE = b0.h.e(interfaceC1554l, iVarB);
            InterfaceC0828g.Companion companion = InterfaceC0828g.INSTANCE;
            Ba.a<InterfaceC0828g> aVarA = companion.a();
            if (interfaceC1554l.w() == null) {
                C1550j.c();
            }
            interfaceC1554l.t();
            if (interfaceC1554l.getInserting()) {
                interfaceC1554l.T(aVarA);
            } else {
                interfaceC1554l.H();
            }
            InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554l);
            C1.b(interfaceC1554lA, iH, companion.c());
            C1.b(interfaceC1554lA, interfaceC1578xF, companion.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB = companion.b();
            if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                interfaceC1554lA.J(Integer.valueOf(iA));
                interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
            }
            C1.b(interfaceC1554lA, iVarE, companion.d());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f22255a;
            pVar.invoke(interfaceC1554l, 0);
            interfaceC1554l.P();
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

    public static final void a(i iVar, c1 c1Var, long j10, long j11, float f10, float f11, C4959d c4959d, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        i iVar2 = (i11 & 1) != 0 ? i.INSTANCE : iVar;
        c1 c1VarA = (i11 & 2) != 0 ? Y0.a() : c1Var;
        long surface = (i11 & 4) != 0 ? C1252D.f7860a.a(interfaceC1554l, 6).getSurface() : j10;
        long jC = (i11 & 8) != 0 ? C1295p.c(surface, interfaceC1554l, (i10 >> 6) & 14) : j11;
        float fU = (i11 & 16) != 0 ? h.u(0) : f10;
        float fU2 = (i11 & 32) != 0 ? h.u(0) : f11;
        C4959d c4959d2 = (i11 & 64) != 0 ? null : c4959d;
        if (C1560o.J()) {
            C1560o.S(-513881741, i10, -1, "androidx.compose.material3.Surface (Surface.kt:102)");
        }
        AbstractC1501G0<h> abstractC1501G0 = f8066a;
        float fU3 = h.u(((h) interfaceC1554l.o(abstractC1501G0)).getValue() + fU);
        C1576w.b(new C1503H0[]{C1298s.a().d(C3602t0.g(jC)), abstractC1501G0.d(h.p(fU3))}, W.c.d(-70914509, true, new b(iVar2, c1VarA, surface, fU3, c4959d2, fU2, pVar), interfaceC1554l, 54), interfaceC1554l, C1503H0.f12626i | 48);
        if (C1560o.J()) {
            C1560o.R();
        }
    }

    public static final void b(Ba.a<C4153F> aVar, i iVar, boolean z10, c1 c1Var, long j10, long j11, float f10, float f11, C4959d c4959d, InterfaceC5162k interfaceC5162k, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, InterfaceC1554l interfaceC1554l, int i10, int i11, int i12) {
        i iVar2 = (i12 & 2) != 0 ? i.INSTANCE : iVar;
        boolean z11 = (i12 & 4) != 0 ? true : z10;
        c1 c1VarA = (i12 & 8) != 0 ? Y0.a() : c1Var;
        long surface = (i12 & 16) != 0 ? C1252D.f7860a.a(interfaceC1554l, 6).getSurface() : j10;
        long jC = (i12 & 32) != 0 ? C1295p.c(surface, interfaceC1554l, (i10 >> 12) & 14) : j11;
        float fU = (i12 & 64) != 0 ? h.u(0) : f10;
        float fU2 = (i12 & 128) != 0 ? h.u(0) : f11;
        C4959d c4959d2 = (i12 & 256) != 0 ? null : c4959d;
        InterfaceC5162k interfaceC5162k2 = (i12 & 512) == 0 ? interfaceC5162k : null;
        if (C1560o.J()) {
            C1560o.S(-789752804, i10, i11, "androidx.compose.material3.Surface (Surface.kt:203)");
        }
        AbstractC1501G0<h> abstractC1501G0 = f8066a;
        float fU3 = h.u(((h) interfaceC1554l.o(abstractC1501G0)).getValue() + fU);
        C1576w.b(new C1503H0[]{C1298s.a().d(C3602t0.g(jC)), abstractC1501G0.d(h.p(fU3))}, W.c.d(1279702876, true, new c(iVar2, c1VarA, surface, fU3, c4959d2, interfaceC5162k2, z11, aVar, fU2, pVar), interfaceC1554l, 54), interfaceC1554l, C1503H0.f12626i | 48);
        if (C1560o.J()) {
            C1560o.R();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i e(i iVar, c1 c1Var, long j10, C4959d c4959d, float f10) {
        return C3303d.a(androidx.compose.foundation.b.a(iVar.e(f10 > 0.0f ? androidx.compose.ui.graphics.b.c(i.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0L, c1Var, false, null, 0L, 0L, 0, 124895, null) : i.INSTANCE).e(i.INSTANCE), j10, c1Var), c1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f(long j10, float f10, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-2079918090, i10, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:465)");
        }
        long jA = C1295p.a(C1252D.f7860a.a(interfaceC1554l, 6), j10, f10, interfaceC1554l, (i10 << 3) & 1008);
        if (C1560o.J()) {
            C1560o.R();
        }
        return jA;
    }
}
