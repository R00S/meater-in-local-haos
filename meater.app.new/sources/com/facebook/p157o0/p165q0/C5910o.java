package com.facebook.p157o0.p165q0;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.C5641a0;
import kotlin.jvm.internal.C9789g;

/* compiled from: SourceApplicationInfo.kt */
/* renamed from: com.facebook.o0.q0.o */
/* loaded from: classes2.dex */
public final class C5910o {

    /* renamed from: a */
    public static final a f15403a = new a(null);

    /* renamed from: b */
    private final String f15404b;

    /* renamed from: c */
    private final boolean f15405c;

    /* compiled from: SourceApplicationInfo.kt */
    /* renamed from: com.facebook.o0.q0.o$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final void m12671a() {
            C5641a0 c5641a0 = C5641a0.f14199a;
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(C5641a0.m11284c()).edit();
            editorEdit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
            editorEdit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
            editorEdit.apply();
        }

        /* renamed from: b */
        public final C5910o m12672b() {
            C5641a0 c5641a0 = C5641a0.f14199a;
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C5641a0.m11284c());
            C9789g c9789g = null;
            if (defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                return new C5910o(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), c9789g);
            }
            return null;
        }
    }

    private C5910o(String str, boolean z) {
        this.f15404b = str;
        this.f15405c = z;
    }

    public /* synthetic */ C5910o(String str, boolean z, C9789g c9789g) {
        this(str, z);
    }

    /* renamed from: a */
    public final void m12670a() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(C5641a0.m11284c()).edit();
        editorEdit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f15404b);
        editorEdit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f15405c);
        editorEdit.apply();
    }

    public String toString() {
        String str = this.f15405c ? "Applink" : "Unclassified";
        if (this.f15404b == null) {
            return str;
        }
        return str + '(' + ((Object) this.f15404b) + ')';
    }
}
