package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.LongIterator;
import okhttp3.HttpUrl;

/* compiled from: ProgressionIterators.kt */
@Metadata(m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m32267d2 = {"Lkotlin/ranges/LongProgressionIterator;", "Lkotlin/collections/LongIterator;", "first", HttpUrl.FRAGMENT_ENCODE_SET, "last", "step", "(JJJ)V", "finalElement", "hasNext", HttpUrl.FRAGMENT_ENCODE_SET, "next", "getStep", "()J", "nextLong", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.e0.h, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class LongProgressionIterator extends LongIterator {

    /* renamed from: f */
    private final long f37228f;

    /* renamed from: g */
    private final long f37229g;

    /* renamed from: h */
    private boolean f37230h;

    /* renamed from: i */
    private long f37231i;

    public LongProgressionIterator(long j2, long j3, long j4) {
        this.f37228f = j4;
        this.f37229g = j3;
        boolean z = true;
        if (j4 <= 0 ? j2 < j3 : j2 > j3) {
            z = false;
        }
        this.f37230h = z;
        this.f37231i = z ? j2 : j3;
    }

    @Override // kotlin.collections.LongIterator
    /* renamed from: b */
    public long mo32406b() {
        long j2 = this.f37231i;
        if (j2 != this.f37229g) {
            this.f37231i = this.f37228f + j2;
        } else {
            if (!this.f37230h) {
                throw new NoSuchElementException();
            }
            this.f37230h = false;
        }
        return j2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f37230h;
    }
}
