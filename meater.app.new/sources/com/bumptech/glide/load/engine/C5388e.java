package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.InterfaceC5368d;
import com.bumptech.glide.load.engine.p123a0.InterfaceC5372a;
import java.io.File;

/* compiled from: DataCacheWriter.java */
/* renamed from: com.bumptech.glide.load.engine.e */
/* loaded from: classes.dex */
class C5388e<DataType> implements InterfaceC5372a.b {

    /* renamed from: a */
    private final InterfaceC5368d<DataType> f13315a;

    /* renamed from: b */
    private final DataType f13316b;

    /* renamed from: c */
    private final C5426i f13317c;

    C5388e(InterfaceC5368d<DataType> interfaceC5368d, DataType datatype, C5426i c5426i) {
        this.f13315a = interfaceC5368d;
        this.f13316b = datatype;
        this.f13317c = c5426i;
    }

    @Override // com.bumptech.glide.load.engine.p123a0.InterfaceC5372a.b
    /* renamed from: a */
    public boolean mo10182a(File file) {
        return this.f13315a.mo10155a(this.f13316b, file, this.f13317c);
    }
}
