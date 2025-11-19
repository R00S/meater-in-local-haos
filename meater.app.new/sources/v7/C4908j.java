package v7;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.C2797m5;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: v7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4908j extends com.google.android.gms.internal.measurement.Y implements InterfaceC4907i {
    C4908j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // v7.InterfaceC4907i
    public final void c0(List<C2797m5> list) {
        Parcel parcelC = c();
        parcelC.writeTypedList(list);
        u1(2, parcelC);
    }
}
