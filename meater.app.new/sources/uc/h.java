package uc;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oc.E;
import oc.x;

/* compiled from: RealResponseBody.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Luc/h;", "Loc/E;", "", "contentTypeString", "", "contentLength", "LCc/g;", "source", "<init>", "(Ljava/lang/String;JLCc/g;)V", "d", "()J", "Loc/x;", "e", "()Loc/x;", "g", "()LCc/g;", "D", "Ljava/lang/String;", "E", "J", "F", "LCc/g;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends E {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final String contentTypeString;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final long contentLength;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final Cc.g source;

    public h(String str, long j10, Cc.g source) {
        C3862t.g(source, "source");
        this.contentTypeString = str;
        this.contentLength = j10;
        this.source = source;
    }

    @Override // oc.E
    /* renamed from: d, reason: from getter */
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // oc.E
    /* renamed from: e */
    public x getF46807D() {
        String str = this.contentTypeString;
        if (str != null) {
            return x.INSTANCE.b(str);
        }
        return null;
    }

    @Override // oc.E
    /* renamed from: g, reason: from getter */
    public Cc.g getSource() {
        return this.source;
    }
}
