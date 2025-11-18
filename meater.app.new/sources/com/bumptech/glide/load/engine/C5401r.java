package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.InterfaceC5423f;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Jobs.java */
/* renamed from: com.bumptech.glide.load.engine.r */
/* loaded from: classes.dex */
final class C5401r {

    /* renamed from: a */
    private final Map<InterfaceC5423f, C5395l<?>> f13471a = new HashMap();

    /* renamed from: b */
    private final Map<InterfaceC5423f, C5395l<?>> f13472b = new HashMap();

    C5401r() {
    }

    /* renamed from: b */
    private Map<InterfaceC5423f, C5395l<?>> m10347b(boolean z) {
        return z ? this.f13472b : this.f13471a;
    }

    /* renamed from: a */
    C5395l<?> m10348a(InterfaceC5423f interfaceC5423f, boolean z) {
        return m10347b(z).get(interfaceC5423f);
    }

    /* renamed from: c */
    void m10349c(InterfaceC5423f interfaceC5423f, C5395l<?> c5395l) {
        m10347b(c5395l.m10328o()).put(interfaceC5423f, c5395l);
    }

    /* renamed from: d */
    void m10350d(InterfaceC5423f interfaceC5423f, C5395l<?> c5395l) {
        Map<InterfaceC5423f, C5395l<?>> mapM10347b = m10347b(c5395l.m10328o());
        if (c5395l.equals(mapM10347b.get(interfaceC5423f))) {
            mapM10347b.remove(interfaceC5423f);
        }
    }
}
