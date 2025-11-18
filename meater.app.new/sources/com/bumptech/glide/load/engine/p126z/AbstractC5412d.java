package com.bumptech.glide.load.engine.p126z;

import com.bumptech.glide.load.engine.p126z.InterfaceC5421m;
import com.bumptech.glide.p145r.C5597k;
import java.util.Queue;

/* compiled from: BaseKeyPool.java */
/* renamed from: com.bumptech.glide.load.engine.z.d */
/* loaded from: classes.dex */
abstract class AbstractC5412d<T extends InterfaceC5421m> {

    /* renamed from: a */
    private final Queue<T> f13516a = C5597k.m11049f(20);

    AbstractC5412d() {
    }

    /* renamed from: a */
    abstract T mo10380a();

    /* renamed from: b */
    T m10383b() {
        T tPoll = this.f13516a.poll();
        return tPoll == null ? (T) mo10380a() : tPoll;
    }

    /* renamed from: c */
    public void m10384c(T t) {
        if (this.f13516a.size() < 20) {
            this.f13516a.offer(t);
        }
    }
}
