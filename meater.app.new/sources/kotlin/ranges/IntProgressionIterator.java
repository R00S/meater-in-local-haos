package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import okhttp3.HttpUrl;

/* compiled from: ProgressionIterators.kt */
@Metadata(m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m32267d2 = {"Lkotlin/ranges/IntProgressionIterator;", "Lkotlin/collections/IntIterator;", "first", HttpUrl.FRAGMENT_ENCODE_SET, "last", "step", "(III)V", "finalElement", "hasNext", HttpUrl.FRAGMENT_ENCODE_SET, "next", "getStep", "()I", "nextInt", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.e0.e, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class IntProgressionIterator extends IntIterator {

    /* renamed from: f */
    private final int f37218f;

    /* renamed from: g */
    private final int f37219g;

    /* renamed from: h */
    private boolean f37220h;

    /* renamed from: i */
    private int f37221i;

    public IntProgressionIterator(int i2, int i3, int i4) {
        this.f37218f = i4;
        this.f37219g = i3;
        boolean z = true;
        if (i4 <= 0 ? i2 < i3 : i2 > i3) {
            z = false;
        }
        this.f37220h = z;
        this.f37221i = z ? i2 : i3;
    }

    @Override // kotlin.collections.IntIterator
    /* renamed from: b */
    public int mo32397b() {
        int i2 = this.f37221i;
        if (i2 != this.f37219g) {
            this.f37221i = this.f37218f + i2;
        } else {
            if (!this.f37220h) {
                throw new NoSuchElementException();
            }
            this.f37220h = false;
        }
        return i2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f37220h;
    }
}
