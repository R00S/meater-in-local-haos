package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FieldNamingPolicy.java */
/* renamed from: com.google.gson.c */
/* loaded from: classes2.dex */
public abstract class EnumC8564c implements InterfaceC8565d {

    /* renamed from: f */
    public static final EnumC8564c f32414f;

    /* renamed from: g */
    public static final EnumC8564c f32415g;

    /* renamed from: h */
    public static final EnumC8564c f32416h;

    /* renamed from: i */
    public static final EnumC8564c f32417i;

    /* renamed from: j */
    public static final EnumC8564c f32418j;

    /* renamed from: k */
    public static final EnumC8564c f32419k;

    /* renamed from: l */
    private static final /* synthetic */ EnumC8564c[] f32420l;

    /* compiled from: FieldNamingPolicy.java */
    /* renamed from: com.google.gson.c$a */
    enum a extends EnumC8564c {
        a(String str, int i2) {
            super(str, i2, null);
        }

        @Override // com.google.gson.InterfaceC8565d
        /* renamed from: g */
        public String mo26915g(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f32414f = aVar;
        EnumC8564c enumC8564c = new EnumC8564c("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.c.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC8565d
            /* renamed from: g */
            public String mo26915g(Field field) {
                return EnumC8564c.m26914u(field.getName());
            }
        };
        f32415g = enumC8564c;
        EnumC8564c enumC8564c2 = new EnumC8564c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.c.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC8565d
            /* renamed from: g */
            public String mo26915g(Field field) {
                return EnumC8564c.m26914u(EnumC8564c.m26913q(field.getName(), " "));
            }
        };
        f32416h = enumC8564c2;
        EnumC8564c enumC8564c3 = new EnumC8564c("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.c.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC8565d
            /* renamed from: g */
            public String mo26915g(Field field) {
                return EnumC8564c.m26913q(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        f32417i = enumC8564c3;
        EnumC8564c enumC8564c4 = new EnumC8564c("LOWER_CASE_WITH_DASHES", 4) { // from class: com.google.gson.c.e
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC8565d
            /* renamed from: g */
            public String mo26915g(Field field) {
                return EnumC8564c.m26913q(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        f32418j = enumC8564c4;
        EnumC8564c enumC8564c5 = new EnumC8564c("LOWER_CASE_WITH_DOTS", 5) { // from class: com.google.gson.c.f
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC8565d
            /* renamed from: g */
            public String mo26915g(Field field) {
                return EnumC8564c.m26913q(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        f32419k = enumC8564c5;
        f32420l = new EnumC8564c[]{aVar, enumC8564c, enumC8564c2, enumC8564c3, enumC8564c4, enumC8564c5};
    }

    private EnumC8564c(String str, int i2) {
    }

    /* renamed from: k */
    private static String m26912k(char c2, String str, int i2) {
        if (i2 >= str.length()) {
            return String.valueOf(c2);
        }
        return c2 + str.substring(i2);
    }

    /* renamed from: q */
    static String m26913q(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    /* renamed from: u */
    static String m26914u(String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        char cCharAt = str.charAt(0);
        int length = str.length();
        while (i2 < length - 1 && !Character.isLetter(cCharAt)) {
            sb.append(cCharAt);
            i2++;
            cCharAt = str.charAt(i2);
        }
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        sb.append(m26912k(Character.toUpperCase(cCharAt), str, i2 + 1));
        return sb.toString();
    }

    public static EnumC8564c valueOf(String str) {
        return (EnumC8564c) Enum.valueOf(EnumC8564c.class, str);
    }

    public static EnumC8564c[] values() {
        return (EnumC8564c[]) f32420l.clone();
    }

    /* synthetic */ EnumC8564c(String str, int i2, a aVar) {
        this(str, i2);
    }
}
