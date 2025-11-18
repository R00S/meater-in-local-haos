package com.google.android.play.core.install;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import h8.C3494a;
import java.util.Locale;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public class InstallException extends ApiException {
    public InstallException(int i10) {
        super(new Status(i10, String.format(Locale.getDefault(), "Install Error(%d): %s", Integer.valueOf(i10), C3494a.a(i10))));
        if (i10 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
