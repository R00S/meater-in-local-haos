package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* compiled from: MutablePropertyReference0Impl.java */
/* renamed from: kotlin.a0.d.q */
/* loaded from: classes2.dex */
public class C9811q extends AbstractC9810p {
    public C9811q(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(AbstractC9781c.NO_RECEIVER, ((ClassBasedDeclarationContainer) kDeclarationContainer).mo32283a(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    @Override // kotlin.reflect.KProperty0
    public Object get() {
        throw null;
    }

    public void set(Object obj) {
        throw null;
    }

    public C9811q(Class cls, String str, String str2, int i2) {
        super(AbstractC9781c.NO_RECEIVER, cls, str, str2, i2);
    }

    public C9811q(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }
}
