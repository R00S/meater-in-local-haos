package com.bumptech.glide.p139n;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ManifestParser.java */
@Deprecated
/* renamed from: com.bumptech.glide.n.d */
/* loaded from: classes.dex */
public final class C5551d {

    /* renamed from: a */
    private final Context f13891a;

    public C5551d(Context context) {
        this.f13891a = context;
    }

    /* renamed from: b */
    private static InterfaceC5549b m10840b(String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName(str);
            Object objNewInstance = null;
            try {
                objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e2) {
                m10841c(cls, e2);
            } catch (InstantiationException e3) {
                m10841c(cls, e3);
            } catch (NoSuchMethodException e4) {
                m10841c(cls, e4);
            } catch (InvocationTargetException e5) {
                m10841c(cls, e5);
            }
            if (objNewInstance instanceof InterfaceC5549b) {
                return (InterfaceC5549b) objNewInstance;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
        } catch (ClassNotFoundException e6) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e6);
        }
    }

    /* renamed from: c */
    private static void m10841c(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    /* renamed from: a */
    public List<InterfaceC5549b> m10842a() {
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f13891a.getPackageManager().getApplicationInfo(this.f13891a.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Got null app info metadata");
                }
                return arrayList;
            }
            if (Log.isLoggable("ManifestParser", 2)) {
                Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                    arrayList.add(m10840b(str));
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Loaded Glide module: " + str);
                    }
                }
            }
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Finished loading Glide modules");
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e2);
        }
    }
}
