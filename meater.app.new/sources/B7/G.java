package B7;

import A7.InterfaceC0855i;
import A7.InterfaceC0856j;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class G extends f7.d implements InterfaceC0855i {

    /* renamed from: E, reason: collision with root package name */
    private final int f1726E;

    public G(DataHolder dataHolder, int i10, int i11) {
        super(dataHolder, i10);
        this.f1726E = i11;
    }

    public final Map<String, InterfaceC0856j> f() {
        HashMap map = new HashMap(this.f1726E);
        for (int i10 = 0; i10 < this.f1726E; i10++) {
            D d10 = new D(this.f41377B, this.f41378C + i10);
            if (d10.d("asset_key") != null) {
                map.put(d10.d("asset_key"), d10);
            }
        }
        return map;
    }

    public final Uri g() {
        return Uri.parse(d("path"));
    }

    public final String toString() {
        boolean zIsLoggable = Log.isLoggable("DataItem", 3);
        byte[] bArrA = a("data");
        Map<String, InterfaceC0856j> mapF = f();
        StringBuilder sb2 = new StringBuilder("DataItemRef{ ");
        sb2.append("uri=".concat(String.valueOf(g())));
        sb2.append(", dataSz=".concat((bArrA == null ? "null" : Integer.valueOf(bArrA.length)).toString()));
        sb2.append(", numAssets=" + mapF.size());
        if (zIsLoggable && !mapF.isEmpty()) {
            sb2.append(", assets=[");
            String str = "";
            for (Map.Entry<String, InterfaceC0856j> entry : mapF.entrySet()) {
                sb2.append(str + entry.getKey() + ": " + entry.getValue().c());
                str = ", ";
            }
            sb2.append("]");
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
