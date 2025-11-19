package com.google.protobuf;

import com.google.protobuf.AbstractC2962w;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ExtensionRegistryLite.java */
/* renamed from: com.google.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2954n {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f39313b = true;

    /* renamed from: c, reason: collision with root package name */
    private static volatile C2954n f39314c;

    /* renamed from: d, reason: collision with root package name */
    static final C2954n f39315d = new C2954n(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, AbstractC2962w.e<?, ?>> f39316a;

    /* compiled from: ExtensionRegistryLite.java */
    /* renamed from: com.google.protobuf.n$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f39317a;

        /* renamed from: b, reason: collision with root package name */
        private final int f39318b;

        a(Object obj, int i10) {
            this.f39317a = obj;
            this.f39318b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f39317a == aVar.f39317a && this.f39318b == aVar.f39318b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f39317a) * 65535) + this.f39318b;
        }
    }

    C2954n() {
        this.f39316a = new HashMap();
    }

    public static C2954n b() {
        if (!f39313b) {
            return f39315d;
        }
        C2954n c2954nA = f39314c;
        if (c2954nA == null) {
            synchronized (C2954n.class) {
                try {
                    c2954nA = f39314c;
                    if (c2954nA == null) {
                        c2954nA = C2953m.a();
                        f39314c = c2954nA;
                    }
                } finally {
                }
            }
        }
        return c2954nA;
    }

    public <ContainingType extends P> AbstractC2962w.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (AbstractC2962w.e) this.f39316a.get(new a(containingtype, i10));
    }

    C2954n(boolean z10) {
        this.f39316a = Collections.emptyMap();
    }
}
