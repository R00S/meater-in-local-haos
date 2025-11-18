package com.bumptech.glide.load.p131o.p132c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.InterfaceC5427j;
import com.bumptech.glide.load.engine.InterfaceC5404u;
import com.bumptech.glide.p145r.C5596j;
import java.io.IOException;

/* compiled from: BitmapDrawableDecoder.java */
/* renamed from: com.bumptech.glide.load.o.c.a */
/* loaded from: classes.dex */
public class C5480a<DataType> implements InterfaceC5427j<DataType, BitmapDrawable> {

    /* renamed from: a */
    private final InterfaceC5427j<DataType, Bitmap> f13709a;

    /* renamed from: b */
    private final Resources f13710b;

    public C5480a(Resources resources, InterfaceC5427j<DataType, Bitmap> interfaceC5427j) {
        this.f13710b = (Resources) C5596j.m11042d(resources);
        this.f13709a = (InterfaceC5427j) C5596j.m11042d(interfaceC5427j);
    }

    @Override // com.bumptech.glide.load.InterfaceC5427j
    /* renamed from: a */
    public boolean mo10452a(DataType datatype, C5426i c5426i) throws IOException {
        return this.f13709a.mo10452a(datatype, c5426i);
    }

    @Override // com.bumptech.glide.load.InterfaceC5427j
    /* renamed from: b */
    public InterfaceC5404u<BitmapDrawable> mo10453b(DataType datatype, int i2, int i3, C5426i c5426i) throws IOException {
        return C5497r.m10661f(this.f13710b, this.f13709a.mo10453b(datatype, i2, i3, c5426i));
    }
}
