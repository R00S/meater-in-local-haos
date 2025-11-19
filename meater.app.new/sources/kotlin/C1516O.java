package kotlin;

import Ba.a;
import Ba.l;
import Ba.p;
import Xb.A0;
import Xb.C1873y0;
import Xb.I;
import Xb.InterfaceC1867v0;
import Xb.InterfaceC1870x;
import Xb.J;
import java.util.Arrays;
import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;
import ta.g;

/* compiled from: Effects.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\n\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\r\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aA\u0010\u0010\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a;\u0010\u0014\u001a\u00020\u00012\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0012\"\u0004\u0018\u00010\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a=\u0010\u001a\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001aG\u0010\u001c\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0016H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010\"\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b\"\u0010#\"\u0014\u0010%\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$¨\u0006&"}, d2 = {"Lkotlin/Function0;", "Loa/F;", "effect", "g", "(LBa/a;LO/l;I)V", "", "key1", "Lkotlin/Function1;", "LO/L;", "LO/K;", "a", "(Ljava/lang/Object;LBa/l;LO/l;I)V", "key2", "b", "(Ljava/lang/Object;Ljava/lang/Object;LBa/l;LO/l;I)V", "key3", "c", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LBa/l;LO/l;I)V", "", "keys", "d", "([Ljava/lang/Object;LBa/l;LO/l;I)V", "Lkotlin/Function2;", "LXb/I;", "Lta/d;", "block", "e", "(Ljava/lang/Object;LBa/p;LO/l;I)V", "f", "(Ljava/lang/Object;Ljava/lang/Object;LBa/p;LO/l;I)V", "Lta/g;", "coroutineContext", "LO/l;", "composer", "i", "(Lta/g;LO/l;)LXb/I;", "LO/L;", "InternalDisposableEffectScope", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.O, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1516O {

    /* renamed from: a, reason: collision with root package name */
    private static final C1510L f12734a = new C1510L();

    public static final void a(Object obj, l<? super C1510L, ? extends InterfaceC1508K> lVar, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-1371986847, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:155)");
        }
        boolean zR = interfaceC1554l.R(obj);
        Object objF = interfaceC1554l.f();
        if (zR || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new C1506J(lVar);
            interfaceC1554l.J(objF);
        }
        if (C1560o.J()) {
            C1560o.R();
        }
    }

    public static final void b(Object obj, Object obj2, l<? super C1510L, ? extends InterfaceC1508K> lVar, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(1429097729, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:195)");
        }
        boolean zR = interfaceC1554l.R(obj) | interfaceC1554l.R(obj2);
        Object objF = interfaceC1554l.f();
        if (zR || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new C1506J(lVar);
            interfaceC1554l.J(objF);
        }
        if (C1560o.J()) {
            C1560o.R();
        }
    }

    public static final void c(Object obj, Object obj2, Object obj3, l<? super C1510L, ? extends InterfaceC1508K> lVar, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-1239538271, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:236)");
        }
        boolean zR = interfaceC1554l.R(obj) | interfaceC1554l.R(obj2) | interfaceC1554l.R(obj3);
        Object objF = interfaceC1554l.f();
        if (zR || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new C1506J(lVar);
            interfaceC1554l.J(objF);
        }
        if (C1560o.J()) {
            C1560o.R();
        }
    }

    public static final void d(Object[] objArr, l<? super C1510L, ? extends InterfaceC1508K> lVar, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-1307627122, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:276)");
        }
        boolean zR = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zR |= interfaceC1554l.R(obj);
        }
        Object objF = interfaceC1554l.f();
        if (zR || objF == InterfaceC1554l.INSTANCE.a()) {
            interfaceC1554l.J(new C1506J(lVar));
        }
        if (C1560o.J()) {
            C1560o.R();
        }
    }

    public static final void e(Object obj, p<? super I, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(1179185413, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:337)");
        }
        g gVarD = interfaceC1554l.D();
        boolean zR = interfaceC1554l.R(obj);
        Object objF = interfaceC1554l.f();
        if (zR || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new C1534c0(gVarD, pVar);
            interfaceC1554l.J(objF);
        }
        if (C1560o.J()) {
            C1560o.R();
        }
    }

    public static final void f(Object obj, Object obj2, p<? super I, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(590241125, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        g gVarD = interfaceC1554l.D();
        boolean zR = interfaceC1554l.R(obj) | interfaceC1554l.R(obj2);
        Object objF = interfaceC1554l.f();
        if (zR || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new C1534c0(gVarD, pVar);
            interfaceC1554l.J(objF);
        }
        if (C1560o.J()) {
            C1560o.R();
        }
    }

    public static final void g(a<C4153F> aVar, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-1288466761, i10, -1, "androidx.compose.runtime.SideEffect (Effects.kt:48)");
        }
        interfaceC1554l.v(aVar);
        if (C1560o.J()) {
            C1560o.R();
        }
    }

    public static final I i(g gVar, InterfaceC1554l interfaceC1554l) {
        InterfaceC1867v0.Companion companion = InterfaceC1867v0.INSTANCE;
        if (gVar.b(companion) == null) {
            g gVarD = interfaceC1554l.D();
            return J.a(gVarD.s(C1873y0.a((InterfaceC1867v0) gVarD.b(companion))).s(gVar));
        }
        InterfaceC1870x interfaceC1870xB = A0.b(null, 1, null);
        interfaceC1870xB.d(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return J.a(interfaceC1870xB);
    }
}
