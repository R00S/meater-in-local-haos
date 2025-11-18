package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.List;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10025d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;

/* compiled from: ReflectJavaAnnotationOwner.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.h */
/* loaded from: classes2.dex */
public interface InterfaceC10707h extends InterfaceC10025d {

    /* compiled from: ReflectJavaAnnotationOwner.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.h$a */
    public static final class a {
        /* renamed from: a */
        public static C10704e m38081a(InterfaceC10707h interfaceC10707h, C10160c c10160c) {
            Annotation[] declaredAnnotations;
            C9801m.m32346f(c10160c, "fqName");
            AnnotatedElement annotatedElementMo38048w = interfaceC10707h.mo38048w();
            if (annotatedElementMo38048w == null || (declaredAnnotations = annotatedElementMo38048w.getDeclaredAnnotations()) == null) {
                return null;
            }
            return C10708i.m38084a(declaredAnnotations, c10160c);
        }

        /* renamed from: b */
        public static List<C10704e> m38082b(InterfaceC10707h interfaceC10707h) {
            Annotation[] declaredAnnotations;
            List<C10704e> listM38085b;
            AnnotatedElement annotatedElementMo38048w = interfaceC10707h.mo38048w();
            return (annotatedElementMo38048w == null || (declaredAnnotations = annotatedElementMo38048w.getDeclaredAnnotations()) == null || (listM38085b = C10708i.m38085b(declaredAnnotations)) == null) ? C10817u.m38888j() : listM38085b;
        }

        /* renamed from: c */
        public static boolean m38083c(InterfaceC10707h interfaceC10707h) {
            return false;
        }
    }

    /* renamed from: w */
    AnnotatedElement mo38048w();
}
