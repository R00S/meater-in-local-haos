package com.bumptech.glide.load.engine;

import java.io.File;
import m6.C3972g;
import m6.InterfaceC3969d;
import q6.InterfaceC4316a;

/* compiled from: DataCacheWriter.java */
/* loaded from: classes2.dex */
class e<DataType> implements InterfaceC4316a.b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3969d<DataType> f33092a;

    /* renamed from: b, reason: collision with root package name */
    private final DataType f33093b;

    /* renamed from: c, reason: collision with root package name */
    private final C3972g f33094c;

    e(InterfaceC3969d<DataType> interfaceC3969d, DataType datatype, C3972g c3972g) {
        this.f33092a = interfaceC3969d;
        this.f33093b = datatype;
        this.f33094c = c3972g;
    }

    @Override // q6.InterfaceC4316a.b
    public boolean a(File file) {
        return this.f33092a.a(this.f33093b, file, this.f33094c);
    }
}
