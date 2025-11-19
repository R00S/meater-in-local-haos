package com.squareup.wire.internal;

import Ha.g;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: DoubleArrayList.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0005J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/squareup/wire/internal/DoubleArrayList;", "", "", "initialCapacity", "<init>", "(I)V", "minCapacity", "Loa/F;", "ensureCapacity", "", "toArray", "()[D", "", "double", "add", "(D)V", "", "isNotEmpty", "()Z", "", "toString", "()Ljava/lang/String;", "data", "[D", "size", "I", "Companion", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DoubleArrayList {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private double[] data;
    private int size;

    /* compiled from: DoubleArrayList.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/squareup/wire/internal/DoubleArrayList$Companion;", "", "()V", "forDecoding", "Lcom/squareup/wire/internal/DoubleArrayList;", "minLengthInBytes", "", "minimumElementByteSize", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final DoubleArrayList forDecoding(long minLengthInBytes, long minimumElementByteSize) {
            return new DoubleArrayList((int) g.h(minLengthInBytes / minimumElementByteSize, 2147483647L));
        }

        private Companion() {
        }
    }

    public DoubleArrayList(int i10) {
        this.data = new double[i10];
    }

    private final void ensureCapacity(int minCapacity) {
        double[] dArr = this.data;
        if (minCapacity > dArr.length) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, Math.max(((dArr.length * 3) / 2) + 1, minCapacity));
            C3862t.f(dArrCopyOf, "copyOf(...)");
            this.data = dArrCopyOf;
        }
    }

    public final void add(double d10) {
        ensureCapacity(this.size + 1);
        double[] dArr = this.data;
        int i10 = this.size;
        this.size = i10 + 1;
        dArr[i10] = d10;
    }

    public final boolean isNotEmpty() {
        return this.size > 0;
    }

    public final double[] toArray() {
        int i10 = this.size;
        double[] dArr = this.data;
        if (i10 < dArr.length) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, i10);
            C3862t.f(dArrCopyOf, "copyOf(...)");
            this.data = dArrCopyOf;
        }
        return this.data;
    }

    public String toString() {
        double[] dArrCopyOf = Arrays.copyOf(this.data, this.size);
        C3862t.f(dArrCopyOf, "copyOf(...)");
        String string = Arrays.toString(dArrCopyOf);
        C3862t.f(string, "toString(...)");
        return string;
    }
}
