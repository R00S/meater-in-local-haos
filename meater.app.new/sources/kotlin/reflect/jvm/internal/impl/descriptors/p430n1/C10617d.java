package kotlin.reflect.jvm.internal.impl.descriptors.p430n1;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10172c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: AnnotationDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.d */
/* loaded from: classes2.dex */
public class C10617d implements InterfaceC10616c {

    /* renamed from: a */
    private final AbstractC10344e0 f40788a;

    /* renamed from: b */
    private final Map<C10163f, AbstractC10211g<?>> f40789b;

    /* renamed from: c */
    private final InterfaceC10741z0 f40790c;

    public C10617d(AbstractC10344e0 abstractC10344e0, Map<C10163f, AbstractC10211g<?>> map, InterfaceC10741z0 interfaceC10741z0) {
        if (abstractC10344e0 == null) {
            m37728b(0);
        }
        if (map == null) {
            m37728b(1);
        }
        if (interfaceC10741z0 == null) {
            m37728b(2);
        }
        this.f40788a = abstractC10344e0;
        this.f40789b = map;
        this.f40790c = interfaceC10741z0;
    }

    /* renamed from: b */
    private static /* synthetic */ void m37728b(int i2) {
        String str = (i2 == 3 || i2 == 4 || i2 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 3 || i2 == 4 || i2 == 5) ? 2 : 3];
        if (i2 == 1) {
            objArr[0] = "valueArguments";
        } else if (i2 == 2) {
            objArr[0] = "source";
        } else if (i2 == 3 || i2 == 4 || i2 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i2 == 3) {
            objArr[1] = "getType";
        } else if (i2 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i2 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i2 != 3 && i2 != 4 && i2 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i2 != 3 && i2 != 4 && i2 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c
    /* renamed from: a */
    public Map<C10163f, AbstractC10211g<?>> mo33159a() {
        Map<C10163f, AbstractC10211g<?>> map = this.f40789b;
        if (map == null) {
            m37728b(4);
        }
        return map;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c
    /* renamed from: d */
    public C10160c mo33162d() {
        return InterfaceC10616c.a.m37727a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c
    public AbstractC10344e0 getType() {
        AbstractC10344e0 abstractC10344e0 = this.f40788a;
        if (abstractC10344e0 == null) {
            m37728b(3);
        }
        return abstractC10344e0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c
    /* renamed from: t */
    public InterfaceC10741z0 mo33164t() {
        InterfaceC10741z0 interfaceC10741z0 = this.f40790c;
        if (interfaceC10741z0 == null) {
            m37728b(5);
        }
        return interfaceC10741z0;
    }

    public String toString() {
        return AbstractC10172c.f39377g.mo35501r(this, null);
    }
}
