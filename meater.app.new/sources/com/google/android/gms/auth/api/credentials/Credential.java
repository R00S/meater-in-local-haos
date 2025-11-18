package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new zzc();

    /* renamed from: f */
    @SafeParcelable.Field
    private final String f16957f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final String f16958g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final Uri f16959h;

    /* renamed from: i */
    @SafeParcelable.Field
    private final List<IdToken> f16960i;

    /* renamed from: j */
    @SafeParcelable.Field
    private final String f16961j;

    /* renamed from: k */
    @SafeParcelable.Field
    private final String f16962k;

    /* renamed from: l */
    @SafeParcelable.Field
    private final String f16963l;

    /* renamed from: m */
    @SafeParcelable.Field
    private final String f16964m;

    public static class Builder {
    }

    @SafeParcelable.Constructor
    Credential(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) Uri uri, @SafeParcelable.Param(id = 4) List<IdToken> list, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) String str4, @SafeParcelable.Param(id = 9) String str5, @SafeParcelable.Param(id = 10) String str6) {
        String strTrim = ((String) Preconditions.m14373l(str, "credential identifier cannot be null")).trim();
        Preconditions.m14369h(strTrim, "credential identifier cannot be empty");
        if (str3 != null && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password must not be empty if set");
        }
        if (str4 != null) {
            boolean z = false;
            if (!TextUtils.isEmpty(str4)) {
                Uri uri2 = Uri.parse(str4);
                if (uri2.isAbsolute() && uri2.isHierarchical() && !TextUtils.isEmpty(uri2.getScheme()) && !TextUtils.isEmpty(uri2.getAuthority()) && ("http".equalsIgnoreCase(uri2.getScheme()) || BuildConfig.APTOIDE_WEB_SERVICES_SCHEME.equalsIgnoreCase(uri2.getScheme()))) {
                    z = true;
                }
            }
            if (!Boolean.valueOf(z).booleanValue()) {
                throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.f16958g = str2;
        this.f16959h = uri;
        this.f16960i = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f16957f = strTrim;
        this.f16961j = str3;
        this.f16962k = str4;
        this.f16963l = str5;
        this.f16964m = str6;
    }

    /* renamed from: J0 */
    public Uri m13614J0() {
        return this.f16959h;
    }

    /* renamed from: W */
    public String m13615W() {
        return this.f16963l;
    }

    /* renamed from: Y */
    public String m13616Y() {
        return this.f16957f;
    }

    /* renamed from: e0 */
    public List<IdToken> m13617e0() {
        return this.f16960i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f16957f, credential.f16957f) && TextUtils.equals(this.f16958g, credential.f16958g) && Objects.m14355a(this.f16959h, credential.f16959h) && TextUtils.equals(this.f16961j, credential.f16961j) && TextUtils.equals(this.f16962k, credential.f16962k);
    }

    public int hashCode() {
        return Objects.m14356b(this.f16957f, this.f16958g, this.f16959h, this.f16961j, this.f16962k);
    }

    /* renamed from: i0 */
    public String m13618i0() {
        return this.f16958g;
    }

    /* renamed from: p0 */
    public String m13619p0() {
        return this.f16961j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 1, m13616Y(), false);
        SafeParcelWriter.m14486u(parcel, 2, m13618i0(), false);
        SafeParcelWriter.m14484s(parcel, 3, m13614J0(), i2, false);
        SafeParcelWriter.m14490y(parcel, 4, m13617e0(), false);
        SafeParcelWriter.m14486u(parcel, 5, m13619p0(), false);
        SafeParcelWriter.m14486u(parcel, 6, m13620y(), false);
        SafeParcelWriter.m14486u(parcel, 9, m13615W(), false);
        SafeParcelWriter.m14486u(parcel, 10, m13621z(), false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public String m13620y() {
        return this.f16962k;
    }

    /* renamed from: z */
    public String m13621z() {
        return this.f16964m;
    }
}
