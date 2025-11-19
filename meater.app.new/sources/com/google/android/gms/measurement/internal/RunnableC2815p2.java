package com.google.android.gms.measurement.internal;

import g7.C3445p;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.p2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2815p2 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final InterfaceC2794m2 f35504B;

    /* renamed from: C, reason: collision with root package name */
    private final int f35505C;

    /* renamed from: D, reason: collision with root package name */
    private final Throwable f35506D;

    /* renamed from: E, reason: collision with root package name */
    private final byte[] f35507E;

    /* renamed from: F, reason: collision with root package name */
    private final String f35508F;

    /* renamed from: G, reason: collision with root package name */
    private final Map<String, List<String>> f35509G;

    @Override // java.lang.Runnable
    public final void run() {
        this.f35504B.a(this.f35508F, this.f35505C, this.f35506D, this.f35507E, this.f35509G);
    }

    private RunnableC2815p2(String str, InterfaceC2794m2 interfaceC2794m2, int i10, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        C3445p.k(interfaceC2794m2);
        this.f35504B = interfaceC2794m2;
        this.f35505C = i10;
        this.f35506D = th;
        this.f35507E = bArr;
        this.f35508F = str;
        this.f35509G = map;
    }
}
