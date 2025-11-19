package Bb;

import Hb.AbstractC1082f0;
import Ra.InterfaceC1692e;
import kotlin.jvm.internal.C3862t;

/* compiled from: ImplicitClassReceiver.kt */
/* loaded from: classes3.dex */
public class e implements g, i {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1692e f1961a;

    /* renamed from: b, reason: collision with root package name */
    private final e f1962b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1692e f1963c;

    public e(InterfaceC1692e classDescriptor, e eVar) {
        C3862t.g(classDescriptor, "classDescriptor");
        this.f1961a = classDescriptor;
        this.f1962b = eVar == null ? this : eVar;
        this.f1963c = classDescriptor;
    }

    @Override // Bb.g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public AbstractC1082f0 a() {
        AbstractC1082f0 abstractC1082f0U = this.f1961a.u();
        C3862t.f(abstractC1082f0U, "getDefaultType(...)");
        return abstractC1082f0U;
    }

    public boolean equals(Object obj) {
        InterfaceC1692e interfaceC1692e = this.f1961a;
        e eVar = obj instanceof e ? (e) obj : null;
        return C3862t.b(interfaceC1692e, eVar != null ? eVar.f1961a : null);
    }

    public int hashCode() {
        return this.f1961a.hashCode();
    }

    @Override // Bb.i
    public final InterfaceC1692e t() {
        return this.f1961a;
    }

    public String toString() {
        return "Class{" + a() + '}';
    }
}
