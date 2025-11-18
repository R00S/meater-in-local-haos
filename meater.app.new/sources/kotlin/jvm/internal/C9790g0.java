package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import okhttp3.HttpUrl;

/* compiled from: Reflection.java */
/* renamed from: kotlin.a0.d.g0 */
/* loaded from: classes2.dex */
public class C9790g0 {

    /* renamed from: a */
    private static final C9792h0 f37180a;

    /* renamed from: b */
    private static final KClass[] f37181b;

    static {
        C9792h0 c9792h0 = null;
        try {
            c9792h0 = (C9792h0) Class.forName("kotlin.f0.y.e.b0").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c9792h0 == null) {
            c9792h0 = new C9792h0();
        }
        f37180a = c9792h0;
        f37181b = new KClass[0];
    }

    /* renamed from: a */
    public static KFunction m32297a(C9793i c9793i) {
        return f37180a.mo32308a(c9793i);
    }

    /* renamed from: b */
    public static KClass m32298b(Class cls) {
        return f37180a.mo32309b(cls);
    }

    /* renamed from: c */
    public static KDeclarationContainer m32299c(Class cls) {
        return f37180a.mo32310c(cls, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* renamed from: d */
    public static KDeclarationContainer m32300d(Class cls, String str) {
        return f37180a.mo32310c(cls, str);
    }

    /* renamed from: e */
    public static KMutableProperty0 m32301e(AbstractC9810p abstractC9810p) {
        return f37180a.mo32311d(abstractC9810p);
    }

    /* renamed from: f */
    public static KMutableProperty1 m32302f(AbstractC9812r abstractC9812r) {
        return f37180a.mo32312e(abstractC9812r);
    }

    /* renamed from: g */
    public static KProperty0 m32303g(AbstractC9816v abstractC9816v) {
        return f37180a.mo32313f(abstractC9816v);
    }

    /* renamed from: h */
    public static KProperty1 m32304h(AbstractC9818x abstractC9818x) {
        return f37180a.mo32314g(abstractC9818x);
    }

    /* renamed from: i */
    public static KProperty2 m32305i(AbstractC9820z abstractC9820z) {
        return f37180a.mo32315h(abstractC9820z);
    }

    /* renamed from: j */
    public static String m32306j(FunctionBase functionBase) {
        return f37180a.mo32316i(functionBase);
    }

    /* renamed from: k */
    public static String m32307k(Lambda lambda) {
        return f37180a.mo32317j(lambda);
    }
}
