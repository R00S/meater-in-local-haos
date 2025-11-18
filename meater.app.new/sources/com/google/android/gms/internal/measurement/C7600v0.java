package com.google.android.gms.internal.measurement;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.v0 */
/* loaded from: classes2.dex */
final class C7600v0 extends zzcl<Boolean> {
    C7600v0(zzcr zzcrVar, String str, Boolean bool) {
        super(zzcrVar, str, bool, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcl
    /* renamed from: e */
    final /* synthetic */ Boolean mo21393e(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzbw.f27983c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (zzbw.f27984d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String strM22116m = super.m22116m();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(strM22116m).length() + 28 + strValueOf.length());
        sb.append("Invalid boolean value for ");
        sb.append(strM22116m);
        sb.append(": ");
        sb.append(strValueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
