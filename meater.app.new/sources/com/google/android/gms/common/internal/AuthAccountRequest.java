package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthAccountRequest> CREATOR = new zaa();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f17691f;

    /* renamed from: g */
    @SafeParcelable.Field
    @Deprecated
    private final IBinder f17692g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final Scope[] f17693h;

    /* renamed from: i */
    @SafeParcelable.Field
    private Integer f17694i;

    /* renamed from: j */
    @SafeParcelable.Field
    private Integer f17695j;

    /* renamed from: k */
    @SafeParcelable.Field
    private Account f17696k;

    @SafeParcelable.Constructor
    AuthAccountRequest(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) Scope[] scopeArr, @SafeParcelable.Param(id = 4) Integer num, @SafeParcelable.Param(id = 5) Integer num2, @SafeParcelable.Param(id = 6) Account account) {
        this.f17691f = i2;
        this.f17692g = iBinder;
        this.f17693h = scopeArr;
        this.f17694i = num;
        this.f17695j = num2;
        this.f17696k = account;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f17691f);
        SafeParcelWriter.m14476k(parcel, 2, this.f17692g, false);
        SafeParcelWriter.m14489x(parcel, 3, this.f17693h, i2, false);
        SafeParcelWriter.m14480o(parcel, 4, this.f17694i, false);
        SafeParcelWriter.m14480o(parcel, 5, this.f17695j, false);
        SafeParcelWriter.m14484s(parcel, 6, this.f17696k, i2, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
