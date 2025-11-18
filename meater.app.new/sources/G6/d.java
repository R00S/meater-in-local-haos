package G6;

import H6.k;
import java.security.MessageDigest;
import m6.InterfaceC3970e;

/* compiled from: ObjectKey.java */
/* loaded from: classes2.dex */
public final class d implements InterfaceC3970e {

    /* renamed from: b, reason: collision with root package name */
    private final Object f4981b;

    public d(Object obj) {
        this.f4981b = k.d(obj);
    }

    @Override // m6.InterfaceC3970e
    public void b(MessageDigest messageDigest) {
        messageDigest.update(this.f4981b.toString().getBytes(InterfaceC3970e.f45117a));
    }

    @Override // m6.InterfaceC3970e
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f4981b.equals(((d) obj).f4981b);
        }
        return false;
    }

    @Override // m6.InterfaceC3970e
    public int hashCode() {
        return this.f4981b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f4981b + '}';
    }
}
