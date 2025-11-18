package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.C8124n;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.p204r.C8488f;
import com.google.firebase.p209u.C8551d;
import com.google.firebase.p209u.C8553f;
import com.google.firebase.p209u.C8555h;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* renamed from: a */
    static /* synthetic */ String m24942a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: b */
    static /* synthetic */ String m24943b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? HttpUrl.FRAGMENT_ENCODE_SET : String.valueOf(applicationInfo.minSdkVersion);
    }

    /* renamed from: c */
    static /* synthetic */ String m24944c(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 16 || !context.getPackageManager().hasSystemFeature("android.hardware.type.television")) ? (i2 < 20 || !context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) ? (i2 < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? (i2 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? HttpUrl.FRAGMENT_ENCODE_SET : "embedded" : "auto" : "watch" : "tv";
    }

    /* renamed from: d */
    static /* synthetic */ String m24945d(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? m24946e(installerPackageName) : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: e */
    private static String m24946e(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C8124n<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C8551d.m26895b());
        arrayList.add(C8488f.m26682c());
        arrayList.add(C8555h.m26903a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C8555h.m26903a("fire-core", "20.4.2"));
        arrayList.add(C8555h.m26903a("device-name", m24946e(Build.PRODUCT)));
        arrayList.add(C8555h.m26903a("device-model", m24946e(Build.DEVICE)));
        arrayList.add(C8555h.m26903a("device-brand", m24946e(Build.BRAND)));
        arrayList.add(C8555h.m26904b("android-target-sdk", new C8555h.a() { // from class: com.google.firebase.d
            @Override // com.google.firebase.p209u.C8555h.a
            /* renamed from: a */
            public final String mo24966a(Object obj) {
                return FirebaseCommonRegistrar.m24942a((Context) obj);
            }
        }));
        arrayList.add(C8555h.m26904b("android-min-sdk", new C8555h.a() { // from class: com.google.firebase.e
            @Override // com.google.firebase.p209u.C8555h.a
            /* renamed from: a */
            public final String mo24966a(Object obj) {
                return FirebaseCommonRegistrar.m24943b((Context) obj);
            }
        }));
        arrayList.add(C8555h.m26904b("android-platform", new C8555h.a() { // from class: com.google.firebase.f
            @Override // com.google.firebase.p209u.C8555h.a
            /* renamed from: a */
            public final String mo24966a(Object obj) {
                return FirebaseCommonRegistrar.m24944c((Context) obj);
            }
        }));
        arrayList.add(C8555h.m26904b("android-installer", new C8555h.a() { // from class: com.google.firebase.c
            @Override // com.google.firebase.p209u.C8555h.a
            /* renamed from: a */
            public final String mo24966a(Object obj) {
                return FirebaseCommonRegistrar.m24945d((Context) obj);
            }
        }));
        String strM26901a = C8553f.m26901a();
        if (strM26901a != null) {
            arrayList.add(C8555h.m26903a("kotlin", strM26901a));
        }
        return arrayList;
    }
}
