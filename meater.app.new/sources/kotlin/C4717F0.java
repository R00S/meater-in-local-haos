package kotlin;

import U0.h;
import U0.j;
import U0.n;
import U0.o;
import U0.r;
import U0.s;
import h0.C3476g;
import h0.C3477h;
import h0.C3478i;
import h0.C3482m;
import h0.C3483n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.C3856m;
import kotlin.jvm.internal.C3861s;
import oa.C4170o;
import oa.v;

/* compiled from: VisibilityThresholds.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\".\u0010\u000b\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0015\u0010\u0010\u001a\u00020\r*\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0015\u0010\u0010\u001a\u00020\u0012*\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0010\u001a\u00020\u0016*\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0017\"\u0015\u0010\u0010\u001a\u00020\u0019*\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u001a\"\u0015\u0010\u0010\u001a\u00020\u001c*\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\"\u0015\u0010\u0010\u001a\u00020 *\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u0015\u0010\u0010\u001a\u00020\u0000*\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lh0/i;", "a", "Lh0/i;", "rectVisibilityThreshold", "", "Lv/q0;", "", "b", "Ljava/util/Map;", "h", "()Ljava/util/Map;", "visibilityThresholdMap", "LU0/n$a;", "LU0/n;", "c", "(LU0/n$a;)J", "VisibilityThreshold", "Lh0/g$a;", "Lh0/g;", "e", "(Lh0/g$a;)J", "Lkotlin/Int$Companion;", "", "(Lkotlin/jvm/internal/s;)I", "LU0/h$a;", "LU0/h;", "(LU0/h$a;)F", "Lh0/m$a;", "Lh0/m;", "f", "(Lh0/m$a;)J", "LU0/r$a;", "LU0/r;", "d", "(LU0/r$a;)J", "Lh0/i$a;", "g", "(Lh0/i$a;)Lh0/i;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.F0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4717F0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C3478i f50591a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map<InterfaceC4770q0<?, ?>, Float> f50592b;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        f50591a = new C3478i(0.5f, 0.5f, 0.5f, 0.5f);
        InterfaceC4770q0<Integer, C4761m> interfaceC4770q0J = C4774s0.j(C3861s.f44009a);
        Float fValueOf2 = Float.valueOf(1.0f);
        C4170o c4170oA = v.a(interfaceC4770q0J, fValueOf2);
        C4170o c4170oA2 = v.a(C4774s0.e(r.INSTANCE), fValueOf2);
        C4170o c4170oA3 = v.a(C4774s0.d(n.INSTANCE), fValueOf2);
        C4170o c4170oA4 = v.a(C4774s0.i(C3856m.f44008a), Float.valueOf(0.01f));
        C4170o c4170oA5 = v.a(C4774s0.g(C3478i.INSTANCE), fValueOf);
        C4170o c4170oA6 = v.a(C4774s0.h(C3482m.INSTANCE), fValueOf);
        C4170o c4170oA7 = v.a(C4774s0.f(C3476g.INSTANCE), fValueOf);
        InterfaceC4770q0<h, C4761m> interfaceC4770q0B = C4774s0.b(h.INSTANCE);
        Float fValueOf3 = Float.valueOf(0.1f);
        f50592b = M.k(c4170oA, c4170oA2, c4170oA3, c4170oA4, c4170oA5, c4170oA6, c4170oA7, v.a(interfaceC4770q0B, fValueOf3), v.a(C4774s0.c(j.INSTANCE), fValueOf3));
    }

    public static final float a(h.Companion companion) {
        return h.u(0.1f);
    }

    public static final int b(C3861s c3861s) {
        return 1;
    }

    public static final long c(n.Companion companion) {
        return o.a(1, 1);
    }

    public static final long d(r.Companion companion) {
        return s.a(1, 1);
    }

    public static final long e(C3476g.Companion companion) {
        return C3477h.a(0.5f, 0.5f);
    }

    public static final long f(C3482m.Companion companion) {
        return C3483n.a(0.5f, 0.5f);
    }

    public static final C3478i g(C3478i.Companion companion) {
        return f50591a;
    }

    public static final Map<InterfaceC4770q0<?, ?>, Float> h() {
        return f50592b;
    }
}
