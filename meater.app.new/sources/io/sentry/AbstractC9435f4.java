package io.sentry;

/* compiled from: SentryDate.java */
/* renamed from: io.sentry.f4 */
/* loaded from: classes2.dex */
public abstract class AbstractC9435f4 implements Comparable<AbstractC9435f4> {
    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC9435f4 abstractC9435f4) {
        return Long.valueOf(mo30792x()).compareTo(Long.valueOf(abstractC9435f4.mo30792x()));
    }

    /* renamed from: k */
    public long mo30788k(AbstractC9435f4 abstractC9435f4) {
        return mo30792x() - abstractC9435f4.mo30792x();
    }

    /* renamed from: q */
    public final boolean m30789q(AbstractC9435f4 abstractC9435f4) {
        return mo30788k(abstractC9435f4) > 0;
    }

    /* renamed from: u */
    public final boolean m30790u(AbstractC9435f4 abstractC9435f4) {
        return mo30788k(abstractC9435f4) < 0;
    }

    /* renamed from: v */
    public long mo30791v(AbstractC9435f4 abstractC9435f4) {
        return (abstractC9435f4 == null || compareTo(abstractC9435f4) >= 0) ? mo30792x() : abstractC9435f4.mo30792x();
    }

    /* renamed from: x */
    public abstract long mo30792x();
}
