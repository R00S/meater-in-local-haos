package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10813s;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.InterfaceC10707h;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10048y;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: ReflectJavaTypeParameter.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.a0 */
/* loaded from: classes2.dex */
public final class C10698a0 extends AbstractC10715p implements InterfaceC10707h, InterfaceC10048y {

    /* renamed from: a */
    private final TypeVariable<?> f41160a;

    public C10698a0(TypeVariable<?> typeVariable) {
        C9801m.m32346f(typeVariable, "typeVariable");
        this.f41160a = typeVariable;
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

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10048y
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public List<C10713n> getUpperBounds() {
        Type[] bounds = this.f41160a.getBounds();
        C9801m.m32345e(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new C10713n(type));
        }
        C10713n c10713n = (C10713n) C10813s.m38870u0(arrayList);
        return C9801m.m32341a(c10713n != null ? c10713n.mo38066R() : null, Object.class) ? C10817u.m38888j() : arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10698a0) && C9801m.m32341a(this.f41160a, ((C10698a0) obj).f41160a);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10043t
    public C10163f getName() {
        C10163f c10163fM35454x = C10163f.m35454x(this.f41160a.getName());
        C9801m.m32345e(c10163fM35454x, "identifier(typeVariable.name)");
        return c10163fM35454x;
    }

    public int hashCode() {
        return this.f41160a.hashCode();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10025d
    /* renamed from: m */
    public boolean mo33583m() {
        return InterfaceC10707h.a.m38083c(this);
    }

    public String toString() {
        return C10698a0.class.getName() + ": " + this.f41160a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.InterfaceC10707h
    /* renamed from: w */
    public AnnotatedElement mo38048w() {
        TypeVariable<?> typeVariable = this.f41160a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }
}
