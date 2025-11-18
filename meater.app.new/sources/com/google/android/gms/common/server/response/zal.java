package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;

@ShowFirstParty
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new zao();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f17950f;

    /* renamed from: g */
    @SafeParcelable.Field
    final String f17951g;

    /* renamed from: h */
    @SafeParcelable.Field
    final ArrayList<zam> f17952h;

    @SafeParcelable.Constructor
    zal(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) ArrayList<zam> arrayList) {
        this.f17950f = i2;
        this.f17951g = str;
        this.f17952h = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f17950f);
        SafeParcelWriter.m14486u(parcel, 2, this.f17951g, false);
        SafeParcelWriter.m14490y(parcel, 3, this.f17952h, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    zal(String str, Map<String, FastJsonResponse.Field<?, ?>> map) {
        ArrayList<zam> arrayList;
        this.f17950f = 1;
        this.f17951g = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, map.get(str2)));
            }
        }
        this.f17952h = arrayList;
    }
}
