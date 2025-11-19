package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.ParserException;
import java.util.List;
import m8.AbstractC4009y;
import v2.N;

/* loaded from: classes.dex */
public class UnrecognizedInputFormatException extends ParserException {

    /* renamed from: D, reason: collision with root package name */
    public final Uri f27708D;

    /* renamed from: E, reason: collision with root package name */
    public final AbstractC4009y<N> f27709E;

    public UnrecognizedInputFormatException(String str, Uri uri, List<? extends N> list) {
        super(str, null, false, 1);
        this.f27708D = uri;
        this.f27709E = AbstractC4009y.B(list);
    }
}
