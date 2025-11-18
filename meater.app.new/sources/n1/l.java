package n1;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListPlatformWrapper.java */
/* loaded from: classes.dex */
final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    private final LocaleList f45602a;

    l(Object obj) {
        this.f45602a = (LocaleList) obj;
    }

    @Override // n1.k
    public String a() {
        return this.f45602a.toLanguageTags();
    }

    @Override // n1.k
    public Object b() {
        return this.f45602a;
    }

    public boolean equals(Object obj) {
        return this.f45602a.equals(((k) obj).b());
    }

    @Override // n1.k
    public Locale get(int i10) {
        return this.f45602a.get(i10);
    }

    public int hashCode() {
        return this.f45602a.hashCode();
    }

    @Override // n1.k
    public boolean isEmpty() {
        return this.f45602a.isEmpty();
    }

    @Override // n1.k
    public int size() {
        return this.f45602a.size();
    }

    public String toString() {
        return this.f45602a.toString();
    }
}
