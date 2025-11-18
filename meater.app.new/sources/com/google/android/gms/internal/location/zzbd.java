package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzbd extends AbstractSafeParcelable {

    /* renamed from: g */
    @SafeParcelable.Field
    private LocationRequest f27644g;

    /* renamed from: h */
    @SafeParcelable.Field
    private List<ClientIdentity> f27645h;

    /* renamed from: i */
    @SafeParcelable.Field
    private String f27646i;

    /* renamed from: j */
    @SafeParcelable.Field
    private boolean f27647j;

    /* renamed from: k */
    @SafeParcelable.Field
    private boolean f27648k;

    /* renamed from: l */
    @SafeParcelable.Field
    private boolean f27649l;

    /* renamed from: m */
    @SafeParcelable.Field
    private String f27650m;

    /* renamed from: n */
    private boolean f27651n = true;

    /* renamed from: f */
    static final List<ClientIdentity> f27643f = Collections.emptyList();
    public static final Parcelable.Creator<zzbd> CREATOR = new zzbe();

    @SafeParcelable.Constructor
    zzbd(@SafeParcelable.Param(id = 1) LocationRequest locationRequest, @SafeParcelable.Param(id = 5) List<ClientIdentity> list, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) boolean z, @SafeParcelable.Param(id = 8) boolean z2, @SafeParcelable.Param(id = 9) boolean z3, @SafeParcelable.Param(id = 10) String str2) {
        this.f27644g = locationRequest;
        this.f27645h = list;
        this.f27646i = str;
        this.f27647j = z;
        this.f27648k = z2;
        this.f27649l = z3;
        this.f27650m = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbd)) {
            return false;
        }
        zzbd zzbdVar = (zzbd) obj;
        return Objects.m14355a(this.f27644g, zzbdVar.f27644g) && Objects.m14355a(this.f27645h, zzbdVar.f27645h) && Objects.m14355a(this.f27646i, zzbdVar.f27646i) && this.f27647j == zzbdVar.f27647j && this.f27648k == zzbdVar.f27648k && this.f27649l == zzbdVar.f27649l && Objects.m14355a(this.f27650m, zzbdVar.f27650m);
    }

    public final int hashCode() {
        return this.f27644g.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f27644g);
        if (this.f27646i != null) {
            sb.append(" tag=");
            sb.append(this.f27646i);
        }
        if (this.f27650m != null) {
            sb.append(" moduleId=");
            sb.append(this.f27650m);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f27647j);
        sb.append(" clients=");
        sb.append(this.f27645h);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f27648k);
        if (this.f27649l) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14484s(parcel, 1, this.f27644g, i2, false);
        SafeParcelWriter.m14490y(parcel, 5, this.f27645h, false);
        SafeParcelWriter.m14486u(parcel, 6, this.f27646i, false);
        SafeParcelWriter.m14468c(parcel, 7, this.f27647j);
        SafeParcelWriter.m14468c(parcel, 8, this.f27648k);
        SafeParcelWriter.m14468c(parcel, 9, this.f27649l);
        SafeParcelWriter.m14486u(parcel, 10, this.f27650m, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
