package com.google.crypto.tink.internal;

import com.google.crypto.tink.shaded.protobuf.P;

/* compiled from: PrimitiveFactory.java */
/* loaded from: classes2.dex */
public abstract class m<PrimitiveT, KeyProtoT extends P> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<PrimitiveT> f37673a;

    public m(Class<PrimitiveT> cls) {
        this.f37673a = cls;
    }

    public abstract PrimitiveT a(KeyProtoT keyprotot);

    final Class<PrimitiveT> b() {
        return this.f37673a;
    }
}
