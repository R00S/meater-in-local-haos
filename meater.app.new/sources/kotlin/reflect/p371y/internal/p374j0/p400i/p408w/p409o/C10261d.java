package kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: ExtensionReceiver.java */
/* renamed from: kotlin.f0.y.e.j0.i.w.o.d */
/* loaded from: classes3.dex */
public class C10261d extends AbstractC10258a implements InterfaceC10263f {

    /* renamed from: c */
    private final InterfaceC10573a f39691c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10261d(InterfaceC10573a interfaceC10573a, AbstractC10344e0 abstractC10344e0, InterfaceC10263f interfaceC10263f) {
        super(abstractC10344e0, interfaceC10263f);
        if (interfaceC10573a == null) {
            m36181b(0);
        }
        if (abstractC10344e0 == null) {
            m36181b(1);
        }
        this.f39691c = interfaceC10573a;
    }

    /* renamed from: b */
    private static /* synthetic */ void m36181b(int i2) {
        String str = i2 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 2 ? 3 : 2];
        if (i2 == 1) {
            objArr[0] = "receiverType";
        } else if (i2 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i2 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i2 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i2 != 2) {
            if (i2 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String str2 = String.format(str, objArr);
        if (i2 == 2) {
            throw new IllegalStateException(str2);
        }
    }

    public String toString() {
        return getType() + ": Ext {" + this.f39691c + "}";
    }
}
