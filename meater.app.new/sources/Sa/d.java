package Sa;

import Hb.U;
import Ra.h0;
import Sa.c;
import java.util.Map;
import vb.AbstractC4943g;

/* compiled from: AnnotationDescriptorImpl.java */
/* loaded from: classes3.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final U f15609a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<qb.f, AbstractC4943g<?>> f15610b;

    /* renamed from: c, reason: collision with root package name */
    private final h0 f15611c;

    public d(U u10, Map<qb.f, AbstractC4943g<?>> map, h0 h0Var) {
        if (u10 == null) {
            c(0);
        }
        if (map == null) {
            c(1);
        }
        if (h0Var == null) {
            c(2);
        }
        this.f15609a = u10;
        this.f15610b = map;
        this.f15611c = h0Var;
    }

    private static /* synthetic */ void c(int i10) {
        String str = (i10 == 3 || i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "valueArguments";
        } else if (i10 == 2) {
            objArr[0] = "source";
        } else if (i10 == 3 || i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i10 == 3) {
            objArr[1] = "getType";
        } else if (i10 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Sa.c
    public U a() {
        U u10 = this.f15609a;
        if (u10 == null) {
            c(3);
        }
        return u10;
    }

    @Override // Sa.c
    public Map<qb.f, AbstractC4943g<?>> b() {
        Map<qb.f, AbstractC4943g<?>> map = this.f15610b;
        if (map == null) {
            c(4);
        }
        return map;
    }

    @Override // Sa.c
    public qb.c f() {
        return c.a.a(this);
    }

    @Override // Sa.c
    public h0 j() {
        h0 h0Var = this.f15611c;
        if (h0Var == null) {
            c(5);
        }
        return h0Var;
    }

    public String toString() {
        return sb.n.f49596h.P(this, null);
    }
}
