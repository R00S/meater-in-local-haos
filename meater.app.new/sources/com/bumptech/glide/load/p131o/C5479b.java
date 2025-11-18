package com.bumptech.glide.load.p131o;

import android.content.Context;
import com.bumptech.glide.load.InterfaceC5429l;
import com.bumptech.glide.load.engine.InterfaceC5404u;
import java.security.MessageDigest;

/* compiled from: UnitTransformation.java */
/* renamed from: com.bumptech.glide.load.o.b */
/* loaded from: classes.dex */
public final class C5479b<T> implements InterfaceC5429l<T> {

    /* renamed from: b */
    private static final InterfaceC5429l<?> f13708b = new C5479b();

    private C5479b() {
    }

    /* renamed from: a */
    public static <T> C5479b<T> m10603a() {
        return (C5479b) f13708b;
    }

    @Override // com.bumptech.glide.load.InterfaceC5429l
    public InterfaceC5404u<T> transform(Context context, InterfaceC5404u<T> interfaceC5404u, int i2, int i3) {
        return interfaceC5404u;
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
    }
}
