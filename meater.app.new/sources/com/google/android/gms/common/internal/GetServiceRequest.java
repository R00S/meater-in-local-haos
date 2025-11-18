package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzm();

    /* renamed from: f */
    static final Scope[] f17731f = new Scope[0];

    /* renamed from: g */
    static final Feature[] f17732g = new Feature[0];

    /* renamed from: h */
    @SafeParcelable.VersionField
    final int f17733h;

    /* renamed from: i */
    @SafeParcelable.Field
    final int f17734i;

    /* renamed from: j */
    @SafeParcelable.Field
    int f17735j;

    /* renamed from: k */
    @SafeParcelable.Field
    String f17736k;

    /* renamed from: l */
    @SafeParcelable.Field
    IBinder f17737l;

    /* renamed from: m */
    @SafeParcelable.Field
    Scope[] f17738m;

    /* renamed from: n */
    @SafeParcelable.Field
    Bundle f17739n;

    /* renamed from: o */
    @SafeParcelable.Field
    Account f17740o;

    /* renamed from: p */
    @SafeParcelable.Field
    Feature[] f17741p;

    /* renamed from: q */
    @SafeParcelable.Field
    Feature[] f17742q;

    /* renamed from: r */
    @SafeParcelable.Field
    boolean f17743r;

    /* renamed from: s */
    @SafeParcelable.Field
    int f17744s;

    /* renamed from: t */
    @SafeParcelable.Field
    boolean f17745t;

    /* renamed from: u */
    @SafeParcelable.Field
    private String f17746u;

    @SafeParcelable.Constructor
    GetServiceRequest(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) int i4, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) IBinder iBinder, @SafeParcelable.Param(id = 6) Scope[] scopeArr, @SafeParcelable.Param(id = 7) Bundle bundle, @SafeParcelable.Param(id = 8) Account account, @SafeParcelable.Param(id = 10) Feature[] featureArr, @SafeParcelable.Param(id = 11) Feature[] featureArr2, @SafeParcelable.Param(id = 12) boolean z, @SafeParcelable.Param(id = 13) int i5, @SafeParcelable.Param(id = 14) boolean z2, @SafeParcelable.Param(id = 15) String str2) {
        scopeArr = scopeArr == null ? f17731f : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f17732g : featureArr;
        featureArr2 = featureArr2 == null ? f17732g : featureArr2;
        this.f17733h = i2;
        this.f17734i = i3;
        this.f17735j = i4;
        if ("com.google.android.gms".equals(str)) {
            this.f17736k = "com.google.android.gms";
        } else {
            this.f17736k = str;
        }
        if (i2 < 2) {
            this.f17740o = iBinder != null ? AccountAccessor.m14281k0(IAccountAccessor.Stub.m14347P(iBinder)) : null;
        } else {
            this.f17737l = iBinder;
            this.f17740o = account;
        }
        this.f17738m = scopeArr;
        this.f17739n = bundle;
        this.f17741p = featureArr;
        this.f17742q = featureArr2;
        this.f17743r = z;
        this.f17744s = i5;
        this.f17745t = z2;
        this.f17746u = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        zzm.m14506a(this, parcel, i2);
    }

    /* renamed from: y */
    public final String m14325y() {
        return this.f17746u;
    }
}
