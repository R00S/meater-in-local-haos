package u7;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2497i1;
import java.util.List;
import java.util.Map;
import v7.K;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
/* renamed from: u7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4685a {

    /* renamed from: a, reason: collision with root package name */
    private final C2497i1 f50497a;

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
    /* renamed from: u7.a$a, reason: collision with other inner class name */
    public interface InterfaceC0721a extends K {
    }

    public C4685a(C2497i1 c2497i1) {
        this.f50497a = c2497i1;
    }

    public void a(String str, String str2, Bundle bundle) {
        this.f50497a.t(str, str2, bundle);
    }

    public List<Bundle> b(String str, String str2) {
        return this.f50497a.g(str, str2);
    }

    public int c(String str) {
        return this.f50497a.a(str);
    }

    public Map<String, Object> d(String str, String str2, boolean z10) {
        return this.f50497a.h(str, str2, z10);
    }

    public void e(String str, String str2, Bundle bundle) {
        this.f50497a.D(str, str2, bundle);
    }

    public void f(InterfaceC0721a interfaceC0721a) {
        this.f50497a.w(interfaceC0721a);
    }

    public void g(Bundle bundle) {
        this.f50497a.k(bundle);
    }

    public void h(String str, String str2, Object obj) {
        this.f50497a.v(str, str2, obj, true);
    }

    public final void i(boolean z10) {
        this.f50497a.x(z10);
    }
}
