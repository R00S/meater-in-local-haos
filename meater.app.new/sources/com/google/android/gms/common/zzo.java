package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();

    /* renamed from: f */
    @SafeParcelable.Field
    private final String f18018f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final boolean f18019g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final boolean f18020h;

    /* renamed from: i */
    @SafeParcelable.Field
    private final Context f18021i;

    /* renamed from: j */
    @SafeParcelable.Field
    private final boolean f18022j;

    @SafeParcelable.Constructor
    zzo(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 4) IBinder iBinder, @SafeParcelable.Param(id = 5) boolean z3) {
        this.f18018f = str;
        this.f18019g = z;
        this.f18020h = z2;
        this.f18021i = (Context) ObjectWrapper.m14709k0(IObjectWrapper.Stub.m14707P(iBinder));
        this.f18022j = z3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 1, this.f18018f, false);
        SafeParcelWriter.m14468c(parcel, 2, this.f18019g);
        SafeParcelWriter.m14468c(parcel, 3, this.f18020h);
        SafeParcelWriter.m14476k(parcel, 4, ObjectWrapper.m14708E0(this.f18021i), false);
        SafeParcelWriter.m14468c(parcel, 5, this.f18022j);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
