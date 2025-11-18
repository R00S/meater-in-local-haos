package U6;

import android.content.Context;
import ma.InterfaceC4015a;

/* compiled from: SchemaManager_Factory.java */
/* loaded from: classes2.dex */
public final class X implements O6.b<W> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4015a<Context> f17599a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4015a<String> f17600b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4015a<Integer> f17601c;

    public X(InterfaceC4015a<Context> interfaceC4015a, InterfaceC4015a<String> interfaceC4015a2, InterfaceC4015a<Integer> interfaceC4015a3) {
        this.f17599a = interfaceC4015a;
        this.f17600b = interfaceC4015a2;
        this.f17601c = interfaceC4015a3;
    }

    public static X a(InterfaceC4015a<Context> interfaceC4015a, InterfaceC4015a<String> interfaceC4015a2, InterfaceC4015a<Integer> interfaceC4015a3) {
        return new X(interfaceC4015a, interfaceC4015a2, interfaceC4015a3);
    }

    public static W c(Context context, String str, int i10) {
        return new W(context, str, i10);
    }

    @Override // ma.InterfaceC4015a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public W get() {
        return c(this.f17599a.get(), this.f17600b.get(), this.f17601c.get().intValue());
    }
}
