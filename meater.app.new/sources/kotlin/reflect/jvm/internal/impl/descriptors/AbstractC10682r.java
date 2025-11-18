package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C9801m;

/* compiled from: DescriptorVisibility.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r */
/* loaded from: classes2.dex */
public abstract class AbstractC10682r extends AbstractC10730u {

    /* renamed from: a */
    private final AbstractC10611m1 f41133a;

    public AbstractC10682r(AbstractC10611m1 abstractC10611m1) {
        C9801m.m32346f(abstractC10611m1, "delegate");
        this.f41133a = abstractC10611m1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u
    /* renamed from: b */
    public AbstractC10611m1 mo38007b() {
        return this.f41133a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u
    /* renamed from: c */
    public String mo38008c() {
        return mo38007b().mo37717b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u
    /* renamed from: f */
    public AbstractC10730u mo38009f() {
        AbstractC10730u abstractC10730uM38135j = C10728t.m38135j(mo38007b().mo37722d());
        C9801m.m32345e(abstractC10730uM38135j, "toDescriptorVisibility(delegate.normalize())");
        return abstractC10730uM38135j;
    }
}
