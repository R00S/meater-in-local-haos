package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CharIterator;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: ProgressionIterators.kt */
@Metadata(m32266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m32267d2 = {"Lkotlin/ranges/CharProgressionIterator;", "Lkotlin/collections/CharIterator;", "first", HttpUrl.FRAGMENT_ENCODE_SET, "last", "step", HttpUrl.FRAGMENT_ENCODE_SET, "(CCI)V", "finalElement", "hasNext", HttpUrl.FRAGMENT_ENCODE_SET, "next", "getStep", "()I", "nextChar", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.e0.b, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class CharProgressionIterator extends CharIterator {

    /* renamed from: f */
    private final int f37208f;

    /* renamed from: g */
    private final int f37209g;

    /* renamed from: h */
    private boolean f37210h;

    /* renamed from: i */
    private int f37211i;

    public CharProgressionIterator(char c2, char c3, int i2) {
        this.f37208f = i2;
        this.f37209g = c3;
        boolean z = true;
        if (i2 <= 0 ? C9801m.m32348h(c2, c3) < 0 : C9801m.m32348h(c2, c3) > 0) {
            z = false;
        }
        this.f37210h = z;
        this.f37211i = z ? c2 : c3;
    }

    @Override // kotlin.collections.CharIterator
    /* renamed from: b */
    public char mo32391b() {
        int i2 = this.f37211i;
        if (i2 != this.f37209g) {
            this.f37211i = this.f37208f + i2;
        } else {
            if (!this.f37210h) {
                throw new NoSuchElementException();
            }
            this.f37210h = false;
        }
        return (char) i2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f37210h;
    }
}
