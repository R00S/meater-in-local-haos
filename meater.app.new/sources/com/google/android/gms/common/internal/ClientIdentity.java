package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class ClientIdentity extends AbstractSafeParcelable {

    @KeepForSdk
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new zab();

    /* renamed from: f */
    @SafeParcelable.Field
    private final int f17699f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final String f17700g;

    @SafeParcelable.Constructor
    public ClientIdentity(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str) {
        this.f17699f = i2;
        this.f17700g = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ClientIdentity)) {
            ClientIdentity clientIdentity = (ClientIdentity) obj;
            if (clientIdentity.f17699f == this.f17699f && Objects.m14355a(clientIdentity.f17700g, this.f17700g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f17699f;
    }

    public String toString() {
        int i2 = this.f17699f;
        String str = this.f17700g;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i2);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f17699f);
        SafeParcelWriter.m14486u(parcel, 2, this.f17700g, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
