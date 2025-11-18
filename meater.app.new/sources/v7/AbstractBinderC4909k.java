package v7;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.BinderC2437b0;
import com.google.android.gms.internal.measurement.C2428a0;
import com.google.android.gms.measurement.internal.C2797m5;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: v7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4909k extends BinderC2437b0 implements InterfaceC4907i {
    public AbstractBinderC4909k() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.internal.measurement.BinderC2437b0
    protected final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(C2797m5.CREATOR);
        C2428a0.f(parcel);
        c0(arrayListCreateTypedArrayList);
        return true;
    }
}
