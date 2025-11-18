package kotlin.reflect.p371y.internal.p374j0.p400i;

import java.util.Collection;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10728t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;

/* compiled from: VisibilityUtil.kt */
/* renamed from: kotlin.f0.y.e.j0.i.p */
/* loaded from: classes3.dex */
public final class C10199p {
    /* renamed from: a */
    public static final InterfaceC10576b m35990a(Collection<? extends InterfaceC10576b> collection) {
        Integer numM38129d;
        C9801m.m32346f(collection, "descriptors");
        collection.isEmpty();
        InterfaceC10576b interfaceC10576b = null;
        for (InterfaceC10576b interfaceC10576b2 : collection) {
            if (interfaceC10576b == null || ((numM38129d = C10728t.m38129d(interfaceC10576b.getVisibility(), interfaceC10576b2.getVisibility())) != null && numM38129d.intValue() < 0)) {
                interfaceC10576b = interfaceC10576b2;
            }
        }
        C9801m.m32343c(interfaceC10576b);
        return interfaceC10576b;
    }
}
