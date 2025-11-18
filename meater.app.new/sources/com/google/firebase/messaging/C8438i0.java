package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.i0 */
/* loaded from: classes2.dex */
public class C8438i0 implements Parcelable.Creator<RemoteMessage> {
    /* renamed from: c */
    static void m26574c(RemoteMessage remoteMessage, Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14470e(parcel, 2, remoteMessage.f31926f, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public RemoteMessage createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        Bundle bundleM14442f = null;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            if (SafeParcelReader.m14458v(iM14425C) != 2) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                bundleM14442f = SafeParcelReader.m14442f(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new RemoteMessage(bundleM14442f);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RemoteMessage[] newArray(int i2) {
        return new RemoteMessage[i2];
    }
}
