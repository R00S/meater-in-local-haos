package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xu */
/* loaded from: classes2.dex */
final class C7352xu {

    /* renamed from: a */
    private static final AbstractC7278vu<?> f20983a = new C7315wu();

    /* renamed from: b */
    private static final AbstractC7278vu<?> f20984b = m16046a();

    /* renamed from: a */
    private static AbstractC7278vu<?> m16046a() {
        try {
            return (AbstractC7278vu) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    static AbstractC7278vu<?> m16047b() {
        return f20983a;
    }

    /* renamed from: c */
    static AbstractC7278vu<?> m16048c() {
        AbstractC7278vu<?> abstractC7278vu = f20984b;
        if (abstractC7278vu != null) {
            return abstractC7278vu;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
