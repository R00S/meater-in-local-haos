package io.sentry.transport;

/* compiled from: TransportResult.java */
/* renamed from: io.sentry.transport.a0 */
/* loaded from: classes2.dex */
public abstract class AbstractC9597a0 {

    /* compiled from: TransportResult.java */
    /* renamed from: io.sentry.transport.a0$b */
    private static final class b extends AbstractC9597a0 {

        /* renamed from: a */
        private final int f36865a;

        b(int i2) {
            super();
            this.f36865a = i2;
        }

        @Override // io.sentry.transport.AbstractC9597a0
        /* renamed from: c */
        public int mo31664c() {
            return this.f36865a;
        }

        @Override // io.sentry.transport.AbstractC9597a0
        /* renamed from: d */
        public boolean mo31665d() {
            return false;
        }
    }

    /* compiled from: TransportResult.java */
    /* renamed from: io.sentry.transport.a0$c */
    private static final class c extends AbstractC9597a0 {

        /* renamed from: a */
        static final c f36866a = new c();

        private c() {
            super();
        }

        @Override // io.sentry.transport.AbstractC9597a0
        /* renamed from: c */
        public int mo31664c() {
            return -1;
        }

        @Override // io.sentry.transport.AbstractC9597a0
        /* renamed from: d */
        public boolean mo31665d() {
            return true;
        }
    }

    /* renamed from: a */
    public static AbstractC9597a0 m31661a() {
        return m31662b(-1);
    }

    /* renamed from: b */
    public static AbstractC9597a0 m31662b(int i2) {
        return new b(i2);
    }

    /* renamed from: e */
    public static AbstractC9597a0 m31663e() {
        return c.f36866a;
    }

    /* renamed from: c */
    public abstract int mo31664c();

    /* renamed from: d */
    public abstract boolean mo31665d();

    private AbstractC9597a0() {
    }
}
