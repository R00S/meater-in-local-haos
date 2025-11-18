package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.reflect.Modifier;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10611m1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10608l1;
import kotlin.reflect.jvm.internal.impl.descriptors.p433q1.C10679a;
import kotlin.reflect.jvm.internal.impl.descriptors.p433q1.C10680b;
import kotlin.reflect.jvm.internal.impl.descriptors.p433q1.C10681c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10042s;

/* compiled from: ReflectJavaModifierListOwner.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.v */
/* loaded from: classes2.dex */
public interface InterfaceC10721v extends InterfaceC10042s {

    /* compiled from: ReflectJavaModifierListOwner.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.v$a */
    public static final class a {
        /* renamed from: a */
        public static AbstractC10611m1 m38116a(InterfaceC10721v interfaceC10721v) {
            int iMo38089E = interfaceC10721v.mo38089E();
            return Modifier.isPublic(iMo38089E) ? C10608l1.h.f40780c : Modifier.isPrivate(iMo38089E) ? C10608l1.e.f40777c : Modifier.isProtected(iMo38089E) ? Modifier.isStatic(iMo38089E) ? C10681c.f41132c : C10680b.f41131c : C10679a.f41130c;
        }

        /* renamed from: b */
        public static boolean m38117b(InterfaceC10721v interfaceC10721v) {
            return Modifier.isAbstract(interfaceC10721v.mo38089E());
        }

        /* renamed from: c */
        public static boolean m38118c(InterfaceC10721v interfaceC10721v) {
            return Modifier.isFinal(interfaceC10721v.mo38089E());
        }

        /* renamed from: d */
        public static boolean m38119d(InterfaceC10721v interfaceC10721v) {
            return Modifier.isStatic(interfaceC10721v.mo38089E());
        }
    }

    /* renamed from: E */
    int mo38089E();
}
