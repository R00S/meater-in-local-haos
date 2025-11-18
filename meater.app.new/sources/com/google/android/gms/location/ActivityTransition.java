package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class ActivityTransition extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new zzc();

    /* renamed from: f */
    @SafeParcelable.Field
    private final int f28436f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final int f28437g;

    public static class Builder {

        /* renamed from: a */
        private int f28438a = -1;

        /* renamed from: b */
        private int f28439b = -1;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface SupportedActivityTransition {
    }

    @SafeParcelable.Constructor
    ActivityTransition(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3) {
        this.f28436f = i2;
        this.f28437g = i3;
    }

    /* renamed from: W */
    public static void m22633W(int i2) {
        boolean z = i2 >= 0 && i2 <= 1;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Transition type ");
        sb.append(i2);
        sb.append(" is not valid.");
        Preconditions.m14363b(z, sb.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.f28436f == activityTransition.f28436f && this.f28437g == activityTransition.f28437g;
    }

    public int hashCode() {
        return Objects.m14356b(Integer.valueOf(this.f28436f), Integer.valueOf(this.f28437g));
    }

    public String toString() {
        int i2 = this.f28436f;
        int i3 = this.f28437g;
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i2);
        sb.append(", mTransitionType=");
        sb.append(i3);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, m22634y());
        SafeParcelWriter.m14477l(parcel, 2, m22635z());
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public int m22634y() {
        return this.f28436f;
    }

    /* renamed from: z */
    public int m22635z() {
        return this.f28437g;
    }
}
