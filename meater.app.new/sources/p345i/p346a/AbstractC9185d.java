package p345i.p346a;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;

/* compiled from: ServiceInfo.java */
/* renamed from: i.a.d */
/* loaded from: classes2.dex */
public abstract class AbstractC9185d implements Cloneable {

    /* renamed from: f */
    public static final byte[] f35290f = new byte[0];

    /* compiled from: ServiceInfo.java */
    /* renamed from: i.a.d$a */
    public enum a {
        Domain,
        Protocol,
        Application,
        Instance,
        Subtype
    }

    @Override // 
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC9185d clone() {
        try {
            return (AbstractC9185d) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public abstract String mo29416f();

    /* renamed from: g */
    public abstract String mo29417g();

    /* renamed from: h */
    public abstract Inet4Address[] mo29418h();

    /* renamed from: i */
    public abstract Inet6Address[] mo29419i();

    /* renamed from: j */
    public abstract InetAddress[] mo29420j();

    /* renamed from: k */
    public abstract String mo29421k();

    /* renamed from: l */
    public abstract int mo29422l();

    /* renamed from: m */
    public abstract int mo29423m();

    /* renamed from: n */
    public abstract String mo29424n();

    /* renamed from: o */
    public abstract String mo29425o();

    /* renamed from: p */
    public abstract String mo29426p();

    /* renamed from: q */
    public abstract String mo29427q();

    /* renamed from: r */
    public abstract byte[] mo29428r();

    /* renamed from: s */
    public abstract String mo29429s();

    /* renamed from: t */
    public abstract int mo29430t();

    /* renamed from: u */
    public abstract boolean mo29431u();

    /* renamed from: v */
    public abstract boolean mo29432v(AbstractC9185d abstractC9185d);

    /* renamed from: w */
    public abstract boolean mo29433w();
}
