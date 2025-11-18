package N6;

import android.content.Context;
import ma.InterfaceC4015a;

/* compiled from: CreationContextFactory_Factory.java */
/* loaded from: classes2.dex */
public final class j implements O6.b<i> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4015a<Context> f12550a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4015a<W6.a> f12551b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4015a<W6.a> f12552c;

    public j(InterfaceC4015a<Context> interfaceC4015a, InterfaceC4015a<W6.a> interfaceC4015a2, InterfaceC4015a<W6.a> interfaceC4015a3) {
        this.f12550a = interfaceC4015a;
        this.f12551b = interfaceC4015a2;
        this.f12552c = interfaceC4015a3;
    }

    public static j a(InterfaceC4015a<Context> interfaceC4015a, InterfaceC4015a<W6.a> interfaceC4015a2, InterfaceC4015a<W6.a> interfaceC4015a3) {
        return new j(interfaceC4015a, interfaceC4015a2, interfaceC4015a3);
    }

    public static i c(Context context, W6.a aVar, W6.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // ma.InterfaceC4015a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f12550a.get(), this.f12551b.get(), this.f12552c.get());
    }
}
