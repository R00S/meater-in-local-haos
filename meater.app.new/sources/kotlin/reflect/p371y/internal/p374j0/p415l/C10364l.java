package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10581c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;

/* compiled from: ClassTypeConstructorImpl.java */
/* renamed from: kotlin.f0.y.e.j0.l.l */
/* loaded from: classes3.dex */
public class C10364l extends AbstractC10334b implements InterfaceC10345e1 {

    /* renamed from: d */
    private final InterfaceC10585e f40136d;

    /* renamed from: e */
    private final List<InterfaceC10587e1> f40137e;

    /* renamed from: f */
    private final Collection<AbstractC10344e0> f40138f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10364l(InterfaceC10585e interfaceC10585e, List<? extends InterfaceC10587e1> list, Collection<AbstractC10344e0> collection, InterfaceC10330n interfaceC10330n) {
        super(interfaceC10330n);
        if (interfaceC10585e == null) {
            m36740v(0);
        }
        if (list == null) {
            m36740v(1);
        }
        if (collection == null) {
            m36740v(2);
        }
        if (interfaceC10330n == null) {
            m36740v(3);
        }
        this.f40136d = interfaceC10585e;
        this.f40137e = Collections.unmodifiableList(new ArrayList(list));
        this.f40138f = Collections.unmodifiableCollection(collection);
    }

    /* renamed from: v */
    private static /* synthetic */ void m36740v(int i2) {
        String str = (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : 3];
        switch (i2) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i2 == 4) {
            objArr[1] = "getParameters";
        } else if (i2 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i2 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i2 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i2 != 4 && i2 != 5 && i2 != 6 && i2 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i2 != 4 && i2 != 5 && i2 != 6 && i2 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: e */
    public boolean mo32888e() {
        return true;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    public List<InterfaceC10587e1> getParameters() {
        List<InterfaceC10587e1> list = this.f40137e;
        if (list == null) {
            m36740v(4);
        }
        return list;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349g
    /* renamed from: l */
    protected Collection<AbstractC10344e0> mo32889l() {
        Collection<AbstractC10344e0> collection = this.f40138f;
        if (collection == null) {
            m36740v(6);
        }
        return collection;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349g
    /* renamed from: q */
    protected InterfaceC10581c1 mo32890q() {
        InterfaceC10581c1.a aVar = InterfaceC10581c1.a.f40737a;
        if (aVar == null) {
            m36740v(7);
        }
        return aVar;
    }

    public String toString() {
        return C10187d.m35825m(this.f40136d).m35432b();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10367m, kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: w */
    public InterfaceC10585e mo32891w() {
        InterfaceC10585e interfaceC10585e = this.f40136d;
        if (interfaceC10585e == null) {
            m36740v(5);
        }
        return interfaceC10585e;
    }
}
