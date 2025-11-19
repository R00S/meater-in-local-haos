package n1;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListCompat.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    private static final j f45599b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    private final k f45600a;

    /* compiled from: LocaleListCompat.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final Locale[] f45601a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* compiled from: LocaleListCompat.java */
    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }
    }

    private j(k kVar) {
        this.f45600a = kVar;
    }

    public static j a(Locale... localeArr) {
        return h(b.a(localeArr));
    }

    public static j b(String str) {
        if (str == null || str.isEmpty()) {
            return d();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(strArrSplit[i10]);
        }
        return a(localeArr);
    }

    public static j d() {
        return f45599b;
    }

    public static j h(LocaleList localeList) {
        return new j(new l(localeList));
    }

    public Locale c(int i10) {
        return this.f45600a.get(i10);
    }

    public boolean e() {
        return this.f45600a.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof j) && this.f45600a.equals(((j) obj).f45600a);
    }

    public int f() {
        return this.f45600a.size();
    }

    public String g() {
        return this.f45600a.a();
    }

    public int hashCode() {
        return this.f45600a.hashCode();
    }

    public String toString() {
        return this.f45600a.toString();
    }
}
