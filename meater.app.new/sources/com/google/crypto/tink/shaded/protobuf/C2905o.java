package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC2913x;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ExtensionRegistryLite.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2905o {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f37883b = true;

    /* renamed from: c, reason: collision with root package name */
    private static volatile C2905o f37884c;

    /* renamed from: d, reason: collision with root package name */
    static final C2905o f37885d = new C2905o(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, AbstractC2913x.e<?, ?>> f37886a;

    /* compiled from: ExtensionRegistryLite.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.o$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f37887a;

        /* renamed from: b, reason: collision with root package name */
        private final int f37888b;

        a(Object obj, int i10) {
            this.f37887a = obj;
            this.f37888b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f37887a == aVar.f37887a && this.f37888b == aVar.f37888b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f37887a) * 65535) + this.f37888b;
        }
    }

    C2905o() {
        this.f37886a = new HashMap();
    }

    public static C2905o b() {
        C2905o c2905oA = f37884c;
        if (c2905oA == null) {
            synchronized (C2905o.class) {
                try {
                    c2905oA = f37884c;
                    if (c2905oA == null) {
                        c2905oA = f37883b ? C2904n.a() : f37885d;
                        f37884c = c2905oA;
                    }
                } finally {
                }
            }
        }
        return c2905oA;
    }

    public <ContainingType extends P> AbstractC2913x.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (AbstractC2913x.e) this.f37886a.get(new a(containingtype, i10));
    }

    C2905o(boolean z10) {
        this.f37886a = Collections.emptyMap();
    }
}
