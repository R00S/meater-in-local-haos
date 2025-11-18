package S2;

import X1.C1804a;
import X1.C1806c;
import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import l8.InterfaceC3914g;

/* compiled from: CueDecoder.java */
/* loaded from: classes.dex */
public final class b {
    public e a(long j10, byte[] bArr, int i10, int i11) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, i10, i11);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return new e(C1806c.a(new InterfaceC3914g() { // from class: S2.a
            @Override // l8.InterfaceC3914g
            public final Object apply(Object obj) {
                return W1.a.b((Bundle) obj);
            }
        }, (ArrayList) C1804a.e(bundle.getParcelableArrayList("c"))), j10, bundle.getLong("d"));
    }
}
