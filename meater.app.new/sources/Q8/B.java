package Q8;

import java.io.File;
import java.io.IOException;

/* compiled from: CrashlyticsFileMarker.java */
/* loaded from: classes2.dex */
class B {

    /* renamed from: a, reason: collision with root package name */
    private final String f14368a;

    /* renamed from: b, reason: collision with root package name */
    private final W8.g f14369b;

    public B(String str, W8.g gVar) {
        this.f14368a = str;
        this.f14369b = gVar;
    }

    private File b() {
        return this.f14369b.g(this.f14368a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e10) {
            N8.g.f().e("Error creating marker: " + this.f14368a, e10);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
