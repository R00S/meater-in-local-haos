package com.google.gson.p215t.p216n;

import com.google.gson.AbstractC8578q;
import com.google.gson.C8566e;
import com.google.gson.InterfaceC8579r;
import com.google.gson.p215t.C8595h;
import com.google.gson.p219u.C8619a;
import com.google.gson.stream.C8585a;
import com.google.gson.stream.C8587c;
import com.google.gson.stream.EnumC8586b;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: ObjectTypeAdapter.java */
/* renamed from: com.google.gson.t.n.h */
/* loaded from: classes2.dex */
public final class C8608h extends AbstractC8578q<Object> {

    /* renamed from: a */
    public static final InterfaceC8579r f32603a = new a();

    /* renamed from: b */
    private final C8566e f32604b;

    /* compiled from: ObjectTypeAdapter.java */
    /* renamed from: com.google.gson.t.n.h$a */
    static class a implements InterfaceC8579r {
        a() {
        }

        @Override // com.google.gson.InterfaceC8579r
        /* renamed from: b */
        public <T> AbstractC8578q<T> mo26979b(C8566e c8566e, C8619a<T> c8619a) {
            if (c8619a.getRawType() == Object.class) {
                return new C8608h(c8566e);
            }
            return null;
        }
    }

    /* compiled from: ObjectTypeAdapter.java */
    /* renamed from: com.google.gson.t.n.h$b */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f32605a;

        static {
            int[] iArr = new int[EnumC8586b.values().length];
            f32605a = iArr;
            try {
                iArr[EnumC8586b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32605a[EnumC8586b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32605a[EnumC8586b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32605a[EnumC8586b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32605a[EnumC8586b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32605a[EnumC8586b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    C8608h(C8566e c8566e) {
        this.f32604b = c8566e;
    }

    @Override // com.google.gson.AbstractC8578q
    /* renamed from: b */
    public Object mo26938b(C8585a c8585a) throws IOException {
        switch (b.f32605a[c8585a.mo27001Q().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                c8585a.mo27002a();
                while (c8585a.mo27009l()) {
                    arrayList.add(mo26938b(c8585a));
                }
                c8585a.mo27006f();
                return arrayList;
            case 2:
                C8595h c8595h = new C8595h();
                c8585a.mo27004b();
                while (c8585a.mo27009l()) {
                    c8595h.put(c8585a.mo26998D(), mo26938b(c8585a));
                }
                c8585a.mo27008j();
                return c8595h;
            case 3:
                return c8585a.mo27000K();
            case 4:
                return Double.valueOf(c8585a.mo27014z());
            case 5:
                return Boolean.valueOf(c8585a.mo27013y());
            case 6:
                c8585a.mo26999I();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.AbstractC8578q
    /* renamed from: d */
    public void mo26939d(C8587c c8587c, Object obj) throws IOException {
        if (obj == null) {
            c8587c.mo27043y();
            return;
        }
        AbstractC8578q abstractC8578qM26927k = this.f32604b.m26927k(obj.getClass());
        if (!(abstractC8578qM26927k instanceof C8608h)) {
            abstractC8578qM26927k.mo26939d(c8587c, obj);
        } else {
            c8587c.mo27036d();
            c8587c.mo27038j();
        }
    }
}
