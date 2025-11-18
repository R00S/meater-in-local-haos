package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602j1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: VariableDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.m0 */
/* loaded from: classes2.dex */
public abstract class AbstractC10662m0 extends AbstractC10657k implements InterfaceC10602j1 {

    /* renamed from: j */
    protected AbstractC10344e0 f41010j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10662m0(InterfaceC10609m interfaceC10609m, InterfaceC10620g interfaceC10620g, C10163f c10163f, AbstractC10344e0 abstractC10344e0, InterfaceC10741z0 interfaceC10741z0) {
        super(interfaceC10609m, interfaceC10620g, c10163f, interfaceC10741z0);
        if (interfaceC10609m == null) {
            m37890v(0);
        }
        if (interfaceC10620g == null) {
            m37890v(1);
        }
        if (c10163f == null) {
            m37890v(2);
        }
        if (interfaceC10741z0 == null) {
            m37890v(3);
        }
        this.f41010j = abstractC10344e0;
    }

    /* renamed from: v */
    private static /* synthetic */ void m37890v(int i2) {
        String str;
        int i3;
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i2) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: A0 */
    public void m37891A0(AbstractC10344e0 abstractC10344e0) {
        this.f41010j = abstractC10344e0;
    }

    /* renamed from: G */
    public boolean mo33204G() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: f */
    public List<InterfaceC10599i1> mo37028f() {
        List<InterfaceC10599i1> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            m37890v(6);
        }
        return listEmptyList;
    }

    /* renamed from: f0 */
    public InterfaceC10735w0 mo37029f0() {
        return null;
    }

    public AbstractC10344e0 getReturnType() {
        AbstractC10344e0 type = getType();
        if (type == null) {
            m37890v(10);
        }
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10596h1
    public AbstractC10344e0 getType() {
        AbstractC10344e0 abstractC10344e0 = this.f41010j;
        if (abstractC10344e0 == null) {
            m37890v(4);
        }
        return abstractC10344e0;
    }

    public List<InterfaceC10587e1> getTypeParameters() {
        List<InterfaceC10587e1> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            m37890v(8);
        }
        return listEmptyList;
    }

    /* renamed from: m0 */
    public InterfaceC10735w0 mo37032m0() {
        return null;
    }
}
