package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountRequest> CREATOR = new zam();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f17775f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final Account f17776g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final int f17777h;

    /* renamed from: i */
    @SafeParcelable.Field
    private final GoogleSignInAccount f17778i;

    @SafeParcelable.Constructor
    ResolveAccountRequest(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) Account account, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) GoogleSignInAccount googleSignInAccount) {
        this.f17775f = i2;
        this.f17776g = account;
        this.f17777h = i3;
        this.f17778i = googleSignInAccount;
    }

    public Account getAccount() {
        return this.f17776g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f17775f);
        SafeParcelWriter.m14484s(parcel, 2, getAccount(), i2, false);
        SafeParcelWriter.m14477l(parcel, 3, m14378y());
        SafeParcelWriter.m14484s(parcel, 4, m14379z(), i2, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public int m14378y() {
        return this.f17777h;
    }

    /* renamed from: z */
    public GoogleSignInAccount m14379z() {
        return this.f17778i;
    }

    public ResolveAccountRequest(Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i2, googleSignInAccount);
    }
}
