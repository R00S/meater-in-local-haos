package com.facebook.p157o0;

import android.content.Context;
import com.facebook.C5641a0;
import com.facebook.internal.C5697q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C9801m;

/* compiled from: AppEventCollection.kt */
/* renamed from: com.facebook.o0.w */
/* loaded from: classes.dex */
public final class C5942w {

    /* renamed from: a */
    private final HashMap<C5928t, C5829i0> f15540a = new HashMap<>();

    /* renamed from: e */
    private final synchronized C5829i0 m12845e(C5928t c5928t) {
        C5829i0 c5829i0 = this.f15540a.get(c5928t);
        if (c5829i0 == null) {
            C5641a0 c5641a0 = C5641a0.f14199a;
            Context contextM11284c = C5641a0.m11284c();
            C5697q c5697qM11628e = C5697q.f14488a.m11628e(contextM11284c);
            if (c5697qM11628e != null) {
                c5829i0 = new C5829i0(c5697qM11628e, C5813a0.f14908a.m12169c(contextM11284c));
            }
        }
        if (c5829i0 == null) {
            return null;
        }
        this.f15540a.put(c5928t, c5829i0);
        return c5829i0;
    }

    /* renamed from: a */
    public final synchronized void m12846a(C5928t c5928t, C5941v c5941v) {
        C9801m.m32346f(c5928t, "accessTokenAppIdPair");
        C9801m.m32346f(c5941v, "appEvent");
        C5829i0 c5829i0M12845e = m12845e(c5928t);
        if (c5829i0M12845e != null) {
            c5829i0M12845e.m12257a(c5941v);
        }
    }

    /* renamed from: b */
    public final synchronized void m12847b(C5827h0 c5827h0) {
        if (c5827h0 == null) {
            return;
        }
        for (Map.Entry<C5928t, List<C5941v>> entry : c5827h0.m12255b()) {
            C5829i0 c5829i0M12845e = m12845e(entry.getKey());
            if (c5829i0M12845e != null) {
                Iterator<C5941v> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    c5829i0M12845e.m12257a(it.next());
                }
            }
        }
    }

    /* renamed from: c */
    public final synchronized C5829i0 m12848c(C5928t c5928t) {
        C9801m.m32346f(c5928t, "accessTokenAppIdPair");
        return this.f15540a.get(c5928t);
    }

    /* renamed from: d */
    public final synchronized int m12849d() {
        int iM12259c;
        iM12259c = 0;
        Iterator<C5829i0> it = this.f15540a.values().iterator();
        while (it.hasNext()) {
            iM12259c += it.next().m12259c();
        }
        return iM12259c;
    }

    /* renamed from: f */
    public final synchronized Set<C5928t> m12850f() {
        Set<C5928t> setKeySet;
        setKeySet = this.f15540a.keySet();
        C9801m.m32345e(setKeySet, "stateMap.keys");
        return setKeySet;
    }
}
