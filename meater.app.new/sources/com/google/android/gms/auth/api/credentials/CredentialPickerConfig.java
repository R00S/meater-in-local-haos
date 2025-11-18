package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new zze();

    /* renamed from: f */
    @SafeParcelable.Field
    private final int f16965f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final boolean f16966g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final boolean f16967h;

    /* renamed from: i */
    @SafeParcelable.Field
    @Deprecated
    private final boolean f16968i;

    /* renamed from: j */
    @SafeParcelable.Field
    private final int f16969j;

    public static class Builder {

        /* renamed from: a */
        private boolean f16970a = false;

        /* renamed from: b */
        private boolean f16971b = true;

        /* renamed from: c */
        private int f16972c = 1;

        /* renamed from: a */
        public CredentialPickerConfig m13628a() {
            return new CredentialPickerConfig(this);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Prompt {
    }

    @SafeParcelable.Constructor
    CredentialPickerConfig(@SafeParcelable.Param(id = 1000) int i2, @SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) boolean z2, @SafeParcelable.Param(id = 3) boolean z3, @SafeParcelable.Param(id = 4) int i3) {
        this.f16965f = i2;
        this.f16966g = z;
        this.f16967h = z2;
        if (i2 < 2) {
            this.f16968i = z3;
            this.f16969j = z3 ? 3 : 1;
        } else {
            this.f16968i = i3 == 3;
            this.f16969j = i3;
        }
    }

    /* renamed from: W */
    public final boolean m13622W() {
        return this.f16967h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14468c(parcel, 1, m13624z());
        SafeParcelWriter.m14468c(parcel, 2, m13622W());
        SafeParcelWriter.m14468c(parcel, 3, m13623y());
        SafeParcelWriter.m14477l(parcel, 4, this.f16969j);
        SafeParcelWriter.m14477l(parcel, 1000, this.f16965f);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    @Deprecated
    /* renamed from: y */
    public final boolean m13623y() {
        return this.f16969j == 3;
    }

    /* renamed from: z */
    public final boolean m13624z() {
        return this.f16966g;
    }

    private CredentialPickerConfig(Builder builder) {
        this(2, builder.f16970a, builder.f16971b, false, builder.f16972c);
    }
}
