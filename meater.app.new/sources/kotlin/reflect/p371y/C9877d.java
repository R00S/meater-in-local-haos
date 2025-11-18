package kotlin.reflect.p371y;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9793i;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.p371y.internal.C9891g0;
import kotlin.reflect.p371y.internal.EmptyContainerForLocal;
import kotlin.reflect.p371y.internal.KFunctionImpl;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10130i;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10141t;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10117e;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10118f;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10121i;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10155g;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10313w;

/* compiled from: reflectLambda.kt */
@Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007¨\u0006\u0004"}, m32267d2 = {"reflect", "Lkotlin/reflect/KFunction;", "R", "Lkotlin/Function;", "kotlin-reflection"}, m32268k = 2, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.d */
/* loaded from: classes.dex */
public final class C9877d {

    /* compiled from: reflectLambda.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.d$a */
    /* synthetic */ class a extends C9793i implements Function2<C10313w, C10130i, InterfaceC10739y0> {

        /* renamed from: h */
        public static final a f37265h = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "loadFunction";
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final KDeclarationContainer getOwner() {
            return C9790g0.m32298b(C10313w.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final String getSignature() {
            return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10739y0 invoke(C10313w c10313w, C10130i c10130i) {
            C9801m.m32346f(c10313w, "p0");
            C9801m.m32346f(c10130i, "p1");
            return c10313w.m36487j(c10130i);
        }
    }

    /* renamed from: a */
    public static final <R> KFunction<R> m32471a(Function<? extends R> function) {
        C9801m.m32346f(function, "<this>");
        Metadata metadata = (Metadata) function.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] strArrM32266d1 = metadata.m32266d1();
        if (strArrM32266d1.length == 0) {
            strArrM32266d1 = null;
        }
        if (strArrM32266d1 == null) {
            return null;
        }
        Pair<C10118f, C10130i> pairM34261j = C10121i.m34261j(strArrM32266d1, metadata.m32267d2());
        C10118f c10118fM37646a = pairM34261j.m37646a();
        C10130i c10130iM37647b = pairM34261j.m37647b();
        C10117e c10117e = new C10117e(metadata.m32269mv(), (metadata.m32271xi() & 8) != 0);
        Class<?> cls = function.getClass();
        C10141t c10141tM34732n0 = c10130iM37647b.m34732n0();
        C9801m.m32345e(c10141tM34732n0, "proto.typeTable");
        return new KFunctionImpl(EmptyContainerForLocal.f37272i, (InterfaceC10739y0) C9891g0.m32563h(cls, c10130iM37647b, c10118fM37646a, new C10155g(c10141tM34732n0), c10117e, a.f37265h));
    }
}
