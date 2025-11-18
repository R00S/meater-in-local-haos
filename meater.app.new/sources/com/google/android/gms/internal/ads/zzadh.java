package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzadh {

    /* renamed from: a */
    private final Map<String, zzadg> f21929a = new HashMap();

    /* renamed from: b */
    private final zzadi f21930b;

    public zzadh(zzadi zzadiVar) {
        this.f21930b = zzadiVar;
    }

    /* renamed from: a */
    public final void m16445a(String str, zzadg zzadgVar) {
        this.f21929a.put(str, zzadgVar);
    }

    /* renamed from: b */
    public final void m16446b(String str, String str2, long j2) {
        zzadi zzadiVar = this.f21930b;
        zzadg zzadgVar = this.f21929a.get(str2);
        String[] strArr = {str};
        if (zzadiVar != null && zzadgVar != null) {
            zzadiVar.m16448a(zzadgVar, j2, strArr);
        }
        Map<String, zzadg> map = this.f21929a;
        zzadi zzadiVar2 = this.f21930b;
        map.put(str, zzadiVar2 == null ? null : zzadiVar2.m16450c(j2));
    }

    /* renamed from: c */
    public final zzadi m16447c() {
        return this.f21930b;
    }
}
