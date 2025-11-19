package com.google.gson.internal;

import com.google.gson.r;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* compiled from: ReflectionAccessFilterHelper.java */
/* loaded from: classes2.dex */
public class k {

    /* compiled from: ReflectionAccessFilterHelper.java */
    private static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f39093a;

        /* compiled from: ReflectionAccessFilterHelper.java */
        class a extends b {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Method f39094b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Method method) {
                super();
                this.f39094b = method;
            }

            @Override // com.google.gson.internal.k.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.f39094b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e10) {
                    throw new RuntimeException("Failed invoking canAccess", e10);
                }
            }
        }

        /* compiled from: ReflectionAccessFilterHelper.java */
        /* renamed from: com.google.gson.internal.k$b$b, reason: collision with other inner class name */
        class C0497b extends b {
            C0497b() {
                super();
            }

            @Override // com.google.gson.internal.k.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        static {
            b aVar;
            if (d.d()) {
                try {
                    aVar = new a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new C0497b();
            }
            f39093a = aVar;
        }

        private b() {
        }

        public abstract boolean a(AccessibleObject accessibleObject, Object obj);
    }

    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return b.f39093a.a(accessibleObject, obj);
    }

    public static r.a b(List<r> list, Class<?> cls) {
        Iterator<r> it = list.iterator();
        while (it.hasNext()) {
            r.a aVarA = it.next().a(cls);
            if (aVarA != r.a.INDECISIVE) {
                return aVarA;
            }
        }
        return r.a.ALLOW;
    }
}
