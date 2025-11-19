package com.google.firebase;

import D9.h;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import h9.C3500f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? i(installerPackageName) : "";
    }

    private static String i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<K8.c<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(D9.c.c());
        arrayList.add(C3500f.g());
        arrayList.add(D9.h.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(D9.h.b("fire-core", "21.0.0"));
        arrayList.add(D9.h.b("device-name", i(Build.PRODUCT)));
        arrayList.add(D9.h.b("device-model", i(Build.DEVICE)));
        arrayList.add(D9.h.b("device-brand", i(Build.BRAND)));
        arrayList.add(D9.h.c("android-target-sdk", new h.a() { // from class: com.google.firebase.h
            @Override // D9.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.e((Context) obj);
            }
        }));
        arrayList.add(D9.h.c("android-min-sdk", new h.a() { // from class: com.google.firebase.i
            @Override // D9.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.f((Context) obj);
            }
        }));
        arrayList.add(D9.h.c("android-platform", new h.a() { // from class: com.google.firebase.j
            @Override // D9.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.g((Context) obj);
            }
        }));
        arrayList.add(D9.h.c("android-installer", new h.a() { // from class: com.google.firebase.k
            @Override // D9.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.h((Context) obj);
            }
        }));
        String strA = D9.e.a();
        if (strA != null) {
            arrayList.add(D9.h.b("kotlin", strA));
        }
        return arrayList;
    }
}
