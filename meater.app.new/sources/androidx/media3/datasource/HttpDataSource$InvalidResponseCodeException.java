package androidx.media3.datasource;

import a2.g;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {

    /* renamed from: E, reason: collision with root package name */
    public final int f26140E;

    /* renamed from: F, reason: collision with root package name */
    public final String f26141F;

    /* renamed from: G, reason: collision with root package name */
    public final Map<String, List<String>> f26142G;

    /* renamed from: H, reason: collision with root package name */
    public final byte[] f26143H;

    public HttpDataSource$InvalidResponseCodeException(int i10, String str, IOException iOException, Map<String, List<String>> map, g gVar, byte[] bArr) {
        super("Response code: " + i10, iOException, gVar, 2004, 1);
        this.f26140E = i10;
        this.f26141F = str;
        this.f26142G = map;
        this.f26143H = bArr;
    }
}
