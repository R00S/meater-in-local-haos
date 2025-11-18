package p6;

import java.util.Queue;
import p6.l;

/* compiled from: BaseKeyPool.java */
/* renamed from: p6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4238c<T extends l> {

    /* renamed from: a, reason: collision with root package name */
    private final Queue<T> f47615a = H6.l.f(20);

    AbstractC4238c() {
    }

    abstract T a();

    T b() {
        T tPoll = this.f47615a.poll();
        return tPoll == null ? (T) a() : tPoll;
    }

    public void c(T t10) {
        if (this.f47615a.size() < 20) {
            this.f47615a.offer(t10);
        }
    }
}
