package com.google.android.gms.wearable.internal;

import A7.InterfaceC0856j;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g7.C3445p;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
@KeepName
/* loaded from: classes2.dex */
public class DataItemAssetParcelable extends AbstractC3492a implements InterfaceC0856j, ReflectedParcelable {
    public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    private final String f35821B;

    /* renamed from: C, reason: collision with root package name */
    private final String f35822C;

    public DataItemAssetParcelable(InterfaceC0856j interfaceC0856j) {
        this.f35821B = (String) C3445p.k(interfaceC0856j.c());
        this.f35822C = (String) C3445p.k(interfaceC0856j.x());
    }

    @Override // A7.InterfaceC0856j
    public final String c() {
        return this.f35821B;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DataItemAssetParcelable[@");
        sb2.append(Integer.toHexString(hashCode()));
        if (this.f35821B == null) {
            sb2.append(",noid");
        } else {
            sb2.append(",");
            sb2.append(this.f35821B);
        }
        sb2.append(", key=");
        sb2.append(this.f35822C);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f35821B;
        int iA = C3493b.a(parcel);
        C3493b.q(parcel, 2, str, false);
        C3493b.q(parcel, 3, this.f35822C, false);
        C3493b.b(parcel, iA);
    }

    @Override // A7.InterfaceC0856j
    public final String x() {
        return this.f35822C;
    }

    DataItemAssetParcelable(String str, String str2) {
        this.f35821B = str;
        this.f35822C = str2;
    }
}
