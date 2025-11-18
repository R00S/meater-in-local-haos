package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* renamed from: com.google.android.gms.internal.ads.pw */
/* loaded from: classes2.dex */
final class C7058pw<FieldDescriptorType> extends C7021ow<FieldDescriptorType, Object> {
    C7058pw(int i2) {
        super(i2, null);
    }

    @Override // com.google.android.gms.internal.ads.C7021ow
    /* renamed from: f */
    public final void mo15706f() {
        if (!m15704a()) {
            for (int i2 = 0; i2 < m15707h(); i2++) {
                Map.Entry<FieldDescriptorType, Object> entryM15710q = m15710q(i2);
                if (((zzdnu) entryM15710q.getKey()).m19710t()) {
                    entryM15710q.setValue(Collections.unmodifiableList((List) entryM15710q.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : m15708i()) {
                if (((zzdnu) entry.getKey()).m19710t()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo15706f();
    }
}
