package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONArray;
import org.json.JSONException;

@zzard
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzato extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzato> CREATOR = new zzatp();

    /* renamed from: f */
    @SafeParcelable.Field
    public final String f22516f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final int f22517g;

    public zzato(RewardItem rewardItem) {
        this(rewardItem.getType(), rewardItem.getAmount());
    }

    /* renamed from: y */
    public static zzato m16942y(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzato(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzato)) {
            zzato zzatoVar = (zzato) obj;
            if (Objects.m14355a(this.f22516f, zzatoVar.f22516f) && Objects.m14355a(Integer.valueOf(this.f22517g), Integer.valueOf(zzatoVar.f22517g))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.m14356b(this.f22516f, Integer.valueOf(this.f22517g));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 2, this.f22516f, false);
        SafeParcelWriter.m14477l(parcel, 3, this.f22517g);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    @SafeParcelable.Constructor
    public zzato(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2) {
        this.f22516f = str;
        this.f22517g = i2;
    }
}
