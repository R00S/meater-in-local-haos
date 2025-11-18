package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzard
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzyd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyd> CREATOR = new zzye();

    /* renamed from: f */
    @SafeParcelable.Field
    public final String f27447f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final int f27448g;

    /* renamed from: h */
    @SafeParcelable.Field
    public final int f27449h;

    /* renamed from: i */
    @SafeParcelable.Field
    public final boolean f27450i;

    /* renamed from: j */
    @SafeParcelable.Field
    public final int f27451j;

    /* renamed from: k */
    @SafeParcelable.Field
    public final int f27452k;

    /* renamed from: l */
    @SafeParcelable.Field
    public final zzyd[] f27453l;

    /* renamed from: m */
    @SafeParcelable.Field
    public final boolean f27454m;

    /* renamed from: n */
    @SafeParcelable.Field
    public final boolean f27455n;

    /* renamed from: o */
    @SafeParcelable.Field
    public boolean f27456o;

    public zzyd() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    /* renamed from: W */
    private static int m20821W(DisplayMetrics displayMetrics) {
        int i2 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i2 <= 400) {
            return 32;
        }
        return i2 <= 720 ? 50 : 90;
    }

    /* renamed from: Y */
    public static zzyd m20822Y(Context context) {
        return new zzyd("320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
    }

    /* renamed from: e0 */
    public static zzyd m20823e0() {
        return new zzyd("reward_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    /* renamed from: y */
    public static int m20824y(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    /* renamed from: z */
    public static int m20825z(DisplayMetrics displayMetrics) {
        return (int) (m20821W(displayMetrics) * displayMetrics.density);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 2, this.f27447f, false);
        SafeParcelWriter.m14477l(parcel, 3, this.f27448g);
        SafeParcelWriter.m14477l(parcel, 4, this.f27449h);
        SafeParcelWriter.m14468c(parcel, 5, this.f27450i);
        SafeParcelWriter.m14477l(parcel, 6, this.f27451j);
        SafeParcelWriter.m14477l(parcel, 7, this.f27452k);
        SafeParcelWriter.m14489x(parcel, 8, this.f27453l, i2, false);
        SafeParcelWriter.m14468c(parcel, 9, this.f27454m);
        SafeParcelWriter.m14468c(parcel, 10, this.f27455n);
        SafeParcelWriter.m14468c(parcel, 11, this.f27456o);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    public zzyd(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzyd(android.content.Context r14, com.google.android.gms.ads.AdSize[] r15) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyd.<init>(android.content.Context, com.google.android.gms.ads.AdSize[]):void");
    }

    @SafeParcelable.Constructor
    zzyd(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) int i4, @SafeParcelable.Param(id = 7) int i5, @SafeParcelable.Param(id = 8) zzyd[] zzydVarArr, @SafeParcelable.Param(id = 9) boolean z2, @SafeParcelable.Param(id = 10) boolean z3, @SafeParcelable.Param(id = 11) boolean z4) {
        this.f27447f = str;
        this.f27448g = i2;
        this.f27449h = i3;
        this.f27450i = z;
        this.f27451j = i4;
        this.f27452k = i5;
        this.f27453l = zzydVarArr;
        this.f27454m = z2;
        this.f27455n = z3;
        this.f27456o = z4;
    }
}
