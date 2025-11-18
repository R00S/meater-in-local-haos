package com.google.gson.internal.bind;

import Q9.c;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.s;
import com.google.gson.t;
import com.google.gson.u;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class NumberTypeAdapter extends TypeAdapter<Number> {

    /* renamed from: b, reason: collision with root package name */
    private static final u f38909b = b(s.f39129C);

    /* renamed from: a, reason: collision with root package name */
    private final t f38910a;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38912a;

        static {
            int[] iArr = new int[Q9.b.values().length];
            f38912a = iArr;
            try {
                iArr[Q9.b.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38912a[Q9.b.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38912a[Q9.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private NumberTypeAdapter(t tVar) {
        this.f38910a = tVar;
    }

    public static u a(t tVar) {
        return tVar == s.f39129C ? f38909b : b(tVar);
    }

    private static u b(t tVar) {
        return new u() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // com.google.gson.u
            public <T> TypeAdapter<T> b(Gson gson, P9.a<T> aVar) {
                if (aVar.c() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Number read(Q9.a aVar) throws IOException {
        Q9.b bVarN = aVar.N();
        int i10 = a.f38912a[bVarN.ordinal()];
        if (i10 == 1) {
            aVar.z();
            return null;
        }
        if (i10 == 2 || i10 == 3) {
            return this.f38910a.c(aVar);
        }
        throw new JsonSyntaxException("Expecting number, got: " + bVarN + "; at path " + aVar.h());
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void write(c cVar, Number number) throws IOException {
        cVar.Q(number);
    }
}
