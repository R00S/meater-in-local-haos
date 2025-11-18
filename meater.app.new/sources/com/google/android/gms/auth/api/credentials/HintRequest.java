package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new zzj();

    /* renamed from: f */
    @SafeParcelable.Field
    private final int f16986f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final CredentialPickerConfig f16987g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final boolean f16988h;

    /* renamed from: i */
    @SafeParcelable.Field
    private final boolean f16989i;

    /* renamed from: j */
    @SafeParcelable.Field
    private final String[] f16990j;

    /* renamed from: k */
    @SafeParcelable.Field
    private final boolean f16991k;

    /* renamed from: l */
    @SafeParcelable.Field
    private final String f16992l;

    /* renamed from: m */
    @SafeParcelable.Field
    private final String f16993m;

    public static final class Builder {

        /* renamed from: a */
        private CredentialPickerConfig f16994a = new CredentialPickerConfig.Builder().m13628a();

        /* renamed from: b */
        private boolean f16995b = false;
    }

    @SafeParcelable.Constructor
    HintRequest(@SafeParcelable.Param(id = 1000) int i2, @SafeParcelable.Param(id = 1) CredentialPickerConfig credentialPickerConfig, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 4) String[] strArr, @SafeParcelable.Param(id = 5) boolean z3, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) String str2) {
        this.f16986f = i2;
        this.f16987g = (CredentialPickerConfig) Preconditions.m14372k(credentialPickerConfig);
        this.f16988h = z;
        this.f16989i = z2;
        this.f16990j = (String[]) Preconditions.m14372k(strArr);
        if (i2 < 2) {
            this.f16991k = true;
            this.f16992l = null;
            this.f16993m = null;
        } else {
            this.f16991k = z3;
            this.f16992l = str;
            this.f16993m = str2;
        }
    }

    /* renamed from: W */
    public final String m13637W() {
        return this.f16993m;
    }

    /* renamed from: Y */
    public final String m13638Y() {
        return this.f16992l;
    }

    /* renamed from: e0 */
    public final boolean m13639e0() {
        return this.f16988h;
    }

    /* renamed from: i0 */
    public final boolean m13640i0() {
        return this.f16991k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14484s(parcel, 1, m13642z(), i2, false);
        SafeParcelWriter.m14468c(parcel, 2, m13639e0());
        SafeParcelWriter.m14468c(parcel, 3, this.f16989i);
        SafeParcelWriter.m14487v(parcel, 4, m13641y(), false);
        SafeParcelWriter.m14468c(parcel, 5, m13640i0());
        SafeParcelWriter.m14486u(parcel, 6, m13638Y(), false);
        SafeParcelWriter.m14486u(parcel, 7, m13637W(), false);
        SafeParcelWriter.m14477l(parcel, 1000, this.f16986f);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public final String[] m13641y() {
        return this.f16990j;
    }

    /* renamed from: z */
    public final CredentialPickerConfig m13642z() {
        return this.f16987g;
    }
}
