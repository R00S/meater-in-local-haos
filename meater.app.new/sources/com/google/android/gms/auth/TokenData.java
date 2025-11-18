package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new zzk();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f16886f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final String f16887g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final Long f16888h;

    /* renamed from: i */
    @SafeParcelable.Field
    private final boolean f16889i;

    /* renamed from: j */
    @SafeParcelable.Field
    private final boolean f16890j;

    /* renamed from: k */
    @SafeParcelable.Field
    private final List<String> f16891k;

    /* renamed from: l */
    @SafeParcelable.Field
    private final String f16892l;

    @SafeParcelable.Constructor
    TokenData(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) Long l, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) List<String> list, @SafeParcelable.Param(id = 7) String str2) {
        this.f16886f = i2;
        this.f16887g = Preconditions.m14368g(str);
        this.f16888h = l;
        this.f16889i = z;
        this.f16890j = z2;
        this.f16891k = list;
        this.f16892l = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f16887g, tokenData.f16887g) && Objects.m14355a(this.f16888h, tokenData.f16888h) && this.f16889i == tokenData.f16889i && this.f16890j == tokenData.f16890j && Objects.m14355a(this.f16891k, tokenData.f16891k) && Objects.m14355a(this.f16892l, tokenData.f16892l);
    }

    public int hashCode() {
        return Objects.m14356b(this.f16887g, this.f16888h, Boolean.valueOf(this.f16889i), Boolean.valueOf(this.f16890j), this.f16891k, this.f16892l);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f16886f);
        SafeParcelWriter.m14486u(parcel, 2, this.f16887g, false);
        SafeParcelWriter.m14482q(parcel, 3, this.f16888h, false);
        SafeParcelWriter.m14468c(parcel, 4, this.f16889i);
        SafeParcelWriter.m14468c(parcel, 5, this.f16890j);
        SafeParcelWriter.m14488w(parcel, 6, this.f16891k, false);
        SafeParcelWriter.m14486u(parcel, 7, this.f16892l, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
