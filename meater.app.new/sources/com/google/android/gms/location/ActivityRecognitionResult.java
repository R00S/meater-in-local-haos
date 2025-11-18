package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new zzb();

    /* renamed from: f */
    @SafeParcelable.Field
    private List<DetectedActivity> f28431f;

    /* renamed from: g */
    @SafeParcelable.Field
    private long f28432g;

    /* renamed from: h */
    @SafeParcelable.Field
    private long f28433h;

    /* renamed from: i */
    @SafeParcelable.Field
    private int f28434i;

    /* renamed from: j */
    @SafeParcelable.Field
    private Bundle f28435j;

    @SafeParcelable.Constructor
    public ActivityRecognitionResult(@SafeParcelable.Param(id = 1) List<DetectedActivity> list, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) long j3, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) Bundle bundle) {
        Preconditions.m14363b(list != null && list.size() > 0, "Must have at least 1 detected activity");
        Preconditions.m14363b(j2 > 0 && j3 > 0, "Must set times");
        this.f28431f = list;
        this.f28432g = j2;
        this.f28433h = j3;
        this.f28434i = i2;
        this.f28435j = bundle;
    }

    /* renamed from: y */
    private static boolean m22632y(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if ((bundle == null && bundle2 != null) || ((bundle != null && bundle2 == null) || bundle.size() != bundle2.size())) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            if (bundle.get(str) == null) {
                if (bundle2.get(str) != null) {
                    return false;
                }
            } else if (bundle.get(str) instanceof Bundle) {
                if (!m22632y(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else if (!bundle.get(str).equals(bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            if (this.f28432g == activityRecognitionResult.f28432g && this.f28433h == activityRecognitionResult.f28433h && this.f28434i == activityRecognitionResult.f28434i && Objects.m14355a(this.f28431f, activityRecognitionResult.f28431f) && m22632y(this.f28435j, activityRecognitionResult.f28435j)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.m14356b(Long.valueOf(this.f28432g), Long.valueOf(this.f28433h), Integer.valueOf(this.f28434i), this.f28431f, this.f28435j);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f28431f);
        long j2 = this.f28432g;
        long j3 = this.f28433h;
        StringBuilder sb = new StringBuilder(strValueOf.length() + 124);
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(strValueOf);
        sb.append(", timeMillis=");
        sb.append(j2);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j3);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14490y(parcel, 1, this.f28431f, false);
        SafeParcelWriter.m14481p(parcel, 2, this.f28432g);
        SafeParcelWriter.m14481p(parcel, 3, this.f28433h);
        SafeParcelWriter.m14477l(parcel, 4, this.f28434i);
        SafeParcelWriter.m14470e(parcel, 5, this.f28435j, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
