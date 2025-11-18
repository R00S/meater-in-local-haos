package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new zzd();

    /* renamed from: f */
    @SafeParcelable.Field
    @Deprecated
    private String f17068f;

    /* renamed from: g */
    @SafeParcelable.Field
    private GoogleSignInAccount f17069g;

    /* renamed from: h */
    @SafeParcelable.Field
    @Deprecated
    private String f17070h;

    @SafeParcelable.Constructor
    SignInAccount(@SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 7) GoogleSignInAccount googleSignInAccount, @SafeParcelable.Param(id = 8) String str2) {
        this.f17069g = googleSignInAccount;
        this.f17068f = Preconditions.m14369h(str, "8.3 and 8.4 SDKs require non-null email");
        this.f17070h = Preconditions.m14369h(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 4, this.f17068f, false);
        SafeParcelWriter.m14484s(parcel, 7, this.f17069g, i2, false);
        SafeParcelWriter.m14486u(parcel, 8, this.f17070h, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: x */
    public final GoogleSignInAccount m13695x() {
        return this.f17069g;
    }
}
