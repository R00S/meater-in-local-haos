package kotlin.reflect.p371y.internal;

import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10659l;
import okhttp3.HttpUrl;

/* compiled from: util.kt */
@Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/CreateKCallableVisitor;", "Lkotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorVisitorEmptyBodies;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", HttpUrl.FRAGMENT_ENCODE_SET, "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "visitFunctionDescriptor", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "data", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "visitPropertyDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.a, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public class CreateKCallableVisitor extends C10659l<KCallableImpl<?>, C10775u> {

    /* renamed from: a */
    private final KDeclarationContainerImpl f37266a;

    public CreateKCallableVisitor(KDeclarationContainerImpl kDeclarationContainerImpl) {
        C9801m.m32346f(kDeclarationContainerImpl, "container");
        this.f37266a = kDeclarationContainerImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10659l, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public KCallableImpl<?> mo32474g(InterfaceC10738y interfaceC10738y, C10775u c10775u) {
        C9801m.m32346f(interfaceC10738y, "descriptor");
        C9801m.m32346f(c10775u, "data");
        return new KFunctionImpl(this.f37266a, interfaceC10738y);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public KCallableImpl<?> mo32473d(InterfaceC10729t0 interfaceC10729t0, C10775u c10775u) {
        C9801m.m32346f(interfaceC10729t0, "descriptor");
        C9801m.m32346f(c10775u, "data");
        int i2 = (interfaceC10729t0.mo37029f0() != null ? 1 : 0) + (interfaceC10729t0.mo37032m0() != null ? 1 : 0);
        if (interfaceC10729t0.mo37031j0()) {
            if (i2 == 0) {
                return new KMutableProperty0Impl(this.f37266a, interfaceC10729t0);
            }
            if (i2 == 1) {
                return new KMutableProperty1Impl(this.f37266a, interfaceC10729t0);
            }
            if (i2 == 2) {
                return new KMutableProperty2Impl(this.f37266a, interfaceC10729t0);
            }
        } else {
            if (i2 == 0) {
                return new KProperty0Impl(this.f37266a, interfaceC10729t0);
            }
            if (i2 == 1) {
                return new KProperty1Impl(this.f37266a, interfaceC10729t0);
            }
            if (i2 == 2) {
                return new KProperty2Impl(this.f37266a, interfaceC10729t0);
            }
        }
        throw new KotlinReflectionInternalError("Unsupported property: " + interfaceC10729t0);
    }
}
