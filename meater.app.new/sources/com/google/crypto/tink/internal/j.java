package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.q;

/* compiled from: ParametersParser.java */
/* loaded from: classes2.dex */
public abstract class j<SerializationT extends q> {

    /* renamed from: a, reason: collision with root package name */
    private final F8.a f37664a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<SerializationT> f37665b;

    /* compiled from: ParametersParser.java */
    class a extends j<SerializationT> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f37666c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(F8.a aVar, Class cls, b bVar) {
            super(aVar, cls, null);
            this.f37666c = bVar;
        }
    }

    /* compiled from: ParametersParser.java */
    public interface b<SerializationT extends q> {
    }

    /* synthetic */ j(F8.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public static <SerializationT extends q> j<SerializationT> a(b<SerializationT> bVar, F8.a aVar, Class<SerializationT> cls) {
        return new a(aVar, cls, bVar);
    }

    public final F8.a b() {
        return this.f37664a;
    }

    public final Class<SerializationT> c() {
        return this.f37665b;
    }

    private j(F8.a aVar, Class<SerializationT> cls) {
        this.f37664a = aVar;
        this.f37665b = cls;
    }
}
