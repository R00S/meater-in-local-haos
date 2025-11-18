package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@zzard
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzark extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzark> CREATOR = new zzarl();

    /* renamed from: f */
    @SafeParcelable.Field
    public final boolean f22406f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final List<String> f22407g;

    public zzark() {
        this(false, Collections.emptyList());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14468c(parcel, 2, this.f22406f);
        SafeParcelWriter.m14488w(parcel, 3, this.f22407g, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    @SafeParcelable.Constructor
    public zzark(@SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) List<String> list) {
        this.f22406f = z;
        this.f22407g = list;
    }
}
