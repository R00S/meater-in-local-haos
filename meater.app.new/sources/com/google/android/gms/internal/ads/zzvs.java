package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.InputStream;

@zzard
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzvs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvs> CREATOR = new zzvt();

    /* renamed from: f */
    @SafeParcelable.Field
    private ParcelFileDescriptor f27229f;

    public zzvs() {
        this(null);
    }

    /* renamed from: W */
    private final synchronized ParcelFileDescriptor m20674W() {
        return this.f27229f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14484s(parcel, 2, m20674W(), i2, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public final synchronized boolean m20675y() {
        return this.f27229f != null;
    }

    /* renamed from: z */
    public final synchronized InputStream m20676z() {
        if (this.f27229f == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f27229f);
        this.f27229f = null;
        return autoCloseInputStream;
    }

    @SafeParcelable.Constructor
    public zzvs(@SafeParcelable.Param(id = 2) ParcelFileDescriptor parcelFileDescriptor) {
        this.f27229f = parcelFileDescriptor;
    }
}
