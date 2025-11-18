package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzy;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();

    /* renamed from: f */
    @SafeParcelable.Field
    private final String f18027f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final AbstractBinderC6414g f18028g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final boolean f18029h;

    /* renamed from: i */
    @SafeParcelable.Field
    private final boolean f18030i;

    @SafeParcelable.Constructor
    zzs(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) boolean z2) {
        this.f18027f = str;
        BinderC6415h binderC6415h = null;
        if (iBinder != null) {
            try {
                IObjectWrapper iObjectWrapperMo14277d = zzy.m14518P(iBinder).mo14277d();
                byte[] bArr = iObjectWrapperMo14277d == null ? null : (byte[]) ObjectWrapper.m14709k0(iObjectWrapperMo14277d);
                if (bArr != null) {
                    binderC6415h = new BinderC6415h(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e2) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e2);
            }
        }
        this.f18028g = binderC6415h;
        this.f18029h = z;
        this.f18030i = z2;
    }

    zzs(String str, AbstractBinderC6414g abstractBinderC6414g, boolean z, boolean z2) {
        this.f18027f = str;
        this.f18028g = abstractBinderC6414g;
        this.f18029h = z;
        this.f18030i = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 1, this.f18027f, false);
        AbstractBinderC6414g abstractBinderC6414g = this.f18028g;
        if (abstractBinderC6414g == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            abstractBinderC6414g = null;
        }
        SafeParcelWriter.m14476k(parcel, 2, abstractBinderC6414g, false);
        SafeParcelWriter.m14468c(parcel, 3, this.f18029h);
        SafeParcelWriter.m14468c(parcel, 4, this.f18030i);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
