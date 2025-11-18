package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzjy extends zzjx {

    /* renamed from: g */
    private final int f26409g;

    /* renamed from: h */
    private final Map<String, List<String>> f26410h;

    public zzjy(int i2, Map<String, List<String>> map, zzjq zzjqVar) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("Response code: ");
        sb.append(i2);
        super(sb.toString(), zzjqVar);
        this.f26409g = i2;
        this.f26410h = map;
    }
}
