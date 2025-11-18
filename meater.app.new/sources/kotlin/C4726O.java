package kotlin;

import Ba.l;
import kotlin.C1510L;
import kotlin.C1516O;
import kotlin.C1560o;
import kotlin.C4725N;
import kotlin.C4725N.a;
import kotlin.InterfaceC1508K;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3856m;
import kotlin.jvm.internal.C3862t;
import kotlin.x1;
import oa.C4153F;

/* compiled from: InfiniteTransition.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001ae\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0007*\u00020\u0006*\u00020\u00022\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e*\u00020\u00022\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "label", "Lv/N;", "c", "(Ljava/lang/String;LO/l;II)Lv/N;", "T", "Lv/q;", "V", "initialValue", "targetValue", "Lv/q0;", "typeConverter", "Lv/M;", "animationSpec", "LO/x1;", "b", "(Lv/N;Ljava/lang/Object;Ljava/lang/Object;Lv/q0;Lv/M;Ljava/lang/String;LO/l;II)LO/x1;", "", "a", "(Lv/N;FFLv/M;Ljava/lang/String;LO/l;II)LO/x1;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4726O {

    /* compiled from: InfiniteTransition.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lv/q;", "V", "Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.O$a */
    static final class a extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ T f50639B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C4725N.a<T, V> f50640C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ T f50641D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ C4724M<T> f50642E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(T t10, C4725N.a<T, V> aVar, T t11, C4724M<T> c4724m) {
            super(0);
            this.f50639B = t10;
            this.f50640C = aVar;
            this.f50641D = t11;
            this.f50642E = c4724m;
        }

        public final void a() {
            if (C3862t.b(this.f50639B, this.f50640C.h()) && C3862t.b(this.f50641D, this.f50640C.i())) {
                return;
            }
            this.f50640C.t(this.f50639B, this.f50641D, this.f50642E);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: InfiniteTransition.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lv/q;", "V", "LO/L;", "LO/K;", "a", "(LO/L;)LO/K;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.O$b */
    static final class b extends AbstractC3864v implements l<C1510L, InterfaceC1508K> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C4725N f50643B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C4725N.a<T, V> f50644C;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"v/O$b$a", "LO/K;", "Loa/F;", "c", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: v.O$b$a */
        public static final class a implements InterfaceC1508K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4725N f50645a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4725N.a f50646b;

            public a(C4725N c4725n, C4725N.a aVar) {
                this.f50645a = c4725n;
                this.f50646b = aVar;
            }

            @Override // kotlin.InterfaceC1508K
            public void c() {
                this.f50645a.j(this.f50646b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C4725N c4725n, C4725N.a<T, V> aVar) {
            super(1);
            this.f50643B = c4725n;
            this.f50644C = aVar;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1508K invoke(C1510L c1510l) {
            this.f50643B.f(this.f50644C);
            return new a(this.f50643B, this.f50644C);
        }
    }

    public static final x1<Float> a(C4725N c4725n, float f10, float f11, C4724M<Float> c4724m, String str, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        String str2 = (i11 & 8) != 0 ? "FloatAnimation" : str;
        if (C1560o.J()) {
            C1560o.S(-644770905, i10, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:316)");
        }
        int i12 = i10 << 3;
        x1<Float> x1VarB = b(c4725n, Float.valueOf(f10), Float.valueOf(f11), C4774s0.i(C3856m.f44008a), c4724m, str2, interfaceC1554l, (i10 & 1022) | (57344 & i12) | (i12 & 458752), 0);
        if (C1560o.J()) {
            C1560o.R();
        }
        return x1VarB;
    }

    public static final <T, V extends AbstractC4769q> x1<T> b(C4725N c4725n, T t10, T t11, InterfaceC4770q0<T, V> interfaceC4770q0, C4724M<T> c4724m, String str, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        if ((i11 & 16) != 0) {
            str = "ValueAnimation";
        }
        String str2 = str;
        if (C1560o.J()) {
            C1560o.S(-1062847727, i10, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:260)");
        }
        Object objF = interfaceC1554l.f();
        InterfaceC1554l.Companion companion = InterfaceC1554l.INSTANCE;
        if (objF == companion.a()) {
            objF = c4725n.new a(t10, t11, interfaceC4770q0, c4724m, str2);
            interfaceC1554l.J(objF);
        }
        C4725N.a aVar = (C4725N.a) objF;
        boolean z10 = true;
        boolean z11 = ((((i10 & 112) ^ 48) > 32 && interfaceC1554l.l(t10)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && interfaceC1554l.l(t11)) || (i10 & 384) == 256);
        if ((((57344 & i10) ^ 24576) <= 16384 || !interfaceC1554l.l(c4724m)) && (i10 & 24576) != 16384) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objF2 = interfaceC1554l.f();
        if (z12 || objF2 == companion.a()) {
            objF2 = new a(t10, aVar, t11, c4724m);
            interfaceC1554l.J(objF2);
        }
        C1516O.g((Ba.a) objF2, interfaceC1554l, 0);
        boolean zL = interfaceC1554l.l(c4725n);
        Object objF3 = interfaceC1554l.f();
        if (zL || objF3 == companion.a()) {
            objF3 = new b(c4725n, aVar);
            interfaceC1554l.J(objF3);
        }
        C1516O.a(aVar, (l) objF3, interfaceC1554l, 6);
        if (C1560o.J()) {
            C1560o.R();
        }
        return aVar;
    }

    public static final C4725N c(String str, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        if ((i11 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (C1560o.J()) {
            C1560o.S(1013651573, i10, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        Object objF = interfaceC1554l.f();
        if (objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new C4725N(str);
            interfaceC1554l.J(objF);
        }
        C4725N c4725n = (C4725N) objF;
        c4725n.k(interfaceC1554l, 0);
        if (C1560o.J()) {
            C1560o.R();
        }
        return c4725n;
    }
}
