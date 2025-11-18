package Ua;

import Ra.AbstractC1707u;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1702o;
import Ra.Z;
import Ra.a0;
import Ra.h0;
import Ra.t0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PropertyGetterDescriptorImpl.java */
/* loaded from: classes3.dex */
public class L extends J implements a0 {

    /* renamed from: N, reason: collision with root package name */
    private Hb.U f17758N;

    /* renamed from: O, reason: collision with root package name */
    private final a0 f17759O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public L(Z z10, Sa.h hVar, Ra.E e10, AbstractC1707u abstractC1707u, boolean z11, boolean z12, boolean z13, InterfaceC1689b.a aVar, a0 a0Var, h0 h0Var) {
        L l10;
        L l11;
        super(e10, abstractC1707u, z10, hVar, qb.f.w("<get-" + z10.getName() + ">"), z11, z12, z13, aVar, h0Var);
        if (z10 == null) {
            H(0);
        }
        if (hVar == null) {
            H(1);
        }
        if (e10 == null) {
            H(2);
        }
        if (abstractC1707u == null) {
            H(3);
        }
        if (aVar == null) {
            H(4);
        }
        if (h0Var == null) {
            H(5);
        }
        if (a0Var != 0) {
            l11 = this;
            l10 = a0Var;
        } else {
            l10 = this;
            l11 = l10;
        }
        l11.f17759O = l10;
    }

    private static /* synthetic */ void H(int i10) {
        String str = (i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i10 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Ua.J, Ua.AbstractC1775n, Ua.AbstractC1774m, Ra.InterfaceC1700m
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a0 L0() {
        a0 a0Var = this.f17759O;
        if (a0Var == null) {
            H(8);
        }
        return a0Var;
    }

    public void R0(Hb.U u10) {
        if (u10 == null) {
            u10 = A0().a();
        }
        this.f17758N = u10;
    }

    @Override // Ra.InterfaceC1712z, Ra.InterfaceC1689b, Ra.InterfaceC1688a
    public Collection<? extends a0> g() {
        Collection<Ra.Y> collectionM0 = super.M0(true);
        if (collectionM0 == null) {
            H(6);
        }
        return collectionM0;
    }

    @Override // Ra.InterfaceC1688a
    public Hb.U getReturnType() {
        return this.f17758N;
    }

    @Override // Ra.InterfaceC1688a
    public List<t0> k() {
        List<t0> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            H(7);
        }
        return listEmptyList;
    }

    @Override // Ra.InterfaceC1700m
    public <R, D> R v0(InterfaceC1702o<R, D> interfaceC1702o, D d10) {
        return interfaceC1702o.k(this, d10);
    }
}
