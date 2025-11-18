package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new zzk();

    /* renamed from: f */
    @SafeParcelable.Field
    private final String f16996f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final String f16997g;

    @SafeParcelable.Constructor
    public IdToken(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2) {
        Preconditions.m14363b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        Preconditions.m14363b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f16996f = str;
        this.f16997g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return Objects.m14355a(this.f16996f, idToken.f16996f) && Objects.m14355a(this.f16997g, idToken.f16997g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 1, m13643y(), false);
        SafeParcelWriter.m14486u(parcel, 2, m13644z(), false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public final String m13643y() {
        return this.f16996f;
    }

    /* renamed from: z */
    public final String m13644z() {
        return this.f16997g;
    }
}
