package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzl extends zzaz {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();

    /* renamed from: f */
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> f16929f;

    /* renamed from: g */
    @SafeParcelable.Indicator
    private final Set<Integer> f16930g;

    /* renamed from: h */
    @SafeParcelable.VersionField
    private final int f16931h;

    /* renamed from: i */
    @SafeParcelable.Field
    private ArrayList<zzr> f16932i;

    /* renamed from: j */
    @SafeParcelable.Field
    private int f16933j;

    /* renamed from: k */
    @SafeParcelable.Field
    private zzo f16934k;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> map = new HashMap<>();
        f16929f = map;
        map.put("authenticatorData", FastJsonResponse.Field.m14555W("authenticatorData", 2, zzr.class));
        map.put("progress", FastJsonResponse.Field.m14562z("progress", 4, zzo.class));
    }

    @SafeParcelable.Constructor
    zzl(@SafeParcelable.Indicator Set<Integer> set, @SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) ArrayList<zzr> arrayList, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) zzo zzoVar) {
        this.f16930g = set;
        this.f16931h = i2;
        this.f16932i = arrayList;
        this.f16933j = i3;
        this.f16934k = zzoVar;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public final /* synthetic */ Map mo13610a() {
        return f16929f;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: b */
    protected final Object mo13611b(FastJsonResponse.Field field) {
        int iM14566p0 = field.m14566p0();
        if (iM14566p0 == 1) {
            return Integer.valueOf(this.f16931h);
        }
        if (iM14566p0 == 2) {
            return this.f16932i;
        }
        if (iM14566p0 == 4) {
            return this.f16934k;
        }
        int iM14566p02 = field.m14566p0();
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(iM14566p02);
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: d */
    protected final boolean mo13612d(FastJsonResponse.Field field) {
        return this.f16930g.contains(Integer.valueOf(field.m14566p0()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        Set<Integer> set = this.f16930g;
        if (set.contains(1)) {
            SafeParcelWriter.m14477l(parcel, 1, this.f16931h);
        }
        if (set.contains(2)) {
            SafeParcelWriter.m14490y(parcel, 2, this.f16932i, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.m14477l(parcel, 3, this.f16933j);
        }
        if (set.contains(4)) {
            SafeParcelWriter.m14484s(parcel, 4, this.f16934k, i2, true);
        }
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    public zzl() {
        this.f16930g = new HashSet(1);
        this.f16931h = 1;
    }
}
