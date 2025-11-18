package com.google.gson.p215t.p218o;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: UnsafeReflectionAccessor.java */
/* renamed from: com.google.gson.t.o.c */
/* loaded from: classes2.dex */
final class C8618c extends AbstractC8617b {

    /* renamed from: b */
    private static Class f32709b;

    /* renamed from: c */
    private final Object f32710c = m27220d();

    /* renamed from: d */
    private final Field f32711d = m27219c();

    C8618c() {
    }

    /* renamed from: c */
    private static Field m27219c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Object m27220d() throws NoSuchFieldException, ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f32709b = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.gson.p215t.p218o.AbstractC8617b
    /* renamed from: b */
    public void mo27217b(AccessibleObject accessibleObject) throws SecurityException {
        if (m27221e(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e2) {
            throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e2);
        }
    }

    /* renamed from: e */
    boolean m27221e(AccessibleObject accessibleObject) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f32710c != null && this.f32711d != null) {
            try {
                f32709b.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f32710c, accessibleObject, Long.valueOf(((Long) f32709b.getMethod("objectFieldOffset", Field.class).invoke(this.f32710c, this.f32711d)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
