package U6;

import android.content.Context;
import ma.InterfaceC4015a;

/* compiled from: EventStoreModule_PackageNameFactory.java */
/* renamed from: U6.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1746h implements O6.b<String> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4015a<Context> f17617a;

    public C1746h(InterfaceC4015a<Context> interfaceC4015a) {
        this.f17617a = interfaceC4015a;
    }

    public static C1746h a(InterfaceC4015a<Context> interfaceC4015a) {
        return new C1746h(interfaceC4015a);
    }

    public static String c(Context context) {
        return (String) O6.d.d(AbstractC1744f.b(context));
    }

    @Override // ma.InterfaceC4015a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f17617a.get());
    }
}
