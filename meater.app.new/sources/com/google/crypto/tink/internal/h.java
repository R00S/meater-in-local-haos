package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.n;
import java.util.concurrent.atomic.AtomicReference;
import r8.v;
import r8.w;

/* compiled from: MutablePrimitiveRegistry.java */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    private static h f37660b = new h();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<n> f37661a = new AtomicReference<>(new n.b().c());

    h() {
    }

    public static h c() {
        return f37660b;
    }

    public <WrapperPrimitiveT> Class<?> a(Class<WrapperPrimitiveT> cls) {
        return this.f37661a.get().c(cls);
    }

    public <KeyT extends r8.g, PrimitiveT> PrimitiveT b(KeyT keyt, Class<PrimitiveT> cls) {
        return (PrimitiveT) this.f37661a.get().d(keyt, cls);
    }

    public synchronized <KeyT extends r8.g, PrimitiveT> void d(l<KeyT, PrimitiveT> lVar) {
        this.f37661a.set(new n.b(this.f37661a.get()).d(lVar).c());
    }

    public synchronized <InputPrimitiveT, WrapperPrimitiveT> void e(w<InputPrimitiveT, WrapperPrimitiveT> wVar) {
        this.f37661a.set(new n.b(this.f37661a.get()).e(wVar).c());
    }

    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT f(v<InputPrimitiveT> vVar, Class<WrapperPrimitiveT> cls) {
        return (WrapperPrimitiveT) this.f37661a.get().e(vVar, cls);
    }
}
