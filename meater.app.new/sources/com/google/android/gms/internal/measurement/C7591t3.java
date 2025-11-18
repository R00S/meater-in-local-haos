package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.t3 */
/* loaded from: classes2.dex */
final class C7591t3<FieldDescriptorType> extends C7597u3<FieldDescriptorType, Object> {
    C7591t3(int i2) {
        super(i2, null);
    }

    @Override // com.google.android.gms.internal.measurement.C7597u3
    /* renamed from: e */
    public final void mo21407e() {
        if (!m21430j()) {
            for (int i2 = 0; i2 < m21431k(); i2++) {
                Map.Entry<FieldDescriptorType, Object> entryM21429i = m21429i(i2);
                if (((zzey) entryM21429i.getKey()).mo22253d()) {
                    entryM21429i.setValue(Collections.unmodifiableList((List) entryM21429i.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : m21432n()) {
                if (((zzey) entry.getKey()).mo22253d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo21407e();
    }
}
