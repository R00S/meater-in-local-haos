package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10803n;
import kotlin.collections.C10813s;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10611m1;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.InterfaceC10707h;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.InterfaceC10721v;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10022b0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10040q;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10165h;

/* compiled from: ReflectJavaMember.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.t */
/* loaded from: classes2.dex */
public abstract class AbstractC10719t extends AbstractC10715p implements InterfaceC10707h, InterfaceC10721v, InterfaceC10040q {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.InterfaceC10721v
    /* renamed from: E */
    public int mo38089E() {
        return mo38106U().getModifiers();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10042s
    /* renamed from: Q */
    public boolean mo33623Q() {
        return InterfaceC10721v.a.m38119d(this);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10025d
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public C10704e mo33582l(C10160c c10160c) {
        return InterfaceC10707h.a.m38081a(this, c10160c);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10025d
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public List<C10704e> getAnnotations() {
        return InterfaceC10707h.a.m38082b(this);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10040q
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public C10711l mo33618P() {
        Class<?> declaringClass = mo38106U().getDeclaringClass();
        C9801m.m32345e(declaringClass, "member.declaringClass");
        return new C10711l(declaringClass);
    }

    /* renamed from: U */
    public abstract Member mo38106U();

    /* renamed from: V */
    protected final List<InterfaceC10022b0> m38113V(Type[] typeArr, Annotation[][] annotationArr, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        C9801m.m32346f(typeArr, "parameterTypes");
        C9801m.m32346f(annotationArr, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(typeArr.length);
        List<String> listM38063b = C10701c.f41171a.m38063b(mo38106U());
        int size = listM38063b != null ? listM38063b.size() - typeArr.length : 0;
        int length = typeArr.length;
        int i2 = 0;
        while (i2 < length) {
            AbstractC10725z abstractC10725zM38122a = AbstractC10725z.f41215a.m38122a(typeArr[i2]);
            if (listM38063b != null) {
                str = (String) C10813s.m38833X(listM38063b, i2 + size);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i2 + '+' + size + " (name=" + getName() + " type=" + abstractC10725zM38122a + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new C10700b0(abstractC10725zM38122a, annotationArr[i2], str, z && i2 == C10803n.m38721A(typeArr)));
            i2++;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC10719t) && C9801m.m32341a(mo38106U(), ((AbstractC10719t) obj).mo38106U());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10043t
    public C10163f getName() {
        String name = mo38106U().getName();
        C10163f c10163fM35454x = name != null ? C10163f.m35454x(name) : null;
        return c10163fM35454x == null ? C10165h.f39266b : c10163fM35454x;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10042s
    public AbstractC10611m1 getVisibility() {
        return InterfaceC10721v.a.m38116a(this);
    }

    public int hashCode() {
        return mo38106U().hashCode();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10042s
    public boolean isAbstract() {
        return InterfaceC10721v.a.m38117b(this);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10042s
    public boolean isFinal() {
        return InterfaceC10721v.a.m38118c(this);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10025d
    /* renamed from: m */
    public boolean mo33583m() {
        return InterfaceC10707h.a.m38083c(this);
    }

    public String toString() {
        return getClass().getName() + ": " + mo38106U();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.InterfaceC10707h
    /* renamed from: w */
    public AnnotatedElement mo38048w() {
        Member memberMo38106U = mo38106U();
        C9801m.m32344d(memberMo38106U, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) memberMo38106U;
    }
}
