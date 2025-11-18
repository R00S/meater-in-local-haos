package kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o;

import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: AbstractReceiverValue.java */
/* renamed from: kotlin.f0.y.e.j0.i.w.o.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10258a implements InterfaceC10263f {

    /* renamed from: a */
    protected final AbstractC10344e0 f39687a;

    /* renamed from: b */
    private final InterfaceC10263f f39688b;

    public AbstractC10258a(AbstractC10344e0 abstractC10344e0, InterfaceC10263f interfaceC10263f) {
        if (abstractC10344e0 == null) {
            m36179b(0);
        }
        this.f39687a = abstractC10344e0;
        this.f39688b = interfaceC10263f == null ? this : interfaceC10263f;
    }

    /* renamed from: b */
    private static /* synthetic */ void m36179b(int i2) {
        String str = (i2 == 1 || i2 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 1 || i2 == 2) ? 2 : 3];
        if (i2 == 1 || i2 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i2 == 1) {
            objArr[1] = "getType";
        } else if (i2 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i2 != 1 && i2 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.InterfaceC10263f
    public AbstractC10344e0 getType() {
        AbstractC10344e0 abstractC10344e0 = this.f39687a;
        if (abstractC10344e0 == null) {
            m36179b(1);
        }
        return abstractC10344e0;
    }
}
