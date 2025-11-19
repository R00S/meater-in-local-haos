package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FieldNamingPolicy.java */
/* loaded from: classes2.dex */
public abstract class c implements com.google.gson.d {

    /* renamed from: B, reason: collision with root package name */
    public static final c f38841B;

    /* renamed from: C, reason: collision with root package name */
    public static final c f38842C;

    /* renamed from: D, reason: collision with root package name */
    public static final c f38843D;

    /* renamed from: E, reason: collision with root package name */
    public static final c f38844E;

    /* renamed from: F, reason: collision with root package name */
    public static final c f38845F;

    /* renamed from: G, reason: collision with root package name */
    public static final c f38846G;

    /* renamed from: H, reason: collision with root package name */
    public static final c f38847H;

    /* renamed from: I, reason: collision with root package name */
    private static final /* synthetic */ c[] f38848I;

    /* compiled from: FieldNamingPolicy.java */
    enum a extends c {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.d
        public String c(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f38841B = aVar;
        c cVar = new c("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.c.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.d
            public String c(Field field) {
                return c.n(field.getName());
            }
        };
        f38842C = cVar;
        c cVar2 = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.c.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.d
            public String c(Field field) {
                return c.n(c.j(field.getName(), ' '));
            }
        };
        f38843D = cVar2;
        c cVar3 = new c("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.c.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.d
            public String c(Field field) {
                return c.j(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        f38844E = cVar3;
        c cVar4 = new c("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: com.google.gson.c.e
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.d
            public String c(Field field) {
                return c.j(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        f38845F = cVar4;
        c cVar5 = new c("LOWER_CASE_WITH_DASHES", 5) { // from class: com.google.gson.c.f
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.d
            public String c(Field field) {
                return c.j(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        f38846G = cVar5;
        c cVar6 = new c("LOWER_CASE_WITH_DOTS", 6) { // from class: com.google.gson.c.g
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.d
            public String c(Field field) {
                return c.j(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        f38847H = cVar6;
        f38848I = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
    }

    private c(String str, int i10) {
    }

    static String j(String str, char c10) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt) && sb2.length() != 0) {
                sb2.append(c10);
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    static String n(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i10 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
            }
        }
        return str;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f38848I.clone();
    }

    /* synthetic */ c(String str, int i10, a aVar) {
        this(str, i10);
    }
}
