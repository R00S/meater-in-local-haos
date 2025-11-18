package Q3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: KeyPath.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f14313c = new e("COMPOSITION");

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f14314a;

    /* renamed from: b, reason: collision with root package name */
    private f f14315b;

    public e(String... strArr) {
        this.f14314a = Arrays.asList(strArr);
    }

    private boolean b() {
        return this.f14314a.get(r0.size() - 1).equals("**");
    }

    private boolean f(String str) {
        return "__container".equals(str);
    }

    public e a(String str) {
        e eVar = new e(this);
        eVar.f14314a.add(str);
        return eVar;
    }

    public boolean c(String str, int i10) {
        if (i10 >= this.f14314a.size()) {
            return false;
        }
        boolean z10 = i10 == this.f14314a.size() - 1;
        String str2 = this.f14314a.get(i10);
        if (!str2.equals("**")) {
            return (z10 || (i10 == this.f14314a.size() + (-2) && b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z10 && this.f14314a.get(i10 + 1).equals(str)) {
            return i10 == this.f14314a.size() + (-2) || (i10 == this.f14314a.size() + (-3) && b());
        }
        if (z10) {
            return true;
        }
        int i11 = i10 + 1;
        if (i11 < this.f14314a.size() - 1) {
            return false;
        }
        return this.f14314a.get(i11).equals(str);
    }

    public f d() {
        return this.f14315b;
    }

    public int e(String str, int i10) {
        if (f(str)) {
            return 0;
        }
        if (this.f14314a.get(i10).equals("**")) {
            return (i10 != this.f14314a.size() - 1 && this.f14314a.get(i10 + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f14314a.equals(eVar.f14314a)) {
            return false;
        }
        f fVar = this.f14315b;
        f fVar2 = eVar.f14315b;
        return fVar != null ? fVar.equals(fVar2) : fVar2 == null;
    }

    public boolean g(String str, int i10) {
        if (f(str)) {
            return true;
        }
        if (i10 >= this.f14314a.size()) {
            return false;
        }
        return this.f14314a.get(i10).equals(str) || this.f14314a.get(i10).equals("**") || this.f14314a.get(i10).equals("*");
    }

    public boolean h(String str, int i10) {
        return "__container".equals(str) || i10 < this.f14314a.size() - 1 || this.f14314a.get(i10).equals("**");
    }

    public int hashCode() {
        int iHashCode = this.f14314a.hashCode() * 31;
        f fVar = this.f14315b;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public e i(f fVar) {
        e eVar = new e(this);
        eVar.f14315b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPath{keys=");
        sb2.append(this.f14314a);
        sb2.append(",resolved=");
        sb2.append(this.f14315b != null);
        sb2.append('}');
        return sb2.toString();
    }

    private e(e eVar) {
        this.f14314a = new ArrayList(eVar.f14314a);
        this.f14315b = eVar.f14315b;
    }
}
