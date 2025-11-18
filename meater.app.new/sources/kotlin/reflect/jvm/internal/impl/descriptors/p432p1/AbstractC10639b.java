package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10581c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import okhttp3.HttpUrl;

/* compiled from: AbstractLazyTypeParameterDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.b */
/* loaded from: classes2.dex */
public abstract class AbstractC10639b extends AbstractC10645e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10639b(InterfaceC10330n interfaceC10330n, InterfaceC10609m interfaceC10609m, InterfaceC10620g interfaceC10620g, C10163f c10163f, EnumC10384r1 enumC10384r1, boolean z, int i2, InterfaceC10741z0 interfaceC10741z0, InterfaceC10581c1 interfaceC10581c1) {
        super(interfaceC10330n, interfaceC10609m, interfaceC10620g, c10163f, enumC10384r1, z, i2, interfaceC10741z0, interfaceC10581c1);
        if (interfaceC10330n == null) {
            m37760v(0);
        }
        if (interfaceC10609m == null) {
            m37760v(1);
        }
        if (interfaceC10620g == null) {
            m37760v(2);
        }
        if (c10163f == null) {
            m37760v(3);
        }
        if (enumC10384r1 == null) {
            m37760v(4);
        }
        if (interfaceC10741z0 == null) {
            m37760v(5);
        }
        if (interfaceC10581c1 == null) {
            m37760v(6);
        }
    }

    /* renamed from: v */
    private static /* synthetic */ void m37760v(int i2) {
        Object[] objArr = new Object[3];
        switch (i2) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10655j
    public String toString() {
        Object[] objArr = new Object[3];
        boolean zMo37669F = mo37669F();
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        objArr[0] = zMo37669F ? "reified " : HttpUrl.FRAGMENT_ENCODE_SET;
        if (mo37672n() != EnumC10384r1.INVARIANT) {
            str = mo37672n() + " ";
        }
        objArr[1] = str;
        objArr[2] = getName();
        return String.format("%s%s%s", objArr);
    }
}
