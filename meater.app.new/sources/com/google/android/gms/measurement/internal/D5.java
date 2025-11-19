package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class D5 implements InterfaceC2794m2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f34795a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ List f34796b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C2880y5 f34797c;

    D5(C2880y5 c2880y5, String str, List list) {
        this.f34795a = str;
        this.f34796b = list;
        this.f34797c = c2880y5;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2794m2
    public final void a(String str, int i10, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.f34797c.S(true, i10, th, bArr, this.f34795a, this.f34796b);
    }
}
