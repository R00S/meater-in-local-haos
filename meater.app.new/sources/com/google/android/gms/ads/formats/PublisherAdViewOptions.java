package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzaga;
import com.google.android.gms.internal.ads.zzagb;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzyf;
import com.google.android.gms.internal.ads.zzzs;
import com.google.android.gms.internal.ads.zzzt;

@zzard
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzc();

    @SafeParcelable.Field
    private final boolean zzbqn;

    @SafeParcelable.Field
    private final zzzs zzbqo;
    private AppEventListener zzbqp;

    @SafeParcelable.Field
    private final IBinder zzbqq;

    public static final class Builder {
        private boolean zzbqn = false;
        private AppEventListener zzbqp;

        public final PublisherAdViewOptions build() {
            return new PublisherAdViewOptions(this);
        }

        public final Builder setAppEventListener(AppEventListener appEventListener) {
            this.zzbqp = appEventListener;
            return this;
        }

        public final Builder setManualImpressionsEnabled(boolean z) {
            this.zzbqn = z;
            return this;
        }
    }

    private PublisherAdViewOptions(Builder builder) {
        this.zzbqn = builder.zzbqn;
        AppEventListener appEventListener = builder.zzbqp;
        this.zzbqp = appEventListener;
        this.zzbqo = appEventListener != null ? new zzyf(this.zzbqp) : null;
        this.zzbqq = null;
    }

    public final AppEventListener getAppEventListener() {
        return this.zzbqp;
    }

    public final boolean getManualImpressionsEnabled() {
        return this.zzbqn;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14468c(parcel, 1, getManualImpressionsEnabled());
        zzzs zzzsVar = this.zzbqo;
        SafeParcelWriter.m14476k(parcel, 2, zzzsVar == null ? null : zzzsVar.asBinder(), false);
        SafeParcelWriter.m14476k(parcel, 3, this.zzbqq, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    public final zzzs zzkt() {
        return this.zzbqo;
    }

    public final zzaga zzku() {
        return zzagb.m16534h7(this.zzbqq);
    }

    @SafeParcelable.Constructor
    PublisherAdViewOptions(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) IBinder iBinder2) {
        this.zzbqn = z;
        this.zzbqo = iBinder != null ? zzzt.m20858h7(iBinder) : null;
        this.zzbqq = iBinder2;
    }
}
