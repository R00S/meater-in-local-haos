package N6;

import android.content.Context;
import ma.InterfaceC4015a;

/* compiled from: MetadataBackendRegistry_Factory.java */
/* loaded from: classes2.dex */
public final class l implements O6.b<k> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4015a<Context> f12558a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4015a<i> f12559b;

    public l(InterfaceC4015a<Context> interfaceC4015a, InterfaceC4015a<i> interfaceC4015a2) {
        this.f12558a = interfaceC4015a;
        this.f12559b = interfaceC4015a2;
    }

    public static l a(InterfaceC4015a<Context> interfaceC4015a, InterfaceC4015a<i> interfaceC4015a2) {
        return new l(interfaceC4015a, interfaceC4015a2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // ma.InterfaceC4015a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.f12558a.get(), this.f12559b.get());
    }
}
