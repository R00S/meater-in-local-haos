package A7;

import android.text.TextUtils;
import com.google.android.gms.wearable.Asset;
import g7.C3443n;
import g7.C3445p;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: A7.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0858l {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f1011a = new HashMap();

    public <T> T a(String str) {
        return (T) this.f1011a.get(str);
    }

    public Set<String> b() {
        return this.f1011a.keySet();
    }

    public void c(C0858l c0858l) {
        for (String str : c0858l.b()) {
            this.f1011a.put(str, c0858l.a(str));
        }
    }

    public void d(String str, boolean z10) {
        this.f1011a.put(str, Boolean.valueOf(z10));
    }

    public void e(String str, int i10) {
        this.f1011a.put(str, Integer.valueOf(i10));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0858l)) {
            return false;
        }
        C0858l c0858l = (C0858l) obj;
        if (h() != c0858l.h()) {
            return false;
        }
        for (String str : b()) {
            Object objA = a(str);
            Object objA2 = c0858l.a(str);
            if (objA instanceof Asset) {
                if (!(objA2 instanceof Asset)) {
                    return false;
                }
                Asset asset = (Asset) objA;
                Asset asset2 = (Asset) objA2;
                if (asset == null || asset2 == null) {
                    if (asset != asset2) {
                        return false;
                    }
                } else {
                    if (!(!TextUtils.isEmpty(asset.h0()) ? ((String) C3445p.k(asset.h0())).equals(asset2.h0()) : Arrays.equals(asset.G0(), asset2.G0()))) {
                        return false;
                    }
                }
            } else if (objA instanceof String[]) {
                if (!(objA2 instanceof String[]) || !Arrays.equals((String[]) objA, (String[]) objA2)) {
                    return false;
                }
            } else if (objA instanceof long[]) {
                if (!(objA2 instanceof long[]) || !Arrays.equals((long[]) objA, (long[]) objA2)) {
                    return false;
                }
            } else if (objA instanceof float[]) {
                if (!(objA2 instanceof float[]) || !Arrays.equals((float[]) objA, (float[]) objA2)) {
                    return false;
                }
            } else if (objA instanceof byte[]) {
                if (!(objA2 instanceof byte[]) || !Arrays.equals((byte[]) objA, (byte[]) objA2)) {
                    return false;
                }
            } else if (!C3443n.a(objA, objA2)) {
                return false;
            }
        }
        return true;
    }

    public void f(String str, long j10) {
        this.f1011a.put(str, Long.valueOf(j10));
    }

    public void g(String str, String str2) {
        this.f1011a.put(str, str2);
    }

    public int h() {
        return this.f1011a.size();
    }

    public int hashCode() {
        return this.f1011a.hashCode() * 29;
    }

    public String toString() {
        return this.f1011a.toString();
    }
}
