package f1;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* compiled from: Person.java */
/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    CharSequence f41193a;

    /* renamed from: b, reason: collision with root package name */
    IconCompat f41194b;

    /* renamed from: c, reason: collision with root package name */
    String f41195c;

    /* renamed from: d, reason: collision with root package name */
    String f41196d;

    /* renamed from: e, reason: collision with root package name */
    boolean f41197e;

    /* renamed from: f, reason: collision with root package name */
    boolean f41198f;

    /* compiled from: Person.java */
    static class a {
        static Person a(u uVar) {
            return new Person.Builder().setName(uVar.c()).setIcon(uVar.a() != null ? uVar.a().n() : null).setUri(uVar.d()).setKey(uVar.b()).setBot(uVar.e()).setImportant(uVar.f()).build();
        }
    }

    public IconCompat a() {
        return this.f41194b;
    }

    public String b() {
        return this.f41196d;
    }

    public CharSequence c() {
        return this.f41193a;
    }

    public String d() {
        return this.f41195c;
    }

    public boolean e() {
        return this.f41197e;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        String strB = b();
        String strB2 = uVar.b();
        return (strB == null && strB2 == null) ? Objects.equals(Objects.toString(c()), Objects.toString(uVar.c())) && Objects.equals(d(), uVar.d()) && Boolean.valueOf(e()).equals(Boolean.valueOf(uVar.e())) && Boolean.valueOf(f()).equals(Boolean.valueOf(uVar.f())) : Objects.equals(strB, strB2);
    }

    public boolean f() {
        return this.f41198f;
    }

    public String g() {
        String str = this.f41195c;
        if (str != null) {
            return str;
        }
        if (this.f41193a == null) {
            return "";
        }
        return "name:" + ((Object) this.f41193a);
    }

    public Person h() {
        return a.a(this);
    }

    public int hashCode() {
        String strB = b();
        return strB != null ? strB.hashCode() : Objects.hash(c(), d(), Boolean.valueOf(e()), Boolean.valueOf(f()));
    }

    public Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f41193a);
        IconCompat iconCompat = this.f41194b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.m() : null);
        bundle.putString("uri", this.f41195c);
        bundle.putString("key", this.f41196d);
        bundle.putBoolean("isBot", this.f41197e);
        bundle.putBoolean("isImportant", this.f41198f);
        return bundle;
    }
}
