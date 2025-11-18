package e7;

import c7.C2333b;
import com.google.android.gms.common.api.AvailabilityException;
import java.util.Set;
import s.C4391a;
import z7.C5209k;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4391a f40660a;

    /* renamed from: b, reason: collision with root package name */
    private final C4391a f40661b;

    /* renamed from: c, reason: collision with root package name */
    private final C5209k f40662c;

    /* renamed from: d, reason: collision with root package name */
    private int f40663d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f40664e;

    public final Set a() {
        return this.f40660a.keySet();
    }

    public final void b(C3212b c3212b, C2333b c2333b, String str) {
        this.f40660a.put(c3212b, c2333b);
        this.f40661b.put(c3212b, str);
        this.f40663d--;
        if (!c2333b.G0()) {
            this.f40664e = true;
        }
        if (this.f40663d == 0) {
            if (!this.f40664e) {
                this.f40662c.c(this.f40661b);
            } else {
                this.f40662c.b(new AvailabilityException(this.f40660a));
            }
        }
    }
}
