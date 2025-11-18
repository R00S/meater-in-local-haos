package com.facebook.p157o0;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C10782c0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: PersistedEvents.kt */
/* renamed from: com.facebook.o0.h0 */
/* loaded from: classes.dex */
public final class C5827h0 implements Serializable {

    /* renamed from: f */
    public static final a f14953f = new a(null);

    /* renamed from: g */
    private final HashMap<C5928t, List<C5941v>> f14954g;

    /* compiled from: PersistedEvents.kt */
    /* renamed from: com.facebook.o0.h0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: PersistedEvents.kt */
    /* renamed from: com.facebook.o0.h0$b */
    public static final class b implements Serializable {

        /* renamed from: f */
        public static final a f14955f = new a(null);

        /* renamed from: g */
        private final HashMap<C5928t, List<C5941v>> f14956g;

        /* compiled from: PersistedEvents.kt */
        /* renamed from: com.facebook.o0.h0$b$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9789g c9789g) {
                this();
            }
        }

        public b(HashMap<C5928t, List<C5941v>> map) {
            C9801m.m32346f(map, "proxyEvents");
            this.f14956g = map;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new C5827h0(this.f14956g);
        }
    }

    public C5827h0() {
        this.f14954g = new HashMap<>();
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new b(this.f14954g);
    }

    /* renamed from: a */
    public final void m12254a(C5928t c5928t, List<C5941v> list) {
        C9801m.m32346f(c5928t, "accessTokenAppIdPair");
        C9801m.m32346f(list, "appEvents");
        if (!this.f14954g.containsKey(c5928t)) {
            this.f14954g.put(c5928t, C10782c0.m38571G0(list));
            return;
        }
        List<C5941v> list2 = this.f14954g.get(c5928t);
        if (list2 == null) {
            return;
        }
        list2.addAll(list);
    }

    /* renamed from: b */
    public final Set<Map.Entry<C5928t, List<C5941v>>> m12255b() {
        Set<Map.Entry<C5928t, List<C5941v>>> setEntrySet = this.f14954g.entrySet();
        C9801m.m32345e(setEntrySet, "events.entries");
        return setEntrySet;
    }

    public C5827h0(HashMap<C5928t, List<C5941v>> map) {
        C9801m.m32346f(map, "appEventMap");
        HashMap<C5928t, List<C5941v>> map2 = new HashMap<>();
        this.f14954g = map2;
        map2.putAll(map);
    }
}
