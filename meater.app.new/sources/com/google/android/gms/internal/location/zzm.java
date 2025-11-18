package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.zzj;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzm extends AbstractSafeParcelable {

    /* renamed from: h */
    @SafeParcelable.Field
    private zzj f27672h;

    /* renamed from: i */
    @SafeParcelable.Field
    private List<ClientIdentity> f27673i;

    /* renamed from: j */
    @SafeParcelable.Field
    private String f27674j;

    /* renamed from: f */
    @VisibleForTesting
    static final List<ClientIdentity> f27670f = Collections.emptyList();

    /* renamed from: g */
    static final zzj f27671g = new zzj();
    public static final Parcelable.Creator<zzm> CREATOR = new zzn();

    @SafeParcelable.Constructor
    zzm(@SafeParcelable.Param(id = 1) zzj zzjVar, @SafeParcelable.Param(id = 2) List<ClientIdentity> list, @SafeParcelable.Param(id = 3) String str) {
        this.f27672h = zzjVar;
        this.f27673i = list;
        this.f27674j = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzmVar = (zzm) obj;
        return Objects.m14355a(this.f27672h, zzmVar.f27672h) && Objects.m14355a(this.f27673i, zzmVar.f27673i) && Objects.m14355a(this.f27674j, zzmVar.f27674j);
    }

    public final int hashCode() {
        return this.f27672h.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14484s(parcel, 1, this.f27672h, i2, false);
        SafeParcelWriter.m14490y(parcel, 2, this.f27673i, false);
        SafeParcelWriter.m14486u(parcel, 3, this.f27674j, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
