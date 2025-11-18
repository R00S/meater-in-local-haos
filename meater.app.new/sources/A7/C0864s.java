package A7;

import android.util.Log;
import com.google.android.gms.internal.wearable.N1;
import com.google.android.gms.internal.wearable.O1;
import com.google.android.gms.wearable.Asset;
import g7.C3432c;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: A7.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0864s {

    /* renamed from: a, reason: collision with root package name */
    private final C0865t f1012a;

    /* renamed from: b, reason: collision with root package name */
    private final C0858l f1013b;

    private C0864s(C0865t c0865t, C0858l c0858l) {
        this.f1012a = c0865t;
        C0858l c0858l2 = new C0858l();
        this.f1013b = c0858l2;
        if (c0858l != null) {
            c0858l2.c(c0858l);
        }
    }

    public static C0864s b(String str) {
        C3432c.a(str, "path must not be null");
        return new C0864s(C0865t.f0(str), null);
    }

    public C0865t a() {
        N1 n1A = O1.a(this.f1013b);
        this.f1012a.O0(n1A.f34501a.f());
        int size = n1A.f34502b.size();
        for (int i10 = 0; i10 < size; i10++) {
            List list = n1A.f34502b;
            String string = Integer.toString(i10);
            Asset asset = (Asset) list.get(i10);
            if (string == null) {
                throw new IllegalStateException("asset key cannot be null: ".concat(String.valueOf(asset)));
            }
            if (asset == null) {
                throw new IllegalStateException("asset cannot be null: key=".concat(string));
            }
            if (Log.isLoggable("DataMap", 3)) {
                Log.d("DataMap", "asPutDataRequest: adding asset: " + string + " " + asset.toString());
            }
            this.f1012a.G0(string, asset);
        }
        return this.f1012a;
    }

    public C0858l c() {
        return this.f1013b;
    }
}
