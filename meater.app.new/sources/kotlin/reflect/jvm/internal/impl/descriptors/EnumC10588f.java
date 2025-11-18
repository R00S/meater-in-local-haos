package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: ClassKind.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f */
/* loaded from: classes2.dex */
public enum EnumC10588f {
    CLASS("class"),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY(null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");


    /* renamed from: m */
    private final String f40751m;

    EnumC10588f(String str) {
        this.f40751m = str;
    }

    /* renamed from: k */
    public final boolean m37681k() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
