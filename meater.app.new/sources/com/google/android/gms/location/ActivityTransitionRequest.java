package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new zzf();

    /* renamed from: f */
    public static final Comparator<ActivityTransition> f28443f = new C7644c();

    /* renamed from: g */
    @SafeParcelable.Field
    private final List<ActivityTransition> f28444g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final String f28445h;

    /* renamed from: i */
    @SafeParcelable.Field
    private final List<ClientIdentity> f28446i;

    @SafeParcelable.Constructor
    public ActivityTransitionRequest(@SafeParcelable.Param(id = 1) List<ActivityTransition> list, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) List<ClientIdentity> list2) {
        Preconditions.m14373l(list, "transitions can't be null");
        Preconditions.m14363b(list.size() > 0, "transitions can't be empty.");
        TreeSet treeSet = new TreeSet(f28443f);
        for (ActivityTransition activityTransition : list) {
            Preconditions.m14363b(treeSet.add(activityTransition), String.format("Found duplicated transition: %s.", activityTransition));
        }
        this.f28444g = Collections.unmodifiableList(list);
        this.f28445h = str;
        this.f28446i = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (Objects.m14355a(this.f28444g, activityTransitionRequest.f28444g) && Objects.m14355a(this.f28445h, activityTransitionRequest.f28445h) && Objects.m14355a(this.f28446i, activityTransitionRequest.f28446i)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f28444g.hashCode() * 31;
        String str = this.f28445h;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<ClientIdentity> list = this.f28446i;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f28444g);
        String str = this.f28445h;
        String strValueOf2 = String.valueOf(this.f28446i);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 61 + String.valueOf(str).length() + strValueOf2.length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(strValueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append('\'');
        sb.append(", mClients=");
        sb.append(strValueOf2);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14490y(parcel, 1, this.f28444g, false);
        SafeParcelWriter.m14486u(parcel, 2, this.f28445h, false);
        SafeParcelWriter.m14490y(parcel, 3, this.f28446i, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
