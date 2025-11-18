package Cc;

import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3862t;

/* compiled from: Segment.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\u0017B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B1\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0002\u0010\fJ\r\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u001d\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0016\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006#"}, d2 = {"LCc/w;", "", "<init>", "()V", "", "data", "", "pos", "limit", "", "shared", "owner", "([BIIZZ)V", "d", "()LCc/w;", "b", "segment", "c", "(LCc/w;)LCc/w;", "byteCount", "e", "(I)LCc/w;", "Loa/F;", "a", "sink", "f", "(LCc/w;I)V", "[B", "I", "Z", "LCc/w;", "next", "g", "prev", "h", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final byte[] data;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int pos;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int limit;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean shared;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean owner;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public w next;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public w prev;

    public w() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }

    public final void a() {
        int i10;
        w wVar = this.prev;
        if (wVar == this) {
            throw new IllegalStateException("cannot compact");
        }
        C3862t.d(wVar);
        if (wVar.owner) {
            int i11 = this.limit - this.pos;
            w wVar2 = this.prev;
            C3862t.d(wVar2);
            int i12 = 8192 - wVar2.limit;
            w wVar3 = this.prev;
            C3862t.d(wVar3);
            if (wVar3.shared) {
                i10 = 0;
            } else {
                w wVar4 = this.prev;
                C3862t.d(wVar4);
                i10 = wVar4.pos;
            }
            if (i11 > i12 + i10) {
                return;
            }
            w wVar5 = this.prev;
            C3862t.d(wVar5);
            f(wVar5, i11);
            b();
            x.b(this);
        }
    }

    public final w b() {
        w wVar = this.next;
        if (wVar == this) {
            wVar = null;
        }
        w wVar2 = this.prev;
        C3862t.d(wVar2);
        wVar2.next = this.next;
        w wVar3 = this.next;
        C3862t.d(wVar3);
        wVar3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return wVar;
    }

    public final w c(w segment) {
        C3862t.g(segment, "segment");
        segment.prev = this;
        segment.next = this.next;
        w wVar = this.next;
        C3862t.d(wVar);
        wVar.prev = segment;
        this.next = segment;
        return segment;
    }

    public final w d() {
        this.shared = true;
        return new w(this.data, this.pos, this.limit, true, false);
    }

    public final w e(int byteCount) {
        w wVarC;
        if (byteCount <= 0 || byteCount > this.limit - this.pos) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (byteCount >= 1024) {
            wVarC = d();
        } else {
            wVarC = x.c();
            byte[] bArr = this.data;
            byte[] bArr2 = wVarC.data;
            int i10 = this.pos;
            C3831l.m(bArr, bArr2, 0, i10, i10 + byteCount, 2, null);
        }
        wVarC.limit = wVarC.pos + byteCount;
        this.pos += byteCount;
        w wVar = this.prev;
        C3862t.d(wVar);
        wVar.c(wVarC);
        return wVarC;
    }

    public final void f(w sink, int byteCount) {
        C3862t.g(sink, "sink");
        if (!sink.owner) {
            throw new IllegalStateException("only owner can write");
        }
        int i10 = sink.limit;
        if (i10 + byteCount > 8192) {
            if (sink.shared) {
                throw new IllegalArgumentException();
            }
            int i11 = sink.pos;
            if ((i10 + byteCount) - i11 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.data;
            C3831l.m(bArr, bArr, 0, i11, i10, 2, null);
            sink.limit -= sink.pos;
            sink.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = sink.data;
        int i12 = sink.limit;
        int i13 = this.pos;
        C3831l.h(bArr2, bArr3, i12, i13, i13 + byteCount);
        sink.limit += byteCount;
        this.pos += byteCount;
    }

    public w(byte[] data, int i10, int i11, boolean z10, boolean z11) {
        C3862t.g(data, "data");
        this.data = data;
        this.pos = i10;
        this.limit = i11;
        this.shared = z10;
        this.owner = z11;
    }
}
