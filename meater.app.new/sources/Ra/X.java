package Ra;

import Hb.E0;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: typeParameterUtils.kt */
/* loaded from: classes3.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1696i f15129a;

    /* renamed from: b, reason: collision with root package name */
    private final List<E0> f15130b;

    /* renamed from: c, reason: collision with root package name */
    private final X f15131c;

    /* JADX WARN: Multi-variable type inference failed */
    public X(InterfaceC1696i classifierDescriptor, List<? extends E0> arguments, X x10) {
        C3862t.g(classifierDescriptor, "classifierDescriptor");
        C3862t.g(arguments, "arguments");
        this.f15129a = classifierDescriptor;
        this.f15130b = arguments;
        this.f15131c = x10;
    }

    public final List<E0> a() {
        return this.f15130b;
    }

    public final InterfaceC1696i b() {
        return this.f15129a;
    }

    public final X c() {
        return this.f15131c;
    }
}
