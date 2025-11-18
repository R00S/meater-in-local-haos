package com.google.android.gms.tasks;

import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
@KeepForSdk
/* loaded from: classes2.dex */
public class NativeOnCompleteListener implements OnCompleteListener<Object> {

    /* renamed from: a */
    private final long f29513a;

    @Override // com.google.android.gms.tasks.OnCompleteListener
    @KeepForSdk
    /* renamed from: a */
    public void mo7019a(Task<Object> task) {
        Object objMo23647j;
        String message;
        Exception excMo23646i;
        if (task.mo23651n()) {
            objMo23647j = task.mo23647j();
            message = null;
        } else if (task.mo23649l() || (excMo23646i = task.mo23646i()) == null) {
            objMo23647j = null;
            message = null;
        } else {
            message = excMo23646i.getMessage();
            objMo23647j = null;
        }
        nativeOnComplete(this.f29513a, objMo23647j, task.mo23651n(), task.mo23649l(), message);
    }

    @KeepForSdk
    public native void nativeOnComplete(long j2, Object obj, boolean z, boolean z2, String str);
}
