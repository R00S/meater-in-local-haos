package H6;

/* compiled from: MultiClassKey.java */
/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private Class<?> f5598a;

    /* renamed from: b, reason: collision with root package name */
    private Class<?> f5599b;

    /* renamed from: c, reason: collision with root package name */
    private Class<?> f5600c;

    public j() {
    }

    public void a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f5598a = cls;
        this.f5599b = cls2;
        this.f5600c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f5598a.equals(jVar.f5598a) && this.f5599b.equals(jVar.f5599b) && l.d(this.f5600c, jVar.f5600c);
    }

    public int hashCode() {
        int iHashCode = ((this.f5598a.hashCode() * 31) + this.f5599b.hashCode()) * 31;
        Class<?> cls = this.f5600c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f5598a + ", second=" + this.f5599b + '}';
    }

    public j(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        a(cls, cls2, cls3);
    }
}
