package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
@SafeParcelable.Class
@Deprecated
/* loaded from: classes2.dex */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();

    /* renamed from: f */
    @SafeParcelable.VersionField
    final int f17961f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final long f17962g;

    /* renamed from: h */
    @SafeParcelable.Field
    private int f17963h;

    /* renamed from: i */
    @SafeParcelable.Field
    private final String f17964i;

    /* renamed from: j */
    @SafeParcelable.Field
    private final String f17965j;

    /* renamed from: k */
    @SafeParcelable.Field
    private final String f17966k;

    /* renamed from: l */
    @SafeParcelable.Field
    private final int f17967l;

    /* renamed from: m */
    @SafeParcelable.Field
    private final List f17968m;

    /* renamed from: n */
    @SafeParcelable.Field
    private final String f17969n;

    /* renamed from: o */
    @SafeParcelable.Field
    private final long f17970o;

    /* renamed from: p */
    @SafeParcelable.Field
    private int f17971p;

    /* renamed from: q */
    @SafeParcelable.Field
    private final String f17972q;

    /* renamed from: r */
    @SafeParcelable.Field
    private final float f17973r;

    /* renamed from: s */
    @SafeParcelable.Field
    private final long f17974s;

    /* renamed from: t */
    @SafeParcelable.Field
    private final boolean f17975t;

    /* renamed from: u */
    private long f17976u = -1;

    @SafeParcelable.Constructor
    WakeLockEvent(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 11) int i3, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) int i4, @SafeParcelable.Param(id = 6) List list, @SafeParcelable.Param(id = 12) String str2, @SafeParcelable.Param(id = 8) long j3, @SafeParcelable.Param(id = 14) int i5, @SafeParcelable.Param(id = 10) String str3, @SafeParcelable.Param(id = 13) String str4, @SafeParcelable.Param(id = 15) float f2, @SafeParcelable.Param(id = 16) long j4, @SafeParcelable.Param(id = 17) String str5, @SafeParcelable.Param(id = 18) boolean z) {
        this.f17961f = i2;
        this.f17962g = j2;
        this.f17963h = i3;
        this.f17964i = str;
        this.f17965j = str3;
        this.f17966k = str5;
        this.f17967l = i4;
        this.f17968m = list;
        this.f17969n = str2;
        this.f17970o = j3;
        this.f17971p = i5;
        this.f17972q = str4;
        this.f17973r = f2;
        this.f17974s = j4;
        this.f17975t = z;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: W */
    public final long mo14583W() {
        return this.f17962g;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: Y */
    public final String mo14584Y() {
        List list = this.f17968m;
        String str = this.f17964i;
        int i2 = this.f17967l;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        String strJoin = list == null ? HttpUrl.FRAGMENT_ENCODE_SET : TextUtils.join(",", list);
        int i3 = this.f17971p;
        String str3 = this.f17965j;
        if (str3 == null) {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str4 = this.f17972q;
        if (str4 == null) {
            str4 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        float f2 = this.f17973r;
        String str5 = this.f17966k;
        if (str5 != null) {
            str2 = str5;
        }
        return "\t" + str + "\t" + i2 + "\t" + strJoin + "\t" + i3 + "\t" + str3 + "\t" + str4 + "\t" + f2 + "\t" + str2 + "\t" + this.f17975t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f17961f);
        SafeParcelWriter.m14481p(parcel, 2, this.f17962g);
        SafeParcelWriter.m14486u(parcel, 4, this.f17964i, false);
        SafeParcelWriter.m14477l(parcel, 5, this.f17967l);
        SafeParcelWriter.m14488w(parcel, 6, this.f17968m, false);
        SafeParcelWriter.m14481p(parcel, 8, this.f17970o);
        SafeParcelWriter.m14486u(parcel, 10, this.f17965j, false);
        SafeParcelWriter.m14477l(parcel, 11, this.f17963h);
        SafeParcelWriter.m14486u(parcel, 12, this.f17969n, false);
        SafeParcelWriter.m14486u(parcel, 13, this.f17972q, false);
        SafeParcelWriter.m14477l(parcel, 14, this.f17971p);
        SafeParcelWriter.m14474i(parcel, 15, this.f17973r);
        SafeParcelWriter.m14481p(parcel, 16, this.f17974s);
        SafeParcelWriter.m14486u(parcel, 17, this.f17966k, false);
        SafeParcelWriter.m14468c(parcel, 18, this.f17975t);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: y */
    public final int mo14585y() {
        return this.f17963h;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: z */
    public final long mo14586z() {
        return this.f17976u;
    }
}
