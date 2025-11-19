package com.google.crypto.tink.internal;

import D8.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC2898h;
import com.google.crypto.tink.shaded.protobuf.P;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import r8.l;
import w8.C5009b;

/* compiled from: KeyTypeManager.java */
/* loaded from: classes2.dex */
public abstract class d<KeyProtoT extends P> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<KeyProtoT> f37646a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, m<?, KeyProtoT>> f37647b;

    /* renamed from: c, reason: collision with root package name */
    private final Class<?> f37648c;

    /* compiled from: KeyTypeManager.java */
    public static abstract class a<KeyFormatProtoT extends P, KeyProtoT extends P> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<KeyFormatProtoT> f37649a;

        /* compiled from: KeyTypeManager.java */
        /* renamed from: com.google.crypto.tink.internal.d$a$a, reason: collision with other inner class name */
        public static final class C0484a<KeyFormatProtoT> {

            /* renamed from: a, reason: collision with root package name */
            public KeyFormatProtoT f37650a;

            /* renamed from: b, reason: collision with root package name */
            public l.b f37651b;

            public C0484a(KeyFormatProtoT keyformatprotot, l.b bVar) {
                this.f37650a = keyformatprotot;
                this.f37651b = bVar;
            }
        }

        public a(Class<KeyFormatProtoT> cls) {
            this.f37649a = cls;
        }

        public abstract KeyProtoT a(KeyFormatProtoT keyformatprotot);

        public final Class<KeyFormatProtoT> b() {
            return this.f37649a;
        }

        public Map<String, C0484a<KeyFormatProtoT>> c() {
            return Collections.emptyMap();
        }

        public abstract KeyFormatProtoT d(AbstractC2898h abstractC2898h);

        public abstract void e(KeyFormatProtoT keyformatprotot);
    }

    @SafeVarargs
    protected d(Class<KeyProtoT> cls, m<?, KeyProtoT>... mVarArr) {
        this.f37646a = cls;
        HashMap map = new HashMap();
        for (m<?, KeyProtoT> mVar : mVarArr) {
            if (map.containsKey(mVar.b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + mVar.b().getCanonicalName());
            }
            map.put(mVar.b(), mVar);
        }
        if (mVarArr.length > 0) {
            this.f37648c = mVarArr[0].b();
        } else {
            this.f37648c = Void.class;
        }
        this.f37647b = Collections.unmodifiableMap(map);
    }

    public C5009b.EnumC0751b a() {
        return C5009b.EnumC0751b.f51985B;
    }

    public final Class<?> b() {
        return this.f37648c;
    }

    public final Class<KeyProtoT> c() {
        return this.f37646a;
    }

    public abstract String d();

    public final <P> P e(KeyProtoT keyprotot, Class<P> cls) {
        m<?, KeyProtoT> mVar = this.f37647b.get(cls);
        if (mVar != null) {
            return (P) mVar.a(keyprotot);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract a<?, KeyProtoT> f();

    public abstract y.c g();

    public abstract KeyProtoT h(AbstractC2898h abstractC2898h);

    public final Set<Class<?>> i() {
        return this.f37647b.keySet();
    }

    public abstract void j(KeyProtoT keyprotot);
}
