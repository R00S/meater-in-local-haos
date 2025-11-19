package com.google.android.gms.internal.measurement;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class A3 extends AbstractC2610w3<Boolean> {
    A3(F3 f32, String str, Boolean bool, boolean z10) {
        super(f32, str, bool);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2610w3
    final /* synthetic */ Boolean g(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (V2.f33907c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (V2.f33908d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.k() + ": " + String.valueOf(obj));
        return null;
    }
}
