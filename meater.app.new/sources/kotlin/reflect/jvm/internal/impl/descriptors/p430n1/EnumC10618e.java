package kotlin.reflect.jvm.internal.impl.descriptors.p430n1;

import kotlin.jvm.internal.C9789g;
import kotlin.reflect.p371y.internal.p374j0.p422m.p423u.C10485a;

/* compiled from: AnnotationUseSiteTarget.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.e */
/* loaded from: classes2.dex */
public enum EnumC10618e {
    FIELD(null, 1, null),
    FILE(null, 1, null),
    PROPERTY(null, 1, null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null, 1, null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");


    /* renamed from: p */
    private final String f40801p;

    EnumC10618e(String str) {
        this.f40801p = str == null ? C10485a.m37229f(name()) : str;
    }

    /* renamed from: k */
    public final String m37730k() {
        return this.f40801p;
    }

    /* synthetic */ EnumC10618e(String str, int i2, C9789g c9789g) {
        this((i2 & 1) != 0 ? null : str);
    }
}
