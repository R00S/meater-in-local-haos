package p345i.p346a.p347g;

import java.io.IOException;
import java.net.DatagramPacket;
import okhttp3.HttpUrl;
import p345i.p346a.p347g.p348s.C9206a;
import p355k.p357b.C9733c;
import p355k.p357b.InterfaceC9732b;

/* compiled from: SocketListener.java */
/* renamed from: i.a.g.r */
/* loaded from: classes2.dex */
class C9205r extends Thread {

    /* renamed from: f */
    static InterfaceC9732b f35465f = C9733c.m32189i(C9205r.class.getName());

    /* renamed from: g */
    private final C9199l f35466g;

    C9205r(C9199l c9199l) {
        StringBuilder sb = new StringBuilder();
        sb.append("SocketListener(");
        sb.append(c9199l != null ? c9199l.m29676p0() : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(")");
        super(sb.toString());
        setDaemon(true);
        this.f35466g = c9199l;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            DatagramPacket datagramPacket = new DatagramPacket(new byte[8972], 8972);
            while (!this.f35466g.m29662X0() && !this.f35466g.m29660V0()) {
                datagramPacket.setLength(8972);
                this.f35466g.m29645E0().receive(datagramPacket);
                if (this.f35466g.m29662X0() || this.f35466g.m29660V0() || this.f35466g.m29664Z0() || this.f35466g.isClosed()) {
                    break;
                }
                try {
                    if (!this.f35466g.m29674n0().m29610E(datagramPacket)) {
                        C9190c c9190c = new C9190c(datagramPacket);
                        if (c9190c.m29502s()) {
                            if (f35465f.mo32175d()) {
                                f35465f.mo32180i(getName() + ".run() JmDNS in:" + c9190c.m29474C(true));
                            }
                            if (c9190c.m29499p()) {
                                int port = datagramPacket.getPort();
                                int i2 = C9206a.f35467a;
                                if (port != i2) {
                                    this.f35466g.m29648G0(c9190c, datagramPacket.getAddress(), datagramPacket.getPort());
                                }
                                C9199l c9199l = this.f35466g;
                                c9199l.m29648G0(c9190c, c9199l.m29668f0(), i2);
                            } else {
                                this.f35466g.m29652K0(c9190c);
                            }
                        } else if (f35465f.mo32173b()) {
                            f35465f.mo32174c(getName() + ".run() JmDNS in message with error code:" + c9190c.m29474C(true));
                        }
                    }
                } catch (IOException e2) {
                    f35465f.mo32177f(getName() + ".run() exception ", e2);
                }
            }
        } catch (IOException e3) {
            if (!this.f35466g.m29662X0() && !this.f35466g.m29660V0() && !this.f35466g.m29664Z0() && !this.f35466g.isClosed()) {
                f35465f.mo32177f(getName() + ".run() exception ", e3);
                this.f35466g.m29669h1();
            }
        }
        if (f35465f.mo32175d()) {
            f35465f.mo32180i(getName() + ".run() exiting.");
        }
    }
}
