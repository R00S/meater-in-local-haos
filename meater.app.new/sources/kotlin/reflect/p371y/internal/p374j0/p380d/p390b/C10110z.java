package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import java.util.Collection;
import kotlin.collections.C10782c0;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10109y;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: methodSignatureMapping.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.z */
/* loaded from: classes3.dex */
public final class C10110z implements InterfaceC10109y<AbstractC10096l> {

    /* renamed from: a */
    public static final C10110z f38490a = new C10110z();

    private C10110z() {
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10109y
    /* renamed from: b */
    public String mo34058b(InterfaceC10585e interfaceC10585e) {
        return InterfaceC10109y.a.m34063a(this, interfaceC10585e);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10109y
    /* renamed from: c */
    public AbstractC10344e0 mo34059c(Collection<? extends AbstractC10344e0> collection) {
        C9801m.m32346f(collection, "types");
        throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + C10782c0.m38599e0(collection, null, null, null, 0, null, null, 63, null));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10109y
    /* renamed from: d */
    public String mo34060d(InterfaceC10585e interfaceC10585e) {
        C9801m.m32346f(interfaceC10585e, "classDescriptor");
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10109y
    /* renamed from: e */
    public AbstractC10344e0 mo34061e(AbstractC10344e0 abstractC10344e0) {
        return InterfaceC10109y.a.m34064b(this, abstractC10344e0);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10109y
    /* renamed from: f */
    public void mo34062f(AbstractC10344e0 abstractC10344e0, InterfaceC10585e interfaceC10585e) {
        C9801m.m32346f(abstractC10344e0, "kotlinType");
        C9801m.m32346f(interfaceC10585e, "descriptor");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10109y
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC10096l mo34057a(InterfaceC10585e interfaceC10585e) {
        C9801m.m32346f(interfaceC10585e, "classDescriptor");
        return null;
    }
}
