package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.o;
import java.io.IOException;
import java.io.InputStream;
import m6.C3972g;
import m6.InterfaceC3974i;
import o6.InterfaceC4139c;
import p6.InterfaceC4237b;
import p6.InterfaceC4239d;

/* compiled from: StreamBitmapDecoder.java */
/* loaded from: classes2.dex */
public class A implements InterfaceC3974i<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final o f33288a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4237b f33289b;

    /* compiled from: StreamBitmapDecoder.java */
    static class a implements o.b {

        /* renamed from: a, reason: collision with root package name */
        private final y f33290a;

        /* renamed from: b, reason: collision with root package name */
        private final H6.d f33291b;

        a(y yVar, H6.d dVar) {
            this.f33290a = yVar;
            this.f33291b = dVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.b
        public void a(InterfaceC4239d interfaceC4239d, Bitmap bitmap) throws IOException {
            IOException iOExceptionA = this.f33291b.a();
            if (iOExceptionA != null) {
                if (bitmap == null) {
                    throw iOExceptionA;
                }
                interfaceC4239d.c(bitmap);
                throw iOExceptionA;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.b
        public void b() {
            this.f33290a.b();
        }
    }

    public A(o oVar, InterfaceC4237b interfaceC4237b) {
        this.f33288a = oVar;
        this.f33289b = interfaceC4237b;
    }

    @Override // m6.InterfaceC3974i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4139c<Bitmap> a(InputStream inputStream, int i10, int i11, C3972g c3972g) {
        boolean z10;
        y yVar;
        if (inputStream instanceof y) {
            yVar = (y) inputStream;
            z10 = false;
        } else {
            z10 = true;
            yVar = new y(inputStream, this.f33289b);
        }
        H6.d dVarB = H6.d.b(yVar);
        try {
            return this.f33288a.f(new H6.i(dVarB), i10, i11, c3972g, new a(yVar, dVarB));
        } finally {
            dVarB.c();
            if (z10) {
                yVar.c();
            }
        }
    }

    @Override // m6.InterfaceC3974i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(InputStream inputStream, C3972g c3972g) {
        return this.f33288a.p(inputStream);
    }
}
