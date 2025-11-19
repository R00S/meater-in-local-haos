package com.google.crypto.tink.internal;

import r8.g;

/* compiled from: PrimitiveConstructor.java */
/* loaded from: classes2.dex */
public abstract class l<KeyT extends r8.g, PrimitiveT> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<KeyT> f37670a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<PrimitiveT> f37671b;

    /* compiled from: PrimitiveConstructor.java */
    class a extends l<KeyT, PrimitiveT> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f37672c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f37672c = bVar;
        }

        @Override // com.google.crypto.tink.internal.l
        public PrimitiveT a(KeyT keyt) {
            return (PrimitiveT) this.f37672c.a(keyt);
        }
    }

    /* compiled from: PrimitiveConstructor.java */
    public interface b<KeyT extends r8.g, PrimitiveT> {
        PrimitiveT a(KeyT keyt);
    }

    /* synthetic */ l(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static <KeyT extends r8.g, PrimitiveT> l<KeyT, PrimitiveT> b(b<KeyT, PrimitiveT> bVar, Class<KeyT> cls, Class<PrimitiveT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public abstract PrimitiveT a(KeyT keyt);

    public Class<KeyT> c() {
        return this.f37670a;
    }

    public Class<PrimitiveT> d() {
        return this.f37671b;
    }

    private l(Class<KeyT> cls, Class<PrimitiveT> cls2) {
        this.f37670a = cls;
        this.f37671b = cls2;
    }
}
