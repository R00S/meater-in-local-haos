package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new zzg();

    /* renamed from: f */
    @SafeParcelable.Field
    private final int f16973f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final boolean f16974g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final String[] f16975h;

    /* renamed from: i */
    @SafeParcelable.Field
    private final CredentialPickerConfig f16976i;

    /* renamed from: j */
    @SafeParcelable.Field
    private final CredentialPickerConfig f16977j;

    /* renamed from: k */
    @SafeParcelable.Field
    private final boolean f16978k;

    /* renamed from: l */
    @SafeParcelable.Field
    private final String f16979l;

    /* renamed from: m */
    @SafeParcelable.Field
    private final String f16980m;

    /* renamed from: n */
    @SafeParcelable.Field
    private final boolean f16981n;

    public static final class Builder {

        /* renamed from: a */
        private boolean f16982a = false;

        /* renamed from: b */
        private boolean f16983b = false;

        /* renamed from: c */
        private String f16984c = null;
    }

    @SafeParcelable.Constructor
    CredentialRequest(@SafeParcelable.Param(id = 1000) int i2, @SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) String[] strArr, @SafeParcelable.Param(id = 3) CredentialPickerConfig credentialPickerConfig, @SafeParcelable.Param(id = 4) CredentialPickerConfig credentialPickerConfig2, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) String str2, @SafeParcelable.Param(id = 8) boolean z3) {
        this.f16973f = i2;
        this.f16974g = z;
        this.f16975h = (String[]) Preconditions.m14372k(strArr);
        this.f16976i = credentialPickerConfig == null ? new CredentialPickerConfig.Builder().m13628a() : credentialPickerConfig;
        this.f16977j = credentialPickerConfig2 == null ? new CredentialPickerConfig.Builder().m13628a() : credentialPickerConfig2;
        if (i2 < 3) {
            this.f16978k = true;
            this.f16979l = null;
            this.f16980m = null;
        } else {
            this.f16978k = z2;
            this.f16979l = str;
            this.f16980m = str2;
        }
        this.f16981n = z3;
    }

    /* renamed from: W */
    public final CredentialPickerConfig m13629W() {
        return this.f16976i;
    }

    /* renamed from: Y */
    public final String m13630Y() {
        return this.f16980m;
    }

    /* renamed from: e0 */
    public final String m13631e0() {
        return this.f16979l;
    }

    /* renamed from: i0 */
    public final boolean m13632i0() {
        return this.f16978k;
    }

    /* renamed from: p0 */
    public final boolean m13633p0() {
        return this.f16974g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14468c(parcel, 1, m13633p0());
        SafeParcelWriter.m14487v(parcel, 2, m13634y(), false);
        SafeParcelWriter.m14484s(parcel, 3, m13629W(), i2, false);
        SafeParcelWriter.m14484s(parcel, 4, m13635z(), i2, false);
        SafeParcelWriter.m14468c(parcel, 5, m13632i0());
        SafeParcelWriter.m14486u(parcel, 6, m13631e0(), false);
        SafeParcelWriter.m14486u(parcel, 7, m13630Y(), false);
        SafeParcelWriter.m14477l(parcel, 1000, this.f16973f);
        SafeParcelWriter.m14468c(parcel, 8, this.f16981n);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public final String[] m13634y() {
        return this.f16975h;
    }

    /* renamed from: z */
    public final CredentialPickerConfig m13635z() {
        return this.f16977j;
    }
}
