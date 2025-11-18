package androidx.core.app;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import okhttp3.HttpUrl;

/* compiled from: Person.java */
/* renamed from: androidx.core.app.m */
/* loaded from: classes.dex */
public class C0249m {

    /* renamed from: a */
    CharSequence f2176a;

    /* renamed from: b */
    IconCompat f2177b;

    /* renamed from: c */
    String f2178c;

    /* renamed from: d */
    String f2179d;

    /* renamed from: e */
    boolean f2180e;

    /* renamed from: f */
    boolean f2181f;

    /* renamed from: a */
    public IconCompat m1646a() {
        return this.f2177b;
    }

    /* renamed from: b */
    public String m1647b() {
        return this.f2179d;
    }

    /* renamed from: c */
    public CharSequence m1648c() {
        return this.f2176a;
    }

    /* renamed from: d */
    public String m1649d() {
        return this.f2178c;
    }

    /* renamed from: e */
    public boolean m1650e() {
        return this.f2180e;
    }

    /* renamed from: f */
    public boolean m1651f() {
        return this.f2181f;
    }

    /* renamed from: g */
    public String m1652g() {
        String str = this.f2178c;
        if (str != null) {
            return str;
        }
        if (this.f2176a == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return "name:" + ((Object) this.f2176a);
    }

    /* renamed from: h */
    public Person m1653h() {
        return new Person.Builder().setName(m1648c()).setIcon(m1646a() != null ? m1646a().m1802p() : null).setUri(m1649d()).setKey(m1647b()).setBot(m1650e()).setImportant(m1651f()).build();
    }
}
