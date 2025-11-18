package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* compiled from: MutablePropertyReference1Impl.java */
/* renamed from: kotlin.a0.d.s */
/* loaded from: classes2.dex */
public class C9813s extends AbstractC9812r {
    public C9813s(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(AbstractC9781c.NO_RECEIVER, ((ClassBasedDeclarationContainer) kDeclarationContainer).mo32283a(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    @Override // kotlin.reflect.KMutableProperty1
    /* renamed from: s */
    public void mo32366s(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }
}
