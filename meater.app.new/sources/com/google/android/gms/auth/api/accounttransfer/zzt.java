package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p024c.p041e.C0868b;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class zzt extends zzaz {
    public static final Parcelable.Creator<zzt> CREATOR = new zzu();

    /* renamed from: f */
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> f16949f;

    /* renamed from: g */
    @SafeParcelable.Indicator
    private final Set<Integer> f16950g;

    /* renamed from: h */
    @SafeParcelable.VersionField
    private final int f16951h;

    /* renamed from: i */
    @SafeParcelable.Field
    private String f16952i;

    /* renamed from: j */
    @SafeParcelable.Field
    private int f16953j;

    /* renamed from: k */
    @SafeParcelable.Field
    private byte[] f16954k;

    /* renamed from: l */
    @SafeParcelable.Field
    private PendingIntent f16955l;

    /* renamed from: m */
    @SafeParcelable.Field
    private DeviceMetaData f16956m;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> map = new HashMap<>();
        f16949f = map;
        map.put("accountType", FastJsonResponse.Field.m14558e0("accountType", 2));
        map.put("status", FastJsonResponse.Field.m14557Y("status", 3));
        map.put("transferBytes", FastJsonResponse.Field.m14561y("transferBytes", 4));
    }

    @SafeParcelable.Constructor
    zzt(@SafeParcelable.Indicator Set<Integer> set, @SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) PendingIntent pendingIntent, @SafeParcelable.Param(id = 6) DeviceMetaData deviceMetaData) {
        this.f16950g = set;
        this.f16951h = i2;
        this.f16952i = str;
        this.f16953j = i3;
        this.f16954k = bArr;
        this.f16955l = pendingIntent;
        this.f16956m = deviceMetaData;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public /* synthetic */ Map mo13610a() {
        return f16949f;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: b */
    protected Object mo13611b(FastJsonResponse.Field field) {
        int iM14566p0 = field.m14566p0();
        if (iM14566p0 == 1) {
            return Integer.valueOf(this.f16951h);
        }
        if (iM14566p0 == 2) {
            return this.f16952i;
        }
        if (iM14566p0 == 3) {
            return Integer.valueOf(this.f16953j);
        }
        if (iM14566p0 == 4) {
            return this.f16954k;
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
        return this.f16950g.contains(Integer.valueOf(field.m14566p0()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        Set<Integer> set = this.f16950g;
        if (set.contains(1)) {
            SafeParcelWriter.m14477l(parcel, 1, this.f16951h);
        }
        if (set.contains(2)) {
            SafeParcelWriter.m14486u(parcel, 2, this.f16952i, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.m14477l(parcel, 3, this.f16953j);
        }
        if (set.contains(4)) {
            SafeParcelWriter.m14471f(parcel, 4, this.f16954k, true);
        }
        if (set.contains(5)) {
            SafeParcelWriter.m14484s(parcel, 5, this.f16955l, i2, true);
        }
        if (set.contains(6)) {
            SafeParcelWriter.m14484s(parcel, 6, this.f16956m, i2, true);
        }
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    public zzt() {
        this.f16950g = new C0868b(3);
        this.f16951h = 1;
    }
}
