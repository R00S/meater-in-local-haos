package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC2077x;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ExtensionRegistryLite.java */
/* renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2069o {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f25005b = true;

    /* renamed from: d, reason: collision with root package name */
    private static volatile C2069o f25007d;

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, AbstractC2077x.e<?, ?>> f25009a;

    /* renamed from: c, reason: collision with root package name */
    private static final Class<?> f25006c = c();

    /* renamed from: e, reason: collision with root package name */
    static final C2069o f25008e = new C2069o(true);

    /* compiled from: ExtensionRegistryLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.o$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f25010a;

        /* renamed from: b, reason: collision with root package name */
        private final int f25011b;

        a(Object obj, int i10) {
            this.f25010a = obj;
            this.f25011b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f25010a == aVar.f25010a && this.f25011b == aVar.f25011b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f25010a) * 65535) + this.f25011b;
        }
    }

    C2069o() {
        this.f25009a = new HashMap();
    }

    public static C2069o b() {
        C2069o c2069oA = f25007d;
        if (c2069oA == null) {
            synchronized (C2069o.class) {
                try {
                    c2069oA = f25007d;
                    if (c2069oA == null) {
                        c2069oA = f25005b ? C2068n.a() : f25008e;
                        f25007d = c2069oA;
                    }
                } finally {
                }
            }
        }
        return c2069oA;
    }

    static Class<?> c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public <ContainingType extends P> AbstractC2077x.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (AbstractC2077x.e) this.f25009a.get(new a(containingtype, i10));
    }

    C2069o(boolean z10) {
        this.f25009a = Collections.emptyMap();
    }
}
