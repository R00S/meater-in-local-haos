package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.x2 */
/* loaded from: classes2.dex */
final class C7614x2 implements InterfaceC7495d3 {

    /* renamed from: a */
    private InterfaceC7495d3[] f27934a;

    C7614x2(InterfaceC7495d3... interfaceC7495d3Arr) {
        this.f27934a = interfaceC7495d3Arr;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7495d3
    /* renamed from: a */
    public final boolean mo21041a(Class<?> cls) {
        for (InterfaceC7495d3 interfaceC7495d3 : this.f27934a) {
            if (interfaceC7495d3.mo21041a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7495d3
    /* renamed from: b */
    public final InterfaceC7501e3 mo21042b(Class<?> cls) {
        for (InterfaceC7495d3 interfaceC7495d3 : this.f27934a) {
            if (interfaceC7495d3.mo21041a(cls)) {
                return interfaceC7495d3.mo21042b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
