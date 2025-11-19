package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.r;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import r8.u;
import r8.y;

/* compiled from: MutableSerializationRegistry.java */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    private static final i f37662b = new i();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<r> f37663a = new AtomicReference<>(new r.b().e());

    public static i a() {
        return f37662b;
    }

    public <SerializationT extends q> boolean b(SerializationT serializationt) {
        return this.f37663a.get().e(serializationt);
    }

    public <SerializationT extends q> r8.g c(SerializationT serializationt, y yVar) {
        return this.f37663a.get().f(serializationt, yVar);
    }

    public r8.g d(o oVar, y yVar) {
        if (yVar == null) {
            throw new NullPointerException("access cannot be null");
        }
        if (b(oVar)) {
            return c(oVar, yVar);
        }
        try {
            return new e(oVar, yVar);
        } catch (GeneralSecurityException e10) {
            throw new TinkBugException("Creating a LegacyProtoKey failed", e10);
        }
    }

    public synchronized <SerializationT extends q> void e(b<SerializationT> bVar) {
        this.f37663a.set(new r.b(this.f37663a.get()).f(bVar).e());
    }

    public synchronized <KeyT extends r8.g, SerializationT extends q> void f(c<KeyT, SerializationT> cVar) {
        this.f37663a.set(new r.b(this.f37663a.get()).g(cVar).e());
    }

    public synchronized <SerializationT extends q> void g(j<SerializationT> jVar) {
        this.f37663a.set(new r.b(this.f37663a.get()).h(jVar).e());
    }

    public synchronized <ParametersT extends u, SerializationT extends q> void h(k<ParametersT, SerializationT> kVar) {
        this.f37663a.set(new r.b(this.f37663a.get()).i(kVar).e());
    }
}
