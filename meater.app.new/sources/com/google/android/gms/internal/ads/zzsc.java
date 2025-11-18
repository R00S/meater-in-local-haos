package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzsc extends zzsb {

    /* renamed from: h */
    private final int f26982h;

    /* renamed from: i */
    private final Map<String, List<String>> f26983i;

    public zzsc(int i2, Map<String, List<String>> map, zzry zzryVar) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("Response code: ");
        sb.append(i2);
        super(sb.toString(), zzryVar, 1);
        this.f26982h = i2;
        this.f26983i = map;
    }
}
