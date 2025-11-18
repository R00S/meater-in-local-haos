package com.google.android.gms.tasks;

import com.google.android.gms.internal.tasks.zza;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzy implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ zza f29574a;

    /* renamed from: b */
    public final /* synthetic */ TaskCompletionSource f29575b;

    /* renamed from: c */
    public final /* synthetic */ C7898d f29576c;

    @Override // com.google.android.gms.tasks.OnCompleteListener
    /* renamed from: a */
    public final void mo7019a(Task task) {
        zza zzaVar = this.f29574a;
        TaskCompletionSource taskCompletionSource = this.f29575b;
        C7898d c7898d = this.f29576c;
        zzaVar.removeCallbacksAndMessages(null);
        if (task.mo23651n()) {
            taskCompletionSource.m23658e(task.mo23647j());
        } else {
            if (task.mo23649l()) {
                c7898d.m23671a();
                return;
            }
            Exception excMo23646i = task.mo23646i();
            excMo23646i.getClass();
            taskCompletionSource.m23657d(excMo23646i);
        }
    }
}
