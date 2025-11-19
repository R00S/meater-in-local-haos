package R4;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: SingleProbeFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"LR4/x0;", "LR4/W;", "<init>", "()V", "R0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: R4.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1684x0 extends W {

    /* renamed from: R0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: SingleProbeFragment.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LR4/x0$a;", "", "<init>", "()V", "", "probeSerialNumber", "LR4/x0;", "a", "(J)LR4/x0;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: R4.x0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final C1684x0 a(long probeSerialNumber) {
            C1684x0 c1684x0 = new C1684x0();
            Bundle bundle = new Bundle();
            bundle.putLong("SN", probeSerialNumber);
            c1684x0.k2(bundle);
            return c1684x0;
        }

        private Companion() {
        }
    }
}
