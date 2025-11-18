package kotlin;

import W.e;
import W.f;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: CompositionLocalMap.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\u000e\u001a\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\t2\u0006\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "LO/z0;", "LO/u;", "key", "", "a", "(LO/z0;LO/u;)Z", "b", "(LO/z0;LO/u;)Ljava/lang/Object;", "", "LO/H0;", "values", "parentScope", "previous", "c", "([LO/H0;LO/z0;LO/z0;)LO/z0;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1580y {
    public static final <T> boolean a(InterfaceC1583z0 interfaceC1583z0, AbstractC1572u<T> abstractC1572u) {
        C3862t.e(abstractC1572u, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return interfaceC1583z0.containsKey(abstractC1572u);
    }

    public static final <T> T b(InterfaceC1583z0 interfaceC1583z0, AbstractC1572u<T> abstractC1572u) {
        C3862t.e(abstractC1572u, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        D1<T> d1A = (D1<T>) interfaceC1583z0.get(abstractC1572u);
        if (d1A == null) {
            d1A = abstractC1572u.a();
        }
        return (T) d1A.a(interfaceC1583z0);
    }

    public static final InterfaceC1583z0 c(C1503H0<?>[] c1503h0Arr, InterfaceC1583z0 interfaceC1583z0, InterfaceC1583z0 interfaceC1583z02) {
        e.a aVarX = f.a().t();
        for (C1503H0<?> c1503h0 : c1503h0Arr) {
            AbstractC1572u<?> abstractC1572uB = c1503h0.b();
            C3862t.e(abstractC1572uB, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            AbstractC1501G0 abstractC1501G0 = (AbstractC1501G0) abstractC1572uB;
            if (c1503h0.getCanOverride() || !a(interfaceC1583z0, abstractC1501G0)) {
                D1 d12 = (D1) interfaceC1583z02.get(abstractC1501G0);
                C3862t.e(c1503h0, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
                aVarX.put(abstractC1501G0, abstractC1501G0.b(c1503h0, d12));
            }
        }
        return aVarX.g();
    }

    public static /* synthetic */ InterfaceC1583z0 d(C1503H0[] c1503h0Arr, InterfaceC1583z0 interfaceC1583z0, InterfaceC1583z0 interfaceC1583z02, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            interfaceC1583z02 = f.a();
        }
        return c(c1503h0Arr, interfaceC1583z0, interfaceC1583z02);
    }
}
