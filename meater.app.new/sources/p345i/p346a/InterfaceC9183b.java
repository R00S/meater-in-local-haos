package p345i.p346a;

import java.net.InetAddress;
import java.util.concurrent.atomic.AtomicReference;
import p345i.p346a.p347g.C9202o;

/* compiled from: NetworkTopologyDiscovery.java */
/* renamed from: i.a.b */
/* loaded from: classes2.dex */
public interface InterfaceC9183b {

    /* compiled from: NetworkTopologyDiscovery.java */
    /* renamed from: i.a.b$a */
    public static final class a {

        /* renamed from: a */
        private static volatile InterfaceC9183b f35288a;

        /* renamed from: b */
        private static final AtomicReference<InterfaceC11533a> f35289b = new AtomicReference<>();

        /* compiled from: NetworkTopologyDiscovery.java */
        /* renamed from: i.a.b$a$a, reason: collision with other inner class name */
        public interface InterfaceC11533a {
            /* renamed from: a */
            InterfaceC9183b m29409a();
        }

        private a() {
        }

        /* renamed from: a */
        public static InterfaceC9183b m29407a() {
            if (f35288a == null) {
                synchronized (a.class) {
                    if (f35288a == null) {
                        f35288a = m29408b();
                    }
                }
            }
            return f35288a;
        }

        /* renamed from: b */
        protected static InterfaceC9183b m29408b() {
            InterfaceC11533a interfaceC11533a = f35289b.get();
            InterfaceC9183b interfaceC9183bM29409a = interfaceC11533a != null ? interfaceC11533a.m29409a() : null;
            return interfaceC9183bM29409a != null ? interfaceC9183bM29409a : new C9202o();
        }
    }

    /* renamed from: a */
    InetAddress[] mo29406a();
}
