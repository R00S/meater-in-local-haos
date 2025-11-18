package com.bumptech.glide.load.p131o.p132c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.InterfaceC5427j;
import com.bumptech.glide.load.engine.InterfaceC5404u;
import com.bumptech.glide.load.engine.p126z.InterfaceC5410b;
import com.bumptech.glide.load.engine.p126z.InterfaceC5413e;
import com.bumptech.glide.load.p131o.p132c.C5491l;
import com.bumptech.glide.p145r.C5590d;
import com.bumptech.glide.p145r.C5594h;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamBitmapDecoder.java */
/* renamed from: com.bumptech.glide.load.o.c.v */
/* loaded from: classes.dex */
public class C5501v implements InterfaceC5427j<InputStream, Bitmap> {

    /* renamed from: a */
    private final C5491l f13771a;

    /* renamed from: b */
    private final InterfaceC5410b f13772b;

    /* compiled from: StreamBitmapDecoder.java */
    /* renamed from: com.bumptech.glide.load.o.c.v$a */
    static class a implements C5491l.b {

        /* renamed from: a */
        private final C5498s f13773a;

        /* renamed from: b */
        private final C5590d f13774b;

        a(C5498s c5498s, C5590d c5590d) {
            this.f13773a = c5498s;
            this.f13774b = c5590d;
        }

        @Override // com.bumptech.glide.load.p131o.p132c.C5491l.b
        /* renamed from: a */
        public void mo10652a(InterfaceC5413e interfaceC5413e, Bitmap bitmap) throws IOException {
            IOException iOExceptionM11022a = this.f13774b.m11022a();
            if (iOExceptionM11022a != null) {
                if (bitmap == null) {
                    throw iOExceptionM11022a;
                }
                interfaceC5413e.mo10387c(bitmap);
                throw iOExceptionM11022a;
            }
        }

        @Override // com.bumptech.glide.load.p131o.p132c.C5491l.b
        /* renamed from: b */
        public void mo10653b() {
            this.f13773a.m10665b();
        }
    }

    public C5501v(C5491l c5491l, InterfaceC5410b interfaceC5410b) {
        this.f13771a = c5491l;
        this.f13772b = interfaceC5410b;
    }

    @Override // com.bumptech.glide.load.InterfaceC5427j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5404u<Bitmap> mo10453b(InputStream inputStream, int i2, int i3, C5426i c5426i) throws IOException {
        C5498s c5498s;
        boolean z;
        if (inputStream instanceof C5498s) {
            c5498s = (C5498s) inputStream;
            z = false;
        } else {
            c5498s = new C5498s(inputStream, this.f13772b);
            z = true;
        }
        C5590d c5590dM11021b = C5590d.m11021b(c5498s);
        try {
            return this.f13771a.m10649e(new C5594h(c5590dM11021b), i2, i3, c5426i, new a(c5498s, c5590dM11021b));
        } finally {
            c5590dM11021b.m11023c();
            if (z) {
                c5498s.m10666c();
            }
        }
    }

    @Override // com.bumptech.glide.load.InterfaceC5427j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10452a(InputStream inputStream, C5426i c5426i) {
        return this.f13771a.m10650m(inputStream);
    }
}
