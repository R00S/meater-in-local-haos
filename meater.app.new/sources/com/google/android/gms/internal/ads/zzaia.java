package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Map;

@zzard
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzaia extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaia> CREATOR = new zzaib();

    /* renamed from: f */
    @SafeParcelable.Field
    private final String f22048f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final String[] f22049g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final String[] f22050h;

    @SafeParcelable.Constructor
    zzaia(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String[] strArr, @SafeParcelable.Param(id = 3) String[] strArr2) {
        this.f22048f = str;
        this.f22049g = strArr;
        this.f22050h = strArr2;
    }

    /* renamed from: y */
    public static zzaia m16584y(zzr zzrVar) throws zza {
        Map<String, String> mapMo16038g = zzrVar.mo16038g();
        int size = mapMo16038g.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i2 = 0;
        for (Map.Entry<String, String> entry : mapMo16038g.entrySet()) {
            strArr[i2] = entry.getKey();
            strArr2[i2] = entry.getValue();
            i2++;
        }
        return new zzaia(zzrVar.m20430q(), strArr, strArr2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 1, this.f22048f, false);
        SafeParcelWriter.m14487v(parcel, 2, this.f22049g, false);
        SafeParcelWriter.m14487v(parcel, 3, this.f22050h, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
