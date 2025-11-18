package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@zzard
/* loaded from: classes2.dex */
public final class zzazh {

    /* renamed from: a */
    private Map<Integer, Bitmap> f22710a = new ConcurrentHashMap();

    /* renamed from: b */
    private AtomicInteger f22711b = new AtomicInteger(0);

    /* renamed from: a */
    public final Bitmap m17277a(Integer num) {
        return this.f22710a.get(num);
    }
}
