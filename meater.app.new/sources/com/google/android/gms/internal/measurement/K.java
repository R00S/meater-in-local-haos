package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class K implements Comparator<InterfaceC2574s> {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ AbstractC2535n f33797B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ Z2 f33798C;

    K(AbstractC2535n abstractC2535n, Z2 z22) {
        this.f33797B = abstractC2535n;
        this.f33798C = z22;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(InterfaceC2574s interfaceC2574s, InterfaceC2574s interfaceC2574s2) {
        InterfaceC2574s interfaceC2574s3 = interfaceC2574s;
        InterfaceC2574s interfaceC2574s4 = interfaceC2574s2;
        AbstractC2535n abstractC2535n = this.f33797B;
        Z2 z22 = this.f33798C;
        if (interfaceC2574s3 instanceof C2630z) {
            return !(interfaceC2574s4 instanceof C2630z) ? 1 : 0;
        }
        if (interfaceC2574s4 instanceof C2630z) {
            return -1;
        }
        return abstractC2535n == null ? interfaceC2574s3.i().compareTo(interfaceC2574s4.i()) : (int) Y1.a(abstractC2535n.a(z22, Arrays.asList(interfaceC2574s3, interfaceC2574s4)).h().doubleValue());
    }
}
