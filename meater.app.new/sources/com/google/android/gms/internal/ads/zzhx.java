package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class zzhx extends zzhw {

    /* renamed from: b */
    private final Map<UUID, byte[]> f26246b;

    public zzhx(String str) {
        super(str);
        this.f26246b = new HashMap();
    }

    /* renamed from: a */
    public final void m20054a(Map<UUID, byte[]> map) {
        this.f26246b.putAll(map);
    }
}
