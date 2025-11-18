package com.squareup.wire.internal;

import Ha.g;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: IntArrayList.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0005J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0005J\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/squareup/wire/internal/IntArrayList;", "", "", "initialCapacity", "<init>", "(I)V", "minCapacity", "Loa/F;", "ensureCapacity", "", "toArray", "()[I", "int", "add", "", "isNotEmpty", "()Z", "", "toString", "()Ljava/lang/String;", "data", "[I", "size", "I", "Companion", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IntArrayList {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int[] data;
    private int size;

    /* compiled from: IntArrayList.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/squareup/wire/internal/IntArrayList$Companion;", "", "()V", "forDecoding", "Lcom/squareup/wire/internal/IntArrayList;", "minLengthInBytes", "", "minimumElementByteSize", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final IntArrayList forDecoding(long minLengthInBytes, long minimumElementByteSize) {
            return new IntArrayList((int) g.h(minLengthInBytes / minimumElementByteSize, 2147483647L));
        }

        private Companion() {
        }
    }

    public IntArrayList(int i10) {
        this.data = new int[i10];
    }

    private final void ensureCapacity(int minCapacity) {
        int[] iArr = this.data;
        if (minCapacity > iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(((iArr.length * 3) / 2) + 1, minCapacity));
            C3862t.f(iArrCopyOf, "copyOf(...)");
            this.data = iArrCopyOf;
        }
    }

    public final void add(int i10) {
        ensureCapacity(this.size + 1);
        int[] iArr = this.data;
        int i11 = this.size;
        this.size = i11 + 1;
        iArr[i11] = i10;
    }

    public final boolean isNotEmpty() {
        return this.size > 0;
    }

    public final int[] toArray() {
        int i10 = this.size;
        int[] iArr = this.data;
        if (i10 < iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            C3862t.f(iArrCopyOf, "copyOf(...)");
            this.data = iArrCopyOf;
        }
        return this.data;
    }

    public String toString() {
        int[] iArrCopyOf = Arrays.copyOf(this.data, this.size);
        C3862t.f(iArrCopyOf, "copyOf(...)");
        String string = Arrays.toString(iArrCopyOf);
        C3862t.f(string, "toString(...)");
        return string;
    }
}
