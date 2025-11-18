package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new zzb();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f16878f;

    /* renamed from: g */
    @SafeParcelable.Field
    private int f16879g;

    /* renamed from: h */
    @SafeParcelable.Field
    @Deprecated
    private String f16880h;

    /* renamed from: i */
    @SafeParcelable.Field
    private Account f16881i;

    @SafeParcelable.Constructor
    AccountChangeEventsRequest(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) Account account) {
        this.f16878f = i2;
        this.f16879g = i3;
        this.f16880h = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f16881i = account;
        } else {
            this.f16881i = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f16878f);
        SafeParcelWriter.m14477l(parcel, 2, this.f16879g);
        SafeParcelWriter.m14486u(parcel, 3, this.f16880h, false);
        SafeParcelWriter.m14484s(parcel, 4, this.f16881i, i2, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    public AccountChangeEventsRequest() {
        this.f16878f = 1;
    }
}
