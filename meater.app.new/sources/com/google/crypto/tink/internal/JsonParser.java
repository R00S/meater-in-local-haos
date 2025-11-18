package com.google.crypto.tink.internal;

import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public final class JsonParser {

    /* renamed from: a, reason: collision with root package name */
    private static final JsonElementTypeAdapter f37637a = new JsonElementTypeAdapter(null);

    private static final class JsonElementTypeAdapter extends TypeAdapter<com.google.gson.j> {
        private JsonElementTypeAdapter() {
        }

        private com.google.gson.j b(Q9.a aVar, Q9.b bVar) throws IOException {
            int i10 = a.f37638a[bVar.ordinal()];
            if (i10 == 3) {
                String strK = aVar.K();
                if (JsonParser.a(strK)) {
                    return new com.google.gson.n(strK);
                }
                throw new IOException("illegal characters in string");
            }
            if (i10 == 4) {
                return new com.google.gson.n(new b(aVar.K()));
            }
            if (i10 == 5) {
                return new com.google.gson.n(Boolean.valueOf(aVar.q()));
            }
            if (i10 == 6) {
                aVar.z();
                return com.google.gson.k.f39117B;
            }
            throw new IllegalStateException("Unexpected token: " + bVar);
        }

        private com.google.gson.j c(Q9.a aVar, Q9.b bVar) throws IOException {
            int i10 = a.f37638a[bVar.ordinal()];
            if (i10 == 1) {
                aVar.a();
                return new com.google.gson.g();
            }
            if (i10 != 2) {
                return null;
            }
            aVar.b();
            return new com.google.gson.l();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.google.gson.j read(Q9.a aVar) throws IOException {
            String strX;
            Q9.b bVarN = aVar.N();
            com.google.gson.j jVarC = c(aVar, bVarN);
            if (jVarC == null) {
                return b(aVar, bVarN);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (aVar.m()) {
                    if (jVarC instanceof com.google.gson.l) {
                        strX = aVar.x();
                        if (!JsonParser.a(strX)) {
                            throw new IOException("illegal characters in string");
                        }
                    } else {
                        strX = null;
                    }
                    Q9.b bVarN2 = aVar.N();
                    com.google.gson.j jVarC2 = c(aVar, bVarN2);
                    boolean z10 = jVarC2 != null;
                    if (jVarC2 == null) {
                        jVarC2 = b(aVar, bVarN2);
                    }
                    if (jVarC instanceof com.google.gson.g) {
                        ((com.google.gson.g) jVarC).A(jVarC2);
                    } else {
                        com.google.gson.l lVar = (com.google.gson.l) jVarC;
                        if (lVar.F(strX)) {
                            throw new IOException("duplicate key: " + strX);
                        }
                        lVar.A(strX, jVarC2);
                    }
                    if (z10) {
                        arrayDeque.addLast(jVarC);
                        if (arrayDeque.size() > 100) {
                            throw new IOException("too many recursions");
                        }
                        jVarC = jVarC2;
                    } else {
                        continue;
                    }
                } else {
                    if (jVarC instanceof com.google.gson.g) {
                        aVar.f();
                    } else {
                        aVar.g();
                    }
                    if (arrayDeque.isEmpty()) {
                        return jVarC;
                    }
                    jVarC = (com.google.gson.j) arrayDeque.removeLast();
                }
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void write(Q9.c cVar, com.google.gson.j jVar) {
            throw new UnsupportedOperationException("write is not supported");
        }

        /* synthetic */ JsonElementTypeAdapter(a aVar) {
            this();
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37638a;

        static {
            int[] iArr = new int[Q9.b.values().length];
            f37638a = iArr;
            try {
                iArr[Q9.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37638a[Q9.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37638a[Q9.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37638a[Q9.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37638a[Q9.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37638a[Q9.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static final class b extends Number {

        /* renamed from: B, reason: collision with root package name */
        private final String f37639B;

        public b(String str) {
            this.f37639B = str;
        }

        @Override // java.lang.Number
        public double doubleValue() {
            return Double.parseDouble(this.f37639B);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f37639B.equals(((b) obj).f37639B);
            }
            return false;
        }

        @Override // java.lang.Number
        public float floatValue() {
            return Float.parseFloat(this.f37639B);
        }

        public int hashCode() {
            return this.f37639B.hashCode();
        }

        @Override // java.lang.Number
        public int intValue() {
            try {
                try {
                    return Integer.parseInt(this.f37639B);
                } catch (NumberFormatException unused) {
                    return new BigDecimal(this.f37639B).intValue();
                }
            } catch (NumberFormatException unused2) {
                return (int) Long.parseLong(this.f37639B);
            }
        }

        @Override // java.lang.Number
        public long longValue() {
            try {
                return Long.parseLong(this.f37639B);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f37639B).longValue();
            }
        }

        public String toString() {
            return this.f37639B;
        }
    }

    public static boolean a(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 != length) {
            char cCharAt = str.charAt(i10);
            int i11 = i10 + 1;
            if (!Character.isSurrogate(cCharAt)) {
                i10 = i11;
            } else {
                if (Character.isLowSurrogate(cCharAt) || i11 == length || !Character.isLowSurrogate(str.charAt(i11))) {
                    return false;
                }
                i10 += 2;
            }
        }
        return true;
    }
}
