package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new zzag();

    /* renamed from: f */
    @SafeParcelable.Field
    private final List<LocationRequest> f28487f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final boolean f28488g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final boolean f28489h;

    /* renamed from: i */
    @SafeParcelable.Field
    private zzae f28490i;

    public static final class Builder {

        /* renamed from: a */
        private final ArrayList<LocationRequest> f28491a = new ArrayList<>();

        /* renamed from: b */
        private boolean f28492b = false;

        /* renamed from: c */
        private boolean f28493c = false;

        /* renamed from: d */
        private zzae f28494d = null;
    }

    @SafeParcelable.Constructor
    LocationSettingsRequest(@SafeParcelable.Param(id = 1) List<LocationRequest> list, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 5) zzae zzaeVar) {
        this.f28487f = list;
        this.f28488g = z;
        this.f28489h = z2;
        this.f28490i = zzaeVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14490y(parcel, 1, Collections.unmodifiableList(this.f28487f), false);
        SafeParcelWriter.m14468c(parcel, 2, this.f28488g);
        SafeParcelWriter.m14468c(parcel, 3, this.f28489h);
        SafeParcelWriter.m14484s(parcel, 5, this.f28490i, i2, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
