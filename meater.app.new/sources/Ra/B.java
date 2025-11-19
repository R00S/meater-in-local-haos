package Ra;

import kotlin.jvm.internal.C3862t;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;

/* compiled from: InvalidModuleException.kt */
/* loaded from: classes3.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    private static final G<C> f15104a = new G<>("InvalidModuleNotifier");

    public static final void a(H h10) {
        C3862t.g(h10, "<this>");
        C c10 = (C) h10.M(f15104a);
        if (c10 != null) {
            c10.a(h10);
            return;
        }
        throw new InvalidModuleException("Accessing invalid module descriptor " + h10);
    }
}
