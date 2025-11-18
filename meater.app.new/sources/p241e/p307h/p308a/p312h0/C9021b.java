package p241e.p307h.p308a.p312h0;

/* compiled from: DownloadServiceConnectChangedEvent.java */
/* renamed from: e.h.a.h0.b */
/* loaded from: classes2.dex */
public class C9021b extends AbstractC9022c {

    /* renamed from: c */
    private final a f34788c;

    /* renamed from: d */
    private final Class<?> f34789d;

    /* compiled from: DownloadServiceConnectChangedEvent.java */
    /* renamed from: e.h.a.h0.b$a */
    public enum a {
        connected,
        disconnected,
        lost
    }

    public C9021b(a aVar, Class<?> cls) {
        super("event.service.connect.changed");
        this.f34788c = aVar;
        this.f34789d = cls;
    }

    /* renamed from: b */
    public a m28908b() {
        return this.f34788c;
    }
}
