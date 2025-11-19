package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.q;
import r8.u;

/* compiled from: ParametersSerializer.java */
/* loaded from: classes2.dex */
public abstract class k<ParametersT extends u, SerializationT extends q> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<ParametersT> f37667a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<SerializationT> f37668b;

    /* compiled from: ParametersSerializer.java */
    class a extends k<ParametersT, SerializationT> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f37669c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f37669c = bVar;
        }
    }

    /* compiled from: ParametersSerializer.java */
    public interface b<ParametersT extends u, SerializationT extends q> {
    }

    /* synthetic */ k(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static <ParametersT extends u, SerializationT extends q> k<ParametersT, SerializationT> a(b<ParametersT, SerializationT> bVar, Class<ParametersT> cls, Class<SerializationT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class<ParametersT> b() {
        return this.f37667a;
    }

    public Class<SerializationT> c() {
        return this.f37668b;
    }

    private k(Class<ParametersT> cls, Class<SerializationT> cls2) {
        this.f37667a = cls;
        this.f37668b = cls2;
    }
}
