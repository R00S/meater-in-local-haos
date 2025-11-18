package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LongSerializationPolicy.java */
/* renamed from: com.google.gson.p */
/* loaded from: classes2.dex */
public abstract class EnumC8577p {

    /* renamed from: f */
    public static final EnumC8577p f32453f;

    /* renamed from: g */
    public static final EnumC8577p f32454g;

    /* renamed from: h */
    private static final /* synthetic */ EnumC8577p[] f32455h;

    /* compiled from: LongSerializationPolicy.java */
    /* renamed from: com.google.gson.p$a */
    enum a extends EnumC8577p {
        a(String str, int i2) {
            super(str, i2, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f32453f = aVar;
        EnumC8577p enumC8577p = new EnumC8577p("STRING", 1) { // from class: com.google.gson.p.b
            {
                a aVar2 = null;
            }
        };
        f32454g = enumC8577p;
        f32455h = new EnumC8577p[]{aVar, enumC8577p};
    }

    private EnumC8577p(String str, int i2) {
    }

    public static EnumC8577p valueOf(String str) {
        return (EnumC8577p) Enum.valueOf(EnumC8577p.class, str);
    }

    public static EnumC8577p[] values() {
        return (EnumC8577p[]) f32455h.clone();
    }

    /* synthetic */ EnumC8577p(String str, int i2, a aVar) {
        this(str, i2);
    }
}
