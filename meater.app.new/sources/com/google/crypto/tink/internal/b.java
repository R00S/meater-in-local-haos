package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.q;
import r8.y;

/* compiled from: KeyParser.java */
/* loaded from: classes2.dex */
public abstract class b<SerializationT extends q> {

    /* renamed from: a, reason: collision with root package name */
    private final F8.a f37640a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<SerializationT> f37641b;

    /* compiled from: KeyParser.java */
    class a extends b<SerializationT> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC0483b f37642c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(F8.a aVar, Class cls, InterfaceC0483b interfaceC0483b) {
            super(aVar, cls, null);
            this.f37642c = interfaceC0483b;
        }

        @Override // com.google.crypto.tink.internal.b
        public r8.g d(SerializationT serializationt, y yVar) {
            return this.f37642c.a(serializationt, yVar);
        }
    }

    /* compiled from: KeyParser.java */
    /* renamed from: com.google.crypto.tink.internal.b$b, reason: collision with other inner class name */
    public interface InterfaceC0483b<SerializationT extends q> {
        r8.g a(SerializationT serializationt, y yVar);
    }

    /* synthetic */ b(F8.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public static <SerializationT extends q> b<SerializationT> a(InterfaceC0483b<SerializationT> interfaceC0483b, F8.a aVar, Class<SerializationT> cls) {
        return new a(aVar, cls, interfaceC0483b);
    }

    public final F8.a b() {
        return this.f37640a;
    }

    public final Class<SerializationT> c() {
        return this.f37641b;
    }

    public abstract r8.g d(SerializationT serializationt, y yVar);

    private b(F8.a aVar, Class<SerializationT> cls) {
        this.f37640a = aVar;
        this.f37641b = cls;
    }
}
