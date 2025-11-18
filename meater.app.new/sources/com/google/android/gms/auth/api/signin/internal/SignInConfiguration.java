package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new zzx();

    /* renamed from: f */
    @SafeParcelable.Field
    private final String f17077f;

    /* renamed from: g */
    @SafeParcelable.Field
    private GoogleSignInOptions f17078g;

    @SafeParcelable.Constructor
    public SignInConfiguration(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 5) GoogleSignInOptions googleSignInOptions) {
        this.f17077f = Preconditions.m14368g(str);
        this.f17078g = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f17077f.equals(signInConfiguration.f17077f)) {
            GoogleSignInOptions googleSignInOptions = this.f17078g;
            if (googleSignInOptions == null) {
                if (signInConfiguration.f17078g == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(signInConfiguration.f17078g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new HashAccumulator().m13697a(this.f17077f).m13697a(this.f17078g).m13698b();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 2, this.f17077f, false);
        SafeParcelWriter.m14484s(parcel, 5, this.f17078g, i2, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public final GoogleSignInOptions m13700y() {
        return this.f17078g;
    }
}
