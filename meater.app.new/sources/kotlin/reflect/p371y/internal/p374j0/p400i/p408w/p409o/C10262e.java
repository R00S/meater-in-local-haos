package kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;

/* compiled from: ImplicitClassReceiver.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.o.e */
/* loaded from: classes3.dex */
public class C10262e implements InterfaceC10263f, InterfaceC10265h {

    /* renamed from: a */
    private final InterfaceC10585e f39692a;

    /* renamed from: b */
    private final C10262e f39693b;

    /* renamed from: c */
    private final InterfaceC10585e f39694c;

    public C10262e(InterfaceC10585e interfaceC10585e, C10262e c10262e) {
        C9801m.m32346f(interfaceC10585e, "classDescriptor");
        this.f39692a = interfaceC10585e;
        this.f39693b = c10262e == null ? this : c10262e;
        this.f39694c = interfaceC10585e;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.InterfaceC10263f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC10368m0 getType() {
        AbstractC10368m0 abstractC10368m0Mo36400s = this.f39692a.mo36400s();
        C9801m.m32345e(abstractC10368m0Mo36400s, "classDescriptor.defaultType");
        return abstractC10368m0Mo36400s;
    }

    public boolean equals(Object obj) {
        InterfaceC10585e interfaceC10585e = this.f39692a;
        C10262e c10262e = obj instanceof C10262e ? (C10262e) obj : null;
        return C9801m.m32341a(interfaceC10585e, c10262e != null ? c10262e.f39692a : null);
    }

    public int hashCode() {
        return this.f39692a.hashCode();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.InterfaceC10265h
    /* renamed from: r */
    public final InterfaceC10585e mo36183r() {
        return this.f39692a;
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }
}
