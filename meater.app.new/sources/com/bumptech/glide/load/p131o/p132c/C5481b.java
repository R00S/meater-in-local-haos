package com.bumptech.glide.load.p131o.p132c;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.EnumC5367c;
import com.bumptech.glide.load.InterfaceC5428k;
import com.bumptech.glide.load.engine.InterfaceC5404u;
import com.bumptech.glide.load.engine.p126z.InterfaceC5413e;
import java.io.File;

/* compiled from: BitmapDrawableEncoder.java */
/* renamed from: com.bumptech.glide.load.o.c.b */
/* loaded from: classes.dex */
public class C5481b implements InterfaceC5428k<BitmapDrawable> {

    /* renamed from: a */
    private final InterfaceC5413e f13711a;

    /* renamed from: b */
    private final InterfaceC5428k<Bitmap> f13712b;

    public C5481b(InterfaceC5413e interfaceC5413e, InterfaceC5428k<Bitmap> interfaceC5428k) {
        this.f13711a = interfaceC5413e;
        this.f13712b = interfaceC5428k;
    }

    @Override // com.bumptech.glide.load.InterfaceC5428k
    /* renamed from: b */
    public EnumC5367c mo10454b(C5426i c5426i) {
        return this.f13712b.mo10454b(c5426i);
    }

    @Override // com.bumptech.glide.load.InterfaceC5368d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo10155a(InterfaceC5404u<BitmapDrawable> interfaceC5404u, File file, C5426i c5426i) {
        return this.f13712b.mo10155a(new C5483d(interfaceC5404u.get().getBitmap(), this.f13711a), file, c5426i);
    }
}
