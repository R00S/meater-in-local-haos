package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class F5 extends G5 {
    F5() {
        super();
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void h() {
        if (!p()) {
            for (int i10 = 0; i10 < i(); i10++) {
                Map.Entry entryG = g(i10);
                if (((InterfaceC2611w4) entryG.getKey()).h()) {
                    entryG.setValue(Collections.unmodifiableList((List) entryG.getValue()));
                }
            }
            for (Map.Entry entry : l()) {
                if (((InterfaceC2611w4) entry.getKey()).h()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.h();
    }
}
