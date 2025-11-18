package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2582t extends AbstractC2535n implements InterfaceC2527m {

    /* renamed from: D, reason: collision with root package name */
    private final List<String> f34310D;

    /* renamed from: E, reason: collision with root package name */
    private final List<InterfaceC2574s> f34311E;

    /* renamed from: F, reason: collision with root package name */
    private Z2 f34312F;

    private C2582t(C2582t c2582t) {
        super(c2582t.f34216B);
        ArrayList arrayList = new ArrayList(c2582t.f34310D.size());
        this.f34310D = arrayList;
        arrayList.addAll(c2582t.f34310D);
        ArrayList arrayList2 = new ArrayList(c2582t.f34311E.size());
        this.f34311E = arrayList2;
        arrayList2.addAll(c2582t.f34311E);
        this.f34312F = c2582t.f34312F;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2535n
    public final InterfaceC2574s a(Z2 z22, List<InterfaceC2574s> list) {
        Z2 z2D = this.f34312F.d();
        for (int i10 = 0; i10 < this.f34310D.size(); i10++) {
            if (i10 < list.size()) {
                z2D.e(this.f34310D.get(i10), z22.b(list.get(i10)));
            } else {
                z2D.e(this.f34310D.get(i10), InterfaceC2574s.f34292p);
            }
        }
        for (InterfaceC2574s interfaceC2574s : this.f34311E) {
            InterfaceC2574s interfaceC2574sB = z2D.b(interfaceC2574s);
            if (interfaceC2574sB instanceof C2598v) {
                interfaceC2574sB = z2D.b(interfaceC2574s);
            }
            if (interfaceC2574sB instanceof C2519l) {
                return ((C2519l) interfaceC2574sB).a();
            }
        }
        return InterfaceC2574s.f34292p;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2535n, com.google.android.gms.internal.measurement.InterfaceC2574s
    public final InterfaceC2574s d() {
        return new C2582t(this);
    }

    public C2582t(String str, List<InterfaceC2574s> list, List<InterfaceC2574s> list2, Z2 z22) {
        super(str);
        this.f34310D = new ArrayList();
        this.f34312F = z22;
        if (!list.isEmpty()) {
            Iterator<InterfaceC2574s> it = list.iterator();
            while (it.hasNext()) {
                this.f34310D.add(it.next().i());
            }
        }
        this.f34311E = new ArrayList(list2);
    }
}
