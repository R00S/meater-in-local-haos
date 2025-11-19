package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.b4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2441b4 implements Comparator<Y3> {
    C2441b4() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Y3 y32, Y3 y33) {
        Y3 y34 = y32;
        Y3 y35 = y33;
        InterfaceC2476f4 interfaceC2476f4 = (InterfaceC2476f4) y34.iterator();
        InterfaceC2476f4 interfaceC2476f42 = (InterfaceC2476f4) y35.iterator();
        while (interfaceC2476f4.hasNext() && interfaceC2476f42.hasNext()) {
            int iCompare = Integer.compare(Y3.h(interfaceC2476f4.a()), Y3.h(interfaceC2476f42.a()));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Integer.compare(y34.z(), y35.z());
    }
}
