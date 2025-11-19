package kotlin;

import J.p;
import U0.h;
import i0.C3602t0;
import kotlin.AbstractC1501G0;
import kotlin.C1560o;
import kotlin.C1576w;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import w.InterfaceC4949B;
import w.z;

/* compiled from: Ripple.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a0\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\"&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\f8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\"(\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\f8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u000e\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\r\u0010\u0010\"\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"", "bounded", "LU0/h;", "radius", "Li0/t0;", "color", "Lw/B;", "b", "(ZFJ)Lw/B;", "Lw/z;", "c", "(ZFJLO/l;II)Lw/z;", "LO/G0;", "a", "LO/G0;", "getLocalUseFallbackRippleImplementation", "()LO/G0;", "getLocalUseFallbackRippleImplementation$annotations", "()V", "LocalUseFallbackRippleImplementation", "LK/M;", "getLocalRippleConfiguration$annotations", "LocalRippleConfiguration", "LK/P;", "LK/P;", "DefaultBoundedRipple", "d", "DefaultUnboundedRipple", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1263O {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1501G0<Boolean> f7975a = C1576w.f(b.f7980B);

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC1501G0<RippleConfiguration> f7976b = C1576w.d(null, a.f7979B, 1, null);

    /* renamed from: c, reason: collision with root package name */
    private static final C1264P f7977c;

    /* renamed from: d, reason: collision with root package name */
    private static final C1264P f7978d;

    /* compiled from: Ripple.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LK/M;", "a", "()LK/M;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.O$a */
    static final class a extends AbstractC3864v implements Ba.a<RippleConfiguration> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f7979B = new a();

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RippleConfiguration invoke() {
            return new RippleConfiguration(0L, null, 3, null);
        }
    }

    /* compiled from: Ripple.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.O$b */
    static final class b extends AbstractC3864v implements Ba.a<Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f7980B = new b();

        b() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static {
        h.Companion companion = h.INSTANCE;
        float fC = companion.c();
        C3602t0.Companion companion2 = C3602t0.INSTANCE;
        f7977c = new C1264P(true, fC, companion2.e(), (C3854k) null);
        f7978d = new C1264P(false, companion.c(), companion2.e(), (C3854k) null);
    }

    public static final AbstractC1501G0<RippleConfiguration> a() {
        return f7976b;
    }

    public static final InterfaceC4949B b(boolean z10, float f10, long j10) {
        return (h.w(f10, h.INSTANCE.c()) && C3602t0.m(j10, C3602t0.INSTANCE.e())) ? z10 ? f7977c : f7978d : new C1264P(z10, f10, j10, (C3854k) null);
    }

    public static final z c(boolean z10, float f10, long j10, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i11 & 2) != 0) {
            f10 = h.INSTANCE.c();
        }
        float f11 = f10;
        if ((i11 & 4) != 0) {
            j10 = C3602t0.INSTANCE.e();
        }
        long j11 = j10;
        if (C1560o.J()) {
            C1560o.S(-1315814667, i10, -1, "androidx.compose.material3.rippleOrFallbackImplementation (Ripple.kt:230)");
        }
        interfaceC1554l.S(-1280632857);
        z zVarF = ((Boolean) interfaceC1554l.o(f7975a)).booleanValue() ? p.f(z11, f11, j11, interfaceC1554l, i10 & 1022, 0) : b(z11, f11, j11);
        interfaceC1554l.I();
        if (C1560o.J()) {
            C1560o.R();
        }
        return zVarF;
    }
}
