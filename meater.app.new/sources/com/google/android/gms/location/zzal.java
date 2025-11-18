package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new zzam();

    /* renamed from: f */
    @SafeParcelable.Field
    private final List<String> f28514f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final PendingIntent f28515g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final String f28516h;

    @SafeParcelable.Constructor
    zzal(@SafeParcelable.Param(id = 1) List<String> list, @SafeParcelable.Param(id = 2) PendingIntent pendingIntent, @SafeParcelable.Param(id = 3) String str) {
        this.f28514f = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f28515g = pendingIntent;
        this.f28516h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14488w(parcel, 1, this.f28514f, false);
        SafeParcelWriter.m14484s(parcel, 2, this.f28515g, i2, false);
        SafeParcelWriter.m14486u(parcel, 3, this.f28516h, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
