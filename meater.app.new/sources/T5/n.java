package T5;

import android.view.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: MeaterDetailsActivityViewModel.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LT5/n;", "Landroidx/lifecycle/Y;", "LG5/a;", "preference", "<init>", "(LG5/a;)V", "", "deviceID", "", "h", "(J)Z", "b", "LG5/a;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class n extends Y {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final G5.a preference;

    public n(G5.a preference) {
        C3862t.g(preference, "preference");
        this.preference = preference;
    }

    public final boolean h(long deviceID) {
        return K4.a.f8678a.g(deviceID) != null;
    }
}
