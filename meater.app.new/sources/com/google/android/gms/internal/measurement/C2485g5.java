package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.g5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2485g5 implements InterfaceC2493h5 {
    C2485g5() {
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2493h5
    public final C2477f5<?, ?> b(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2493h5
    public final Object c(Object obj) {
        return C2469e5.c().g();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2493h5
    public final boolean d(Object obj) {
        return !((C2469e5) obj).i();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2493h5
    public final Map<?, ?> e(Object obj) {
        return (C2469e5) obj;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2493h5
    public final Map<?, ?> f(Object obj) {
        return (C2469e5) obj;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2493h5
    public final Object g(Object obj, Object obj2) {
        C2469e5 c2469e5G = (C2469e5) obj;
        C2469e5 c2469e5 = (C2469e5) obj2;
        if (!c2469e5.isEmpty()) {
            if (!c2469e5G.i()) {
                c2469e5G = c2469e5G.g();
            }
            c2469e5G.d(c2469e5);
        }
        return c2469e5G;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2493h5
    public final Object h(Object obj) {
        ((C2469e5) obj).h();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2493h5
    public final int i(int i10, Object obj, Object obj2) {
        C2469e5 c2469e5 = (C2469e5) obj;
        if (c2469e5.isEmpty()) {
            return 0;
        }
        Iterator it = c2469e5.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
