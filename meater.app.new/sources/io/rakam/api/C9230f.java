package io.rakam.api;

import java.util.HashMap;
import java.util.Map;

/* compiled from: Rakam.java */
/* renamed from: io.rakam.api.f */
/* loaded from: classes.dex */
public class C9230f {

    /* renamed from: a */
    static final Map<String, C9231g> f35654a = new HashMap();

    /* renamed from: a */
    public static C9231g m29891a() {
        return m29892b(null);
    }

    /* renamed from: b */
    public static synchronized C9231g m29892b(String str) {
        C9231g c9231g;
        String strM29989e = C9234j.m29989e(str);
        Map<String, C9231g> map = f35654a;
        c9231g = map.get(strM29989e);
        if (c9231g == null) {
            c9231g = new C9231g(strM29989e);
            map.put(strM29989e, c9231g);
        }
        return c9231g;
    }
}
