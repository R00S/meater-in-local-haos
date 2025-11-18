package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10326j;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: VariableDescriptorWithInitializerImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.n0 */
/* loaded from: classes2.dex */
public abstract class AbstractC10664n0 extends AbstractC10662m0 {

    /* renamed from: k */
    private final boolean f41027k;

    /* renamed from: l */
    protected InterfaceC10326j<AbstractC10211g<?>> f41028l;

    /* renamed from: m */
    protected Function0<InterfaceC10326j<AbstractC10211g<?>>> f41029m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10664n0(InterfaceC10609m interfaceC10609m, InterfaceC10620g interfaceC10620g, C10163f c10163f, AbstractC10344e0 abstractC10344e0, boolean z, InterfaceC10741z0 interfaceC10741z0) {
        super(interfaceC10609m, interfaceC10620g, c10163f, abstractC10344e0, interfaceC10741z0);
        if (interfaceC10609m == null) {
            m37908v(0);
        }
        if (interfaceC10620g == null) {
            m37908v(1);
        }
        if (c10163f == null) {
            m37908v(2);
        }
        if (interfaceC10741z0 == null) {
            m37908v(3);
        }
        this.f41027k = z;
    }

    /* renamed from: v */
    private static /* synthetic */ void m37908v(int i2) {
        Object[] objArr = new Object[3];
        if (i2 == 1) {
            objArr[0] = "annotations";
        } else if (i2 == 2) {
            objArr[0] = "name";
        } else if (i2 == 3) {
            objArr[0] = "source";
        } else if (i2 == 4 || i2 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i2 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i2 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: L0 */
    public void m37909L0(InterfaceC10326j<AbstractC10211g<?>> interfaceC10326j, Function0<InterfaceC10326j<AbstractC10211g<?>>> function0) {
        if (function0 == null) {
            m37908v(5);
        }
        this.f41029m = function0;
        if (interfaceC10326j == null) {
            interfaceC10326j = function0.invoke();
        }
        this.f41028l = interfaceC10326j;
    }

    /* renamed from: M0 */
    public void m37910M0(Function0<InterfaceC10326j<AbstractC10211g<?>>> function0) {
        if (function0 == null) {
            m37908v(4);
        }
        m37909L0(null, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602j1
    /* renamed from: X */
    public AbstractC10211g<?> mo37026X() {
        InterfaceC10326j<AbstractC10211g<?>> interfaceC10326j = this.f41028l;
        if (interfaceC10326j != null) {
            return interfaceC10326j.invoke();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602j1
    /* renamed from: j0 */
    public boolean mo37031j0() {
        return this.f41027k;
    }
}
