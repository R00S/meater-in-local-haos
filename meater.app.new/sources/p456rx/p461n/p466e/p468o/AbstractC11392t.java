package p456rx.p461n.p466e.p468o;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SpscArrayQueue.java */
/* renamed from: rx.n.e.o.t */
/* loaded from: classes3.dex */
abstract class AbstractC11392t<E> extends AbstractC11378f<E> {

    /* renamed from: k */
    private static final Integer f42972k = Integer.getInteger("jctools.spsc.max.lookahead.step", RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT);

    /* renamed from: l */
    protected final int f42973l;

    public AbstractC11392t(int i2) {
        super(i2);
        this.f42973l = Math.min(i2 / 4, f42972k.intValue());
    }
}
