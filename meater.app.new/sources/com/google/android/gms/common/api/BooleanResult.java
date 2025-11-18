package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes2.dex */
public class BooleanResult implements Result {

    /* renamed from: f */
    private final Status f17246f;

    /* renamed from: g */
    private final boolean f17247g;

    @KeepForSdk
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BooleanResult)) {
            return false;
        }
        BooleanResult booleanResult = (BooleanResult) obj;
        return this.f17246f.equals(booleanResult.f17246f) && this.f17247g == booleanResult.f17247g;
    }

    @Override // com.google.android.gms.common.api.Result
    @KeepForSdk
    public Status getStatus() {
        return this.f17246f;
    }

    @KeepForSdk
    public final int hashCode() {
        return ((this.f17246f.hashCode() + 527) * 31) + (this.f17247g ? 1 : 0);
    }
}
