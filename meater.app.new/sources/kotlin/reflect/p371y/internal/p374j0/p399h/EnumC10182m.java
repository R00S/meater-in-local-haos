package kotlin.reflect.p371y.internal.p374j0.p399h;

import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10546u;

/* compiled from: DescriptorRenderer.kt */
/* renamed from: kotlin.f0.y.e.j0.h.m */
/* loaded from: classes3.dex */
public enum EnumC10182m {
    PLAIN { // from class: kotlin.f0.y.e.j0.h.m.b
        @Override // kotlin.reflect.p371y.internal.p374j0.p399h.EnumC10182m
        /* renamed from: k */
        public String mo35762k(String str) {
            C9801m.m32346f(str, "string");
            return str;
        }
    },
    HTML { // from class: kotlin.f0.y.e.j0.h.m.a
        @Override // kotlin.reflect.p371y.internal.p374j0.p399h.EnumC10182m
        /* renamed from: k */
        public String mo35762k(String str) {
            C9801m.m32346f(str, "string");
            return C10546u.m37507A(C10546u.m37507A(str, "<", "&lt;", false, 4, null), ">", "&gt;", false, 4, null);
        }
    };

    /* synthetic */ EnumC10182m(C9789g c9789g) {
        this();
    }

    /* renamed from: k */
    public abstract String mo35762k(String str);
}
