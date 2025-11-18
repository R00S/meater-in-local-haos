package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new zzd();

    /* renamed from: f */
    @SafeParcelable.Field
    private final int f28440f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final int f28441g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final long f28442h;

    @SafeParcelable.Constructor
    public ActivityTransitionEvent(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) long j2) {
        DetectedActivity.m22640W(i2);
        ActivityTransition.m22633W(i3);
        this.f28440f = i2;
        this.f28441g = i3;
        this.f28442h = j2;
    }

    /* renamed from: W */
    public int m22636W() {
        return this.f28441g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.f28440f == activityTransitionEvent.f28440f && this.f28441g == activityTransitionEvent.f28441g && this.f28442h == activityTransitionEvent.f28442h;
    }

    public int hashCode() {
        return Objects.m14356b(Integer.valueOf(this.f28440f), Integer.valueOf(this.f28441g), Long.valueOf(this.f28442h));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i2 = this.f28440f;
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("ActivityType ");
        sb2.append(i2);
        sb.append(sb2.toString());
        sb.append(" ");
        int i3 = this.f28441g;
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("TransitionType ");
        sb3.append(i3);
        sb.append(sb3.toString());
        sb.append(" ");
        long j2 = this.f28442h;
        StringBuilder sb4 = new StringBuilder(41);
        sb4.append("ElapsedRealTimeNanos ");
        sb4.append(j2);
        sb.append(sb4.toString());
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, m22637y());
        SafeParcelWriter.m14477l(parcel, 2, m22636W());
        SafeParcelWriter.m14481p(parcel, 3, m22638z());
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public int m22637y() {
        return this.f28440f;
    }

    /* renamed from: z */
    public long m22638z() {
        return this.f28442h;
    }
}
