package Bb;

import Hb.U;
import Ra.InterfaceC1688a;

/* compiled from: ExtensionReceiver.java */
/* loaded from: classes3.dex */
public class d extends a implements g {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1688a f1960c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC1688a interfaceC1688a, U u10, g gVar) {
        super(u10, gVar);
        if (interfaceC1688a == null) {
            d(0);
        }
        if (u10 == null) {
            d(1);
        }
        this.f1960c = interfaceC1688a;
    }

    private static /* synthetic */ void d(int i10) {
        String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 2 ? 3 : 2];
        if (i10 == 1) {
            objArr[0] = "receiverType";
        } else if (i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i10 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 == 2) {
            throw new IllegalStateException(str2);
        }
    }

    public String toString() {
        return a() + ": Ext {" + this.f1960c + "}";
    }
}
