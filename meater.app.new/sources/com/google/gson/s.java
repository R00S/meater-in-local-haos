package com.google.gson;

import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ToNumberPolicy.java */
/* loaded from: classes2.dex */
public abstract class s implements t {

    /* renamed from: B, reason: collision with root package name */
    public static final s f39128B;

    /* renamed from: C, reason: collision with root package name */
    public static final s f39129C;

    /* renamed from: D, reason: collision with root package name */
    public static final s f39130D;

    /* renamed from: E, reason: collision with root package name */
    public static final s f39131E;

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ s[] f39132F;

    /* compiled from: ToNumberPolicy.java */
    enum a extends s {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.t
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Double c(Q9.a aVar) {
            return Double.valueOf(aVar.s());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        f39128B = aVar;
        s sVar = new s("LAZILY_PARSED_NUMBER", 1) { // from class: com.google.gson.s.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.t
            public Number c(Q9.a aVar2) {
                return new com.google.gson.internal.f(aVar2.K());
            }
        };
        f39129C = sVar;
        s sVar2 = new s("LONG_OR_DOUBLE", 2) { // from class: com.google.gson.s.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.t
            public Number c(Q9.a aVar2) throws IOException, NumberFormatException {
                String strK = aVar2.K();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(strK));
                    } catch (NumberFormatException e10) {
                        throw new JsonParseException("Cannot parse " + strK + "; at path " + aVar2.l(), e10);
                    }
                } catch (NumberFormatException unused) {
                    Double dValueOf = Double.valueOf(strK);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (!aVar2.n()) {
                            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar2.l());
                        }
                    }
                    return dValueOf;
                }
            }
        };
        f39130D = sVar2;
        s sVar3 = new s("BIG_DECIMAL", 3) { // from class: com.google.gson.s.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.t
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public BigDecimal c(Q9.a aVar2) throws IOException {
                String strK = aVar2.K();
                try {
                    return new BigDecimal(strK);
                } catch (NumberFormatException e10) {
                    throw new JsonParseException("Cannot parse " + strK + "; at path " + aVar2.l(), e10);
                }
            }
        };
        f39131E = sVar3;
        f39132F = new s[]{aVar, sVar, sVar2, sVar3};
    }

    private s(String str, int i10) {
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f39132F.clone();
    }

    /* synthetic */ s(String str, int i10, a aVar) {
        this(str, i10);
    }
}
