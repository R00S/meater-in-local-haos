package kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o;

import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: TransientReceiver.java */
/* renamed from: kotlin.f0.y.e.j0.i.w.o.i */
/* loaded from: classes3.dex */
public class C10266i extends AbstractC10258a {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10266i(AbstractC10344e0 abstractC10344e0) {
        this(abstractC10344e0, null);
        if (abstractC10344e0 == null) {
            m36185b(0);
        }
    }

    /* renamed from: b */
    private static /* synthetic */ void m36185b(int i2) {
        Object[] objArr = new Object[3];
        if (i2 != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i2 != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        return "{Transient} : " + getType();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C10266i(AbstractC10344e0 abstractC10344e0, InterfaceC10263f interfaceC10263f) {
        super(abstractC10344e0, interfaceC10263f);
        if (abstractC10344e0 == null) {
            m36185b(1);
        }
    }
}
