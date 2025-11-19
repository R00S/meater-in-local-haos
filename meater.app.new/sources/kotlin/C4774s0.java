package kotlin;

import U0.h;
import U0.j;
import U0.n;
import U0.r;
import U0.s;
import h0.C3476g;
import h0.C3477h;
import h0.C3478i;
import h0.C3482m;
import h0.C3483n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3856m;
import kotlin.jvm.internal.C3861s;

/* compiled from: VectorConverters.kt */
@Metadata(d1 = {"\u0000¬\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\" \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010\" \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010\" \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010\" \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010\" \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00190\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0010\" \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00190\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0010\" \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00190\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0010\" \u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00190\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0010\" \u0010+\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0010\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\u0006*\u00020,8F¢\u0006\u0006\u001a\u0004\b*\u0010-\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u0006*\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0\u0006*\u0002028F¢\u0006\u0006\u001a\u0004\b#\u00103\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0006*\u0002048F¢\u0006\u0006\u001a\u0004\b\u0013\u00105\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0006*\u0002068F¢\u0006\u0006\u001a\u0004\b\u0016\u00107\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00190\u0006*\u0002088F¢\u0006\u0006\u001a\u0004\b&\u00109\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00190\u0006*\u00020:8F¢\u0006\u0006\u001a\u0004\b \u0010;\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00190\u0006*\u00020<8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010=\"!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00190\u0006*\u00020>8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010?¨\u0006@"}, d2 = {"T", "Lv/q;", "V", "Lkotlin/Function1;", "convertToVector", "convertFromVector", "Lv/q0;", "a", "(LBa/l;LBa/l;)Lv/q0;", "", "start", "stop", "fraction", "k", "(FFF)F", "Lv/m;", "Lv/q0;", "FloatToVector", "", "b", "IntToVector", "LU0/h;", "c", "DpToVector", "LU0/j;", "Lv/n;", "d", "DpOffsetToVector", "Lh0/m;", "e", "SizeToVector", "Lh0/g;", "f", "OffsetToVector", "LU0/n;", "g", "IntOffsetToVector", "LU0/r;", "h", "IntSizeToVector", "Lh0/i;", "Lv/p;", "i", "RectToVector", "Lkotlin/Float$Companion;", "(Lkotlin/jvm/internal/m;)Lv/q0;", "VectorConverter", "Lkotlin/Int$Companion;", "j", "(Lkotlin/jvm/internal/s;)Lv/q0;", "Lh0/i$a;", "(Lh0/i$a;)Lv/q0;", "LU0/h$a;", "(LU0/h$a;)Lv/q0;", "LU0/j$a;", "(LU0/j$a;)Lv/q0;", "Lh0/m$a;", "(Lh0/m$a;)Lv/q0;", "Lh0/g$a;", "(Lh0/g$a;)Lv/q0;", "LU0/n$a;", "(LU0/n$a;)Lv/q0;", "LU0/r$a;", "(LU0/r$a;)Lv/q0;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4774s0 {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC4770q0<Float, C4761m> f50899a = a(e.f50912B, f.f50913B);

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC4770q0<Integer, C4761m> f50900b = a(k.f50918B, l.f50919B);

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC4770q0<U0.h, C4761m> f50901c = a(c.f50910B, d.f50911B);

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC4770q0<U0.j, C4763n> f50902d = a(a.f50908B, b.f50909B);

    /* renamed from: e, reason: collision with root package name */
    private static final InterfaceC4770q0<C3482m, C4763n> f50903e = a(q.f50924B, r.f50925B);

    /* renamed from: f, reason: collision with root package name */
    private static final InterfaceC4770q0<C3476g, C4763n> f50904f = a(m.f50920B, n.f50921B);

    /* renamed from: g, reason: collision with root package name */
    private static final InterfaceC4770q0<U0.n, C4763n> f50905g = a(g.f50914B, h.f50915B);

    /* renamed from: h, reason: collision with root package name */
    private static final InterfaceC4770q0<U0.r, C4763n> f50906h = a(i.f50916B, j.f50917B);

    /* renamed from: i, reason: collision with root package name */
    private static final InterfaceC4770q0<C3478i, C4767p> f50907i = a(o.f50922B, p.f50923B);

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/j;", "it", "Lv/n;", "a", "(J)Lv/n;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.s0$a */
    static final class a extends AbstractC3864v implements Ba.l<U0.j, C4763n> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f50908B = new a();

        a() {
            super(1);
        }

        public final C4763n a(long j10) {
            return new C4763n(U0.j.e(j10), U0.j.f(j10));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4763n invoke(U0.j jVar) {
            return a(jVar.getPackedValue());
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv/n;", "it", "LU0/j;", "a", "(Lv/n;)J"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.s0$b */
    static final class b extends AbstractC3864v implements Ba.l<C4763n, U0.j> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f50909B = new b();

        b() {
            super(1);
        }

        public final long a(C4763n c4763n) {
            return U0.i.a(U0.h.u(c4763n.getV1()), U0.h.u(c4763n.getV2()));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ U0.j invoke(C4763n c4763n) {
            return U0.j.a(a(c4763n));
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/h;", "it", "Lv/m;", "a", "(F)Lv/m;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.s0$c */
    static final class c extends AbstractC3864v implements Ba.l<U0.h, C4761m> {

        /* renamed from: B, reason: collision with root package name */
        public static final c f50910B = new c();

        c() {
            super(1);
        }

        public final C4761m a(float f10) {
            return new C4761m(f10);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4761m invoke(U0.h hVar) {
            return a(hVar.getValue());
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv/m;", "it", "LU0/h;", "a", "(Lv/m;)F"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.s0$d */
    static final class d extends AbstractC3864v implements Ba.l<C4761m, U0.h> {

        /* renamed from: B, reason: collision with root package name */
        public static final d f50911B = new d();

        d() {
            super(1);
        }

        public final float a(C4761m c4761m) {
            return U0.h.u(c4761m.getValue());
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ U0.h invoke(C4761m c4761m) {
            return U0.h.p(a(c4761m));
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lv/m;", "a", "(F)Lv/m;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.s0$e */
    static final class e extends AbstractC3864v implements Ba.l<Float, C4761m> {

        /* renamed from: B, reason: collision with root package name */
        public static final e f50912B = new e();

        e() {
            super(1);
        }

        public final C4761m a(float f10) {
            return new C4761m(f10);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4761m invoke(Float f10) {
            return a(f10.floatValue());
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv/m;", "it", "", "a", "(Lv/m;)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.s0$f */
    static final class f extends AbstractC3864v implements Ba.l<C4761m, Float> {

        /* renamed from: B, reason: collision with root package name */
        public static final f f50913B = new f();

        f() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke(C4761m c4761m) {
            return Float.valueOf(c4761m.getValue());
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/n;", "it", "Lv/n;", "a", "(J)Lv/n;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.s0$g */
    static final class g extends AbstractC3864v implements Ba.l<U0.n, C4763n> {

        /* renamed from: B, reason: collision with root package name */
        public static final g f50914B = new g();

        g() {
            super(1);
        }

        public final C4763n a(long j10) {
            return new C4763n(U0.n.h(j10), U0.n.i(j10));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4763n invoke(U0.n nVar) {
            return a(nVar.getPackedValue());
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv/n;", "it", "LU0/n;", "a", "(Lv/n;)J"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.s0$h */
    static final class h extends AbstractC3864v implements Ba.l<C4763n, U0.n> {

        /* renamed from: B, reason: collision with root package name */
        public static final h f50915B = new h();

        h() {
            super(1);
        }

        public final long a(C4763n c4763n) {
            return U0.o.a(Math.round(c4763n.getV1()), Math.round(c4763n.getV2()));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ U0.n invoke(C4763n c4763n) {
            return U0.n.b(a(c4763n));
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/r;", "it", "Lv/n;", "a", "(J)Lv/n;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.s0$i */
    static final class i extends AbstractC3864v implements Ba.l<U0.r, C4763n> {

        /* renamed from: B, reason: collision with root package name */
        public static final i f50916B = new i();

        i() {
            super(1);
        }

        public final C4763n a(long j10) {
            return new C4763n(U0.r.g(j10), U0.r.f(j10));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4763n invoke(U0.r rVar) {
            return a(rVar.getPackedValue());
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv/n;", "it", "LU0/r;", "a", "(Lv/n;)J"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.s0$j */
    static final class j extends AbstractC3864v implements Ba.l<C4763n, U0.r> {

        /* renamed from: B, reason: collision with root package name */
        public static final j f50917B = new j();

        j() {
            super(1);
        }

        public final long a(C4763n c4763n) {
            return s.a(Ha.g.d(Math.round(c4763n.getV1()), 0), Ha.g.d(Math.round(c4763n.getV2()), 0));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ U0.r invoke(C4763n c4763n) {
            return U0.r.b(a(c4763n));
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lv/m;", "a", "(I)Lv/m;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.s0$k */
    static final class k extends AbstractC3864v implements Ba.l<Integer, C4761m> {

        /* renamed from: B, reason: collision with root package name */
        public static final k f50918B = new k();

        k() {
            super(1);
        }

        public final C4761m a(int i10) {
            return new C4761m(i10);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4761m invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv/m;", "it", "", "a", "(Lv/m;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.s0$l */
    static final class l extends AbstractC3864v implements Ba.l<C4761m, Integer> {

        /* renamed from: B, reason: collision with root package name */
        public static final l f50919B = new l();

        l() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(C4761m c4761m) {
            return Integer.valueOf((int) c4761m.getValue());
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh0/g;", "it", "Lv/n;", "a", "(J)Lv/n;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.s0$m */
    static final class m extends AbstractC3864v implements Ba.l<C3476g, C4763n> {

        /* renamed from: B, reason: collision with root package name */
        public static final m f50920B = new m();

        m() {
            super(1);
        }

        public final C4763n a(long j10) {
            return new C4763n(C3476g.m(j10), C3476g.n(j10));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4763n invoke(C3476g c3476g) {
            return a(c3476g.getPackedValue());
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv/n;", "it", "Lh0/g;", "a", "(Lv/n;)J"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.s0$n */
    static final class n extends AbstractC3864v implements Ba.l<C4763n, C3476g> {

        /* renamed from: B, reason: collision with root package name */
        public static final n f50921B = new n();

        n() {
            super(1);
        }

        public final long a(C4763n c4763n) {
            return C3477h.a(c4763n.getV1(), c4763n.getV2());
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C3476g invoke(C4763n c4763n) {
            return C3476g.d(a(c4763n));
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh0/i;", "it", "Lv/p;", "a", "(Lh0/i;)Lv/p;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.s0$o */
    static final class o extends AbstractC3864v implements Ba.l<C3478i, C4767p> {

        /* renamed from: B, reason: collision with root package name */
        public static final o f50922B = new o();

        o() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4767p invoke(C3478i c3478i) {
            return new C4767p(c3478i.getLeft(), c3478i.getTop(), c3478i.getRight(), c3478i.getBottom());
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv/p;", "it", "Lh0/i;", "a", "(Lv/p;)Lh0/i;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.s0$p */
    static final class p extends AbstractC3864v implements Ba.l<C4767p, C3478i> {

        /* renamed from: B, reason: collision with root package name */
        public static final p f50923B = new p();

        p() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3478i invoke(C4767p c4767p) {
            return new C3478i(c4767p.getV1(), c4767p.getV2(), c4767p.getV3(), c4767p.getV4());
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh0/m;", "it", "Lv/n;", "a", "(J)Lv/n;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.s0$q */
    static final class q extends AbstractC3864v implements Ba.l<C3482m, C4763n> {

        /* renamed from: B, reason: collision with root package name */
        public static final q f50924B = new q();

        q() {
            super(1);
        }

        public final C4763n a(long j10) {
            return new C4763n(C3482m.i(j10), C3482m.g(j10));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4763n invoke(C3482m c3482m) {
            return a(c3482m.getPackedValue());
        }
    }

    /* compiled from: VectorConverters.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv/n;", "it", "Lh0/m;", "a", "(Lv/n;)J"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.s0$r */
    static final class r extends AbstractC3864v implements Ba.l<C4763n, C3482m> {

        /* renamed from: B, reason: collision with root package name */
        public static final r f50925B = new r();

        r() {
            super(1);
        }

        public final long a(C4763n c4763n) {
            return C3483n.a(c4763n.getV1(), c4763n.getV2());
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C3482m invoke(C4763n c4763n) {
            return C3482m.c(a(c4763n));
        }
    }

    public static final <T, V extends AbstractC4769q> InterfaceC4770q0<T, V> a(Ba.l<? super T, ? extends V> lVar, Ba.l<? super V, ? extends T> lVar2) {
        return new C4772r0(lVar, lVar2);
    }

    public static final InterfaceC4770q0<U0.h, C4761m> b(h.Companion companion) {
        return f50901c;
    }

    public static final InterfaceC4770q0<U0.j, C4763n> c(j.Companion companion) {
        return f50902d;
    }

    public static final InterfaceC4770q0<U0.n, C4763n> d(n.Companion companion) {
        return f50905g;
    }

    public static final InterfaceC4770q0<U0.r, C4763n> e(r.Companion companion) {
        return f50906h;
    }

    public static final InterfaceC4770q0<C3476g, C4763n> f(C3476g.Companion companion) {
        return f50904f;
    }

    public static final InterfaceC4770q0<C3478i, C4767p> g(C3478i.Companion companion) {
        return f50907i;
    }

    public static final InterfaceC4770q0<C3482m, C4763n> h(C3482m.Companion companion) {
        return f50903e;
    }

    public static final InterfaceC4770q0<Float, C4761m> i(C3856m c3856m) {
        return f50899a;
    }

    public static final InterfaceC4770q0<Integer, C4761m> j(C3861s c3861s) {
        return f50900b;
    }

    public static final float k(float f10, float f11, float f12) {
        return (f10 * (1 - f12)) + (f11 * f12);
    }
}
