package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountResponse> CREATOR = new zan();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f17779f;

    /* renamed from: g */
    @SafeParcelable.Field
    private IBinder f17780g;

    /* renamed from: h */
    @SafeParcelable.Field
    private ConnectionResult f17781h;

    /* renamed from: i */
    @SafeParcelable.Field
    private boolean f17782i;

    /* renamed from: j */
    @SafeParcelable.Field
    private boolean f17783j;

    @SafeParcelable.Constructor
    ResolveAccountResponse(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) ConnectionResult connectionResult, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2) {
        this.f17779f = i2;
        this.f17780g = iBinder;
        this.f17781h = connectionResult;
        this.f17782i = z;
        this.f17783j = z2;
    }

    /* renamed from: W */
    public boolean m14380W() {
        return this.f17782i;
    }

    /* renamed from: Y */
    public boolean m14381Y() {
        return this.f17783j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.f17781h.equals(resolveAccountResponse.f17781h) && m14382y().equals(resolveAccountResponse.m14382y());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f17779f);
        SafeParcelWriter.m14476k(parcel, 2, this.f17780g, false);
        SafeParcelWriter.m14484s(parcel, 3, m14383z(), i2, false);
        SafeParcelWriter.m14468c(parcel, 4, m14380W());
        SafeParcelWriter.m14468c(parcel, 5, m14381Y());
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public IAccountAccessor m14382y() {
        return IAccountAccessor.Stub.m14347P(this.f17780g);
    }

    /* renamed from: z */
    public ConnectionResult m14383z() {
        return this.f17781h;
    }
}
