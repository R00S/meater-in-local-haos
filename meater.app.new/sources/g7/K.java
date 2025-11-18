package g7;

import com.google.android.gms.common.api.Status;
import d7.AbstractC3049c;
import g7.C3444o;
import java.util.concurrent.TimeUnit;
import z7.C5209k;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
final class K implements AbstractC3049c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC3049c f41952a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5209k f41953b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3444o.a f41954c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ L f41955d;

    K(AbstractC3049c abstractC3049c, C5209k c5209k, C3444o.a aVar, L l10) {
        this.f41952a = abstractC3049c;
        this.f41953b = c5209k;
        this.f41954c = aVar;
        this.f41955d = l10;
    }

    @Override // d7.AbstractC3049c.a
    public final void a(Status status) {
        if (!status.G0()) {
            this.f41953b.b(C3431b.a(status));
        } else {
            this.f41953b.c(this.f41954c.a(this.f41952a.c(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
