package com.bumptech.glide.load.p131o.p132c;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.InterfaceC5427j;
import com.bumptech.glide.load.engine.InterfaceC5404u;
import com.bumptech.glide.load.engine.p126z.InterfaceC5413e;
import com.bumptech.glide.load.p131o.p134e.C5511e;

/* compiled from: ResourceBitmapDecoder.java */
/* renamed from: com.bumptech.glide.load.o.c.t */
/* loaded from: classes.dex */
public class C5499t implements InterfaceC5427j<Uri, Bitmap> {

    /* renamed from: a */
    private final C5511e f13767a;

    /* renamed from: b */
    private final InterfaceC5413e f13768b;

    public C5499t(C5511e c5511e, InterfaceC5413e interfaceC5413e) {
        this.f13767a = c5511e;
        this.f13768b = interfaceC5413e;
    }

    @Override // com.bumptech.glide.load.InterfaceC5427j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5404u<Bitmap> mo10453b(Uri uri, int i2, int i3, C5426i c5426i) {
        InterfaceC5404u<Drawable> interfaceC5404uMo10453b = this.f13767a.mo10453b(uri, i2, i3, c5426i);
        if (interfaceC5404uMo10453b == null) {
            return null;
        }
        return C5492m.m10654a(this.f13768b, interfaceC5404uMo10453b.get(), i2, i3);
    }

    @Override // com.bumptech.glide.load.InterfaceC5427j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10452a(Uri uri, C5426i c5426i) {
        return "android.resource".equals(uri.getScheme());
    }
}
