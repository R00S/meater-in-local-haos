package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import cm.aptoide.p092pt.downloadmanager.Constants;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class zzr extends zzaz {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();

    /* renamed from: f */
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> f16942f;

    /* renamed from: g */
    @SafeParcelable.Indicator
    private final Set<Integer> f16943g;

    /* renamed from: h */
    @SafeParcelable.VersionField
    private final int f16944h;

    /* renamed from: i */
    @SafeParcelable.Field
    private zzt f16945i;

    /* renamed from: j */
    @SafeParcelable.Field
    private String f16946j;

    /* renamed from: k */
    @SafeParcelable.Field
    private String f16947k;

    /* renamed from: l */
    @SafeParcelable.Field
    private String f16948l;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> map = new HashMap<>();
        f16942f = map;
        map.put("authenticatorInfo", FastJsonResponse.Field.m14562z("authenticatorInfo", 2, zzt.class));
        map.put(RoomInstalled.SIGNATURE, FastJsonResponse.Field.m14558e0(RoomInstalled.SIGNATURE, 3));
        map.put(Constants.PACKAGE, FastJsonResponse.Field.m14558e0(Constants.PACKAGE, 4));
    }

    public zzr() {
        this.f16943g = new HashSet(3);
        this.f16944h = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public /* synthetic */ Map mo13610a() {
        return f16942f;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: b */
    protected Object mo13611b(FastJsonResponse.Field field) {
        int iM14566p0 = field.m14566p0();
        if (iM14566p0 == 1) {
            return Integer.valueOf(this.f16944h);
        }
        if (iM14566p0 == 2) {
            return this.f16945i;
        }
        if (iM14566p0 == 3) {
            return this.f16946j;
        }
        if (iM14566p0 == 4) {
            return this.f16947k;
        }
        int iM14566p02 = field.m14566p0();
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(iM14566p02);
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: d */
    protected boolean mo13612d(FastJsonResponse.Field field) {
        return this.f16943g.contains(Integer.valueOf(field.m14566p0()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        Set<Integer> set = this.f16943g;
        if (set.contains(1)) {
            SafeParcelWriter.m14477l(parcel, 1, this.f16944h);
        }
        if (set.contains(2)) {
            SafeParcelWriter.m14484s(parcel, 2, this.f16945i, i2, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.m14486u(parcel, 3, this.f16946j, true);
        }
        if (set.contains(4)) {
            SafeParcelWriter.m14486u(parcel, 4, this.f16947k, true);
        }
        if (set.contains(5)) {
            SafeParcelWriter.m14486u(parcel, 5, this.f16948l, true);
        }
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    @SafeParcelable.Constructor
    zzr(@SafeParcelable.Indicator Set<Integer> set, @SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) zzt zztVar, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3) {
        this.f16943g = set;
        this.f16944h = i2;
        this.f16945i = zztVar;
        this.f16946j = str;
        this.f16947k = str2;
        this.f16948l = str3;
    }
}
