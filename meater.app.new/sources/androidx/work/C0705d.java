package androidx.work;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ContentUriTriggers.java */
/* renamed from: androidx.work.d */
/* loaded from: classes.dex */
public final class C0705d {

    /* renamed from: a */
    private final Set<a> f4507a = new HashSet();

    /* compiled from: ContentUriTriggers.java */
    /* renamed from: androidx.work.d$a */
    public static final class a {

        /* renamed from: a */
        private final Uri f4508a;

        /* renamed from: b */
        private final boolean f4509b;

        a(Uri uri, boolean z) {
            this.f4508a = uri;
            this.f4509b = z;
        }

        /* renamed from: a */
        public Uri m4821a() {
            return this.f4508a;
        }

        /* renamed from: b */
        public boolean m4822b() {
            return this.f4509b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4509b == aVar.f4509b && this.f4508a.equals(aVar.f4508a);
        }

        public int hashCode() {
            return (this.f4508a.hashCode() * 31) + (this.f4509b ? 1 : 0);
        }
    }

    /* renamed from: a */
    public void m4818a(Uri uri, boolean z) {
        this.f4507a.add(new a(uri, z));
    }

    /* renamed from: b */
    public Set<a> m4819b() {
        return this.f4507a;
    }

    /* renamed from: c */
    public int m4820c() {
        return this.f4507a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0705d.class != obj.getClass()) {
            return false;
        }
        return this.f4507a.equals(((C0705d) obj).f4507a);
    }

    public int hashCode() {
        return this.f4507a.hashCode();
    }
}
