package com.google.android.gms.internal.measurement;

import java.io.File;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2544o0 implements InterfaceC2528m0 {
    C2544o0() {
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2528m0
    public final /* synthetic */ String a(String str, AbstractC2567r0 abstractC2567r0) {
        return e(str, abstractC2567r0, EnumC2552p0.RAW_FILE_IO_TYPE);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2528m0
    public final /* synthetic */ String b(File file, String str, AbstractC2567r0 abstractC2567r0) {
        return a(new File(file, str).getPath(), abstractC2567r0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2528m0
    public final /* synthetic */ String c(String str) {
        return a(str, AbstractC2567r0.f34281a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2528m0
    public final /* synthetic */ String d(File file, String str) {
        return b(file, str, AbstractC2567r0.f34281a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2528m0
    public final /* synthetic */ String e(String str, AbstractC2567r0 abstractC2567r0, EnumC2552p0 enumC2552p0) {
        return C2520l0.a(this, str, abstractC2567r0, enumC2552p0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2528m0
    public final String f(String str, AbstractC2567r0 abstractC2567r0, EnumC2552p0 enumC2552p0) {
        return str;
    }
}
