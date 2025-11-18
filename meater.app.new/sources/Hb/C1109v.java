package Hb;

import Ra.InterfaceC1692e;
import Ra.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import tb.C4597i;

/* compiled from: ClassTypeConstructorImpl.java */
/* renamed from: Hb.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1109v extends AbstractC1073b {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1692e f5793d;

    /* renamed from: e, reason: collision with root package name */
    private final List<Ra.m0> f5794e;

    /* renamed from: f, reason: collision with root package name */
    private final Collection<U> f5795f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1109v(InterfaceC1692e interfaceC1692e, List<? extends Ra.m0> list, Collection<U> collection, Gb.n nVar) {
        super(nVar);
        if (interfaceC1692e == null) {
            I(0);
        }
        if (list == null) {
            I(1);
        }
        if (collection == null) {
            I(2);
        }
        if (nVar == null) {
            I(3);
        }
        this.f5793d = interfaceC1692e;
        this.f5794e = Collections.unmodifiableList(new ArrayList(list));
        this.f5795f = Collections.unmodifiableCollection(collection);
    }

    private static /* synthetic */ void I(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
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
        if (i10 == 4) {
            objArr[1] = "getParameters";
        } else if (i10 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i10 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i10 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Hb.AbstractC1110w, Hb.y0
    /* renamed from: J */
    public InterfaceC1692e t() {
        InterfaceC1692e interfaceC1692e = this.f5793d;
        if (interfaceC1692e == null) {
            I(5);
        }
        return interfaceC1692e;
    }

    @Override // Hb.y0
    public List<Ra.m0> getParameters() {
        List<Ra.m0> list = this.f5794e;
        if (list == null) {
            I(4);
        }
        return list;
    }

    @Override // Hb.AbstractC1103q
    protected Collection<U> n() {
        Collection<U> collection = this.f5795f;
        if (collection == null) {
            I(6);
        }
        return collection;
    }

    public String toString() {
        return C4597i.m(this.f5793d).b();
    }

    @Override // Hb.y0
    public boolean u() {
        return true;
    }

    @Override // Hb.AbstractC1103q
    protected Ra.k0 w() {
        k0.a aVar = k0.a.f15161a;
        if (aVar == null) {
            I(7);
        }
        return aVar;
    }
}
