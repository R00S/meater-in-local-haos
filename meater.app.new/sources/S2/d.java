package S2;

import X1.C1806c;
import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import l8.InterfaceC3914g;

/* compiled from: CueEncoder.java */
/* loaded from: classes.dex */
public final class d {
    public byte[] a(List<W1.a> list, long j10) {
        ArrayList<Bundle> arrayListB = C1806c.b(list, new InterfaceC3914g() { // from class: S2.c
            @Override // l8.InterfaceC3914g
            public final Object apply(Object obj) {
                return ((W1.a) obj).d();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayListB);
        bundle.putLong("d", j10);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
