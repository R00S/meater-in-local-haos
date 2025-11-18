package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.n3 */
/* loaded from: classes2.dex */
final class RunnableC7771n3 implements Runnable {

    /* renamed from: f */
    private final InterfaceC7735j3 f28786f;

    /* renamed from: g */
    private final int f28787g;

    /* renamed from: h */
    private final Throwable f28788h;

    /* renamed from: i */
    private final byte[] f28789i;

    /* renamed from: j */
    private final String f28790j;

    /* renamed from: k */
    private final Map<String, List<String>> f28791k;

    private RunnableC7771n3(String str, InterfaceC7735j3 interfaceC7735j3, int i2, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        Preconditions.m14372k(interfaceC7735j3);
        this.f28786f = interfaceC7735j3;
        this.f28787g = i2;
        this.f28788h = th;
        this.f28789i = bArr;
        this.f28790j = str;
        this.f28791k = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28786f.mo22788a(this.f28790j, this.f28787g, this.f28788h, this.f28789i, this.f28791k);
    }
}
