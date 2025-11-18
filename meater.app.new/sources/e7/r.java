package e7;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import z7.C5209k;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Map f40730a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Map f40731b = Collections.synchronizedMap(new WeakHashMap());

    private final void h(boolean z10, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f40730a) {
            map = new HashMap(this.f40730a);
        }
        synchronized (this.f40731b) {
            map2 = new HashMap(this.f40731b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).e(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C5209k) entry2.getKey()).d(new ApiException(status));
            }
        }
    }

    final void c(BasePendingResult basePendingResult, boolean z10) {
        this.f40730a.put(basePendingResult, Boolean.valueOf(z10));
        basePendingResult.b(new C3226p(this, basePendingResult));
    }

    final void d(C5209k c5209k, boolean z10) {
        this.f40731b.put(c5209k, Boolean.valueOf(z10));
        c5209k.a().c(new C3227q(this, c5209k));
    }

    final void e(int i10, String str) {
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        h(true, new Status(20, sb2.toString()));
    }

    public final void f() {
        h(false, C3216f.f40669Q);
    }

    final boolean g() {
        return (this.f40730a.isEmpty() && this.f40731b.isEmpty()) ? false : true;
    }
}
