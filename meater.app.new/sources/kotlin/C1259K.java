package kotlin;

import Ba.l;
import Ba.p;
import Ba.q;
import F0.x;
import U0.h;
import androidx.compose.foundation.layout.o;
import b0.i;
import h0.C3477h;
import h0.C3482m;
import h0.C3483n;
import i0.e1;
import k0.Stroke;
import kotlin.C1509K0;
import kotlin.C4729S;
import kotlin.CubicBezierEasing;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.x1;
import oa.C4153F;
import y0.H;
import y0.J;
import y0.K;
import y0.Z;

/* compiled from: ProgressIndicator.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\u001aD\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a6\u0010\u0012\u001a\u00020\t*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a&\u0010\u0014\u001a\u00020\t*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a>\u0010\u0016\u001a\u00020\t*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018\"\u0014\u0010\u001c\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u001a\u0010 \u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001f\"\u001a\u0010#\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001f\"\u001a\u0010&\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001f\"\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010(\"\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010(\"\u0014\u0010+\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010(\"\u0014\u0010-\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010(\"\u0014\u0010/\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Lb0/i;", "modifier", "Li0/t0;", "color", "LU0/h;", "strokeWidth", "trackColor", "Li0/e1;", "strokeCap", "Loa/F;", "a", "(Lb0/i;JFJILO/l;II)V", "Lk0/f;", "", "startAngle", "sweep", "Lk0/k;", "stroke", "f", "(Lk0/f;FFJLk0/k;)V", "g", "(Lk0/f;JLk0/k;)V", "h", "(Lk0/f;FFFJLk0/k;)V", "F", "SemanticsBoundsPadding", "b", "Lb0/i;", "IncreaseSemanticsBounds", "c", "getLinearIndicatorWidth", "()F", "LinearIndicatorWidth", "d", "getLinearIndicatorHeight", "LinearIndicatorHeight", "e", "getCircularIndicatorDiameter", "CircularIndicatorDiameter", "Lv/x;", "Lv/x;", "FirstLineHeadEasing", "FirstLineTailEasing", "SecondLineHeadEasing", "i", "SecondLineTailEasing", "j", "CircularEasing", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1259K {

    /* renamed from: a, reason: collision with root package name */
    private static final float f7939a;

    /* renamed from: b, reason: collision with root package name */
    private static final i f7940b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f7941c;

    /* renamed from: d, reason: collision with root package name */
    private static final float f7942d;

    /* renamed from: e, reason: collision with root package name */
    private static final float f7943e;

    /* renamed from: f, reason: collision with root package name */
    private static final CubicBezierEasing f7944f;

    /* renamed from: g, reason: collision with root package name */
    private static final CubicBezierEasing f7945g;

    /* renamed from: h, reason: collision with root package name */
    private static final CubicBezierEasing f7946h;

    /* renamed from: i, reason: collision with root package name */
    private static final CubicBezierEasing f7947i;

    /* renamed from: j, reason: collision with root package name */
    private static final CubicBezierEasing f7948j;

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk0/f;", "Loa/F;", "a", "(Lk0/f;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.K$a */
    static final class a extends AbstractC3864v implements l<k0.f, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ long f7949B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Stroke f7950C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ x1<Integer> f7951D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ x1<Float> f7952E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ x1<Float> f7953F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ x1<Float> f7954G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ float f7955H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ long f7956I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, Stroke stroke, x1<Integer> x1Var, x1<Float> x1Var2, x1<Float> x1Var3, x1<Float> x1Var4, float f10, long j11) {
            super(1);
            this.f7949B = j10;
            this.f7950C = stroke;
            this.f7951D = x1Var;
            this.f7952E = x1Var2;
            this.f7953F = x1Var3;
            this.f7954G = x1Var4;
            this.f7955H = f10;
            this.f7956I = j11;
        }

        public final void a(k0.f fVar) {
            C1259K.g(fVar, this.f7949B, this.f7950C);
            C1259K.h(fVar, this.f7953F.getValue().floatValue() + (((this.f7951D.getValue().floatValue() * 216.0f) % 360.0f) - 90.0f) + this.f7954G.getValue().floatValue(), this.f7955H, Math.abs(this.f7952E.getValue().floatValue() - this.f7953F.getValue().floatValue()), this.f7956I, this.f7950C);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(k0.f fVar) {
            a(fVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.K$b */
    static final class b extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ i f7957B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ long f7958C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ float f7959D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f7960E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f7961F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f7962G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f7963H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i iVar, long j10, float f10, long j11, int i10, int i11, int i12) {
            super(2);
            this.f7957B = iVar;
            this.f7958C = j10;
            this.f7959D = f10;
            this.f7960E = j11;
            this.f7961F = i10;
            this.f7962G = i11;
            this.f7963H = i12;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1259K.a(this.f7957B, this.f7958C, this.f7959D, this.f7960E, this.f7961F, interfaceC1554l, C1509K0.a(this.f7962G | 1), this.f7963H);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv/S$b;", "", "Loa/F;", "a", "(Lv/S$b;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.K$c */
    static final class c extends AbstractC3864v implements l<C4729S.b<Float>, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final c f7964B = new c();

        c() {
            super(1);
        }

        public final void a(C4729S.b<Float> bVar) {
            bVar.d(1332);
            bVar.e(bVar.f(Float.valueOf(0.0f), 0), C1259K.f7948j);
            bVar.f(Float.valueOf(290.0f), 666);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C4729S.b<Float> bVar) {
            a(bVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv/S$b;", "", "Loa/F;", "a", "(Lv/S$b;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.K$d */
    static final class d extends AbstractC3864v implements l<C4729S.b<Float>, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final d f7965B = new d();

        d() {
            super(1);
        }

        public final void a(C4729S.b<Float> bVar) {
            bVar.d(1332);
            bVar.e(bVar.f(Float.valueOf(0.0f), 666), C1259K.f7948j);
            bVar.f(Float.valueOf(290.0f), bVar.getDurationMillis());
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C4729S.b<Float> bVar) {
            a(bVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ly0/K;", "Ly0/H;", "measurable", "LU0/b;", "constraints", "Ly0/J;", "a", "(Ly0/K;Ly0/H;J)Ly0/J;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.K$e */
    static final class e extends AbstractC3864v implements q<K, H, U0.b, J> {

        /* renamed from: B, reason: collision with root package name */
        public static final e f7966B = new e();

        /* compiled from: ProgressIndicator.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: K.K$e$a */
        static final class a extends AbstractC3864v implements l<Z.a, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ Z f7967B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ int f7968C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Z z10, int i10) {
                super(1);
                this.f7967B = z10;
                this.f7968C = i10;
            }

            public final void a(Z.a aVar) {
                Z.a.h(aVar, this.f7967B, 0, -this.f7968C, 0.0f, 4, null);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
                a(aVar);
                return C4153F.f46609a;
            }
        }

        e() {
            super(3);
        }

        public final J a(K k10, H h10, long j10) {
            int iI1 = k10.i1(C1259K.f7939a);
            int i10 = iI1 * 2;
            Z zT = h10.T(U0.c.n(j10, 0, i10));
            return K.E1(k10, zT.getWidth(), zT.getHeight() - i10, null, new a(zT, iI1), 4, null);
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ J g(K k10, H h10, U0.b bVar) {
            return a(k10, h10, bVar.getValue());
        }
    }

    static {
        float fU = h.u(10);
        f7939a = fU;
        f7940b = o.k(F0.o.c(androidx.compose.ui.layout.b.a(i.INSTANCE, e.f7966B), true, f.f7969B), 0.0f, fU, 1, null);
        f7941c = h.u(240);
        M.l lVar = M.l.f11651a;
        f7942d = lVar.e();
        f7943e = h.u(lVar.c() - h.u(lVar.e() * 2));
        f7944f = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
        f7945g = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
        f7946h = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
        f7947i = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
        f7948j = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(b0.i r36, long r37, float r39, long r40, int r42, kotlin.InterfaceC1554l r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1259K.a(b0.i, long, float, long, int, O.l, int, int):void");
    }

    private static final void f(k0.f fVar, float f10, float f11, long j10, Stroke stroke) {
        float f12 = 2;
        float width = stroke.getWidth() / f12;
        float fI = C3482m.i(fVar.C()) - (f12 * width);
        k0.f.W(fVar, j10, f10, f11, false, C3477h.a(width, width), C3483n.a(fI, fI), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(k0.f fVar, long j10, Stroke stroke) {
        f(fVar, 0.0f, 360.0f, j10, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(k0.f fVar, float f10, float f11, float f12, long j10, Stroke stroke) {
        f(fVar, f10 + (e1.e(stroke.getCap(), e1.INSTANCE.a()) ? 0.0f : ((f11 / h.u(f7943e / 2)) * 57.29578f) / 2.0f), Math.max(f12, 0.1f), j10, stroke);
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LF0/x;", "Loa/F;", "a", "(LF0/x;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.K$f */
    static final class f extends AbstractC3864v implements l<x, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final f f7969B = new f();

        f() {
            super(1);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(x xVar) {
            a(xVar);
            return C4153F.f46609a;
        }

        public final void a(x xVar) {
        }
    }
}
