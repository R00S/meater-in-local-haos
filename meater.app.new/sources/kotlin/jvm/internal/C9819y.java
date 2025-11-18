package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* compiled from: PropertyReference1Impl.java */
/* renamed from: kotlin.a0.d.y */
/* loaded from: classes2.dex */
public class C9819y extends AbstractC9818x {
    public C9819y(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(AbstractC9781c.NO_RECEIVER, ((ClassBasedDeclarationContainer) kDeclarationContainer).mo32283a(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public C9819y(Class cls, String str, String str2, int i2) {
        super(AbstractC9781c.NO_RECEIVER, cls, str, str2, i2);
    }
}
