package g7;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: g7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3431b {
    public static ApiException a(Status status) {
        return status.v0() ? new ResolvableApiException(status) : new ApiException(status);
    }
}
