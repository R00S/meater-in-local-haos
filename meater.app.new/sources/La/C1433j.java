package La;

import Ra.InterfaceC1712z;
import Ua.C1776o;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: util.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LLa/j;", "LUa/o;", "LLa/A;", "Loa/F;", "LLa/d0;", "container", "<init>", "(LLa/d0;)V", "LRa/Z;", "descriptor", "data", "visitPropertyDescriptor", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Loa/F;)LLa/A;", "LRa/z;", "visitFunctionDescriptor", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Loa/F;)LLa/A;", "a", "LLa/d0;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: La.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1433j extends C1776o<A<?>, C4153F> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC1422d0 container;

    public C1433j(AbstractC1422d0 container) {
        C3862t.g(container, "container");
        this.container = container;
    }

    @Override // Ua.C1776o, Ra.InterfaceC1702o
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public A<?> m(InterfaceC1712z descriptor, C4153F data) {
        C3862t.g(descriptor, "descriptor");
        C3862t.g(data, "data");
        return new C1432i0(this.container, descriptor);
    }

    @Override // Ra.InterfaceC1702o
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public A<?> a(Ra.Z descriptor, C4153F data) {
        C3862t.g(descriptor, "descriptor");
        C3862t.g(data, "data");
        int i10 = (descriptor.d0() != null ? 1 : 0) + (descriptor.j0() != null ? 1 : 0);
        if (descriptor.h0()) {
            if (i10 == 0) {
                return new C1436k0(this.container, descriptor);
            }
            if (i10 == 1) {
                return new C1440m0(this.container, descriptor);
            }
            if (i10 == 2) {
                return new C1444o0(this.container, descriptor);
            }
        } else {
            if (i10 == 0) {
                return new B0(this.container, descriptor);
            }
            if (i10 == 1) {
                return new E0(this.container, descriptor);
            }
            if (i10 == 2) {
                return new H0(this.container, descriptor);
            }
        }
        throw new Y0("Unsupported property: " + descriptor);
    }
}
