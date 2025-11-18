package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new zza();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f16872f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final long f16873g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final String f16874h;

    /* renamed from: i */
    @SafeParcelable.Field
    private final int f16875i;

    /* renamed from: j */
    @SafeParcelable.Field
    private final int f16876j;

    /* renamed from: k */
    @SafeParcelable.Field
    private final String f16877k;

    @SafeParcelable.Constructor
    AccountChangeEvent(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) int i4, @SafeParcelable.Param(id = 6) String str2) {
        this.f16872f = i2;
        this.f16873g = j2;
        this.f16874h = (String) Preconditions.m14372k(str);
        this.f16875i = i3;
        this.f16876j = i4;
        this.f16877k = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AccountChangeEvent) {
            AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
            if (this.f16872f == accountChangeEvent.f16872f && this.f16873g == accountChangeEvent.f16873g && Objects.m14355a(this.f16874h, accountChangeEvent.f16874h) && this.f16875i == accountChangeEvent.f16875i && this.f16876j == accountChangeEvent.f16876j && Objects.m14355a(this.f16877k, accountChangeEvent.f16877k)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.m14356b(Integer.valueOf(this.f16872f), Long.valueOf(this.f16873g), this.f16874h, Integer.valueOf(this.f16875i), Integer.valueOf(this.f16876j), this.f16877k);
    }

    public String toString() {
        int i2 = this.f16875i;
        String str = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        String str2 = this.f16874h;
        String str3 = this.f16877k;
        int i3 = this.f16876j;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 91 + str.length() + String.valueOf(str3).length());
        sb.append("AccountChangeEvent {accountName = ");
        sb.append(str2);
        sb.append(", changeType = ");
        sb.append(str);
        sb.append(", changeData = ");
        sb.append(str3);
        sb.append(", eventIndex = ");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f16872f);
        SafeParcelWriter.m14481p(parcel, 2, this.f16873g);
        SafeParcelWriter.m14486u(parcel, 3, this.f16874h, false);
        SafeParcelWriter.m14477l(parcel, 4, this.f16875i);
        SafeParcelWriter.m14477l(parcel, 5, this.f16876j);
        SafeParcelWriter.m14486u(parcel, 6, this.f16877k, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
