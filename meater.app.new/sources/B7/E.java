package B7;

import A7.InterfaceC0855i;
import A7.InterfaceC0856j;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import g7.C3445p;
import h7.AbstractC3492a;
import h7.C3493b;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class E extends AbstractC3492a implements InterfaceC0855i {
    public static final Parcelable.Creator<E> CREATOR = new F();

    /* renamed from: B, reason: collision with root package name */
    private final Uri f1720B;

    /* renamed from: C, reason: collision with root package name */
    private final Map f1721C;

    /* renamed from: D, reason: collision with root package name */
    private byte[] f1722D;

    E(Uri uri, Bundle bundle, byte[] bArr) {
        this.f1720B = uri;
        HashMap map = new HashMap();
        bundle.setClassLoader((ClassLoader) C3445p.k(DataItemAssetParcelable.class.getClassLoader()));
        for (String str : bundle.keySet()) {
            map.put(str, (DataItemAssetParcelable) C3445p.k(bundle.getParcelable(str)));
        }
        this.f1721C = map;
        this.f1722D = bArr;
    }

    public final String toString() {
        boolean zIsLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb2 = new StringBuilder("DataItemParcelable[");
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.f1722D;
        sb2.append(",dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        sb2.append(", numAssets=" + this.f1721C.size());
        sb2.append(", uri=".concat(String.valueOf(this.f1720B)));
        if (!zIsLoggable) {
            sb2.append("]");
            return sb2.toString();
        }
        sb2.append("]\n  assets: ");
        for (String str : this.f1721C.keySet()) {
            sb2.append("\n    " + str + ": " + String.valueOf(this.f1721C.get(str)));
        }
        sb2.append("\n  ]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.p(parcel, 2, this.f1720B, i10, false);
        Bundle bundle = new Bundle();
        bundle.setClassLoader((ClassLoader) C3445p.k(DataItemAssetParcelable.class.getClassLoader()));
        for (Map.Entry entry : this.f1721C.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((InterfaceC0856j) entry.getValue()));
        }
        C3493b.e(parcel, 4, bundle, false);
        C3493b.g(parcel, 5, this.f1722D, false);
        C3493b.b(parcel, iA);
    }
}
