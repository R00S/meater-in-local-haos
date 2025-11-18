package androidx.datastore.preferences.protobuf;

import okhttp3.HttpUrl;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'g' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: JavaType.java */
/* renamed from: androidx.datastore.preferences.protobuf.b0 */
/* loaded from: classes.dex */
public final class EnumC0360b0 {

    /* renamed from: f */
    public static final EnumC0360b0 f2682f;

    /* renamed from: g */
    public static final EnumC0360b0 f2683g;

    /* renamed from: h */
    public static final EnumC0360b0 f2684h;

    /* renamed from: i */
    public static final EnumC0360b0 f2685i;

    /* renamed from: j */
    public static final EnumC0360b0 f2686j;

    /* renamed from: k */
    public static final EnumC0360b0 f2687k;

    /* renamed from: l */
    public static final EnumC0360b0 f2688l;

    /* renamed from: m */
    public static final EnumC0360b0 f2689m;

    /* renamed from: n */
    public static final EnumC0360b0 f2690n;

    /* renamed from: o */
    public static final EnumC0360b0 f2691o;

    /* renamed from: p */
    private static final /* synthetic */ EnumC0360b0[] f2692p;

    /* renamed from: q */
    private final Class<?> f2693q;

    /* renamed from: r */
    private final Class<?> f2694r;

    /* renamed from: s */
    private final Object f2695s;

    static {
        EnumC0360b0 enumC0360b0 = new EnumC0360b0("VOID", 0, Void.class, Void.class, null);
        f2682f = enumC0360b0;
        Class cls = Integer.TYPE;
        EnumC0360b0 enumC0360b02 = new EnumC0360b0("INT", 1, cls, Integer.class, 0);
        f2683g = enumC0360b02;
        EnumC0360b0 enumC0360b03 = new EnumC0360b0("LONG", 2, Long.TYPE, Long.class, 0L);
        f2684h = enumC0360b03;
        EnumC0360b0 enumC0360b04 = new EnumC0360b0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f2685i = enumC0360b04;
        EnumC0360b0 enumC0360b05 = new EnumC0360b0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f2686j = enumC0360b05;
        EnumC0360b0 enumC0360b06 = new EnumC0360b0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f2687k = enumC0360b06;
        EnumC0360b0 enumC0360b07 = new EnumC0360b0("STRING", 6, String.class, String.class, HttpUrl.FRAGMENT_ENCODE_SET);
        f2688l = enumC0360b07;
        EnumC0360b0 enumC0360b08 = new EnumC0360b0("BYTE_STRING", 7, AbstractC0377h.class, AbstractC0377h.class, AbstractC0377h.f2734f);
        f2689m = enumC0360b08;
        EnumC0360b0 enumC0360b09 = new EnumC0360b0("ENUM", 8, cls, Integer.class, null);
        f2690n = enumC0360b09;
        EnumC0360b0 enumC0360b010 = new EnumC0360b0("MESSAGE", 9, Object.class, Object.class, null);
        f2691o = enumC0360b010;
        f2692p = new EnumC0360b0[]{enumC0360b0, enumC0360b02, enumC0360b03, enumC0360b04, enumC0360b05, enumC0360b06, enumC0360b07, enumC0360b08, enumC0360b09, enumC0360b010};
    }

    private EnumC0360b0(String str, int i2, Class cls, Class cls2, Object obj) {
        this.f2693q = cls;
        this.f2694r = cls2;
        this.f2695s = obj;
    }

    public static EnumC0360b0 valueOf(String str) {
        return (EnumC0360b0) Enum.valueOf(EnumC0360b0.class, str);
    }

    public static EnumC0360b0[] values() {
        return (EnumC0360b0[]) f2692p.clone();
    }

    /* renamed from: g */
    public Class<?> m2577g() {
        return this.f2694r;
    }
}
