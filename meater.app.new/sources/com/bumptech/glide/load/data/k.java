package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.resource.bitmap.y;
import java.io.InputStream;
import p6.InterfaceC4237b;

/* compiled from: InputStreamRewinder.java */
/* loaded from: classes2.dex */
public final class k implements e<InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final y f33054a;

    /* compiled from: InputStreamRewinder.java */
    public static final class a implements e.a<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC4237b f33055a;

        public a(InterfaceC4237b interfaceC4237b) {
            this.f33055a = interfaceC4237b;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e<InputStream> build(InputStream inputStream) {
            return new k(inputStream, this.f33055a);
        }
    }

    public k(InputStream inputStream, InterfaceC4237b interfaceC4237b) {
        y yVar = new y(inputStream, interfaceC4237b);
        this.f33054a = yVar;
        yVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
        this.f33054a.c();
    }

    public void c() {
        this.f33054a.b();
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream a() {
        this.f33054a.reset();
        return this.f33054a;
    }
}
