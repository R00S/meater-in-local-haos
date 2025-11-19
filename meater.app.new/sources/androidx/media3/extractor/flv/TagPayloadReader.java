package androidx.media3.extractor.flv;

import X1.y;
import androidx.media3.common.ParserException;
import v2.O;

/* loaded from: classes.dex */
abstract class TagPayloadReader {

    /* renamed from: a, reason: collision with root package name */
    protected final O f28036a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    protected TagPayloadReader(O o10) {
        this.f28036a = o10;
    }

    public final boolean a(y yVar, long j10) {
        return b(yVar) && c(yVar, j10);
    }

    protected abstract boolean b(y yVar);

    protected abstract boolean c(y yVar, long j10);
}
