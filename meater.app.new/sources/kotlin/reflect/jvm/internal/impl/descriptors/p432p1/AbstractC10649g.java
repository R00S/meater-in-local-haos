package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;

/* compiled from: ClassDescriptorBase.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.g */
/* loaded from: classes2.dex */
public abstract class AbstractC10649g extends AbstractC10637a {

    /* renamed from: k */
    private final InterfaceC10609m f40974k;

    /* renamed from: l */
    private final InterfaceC10741z0 f40975l;

    /* renamed from: m */
    private final boolean f40976m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC10649g(InterfaceC10330n interfaceC10330n, InterfaceC10609m interfaceC10609m, C10163f c10163f, InterfaceC10741z0 interfaceC10741z0, boolean z) {
        super(interfaceC10330n, c10163f);
        if (interfaceC10330n == null) {
            m37847K(0);
        }
        if (interfaceC10609m == null) {
            m37847K(1);
        }
        if (c10163f == null) {
            m37847K(2);
        }
        if (interfaceC10741z0 == null) {
            m37847K(3);
        }
        this.f40974k = interfaceC10609m;
        this.f40975l = interfaceC10741z0;
        this.f40976m = z;
    }

    /* renamed from: K */
    private static /* synthetic */ void m37847K(int i2) {
        String str = (i2 == 4 || i2 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 4 || i2 == 5) ? 2 : 3];
        if (i2 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i2 == 2) {
            objArr[0] = "name";
        } else if (i2 == 3) {
            objArr[0] = "source";
        } else if (i2 == 4 || i2 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i2 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i2 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i2 != 4 && i2 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i2 != 4 && i2 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10612n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: b */
    public InterfaceC10609m mo32876b() {
        InterfaceC10609m interfaceC10609m = this.f40974k;
        if (interfaceC10609m == null) {
            m37847K(4);
        }
        return interfaceC10609m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10635p
    /* renamed from: t */
    public InterfaceC10741z0 mo32883t() {
        InterfaceC10741z0 interfaceC10741z0 = this.f40975l;
        if (interfaceC10741z0 == null) {
            m37847K(5);
        }
        return interfaceC10741z0;
    }

    /* renamed from: z */
    public boolean mo32885z() {
        return this.f40976m;
    }
}
