package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {

    /* renamed from: n */
    @SafeParcelable.VersionField
    final int f17298n;

    /* renamed from: o */
    @SafeParcelable.Field
    private final int f17299o;

    /* renamed from: p */
    @SafeParcelable.Field
    private final String f17300p;

    /* renamed from: q */
    @SafeParcelable.Field
    private final PendingIntent f17301q;

    /* renamed from: r */
    @SafeParcelable.Field
    private final ConnectionResult f17302r;

    /* renamed from: f */
    @ShowFirstParty
    @VisibleForTesting
    @KeepForSdk
    public static final Status f17290f = new Status(-1);

    /* renamed from: g */
    @ShowFirstParty
    @VisibleForTesting
    @KeepForSdk
    public static final Status f17291g = new Status(0);

    /* renamed from: h */
    @ShowFirstParty
    @KeepForSdk
    public static final Status f17292h = new Status(14);

    /* renamed from: i */
    @ShowFirstParty
    @KeepForSdk
    public static final Status f17293i = new Status(8);

    /* renamed from: j */
    @ShowFirstParty
    @KeepForSdk
    public static final Status f17294j = new Status(15);

    /* renamed from: k */
    @ShowFirstParty
    @KeepForSdk
    public static final Status f17295k = new Status(16);

    /* renamed from: m */
    @ShowFirstParty
    public static final Status f17297m = new Status(17);

    /* renamed from: l */
    @KeepForSdk
    public static final Status f17296l = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new zzb();

    public Status(int i2) {
        this(i2, null);
    }

    @SafeParcelable.Constructor
    Status(@SafeParcelable.Param(id = 1000) int i2, @SafeParcelable.Param(id = 1) int i3, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) PendingIntent pendingIntent, @SafeParcelable.Param(id = 4) ConnectionResult connectionResult) {
        this.f17298n = i2;
        this.f17299o = i3;
        this.f17300p = str;
        this.f17301q = pendingIntent;
        this.f17302r = connectionResult;
    }

    /* renamed from: W */
    public String m13913W() {
        return this.f17300p;
    }

    @VisibleForTesting
    /* renamed from: Y */
    public boolean m13914Y() {
        return this.f17301q != null;
    }

    /* renamed from: e0 */
    public boolean m13915e0() {
        return this.f17299o <= 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f17298n == status.f17298n && this.f17299o == status.f17299o && Objects.m14355a(this.f17300p, status.f17300p) && Objects.m14355a(this.f17301q, status.f17301q) && Objects.m14355a(this.f17302r, status.f17302r);
    }

    @Override // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this;
    }

    public int hashCode() {
        return Objects.m14356b(Integer.valueOf(this.f17298n), Integer.valueOf(this.f17299o), this.f17300p, this.f17301q, this.f17302r);
    }

    /* renamed from: i0 */
    public void m13916i0(Activity activity, int i2) throws IntentSender.SendIntentException {
        if (m13914Y()) {
            PendingIntent pendingIntent = this.f17301q;
            Preconditions.m14372k(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i2, null, 0, 0, 0);
        }
    }

    /* renamed from: p0 */
    public final String m13917p0() {
        String str = this.f17300p;
        return str != null ? str : CommonStatusCodes.m13848a(this.f17299o);
    }

    public String toString() {
        Objects.ToStringHelper toStringHelperM14357c = Objects.m14357c(this);
        toStringHelperM14357c.m14358a("statusCode", m13917p0());
        toStringHelperM14357c.m14358a("resolution", this.f17301q);
        return toStringHelperM14357c.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, m13919z());
        SafeParcelWriter.m14486u(parcel, 2, m13913W(), false);
        SafeParcelWriter.m14484s(parcel, 3, this.f17301q, i2, false);
        SafeParcelWriter.m14484s(parcel, 4, m13918y(), i2, false);
        SafeParcelWriter.m14477l(parcel, 1000, this.f17298n);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public ConnectionResult m13918y() {
        return this.f17302r;
    }

    /* renamed from: z */
    public int m13919z() {
        return this.f17299o;
    }

    public Status(int i2, String str) {
        this(1, i2, str, null, null);
    }

    public Status(int i2, String str, PendingIntent pendingIntent) {
        this(1, i2, str, pendingIntent, null);
    }
}
