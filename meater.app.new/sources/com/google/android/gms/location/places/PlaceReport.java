package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<PlaceReport> CREATOR = new zza();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f28503f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final String f28504g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final String f28505h;

    /* renamed from: i */
    @SafeParcelable.Field
    private final String f28506i;

    @SafeParcelable.Constructor
    PlaceReport(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3) {
        this.f28503f = i2;
        this.f28504g = str;
        this.f28505h = str2;
        this.f28506i = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return Objects.m14355a(this.f28504g, placeReport.f28504g) && Objects.m14355a(this.f28505h, placeReport.f28505h) && Objects.m14355a(this.f28506i, placeReport.f28506i);
    }

    public int hashCode() {
        return Objects.m14356b(this.f28504g, this.f28505h, this.f28506i);
    }

    public String toString() {
        Objects.ToStringHelper toStringHelperM14357c = Objects.m14357c(this);
        toStringHelperM14357c.m14358a("placeId", this.f28504g);
        toStringHelperM14357c.m14358a(StoreTabGridRecyclerFragment.BundleCons.TAG, this.f28505h);
        if (!"unknown".equals(this.f28506i)) {
            toStringHelperM14357c.m14358a("source", this.f28506i);
        }
        return toStringHelperM14357c.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f28503f);
        SafeParcelWriter.m14486u(parcel, 2, m22654y(), false);
        SafeParcelWriter.m14486u(parcel, 3, m22655z(), false);
        SafeParcelWriter.m14486u(parcel, 4, this.f28506i, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public String m22654y() {
        return this.f28504g;
    }

    /* renamed from: z */
    public String m22655z() {
        return this.f28505h;
    }
}
