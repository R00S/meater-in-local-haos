package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.d5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2460d5 implements InterfaceC2525l5 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC2525l5[] f34074a;

    C2460d5(InterfaceC2525l5... interfaceC2525l5Arr) {
        this.f34074a = interfaceC2525l5Arr;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2525l5
    public final InterfaceC2501i5 a(Class<?> cls) {
        for (InterfaceC2525l5 interfaceC2525l5 : this.f34074a) {
            if (interfaceC2525l5.b(cls)) {
                return interfaceC2525l5.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2525l5
    public final boolean b(Class<?> cls) {
        for (InterfaceC2525l5 interfaceC2525l5 : this.f34074a) {
            if (interfaceC2525l5.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
