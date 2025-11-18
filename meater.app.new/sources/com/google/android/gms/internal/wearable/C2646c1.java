package com.google.android.gms.internal.wearable;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.c1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2646c1 extends C2661h1 {
    C2646c1() {
        super(null);
    }

    @Override // com.google.android.gms.internal.wearable.C2661h1
    public final void a() {
        if (!l()) {
            for (int i10 = 0; i10 < c(); i10++) {
                Map.Entry entryI = i(i10);
                if (((InterfaceC2648d0) ((C2649d1) entryI).c()).h()) {
                    entryI.setValue(Collections.unmodifiableList((List) entryI.getValue()));
                }
            }
            for (Map.Entry entry : d()) {
                if (((InterfaceC2648d0) entry.getKey()).h()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
