package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloudMessage> CREATOR = new zzb();

    /* renamed from: f */
    @SafeParcelable.Field
    private Intent f17136f;

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface MessagePriority {
    }

    @SafeParcelable.Constructor
    public CloudMessage(@SafeParcelable.Param(id = 1) Intent intent) {
        this.f17136f = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14484s(parcel, 1, this.f17136f, i2, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public final Intent m13743y() {
        return this.f17136f;
    }
}
