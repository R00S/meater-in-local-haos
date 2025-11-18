package o2;

import java.util.NoSuchElementException;

/* compiled from: BaseMediaChunkIterator.java */
/* renamed from: o2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4100b implements m {

    /* renamed from: b, reason: collision with root package name */
    private final long f46320b;

    /* renamed from: c, reason: collision with root package name */
    private final long f46321c;

    /* renamed from: d, reason: collision with root package name */
    private long f46322d;

    public AbstractC4100b(long j10, long j11) {
        this.f46320b = j10;
        this.f46321c = j11;
        f();
    }

    protected final void c() {
        long j10 = this.f46322d;
        if (j10 < this.f46320b || j10 > this.f46321c) {
            throw new NoSuchElementException();
        }
    }

    protected final long d() {
        return this.f46322d;
    }

    public boolean e() {
        return this.f46322d > this.f46321c;
    }

    public void f() {
        this.f46322d = this.f46320b - 1;
    }

    @Override // o2.m
    public boolean next() {
        this.f46322d++;
        return !e();
    }
}
