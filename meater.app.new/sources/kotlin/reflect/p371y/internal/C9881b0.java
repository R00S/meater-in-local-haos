package kotlin.reflect.p371y.internal;

import kotlin.jvm.internal.AbstractC9781c;
import kotlin.jvm.internal.AbstractC9810p;
import kotlin.jvm.internal.AbstractC9812r;
import kotlin.jvm.internal.AbstractC9816v;
import kotlin.jvm.internal.AbstractC9818x;
import kotlin.jvm.internal.AbstractC9820z;
import kotlin.jvm.internal.C9792h0;
import kotlin.jvm.internal.C9793i;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.p371y.C9877d;

/* compiled from: ReflectionFactoryImpl.java */
/* renamed from: kotlin.f0.y.e.b0 */
/* loaded from: classes2.dex */
public class C9881b0 extends C9792h0 {
    /* renamed from: k */
    private static KDeclarationContainerImpl m32491k(AbstractC9781c abstractC9781c) {
        KDeclarationContainer owner = abstractC9781c.getOwner();
        return owner instanceof KDeclarationContainerImpl ? (KDeclarationContainerImpl) owner : EmptyContainerForLocal.f37272i;
    }

    @Override // kotlin.jvm.internal.C9792h0
    /* renamed from: a */
    public KFunction mo32308a(C9793i c9793i) {
        return new KFunctionImpl(m32491k(c9793i), c9793i.getF40571m(), c9793i.getSignature(), c9793i.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C9792h0
    /* renamed from: b */
    public KClass mo32309b(Class cls) {
        return C9890g.m32555a(cls);
    }

    @Override // kotlin.jvm.internal.C9792h0
    /* renamed from: c */
    public KDeclarationContainer mo32310c(Class cls, String str) {
        return new KPackageImpl(cls, str);
    }

    @Override // kotlin.jvm.internal.C9792h0
    /* renamed from: d */
    public KMutableProperty0 mo32311d(AbstractC9810p abstractC9810p) {
        return new KMutableProperty0Impl(m32491k(abstractC9810p), abstractC9810p.getF40571m(), abstractC9810p.getSignature(), abstractC9810p.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C9792h0
    /* renamed from: e */
    public KMutableProperty1 mo32312e(AbstractC9812r abstractC9812r) {
        return new KMutableProperty1Impl(m32491k(abstractC9812r), abstractC9812r.getF40571m(), abstractC9812r.getSignature(), abstractC9812r.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C9792h0
    /* renamed from: f */
    public KProperty0 mo32313f(AbstractC9816v abstractC9816v) {
        return new KProperty0Impl(m32491k(abstractC9816v), abstractC9816v.getF40571m(), abstractC9816v.getSignature(), abstractC9816v.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C9792h0
    /* renamed from: g */
    public KProperty1 mo32314g(AbstractC9818x abstractC9818x) {
        return new KProperty1Impl(m32491k(abstractC9818x), abstractC9818x.getF40571m(), abstractC9818x.getSignature(), abstractC9818x.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C9792h0
    /* renamed from: h */
    public KProperty2 mo32315h(AbstractC9820z abstractC9820z) {
        return new KProperty2Impl(m32491k(abstractC9820z), abstractC9820z.getF40571m(), abstractC9820z.getSignature());
    }

    @Override // kotlin.jvm.internal.C9792h0
    /* renamed from: i */
    public String mo32316i(FunctionBase functionBase) {
        KFunctionImpl kFunctionImplM32558c;
        KFunction kFunctionM32471a = C9877d.m32471a(functionBase);
        return (kFunctionM32471a == null || (kFunctionImplM32558c = C9891g0.m32558c(kFunctionM32471a)) == null) ? super.mo32316i(functionBase) : ReflectionObjectRenderer.f37273a.m32500e(kFunctionImplM32558c.mo37304F());
    }

    @Override // kotlin.jvm.internal.C9792h0
    /* renamed from: j */
    public String mo32317j(Lambda lambda) {
        return mo32316i(lambda);
    }
}
