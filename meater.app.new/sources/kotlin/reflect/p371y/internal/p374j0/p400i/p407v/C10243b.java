package kotlin.reflect.p371y.internal.p374j0.p400i.p407v;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10318b;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;

/* compiled from: SamConversionResolverImpl.kt */
/* renamed from: kotlin.f0.y.e.j0.i.v.b */
/* loaded from: classes3.dex */
public final class C10243b implements InterfaceC10242a {

    /* renamed from: a */
    private final Iterable<Object> f39622a;

    /* renamed from: b */
    private final InterfaceC10318b<InterfaceC10585e, AbstractC10368m0> f39623b;

    public C10243b(InterfaceC10330n interfaceC10330n, Iterable<? extends Object> iterable) {
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(iterable, "samWithReceiverResolvers");
        this.f39622a = iterable;
        this.f39623b = interfaceC10330n.mo36513a();
    }
}
