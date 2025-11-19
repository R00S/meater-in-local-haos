package K6;

/* compiled from: Encoding.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f8716a;

    private c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f8716a = str;
    }

    public static c b(String str) {
        return new c(str);
    }

    public String a() {
        return this.f8716a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f8716a.equals(((c) obj).f8716a);
        }
        return false;
    }

    public int hashCode() {
        return this.f8716a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f8716a + "\"}";
    }
}
