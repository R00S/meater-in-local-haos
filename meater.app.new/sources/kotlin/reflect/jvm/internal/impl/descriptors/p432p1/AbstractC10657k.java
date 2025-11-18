package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10612n;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10635p;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: DeclarationDescriptorNonRootImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.k */
/* loaded from: classes2.dex */
public abstract class AbstractC10657k extends AbstractC10655j implements InterfaceC10612n {

    /* renamed from: h */
    private final InterfaceC10609m f40996h;

    /* renamed from: i */
    private final InterfaceC10741z0 f40997i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC10657k(InterfaceC10609m interfaceC10609m, InterfaceC10620g interfaceC10620g, C10163f c10163f, InterfaceC10741z0 interfaceC10741z0) {
        super(interfaceC10620g, c10163f);
        if (interfaceC10609m == null) {
            m37870v(0);
        }
        if (interfaceC10620g == null) {
            m37870v(1);
        }
        if (c10163f == null) {
            m37870v(2);
        }
        if (interfaceC10741z0 == null) {
            m37870v(3);
        }
        this.f40996h = interfaceC10609m;
        this.f40997i = interfaceC10741z0;
    }

    /* renamed from: v */
    private static /* synthetic */ void m37870v(int i2) {
        String str = (i2 == 4 || i2 == 5 || i2 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 4 || i2 == 5 || i2 == 6) ? 2 : 3];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i2 == 4) {
            objArr[1] = "getOriginal";
        } else if (i2 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i2 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i2 != 4 && i2 != 5 && i2 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i2 != 4 && i2 != 5 && i2 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10655j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public InterfaceC10635p mo37019a() {
        InterfaceC10635p interfaceC10635p = (InterfaceC10635p) super.mo37019a();
        if (interfaceC10635p == null) {
            m37870v(4);
        }
        return interfaceC10635p;
    }

    /* renamed from: b */
    public InterfaceC10609m mo32876b() {
        InterfaceC10609m interfaceC10609m = this.f40996h;
        if (interfaceC10609m == null) {
            m37870v(5);
        }
        return interfaceC10609m;
    }

    /* renamed from: t */
    public InterfaceC10741z0 mo32883t() {
        InterfaceC10741z0 interfaceC10741z0 = this.f40997i;
        if (interfaceC10741z0 == null) {
            m37870v(6);
        }
        return interfaceC10741z0;
    }
}
