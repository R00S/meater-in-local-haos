package p241e.p307h.p308a.p309e0;

import p241e.p307h.p308a.p315k0.C9033c;

/* compiled from: DefaultConnectionCountAdapter.java */
/* renamed from: e.h.a.e0.a */
/* loaded from: classes2.dex */
public class C9000a implements C9033c.a {
    @Override // p241e.p307h.p308a.p315k0.C9033c.a
    /* renamed from: a */
    public int mo28717a(int i2, String str, String str2, long j2) {
        if (j2 < 1048576) {
            return 1;
        }
        if (j2 < 5242880) {
            return 2;
        }
        if (j2 < 52428800) {
            return 3;
        }
        return j2 < 104857600 ? 4 : 5;
    }
}
