package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;

/* compiled from: ReflectionFactory.java */
/* renamed from: kotlin.a0.d.h0 */
/* loaded from: classes2.dex */
public class C9792h0 {
    /* renamed from: a */
    public KFunction mo32308a(C9793i c9793i) {
        return c9793i;
    }

    /* renamed from: b */
    public KClass mo32309b(Class cls) {
        return new ClassReference(cls);
    }

    /* renamed from: c */
    public KDeclarationContainer mo32310c(Class cls, String str) {
        return new PackageReference(cls, str);
    }

    /* renamed from: d */
    public KMutableProperty0 mo32311d(AbstractC9810p abstractC9810p) {
        return abstractC9810p;
    }

    /* renamed from: e */
    public KMutableProperty1 mo32312e(AbstractC9812r abstractC9812r) {
        return abstractC9812r;
    }

    /* renamed from: f */
    public KProperty0 mo32313f(AbstractC9816v abstractC9816v) {
        return abstractC9816v;
    }

    /* renamed from: g */
    public KProperty1 mo32314g(AbstractC9818x abstractC9818x) {
        return abstractC9818x;
    }

    /* renamed from: h */
    public KProperty2 mo32315h(AbstractC9820z abstractC9820z) {
        return abstractC9820z;
    }

    /* renamed from: i */
    public String mo32316i(FunctionBase functionBase) {
        String string = functionBase.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* renamed from: j */
    public String mo32317j(Lambda lambda) {
        return mo32316i(lambda);
    }
}
