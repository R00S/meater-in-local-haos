package kotlin.reflect.p371y.internal.p374j0.p399h;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.C10782c0;
import kotlin.collections.C10803n;
import kotlin.jvm.internal.C9789g;

/* compiled from: DescriptorRenderer.kt */
/* renamed from: kotlin.f0.y.e.j0.h.e */
/* loaded from: classes3.dex */
public enum EnumC10174e {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);


    /* renamed from: f */
    public static final a f39407f = new a(null);

    /* renamed from: g */
    public static final Set<EnumC10174e> f39408g;

    /* renamed from: h */
    public static final Set<EnumC10174e> f39409h;

    /* renamed from: x */
    private final boolean f39425x;

    /* compiled from: DescriptorRenderer.kt */
    /* renamed from: kotlin.f0.y.e.j0.h.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    static {
        EnumC10174e[] enumC10174eArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (EnumC10174e enumC10174e : enumC10174eArrValues) {
            if (enumC10174e.f39425x) {
                arrayList.add(enumC10174e);
            }
        }
        f39408g = C10782c0.m38574I0(arrayList);
        f39409h = C10803n.m38758l0(values());
    }

    EnumC10174e(boolean z) {
        this.f39425x = z;
    }
}
