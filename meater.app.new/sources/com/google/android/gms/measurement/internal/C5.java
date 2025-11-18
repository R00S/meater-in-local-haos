package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class C5 implements InterfaceC2794m2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f34780a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ M5 f34781b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C2880y5 f34782c;

    C5(C2880y5 c2880y5, String str, M5 m52) {
        this.f34780a = str;
        this.f34781b = m52;
        this.f34782c = c2880y5;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2794m2
    public final void a(String str, int i10, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.f34782c.G(this.f34780a, i10, th, bArr, this.f34781b);
    }
}
