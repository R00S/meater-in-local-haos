package com.google.gson.internal.bind;

import Q9.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.g;
import com.google.gson.s;
import com.google.gson.t;
import com.google.gson.u;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ObjectTypeAdapter extends TypeAdapter<Object> {

    /* renamed from: c, reason: collision with root package name */
    private static final u f38913c = b(s.f39128B);

    /* renamed from: a, reason: collision with root package name */
    private final Gson f38914a;

    /* renamed from: b, reason: collision with root package name */
    private final t f38915b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38917a;

        static {
            int[] iArr = new int[Q9.b.values().length];
            f38917a = iArr;
            try {
                iArr[Q9.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38917a[Q9.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38917a[Q9.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38917a[Q9.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38917a[Q9.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38917a[Q9.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static u a(t tVar) {
        return tVar == s.f39128B ? f38913c : b(tVar);
    }

    private static u b(final t tVar) {
        return new u() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
            @Override // com.google.gson.u
            public <T> TypeAdapter<T> b(Gson gson, P9.a<T> aVar) {
                if (aVar.c() == Object.class) {
                    return new ObjectTypeAdapter(gson, tVar);
                }
                return null;
            }
        };
    }

    private Object c(Q9.a aVar, Q9.b bVar) throws IOException {
        int i10 = a.f38917a[bVar.ordinal()];
        if (i10 == 3) {
            return aVar.K();
        }
        if (i10 == 4) {
            return this.f38915b.c(aVar);
        }
        if (i10 == 5) {
            return Boolean.valueOf(aVar.q());
        }
        if (i10 == 6) {
            aVar.z();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }

    private Object d(Q9.a aVar, Q9.b bVar) throws IOException {
        int i10 = a.f38917a[bVar.ordinal()];
        if (i10 == 1) {
            aVar.a();
            return new ArrayList();
        }
        if (i10 != 2) {
            return null;
        }
        aVar.b();
        return new g();
    }

    @Override // com.google.gson.TypeAdapter
    public Object read(Q9.a aVar) throws IOException {
        Q9.b bVarN = aVar.N();
        Object objD = d(aVar, bVarN);
        if (objD == null) {
            return c(aVar, bVarN);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.m()) {
                String strX = objD instanceof Map ? aVar.x() : null;
                Q9.b bVarN2 = aVar.N();
                Object objD2 = d(aVar, bVarN2);
                boolean z10 = objD2 != null;
                if (objD2 == null) {
                    objD2 = c(aVar, bVarN2);
                }
                if (objD instanceof List) {
                    ((List) objD).add(objD2);
                } else {
                    ((Map) objD).put(strX, objD2);
                }
                if (z10) {
                    arrayDeque.addLast(objD);
                    objD = objD2;
                }
            } else {
                if (objD instanceof List) {
                    aVar.f();
                } else {
                    aVar.g();
                }
                if (arrayDeque.isEmpty()) {
                    return objD;
                }
                objD = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void write(c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.p();
            return;
        }
        TypeAdapter typeAdapterN = this.f38914a.n(obj.getClass());
        if (!(typeAdapterN instanceof ObjectTypeAdapter)) {
            typeAdapterN.write(cVar, obj);
        } else {
            cVar.d();
            cVar.g();
        }
    }

    private ObjectTypeAdapter(Gson gson, t tVar) {
        this.f38914a = gson;
        this.f38915b = tVar;
    }
}
