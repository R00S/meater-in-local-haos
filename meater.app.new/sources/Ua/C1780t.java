package Ua;

import Ra.InterfaceC1692e;
import Ra.InterfaceC1700m;

/* compiled from: LazyClassReceiverParameterDescriptor.java */
/* renamed from: Ua.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1780t extends AbstractC1764c {

    /* renamed from: D, reason: collision with root package name */
    private final InterfaceC1692e f17907D;

    /* renamed from: E, reason: collision with root package name */
    private final Bb.e f17908E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1780t(InterfaceC1692e interfaceC1692e) {
        super(Sa.h.f15630e.b());
        if (interfaceC1692e == null) {
            H(0);
        }
        this.f17907D = interfaceC1692e;
        this.f17908E = new Bb.e(interfaceC1692e, null);
    }

    private static /* synthetic */ void H(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i10 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i10 == 1) {
            objArr[1] = "getValue";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Ra.InterfaceC1700m
    public InterfaceC1700m c() {
        InterfaceC1692e interfaceC1692e = this.f17907D;
        if (interfaceC1692e == null) {
            H(2);
        }
        return interfaceC1692e;
    }

    @Override // Ra.c0
    public Bb.g getValue() {
        Bb.e eVar = this.f17908E;
        if (eVar == null) {
            H(1);
        }
        return eVar;
    }

    @Override // Ua.AbstractC1774m
    public String toString() {
        return "class " + this.f17907D.getName() + "::this";
    }
}
