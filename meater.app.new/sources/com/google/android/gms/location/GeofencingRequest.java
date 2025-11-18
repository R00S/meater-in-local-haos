package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.zzbh;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new zzq();

    /* renamed from: f */
    @SafeParcelable.Field
    private final List<zzbh> f28460f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final int f28461g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final String f28462h;

    public static final class Builder {

        /* renamed from: a */
        private final List<zzbh> f28463a = new ArrayList();

        /* renamed from: b */
        private int f28464b = 5;

        /* renamed from: c */
        private String f28465c = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @SafeParcelable.Constructor
    GeofencingRequest(@SafeParcelable.Param(id = 1) List<zzbh> list, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) String str) {
        this.f28460f = list;
        this.f28461g = i2;
        this.f28462h = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GeofencingRequest[");
        sb.append("geofences=");
        sb.append(this.f28460f);
        int i2 = this.f28461g;
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(", initialTrigger=");
        sb2.append(i2);
        sb2.append(", ");
        sb.append(sb2.toString());
        String strValueOf = String.valueOf(this.f28462h);
        sb.append(strValueOf.length() != 0 ? "tag=".concat(strValueOf) : new String("tag="));
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14490y(parcel, 1, this.f28460f, false);
        SafeParcelWriter.m14477l(parcel, 2, m22643y());
        SafeParcelWriter.m14486u(parcel, 3, this.f28462h, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public int m22643y() {
        return this.f28461g;
    }
}
