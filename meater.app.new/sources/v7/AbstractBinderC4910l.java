package v7;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.BinderC2437b0;
import com.google.android.gms.internal.measurement.C2428a0;
import com.google.android.gms.measurement.internal.C2859v5;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: v7.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4910l extends BinderC2437b0 implements InterfaceC4911m {
    public AbstractBinderC4910l() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.BinderC2437b0
    protected final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        C2859v5 c2859v5 = (C2859v5) C2428a0.a(parcel, C2859v5.CREATOR);
        C2428a0.f(parcel);
        m(c2859v5);
        return true;
    }
}
