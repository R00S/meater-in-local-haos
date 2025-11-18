package com.google.android.gms.common.server.response;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.VisibleForTesting;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @KeepForSdk
    public FastSafeParcelableJsonResponse() {
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @VisibleForTesting
    /* renamed from: c */
    public Object mo14552c(String str) {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @VisibleForTesting
    /* renamed from: e */
    public boolean mo14553e(String str) {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field<?, ?> field : mo13610a().values()) {
            if (mo13612d(field)) {
                if (!fastJsonResponse.mo13612d(field) || !mo13611b(field).equals(fastJsonResponse.mo13611b(field))) {
                    return false;
                }
            } else if (fastJsonResponse.mo13612d(field)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = 0;
        for (FastJsonResponse.Field<?, ?> field : mo13610a().values()) {
            if (mo13612d(field)) {
                iHashCode = (iHashCode * 31) + mo13611b(field).hashCode();
            }
        }
        return iHashCode;
    }
}
