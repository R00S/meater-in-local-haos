package com.liulishuo.filedownloader.services;

import p241e.p307h.p308a.p315k0.C9033c;
import p241e.p307h.p308a.p315k0.C9036f;

/* compiled from: DefaultIdGenerator.java */
/* renamed from: com.liulishuo.filedownloader.services.b */
/* loaded from: classes2.dex */
public class C8702b implements C9033c.d {
    @Override // p241e.p307h.p308a.p315k0.C9033c.d
    /* renamed from: a */
    public int mo27612a(String str, String str2, boolean z) {
        return z ? C9036f.m28988O(C9036f.m29009o("%sp%s@dir", str, str2)).hashCode() : C9036f.m28988O(C9036f.m29009o("%sp%s", str, str2)).hashCode();
    }

    @Override // p241e.p307h.p308a.p315k0.C9033c.d
    /* renamed from: b */
    public int mo27613b(int i2, String str, String str2, boolean z) {
        return mo27612a(str, str2, z);
    }
}
