package com.facebook.p157o0.p160m0.p161n;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: UnityReflection.kt */
/* renamed from: com.facebook.o0.m0.n.e */
/* loaded from: classes.dex */
public final class C5873e {

    /* renamed from: a */
    public static final C5873e f15254a = new C5873e();

    /* renamed from: b */
    private static final String f15255b = C5873e.class.getCanonicalName();

    /* renamed from: c */
    private static Class<?> f15256c;

    private C5873e() {
    }

    /* renamed from: a */
    public static final void m12464a() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m12467d("UnityFacebookSDKPlugin", "CaptureViewHierarchy", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* renamed from: b */
    private final Class<?> m12465b() throws ClassNotFoundException {
        Class<?> cls = Class.forName("com.unity3d.player.UnityPlayer");
        C9801m.m32345e(cls, "forName(UNITY_PLAYER_CLASS)");
        return cls;
    }

    /* renamed from: c */
    public static final void m12466c(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m12467d("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    /* renamed from: d */
    public static final void m12467d(String str, String str2, String str3) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            if (f15256c == null) {
                f15256c = f15254a.m12465b();
            }
            Class<?> cls = f15256c;
            if (cls == null) {
                C9801m.m32363w("unityPlayer");
                throw null;
            }
            Method method = cls.getMethod("UnitySendMessage", String.class, String.class, String.class);
            Class<?> cls2 = f15256c;
            if (cls2 != null) {
                method.invoke(cls2, str, str2, str3);
            } else {
                C9801m.m32363w("unityPlayer");
                throw null;
            }
        } catch (Exception e2) {
            Log.e(f15255b, "Failed to send message to Unity", e2);
        }
    }
}
