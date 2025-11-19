package Q8;

import java.io.File;

/* compiled from: AutoValue_CrashlyticsReportWithSessionId.java */
/* renamed from: Q8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1615c extends D {

    /* renamed from: a, reason: collision with root package name */
    private final T8.F f14429a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14430b;

    /* renamed from: c, reason: collision with root package name */
    private final File f14431c;

    C1615c(T8.F f10, String str, File file) {
        if (f10 == null) {
            throw new NullPointerException("Null report");
        }
        this.f14429a = f10;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f14430b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f14431c = file;
    }

    @Override // Q8.D
    public T8.F b() {
        return this.f14429a;
    }

    @Override // Q8.D
    public File c() {
        return this.f14431c;
    }

    @Override // Q8.D
    public String d() {
        return this.f14430b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        return this.f14429a.equals(d10.b()) && this.f14430b.equals(d10.d()) && this.f14431c.equals(d10.c());
    }

    public int hashCode() {
        return ((((this.f14429a.hashCode() ^ 1000003) * 1000003) ^ this.f14430b.hashCode()) * 1000003) ^ this.f14431c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f14429a + ", sessionId=" + this.f14430b + ", reportFile=" + this.f14431c + "}";
    }
}
