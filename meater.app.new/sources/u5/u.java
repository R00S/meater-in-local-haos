package u5;

import k3.C3790a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.InterfaceC3857n;
import oa.InterfaceC4160e;

/* compiled from: AppBarConfiguration.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes2.dex */
public final /* synthetic */ class u implements C3790a.b, InterfaceC3857n {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Ba.a f50486a;

    public u(Ba.a function) {
        C3862t.g(function, "function");
        this.f50486a = function;
    }

    @Override // kotlin.jvm.internal.InterfaceC3857n
    public final InterfaceC4160e<?> a() {
        return this.f50486a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C3790a.b) && (obj instanceof InterfaceC3857n)) {
            return C3862t.b(a(), ((InterfaceC3857n) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
