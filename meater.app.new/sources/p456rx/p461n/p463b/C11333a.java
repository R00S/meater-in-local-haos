package p456rx.p461n.p463b;

import p456rx.InterfaceC11242g;

/* compiled from: ProducerArbiter.java */
/* renamed from: rx.n.b.a */
/* loaded from: classes3.dex */
public final class C11333a implements InterfaceC11242g {

    /* renamed from: f */
    static final InterfaceC11242g f42727f = new a();

    /* renamed from: g */
    long f42728g;

    /* renamed from: h */
    InterfaceC11242g f42729h;

    /* renamed from: i */
    boolean f42730i;

    /* renamed from: j */
    long f42731j;

    /* renamed from: k */
    long f42732k;

    /* renamed from: l */
    InterfaceC11242g f42733l;

    /* compiled from: ProducerArbiter.java */
    /* renamed from: rx.n.b.a$a */
    static class a implements InterfaceC11242g {
        a() {
        }

        @Override // p456rx.InterfaceC11242g
        public void request(long j2) {
        }
    }

    /* renamed from: a */
    public void m40373a() {
        while (true) {
            synchronized (this) {
                long j2 = this.f42731j;
                long j3 = this.f42732k;
                InterfaceC11242g interfaceC11242g = this.f42733l;
                if (j2 == 0 && j3 == 0 && interfaceC11242g == null) {
                    this.f42730i = false;
                    return;
                }
                this.f42731j = 0L;
                this.f42732k = 0L;
                this.f42733l = null;
                long j4 = this.f42728g;
                if (j4 != Long.MAX_VALUE) {
                    long j5 = j4 + j2;
                    if (j5 < 0 || j5 == Long.MAX_VALUE) {
                        this.f42728g = Long.MAX_VALUE;
                        j4 = Long.MAX_VALUE;
                    } else {
                        j4 = j5 - j3;
                        if (j4 < 0) {
                            throw new IllegalStateException("more produced than requested");
                        }
                        this.f42728g = j4;
                    }
                }
                if (interfaceC11242g == null) {
                    InterfaceC11242g interfaceC11242g2 = this.f42729h;
                    if (interfaceC11242g2 != null && j2 != 0) {
                        interfaceC11242g2.request(j2);
                    }
                } else if (interfaceC11242g == f42727f) {
                    this.f42729h = null;
                } else {
                    this.f42729h = interfaceC11242g;
                    interfaceC11242g.request(j4);
                }
            }
        }
    }

    /* renamed from: b */
    public void m40374b(long j2) {
        if (j2 <= 0) {
            throw new IllegalArgumentException("n > 0 required");
        }
        synchronized (this) {
            if (this.f42730i) {
                this.f42732k += j2;
                return;
            }
            this.f42730i = true;
            try {
                long j3 = this.f42728g;
                if (j3 != Long.MAX_VALUE) {
                    long j4 = j3 - j2;
                    if (j4 < 0) {
                        throw new IllegalStateException("more items arrived than were requested");
                    }
                    this.f42728g = j4;
                }
                m40373a();
            } catch (Throwable th) {
                synchronized (this) {
                    this.f42730i = false;
                    throw th;
                }
            }
        }
    }

    /* renamed from: c */
    public void m40375c(InterfaceC11242g interfaceC11242g) {
        synchronized (this) {
            if (this.f42730i) {
                if (interfaceC11242g == null) {
                    interfaceC11242g = f42727f;
                }
                this.f42733l = interfaceC11242g;
                return;
            }
            this.f42730i = true;
            try {
                this.f42729h = interfaceC11242g;
                if (interfaceC11242g != null) {
                    interfaceC11242g.request(this.f42728g);
                }
                m40373a();
            } catch (Throwable th) {
                synchronized (this) {
                    this.f42730i = false;
                    throw th;
                }
            }
        }
    }

    @Override // p456rx.InterfaceC11242g
    public void request(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j2 == 0) {
            return;
        }
        synchronized (this) {
            if (this.f42730i) {
                this.f42731j += j2;
                return;
            }
            this.f42730i = true;
            try {
                long j3 = this.f42728g + j2;
                if (j3 < 0) {
                    j3 = Long.MAX_VALUE;
                }
                this.f42728g = j3;
                InterfaceC11242g interfaceC11242g = this.f42729h;
                if (interfaceC11242g != null) {
                    interfaceC11242g.request(j2);
                }
                m40373a();
            } catch (Throwable th) {
                synchronized (this) {
                    this.f42730i = false;
                    throw th;
                }
            }
        }
    }
}
