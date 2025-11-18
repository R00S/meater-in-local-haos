package kotlin.reflect.p371y;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.p371y.internal.C9891g0;
import kotlin.reflect.p371y.internal.KCallableImpl;
import kotlin.reflect.p371y.internal.calls.Caller;
import okhttp3.HttpUrl;

/* compiled from: KCallablesJvm.kt */
@Metadata(m32266d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\",\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0000\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m32267d2 = {"value", HttpUrl.FRAGMENT_ENCODE_SET, "isAccessible", "Lkotlin/reflect/KCallable;", "(Lkotlin/reflect/KCallable;)Z", "setAccessible", "(Lkotlin/reflect/KCallable;Z)V", "kotlin-reflection"}, m32268k = 2, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.a */
/* loaded from: classes.dex */
public final class C9874a {
    /* renamed from: a */
    public static final void m32462a(KCallable<?> kCallable, boolean z) {
        Caller<?> callerMo32542B;
        C9801m.m32346f(kCallable, "<this>");
        if (kCallable instanceof KMutableProperty) {
            KProperty kProperty = (KProperty) kCallable;
            Field fieldM32466b = C9876c.m32466b(kProperty);
            if (fieldM32466b != null) {
                fieldM32466b.setAccessible(z);
            }
            Method methodM32467c = C9876c.m32467c(kProperty);
            if (methodM32467c != null) {
                methodM32467c.setAccessible(z);
            }
            Method methodM32469e = C9876c.m32469e((KMutableProperty) kCallable);
            if (methodM32469e == null) {
                return;
            }
            methodM32469e.setAccessible(z);
            return;
        }
        if (kCallable instanceof KProperty) {
            KProperty kProperty2 = (KProperty) kCallable;
            Field fieldM32466b2 = C9876c.m32466b(kProperty2);
            if (fieldM32466b2 != null) {
                fieldM32466b2.setAccessible(z);
            }
            Method methodM32467c2 = C9876c.m32467c(kProperty2);
            if (methodM32467c2 == null) {
                return;
            }
            methodM32467c2.setAccessible(z);
            return;
        }
        if (kCallable instanceof KProperty.b) {
            Field fieldM32466b3 = C9876c.m32466b(((KProperty.b) kCallable).mo32435n());
            if (fieldM32466b3 != null) {
                fieldM32466b3.setAccessible(z);
            }
            Method methodM32468d = C9876c.m32468d((KFunction) kCallable);
            if (methodM32468d == null) {
                return;
            }
            methodM32468d.setAccessible(z);
            return;
        }
        if (kCallable instanceof KMutableProperty.a) {
            Field fieldM32466b4 = C9876c.m32466b(((KMutableProperty.a) kCallable).mo32435n());
            if (fieldM32466b4 != null) {
                fieldM32466b4.setAccessible(z);
            }
            Method methodM32468d2 = C9876c.m32468d((KFunction) kCallable);
            if (methodM32468d2 == null) {
                return;
            }
            methodM32468d2.setAccessible(z);
            return;
        }
        if (!(kCallable instanceof KFunction)) {
            throw new UnsupportedOperationException("Unknown callable: " + kCallable + " (" + kCallable.getClass() + ')');
        }
        KFunction kFunction = (KFunction) kCallable;
        Method methodM32468d3 = C9876c.m32468d(kFunction);
        if (methodM32468d3 != null) {
            methodM32468d3.setAccessible(z);
        }
        KCallableImpl<?> kCallableImplM32557b = C9891g0.m32557b(kCallable);
        Object member = (kCallableImplM32557b == null || (callerMo32542B = kCallableImplM32557b.mo32542B()) == null) ? null : callerMo32542B.getMember();
        AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
        if (accessibleObject != null) {
            accessibleObject.setAccessible(true);
        }
        Constructor constructorM32465a = C9876c.m32465a(kFunction);
        if (constructorM32465a == null) {
            return;
        }
        constructorM32465a.setAccessible(z);
    }
}
