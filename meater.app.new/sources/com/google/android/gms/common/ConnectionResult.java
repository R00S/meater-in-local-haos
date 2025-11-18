package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class ConnectionResult extends AbstractSafeParcelable {

    /* renamed from: g */
    @SafeParcelable.VersionField
    final int f17199g;

    /* renamed from: h */
    @SafeParcelable.Field
    private final int f17200h;

    /* renamed from: i */
    @SafeParcelable.Field
    private final PendingIntent f17201i;

    /* renamed from: j */
    @SafeParcelable.Field
    private final String f17202j;

    /* renamed from: f */
    @ShowFirstParty
    @KeepForSdk
    public static final ConnectionResult f17198f = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new zzb();

    public ConnectionResult(int i2) {
        this(i2, null, null);
    }

    @SafeParcelable.Constructor
    ConnectionResult(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) PendingIntent pendingIntent, @SafeParcelable.Param(id = 4) String str) {
        this.f17199g = i2;
        this.f17200h = i3;
        this.f17201i = pendingIntent;
        this.f17202j = str;
    }

    /* renamed from: p0 */
    static String m13792p0(int i2) {
        if (i2 == 99) {
            return "UNFINISHED";
        }
        if (i2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i2) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i2) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i2 + ")";
                }
        }
    }

    /* renamed from: W */
    public PendingIntent m13793W() {
        return this.f17201i;
    }

    /* renamed from: Y */
    public boolean m13794Y() {
        return (this.f17200h == 0 || this.f17201i == null) ? false : true;
    }

    /* renamed from: e0 */
    public boolean m13795e0() {
        return this.f17200h == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f17200h == connectionResult.f17200h && Objects.m14355a(this.f17201i, connectionResult.f17201i) && Objects.m14355a(this.f17202j, connectionResult.f17202j);
    }

    public int hashCode() {
        return Objects.m14356b(Integer.valueOf(this.f17200h), this.f17201i, this.f17202j);
    }

    /* renamed from: i0 */
    public void m13796i0(Activity activity, int i2) throws IntentSender.SendIntentException {
        if (m13794Y()) {
            PendingIntent pendingIntent = this.f17201i;
            Preconditions.m14372k(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i2, null, 0, 0, 0);
        }
    }

    public String toString() {
        Objects.ToStringHelper toStringHelperM14357c = Objects.m14357c(this);
        toStringHelperM14357c.m14358a("statusCode", m13792p0(this.f17200h));
        toStringHelperM14357c.m14358a("resolution", this.f17201i);
        toStringHelperM14357c.m14358a("message", this.f17202j);
        return toStringHelperM14357c.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f17199g);
        SafeParcelWriter.m14477l(parcel, 2, m13797y());
        SafeParcelWriter.m14484s(parcel, 3, m13793W(), i2, false);
        SafeParcelWriter.m14486u(parcel, 4, m13798z(), false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public int m13797y() {
        return this.f17200h;
    }

    /* renamed from: z */
    public String m13798z() {
        return this.f17202j;
    }

    public ConnectionResult(int i2, PendingIntent pendingIntent) {
        this(i2, pendingIntent, null);
    }

    public ConnectionResult(int i2, PendingIntent pendingIntent, String str) {
        this(1, i2, pendingIntent, str);
    }
}
