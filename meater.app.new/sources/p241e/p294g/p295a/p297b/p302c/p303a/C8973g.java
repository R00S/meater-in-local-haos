package p241e.p294g.p295a.p297b.p302c.p303a;

import androidx.appcompat.widget.SearchView;
import p241e.p294g.p295a.p304c.AbstractC8977c;

/* compiled from: SearchViewQueryTextEvent.java */
/* renamed from: e.g.a.b.c.a.g */
/* loaded from: classes2.dex */
public final class C8973g extends AbstractC8977c<SearchView> {

    /* renamed from: b */
    private final CharSequence f34520b;

    /* renamed from: c */
    private final boolean f34521c;

    private C8973g(SearchView searchView, CharSequence charSequence, boolean z) {
        super(searchView);
        this.f34520b = charSequence;
        this.f34521c = z;
    }

    /* renamed from: b */
    public static C8973g m28569b(SearchView searchView, CharSequence charSequence, boolean z) {
        return new C8973g(searchView, charSequence, z);
    }

    /* renamed from: c */
    public boolean m28570c() {
        return this.f34521c;
    }

    /* renamed from: d */
    public CharSequence m28571d() {
        return this.f34520b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8973g)) {
            return false;
        }
        C8973g c8973g = (C8973g) obj;
        return c8973g.m28577a() == m28577a() && c8973g.f34520b.equals(this.f34520b) && c8973g.f34521c == this.f34521c;
    }

    public int hashCode() {
        return ((((629 + m28577a().hashCode()) * 37) + this.f34520b.hashCode()) * 37) + (this.f34521c ? 1 : 0);
    }

    public String toString() {
        return "SearchViewQueryTextEvent{view=" + m28577a() + ", queryText=" + ((Object) this.f34520b) + ", submitted=" + this.f34521c + '}';
    }
}
