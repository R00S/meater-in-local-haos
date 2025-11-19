package N8;

import Q8.C1622j;
import android.content.Context;
import android.content.res.Resources;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DevelopmentPlatformProvider.java */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12573a;

    /* renamed from: b, reason: collision with root package name */
    private b f12574b = null;

    /* compiled from: DevelopmentPlatformProvider.java */
    private class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f12575a;

        /* renamed from: b, reason: collision with root package name */
        private final String f12576b;

        private b() throws Resources.NotFoundException {
            int iP = C1622j.p(f.this.f12573a, "com.google.firebase.crashlytics.unity_version", "string");
            if (iP == 0) {
                if (!f.this.c("flutter_assets/NOTICES.Z")) {
                    this.f12575a = null;
                    this.f12576b = null;
                    return;
                } else {
                    this.f12575a = "Flutter";
                    this.f12576b = null;
                    g.f().i("Development platform is: Flutter");
                    return;
                }
            }
            this.f12575a = "Unity";
            String string = f.this.f12573a.getResources().getString(iP);
            this.f12576b = string;
            g.f().i("Unity Editor version is: " + string);
        }
    }

    public f(Context context) {
        this.f12573a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) throws IOException {
        if (this.f12573a.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.f12573a.getAssets().open(str);
            if (inputStreamOpen == null) {
                return true;
            }
            inputStreamOpen.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.f12574b == null) {
            this.f12574b = new b();
        }
        return this.f12574b;
    }

    public String d() {
        return f().f12575a;
    }

    public String e() {
        return f().f12576b;
    }
}
