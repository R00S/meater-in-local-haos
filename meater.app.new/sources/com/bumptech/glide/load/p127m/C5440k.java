package com.bumptech.glide.load.p127m;

import com.bumptech.glide.load.engine.p126z.InterfaceC5410b;
import com.bumptech.glide.load.p127m.InterfaceC5434e;
import com.bumptech.glide.load.p131o.p132c.C5498s;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: InputStreamRewinder.java */
/* renamed from: com.bumptech.glide.load.m.k */
/* loaded from: classes.dex */
public final class C5440k implements InterfaceC5434e<InputStream> {

    /* renamed from: a */
    private final C5498s f13585a;

    /* compiled from: InputStreamRewinder.java */
    /* renamed from: com.bumptech.glide.load.m.k$a */
    public static final class a implements InterfaceC5434e.a<InputStream> {

        /* renamed from: a */
        private final InterfaceC5410b f13586a;

        public a(InterfaceC5410b interfaceC5410b) {
            this.f13586a = interfaceC5410b;
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5434e.a
        /* renamed from: a */
        public Class<InputStream> mo10470a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5434e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC5434e<InputStream> mo10471b(InputStream inputStream) {
            return new C5440k(inputStream, this.f13586a);
        }
    }

    C5440k(InputStream inputStream, InterfaceC5410b interfaceC5410b) {
        C5498s c5498s = new C5498s(inputStream, interfaceC5410b);
        this.f13585a = c5498s;
        c5498s.mark(5242880);
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5434e
    /* renamed from: b */
    public void mo10469b() {
        this.f13585a.m10666c();
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5434e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InputStream mo10468a() throws IOException {
        this.f13585a.reset();
        return this.f13585a;
    }
}
