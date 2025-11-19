package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.q;
import r8.g;

/* compiled from: KeySerializer.java */
/* loaded from: classes2.dex */
public abstract class c<KeyT extends r8.g, SerializationT extends q> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<KeyT> f37643a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<SerializationT> f37644b;

    /* compiled from: KeySerializer.java */
    class a extends c<KeyT, SerializationT> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f37645c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f37645c = bVar;
        }
    }

    /* compiled from: KeySerializer.java */
    public interface b<KeyT extends r8.g, SerializationT extends q> {
    }

    /* synthetic */ c(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static <KeyT extends r8.g, SerializationT extends q> c<KeyT, SerializationT> a(b<KeyT, SerializationT> bVar, Class<KeyT> cls, Class<SerializationT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class<KeyT> b() {
        return this.f37643a;
    }

    public Class<SerializationT> c() {
        return this.f37644b;
    }

    private c(Class<KeyT> cls, Class<SerializationT> cls2) {
        this.f37643a = cls;
        this.f37644b = cls2;
    }
}
