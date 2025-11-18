package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.BinderC8470y0;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* renamed from: com.google.firebase.messaging.g */
/* loaded from: classes2.dex */
public abstract class AbstractServiceC8433g extends Service {
    private Binder binder;
    private int lastStartId;
    final ExecutorService executor = C8451p.m26614c();
    private final Object lock = new Object();
    private int runningTasks = 0;

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    /* renamed from: com.google.firebase.messaging.g$a */
    class a implements BinderC8470y0.a {
        a() {
        }

        @Override // com.google.firebase.messaging.BinderC8470y0.a
        @KeepForSdk
        /* renamed from: a */
        public Task<Void> mo26539a(Intent intent) {
            return AbstractServiceC8433g.this.processIntent(intent);
        }
    }

    private void finishTask(Intent intent) {
        if (intent != null) {
            C8464v0.m26662b(intent);
        }
        synchronized (this.lock) {
            int i2 = this.runningTasks - 1;
            this.runningTasks = i2;
            if (i2 == 0) {
                stopSelfResultHook(this.lastStartId);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> processIntent(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return Tasks.m23663e(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.executor.execute(new Runnable(this, intent, taskCompletionSource) { // from class: com.google.firebase.messaging.d

            /* renamed from: f */
            private final AbstractServiceC8433g f31980f;

            /* renamed from: g */
            private final Intent f31981g;

            /* renamed from: h */
            private final TaskCompletionSource f31982h;

            {
                this.f31980f = this;
                this.f31981g = intent;
                this.f31982h = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f31980f.lambda$processIntent$0$EnhancedIntentService(this.f31981g, this.f31982h);
            }
        });
        return taskCompletionSource.m23654a();
    }

    protected abstract Intent getStartCommandIntent(Intent intent);

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    final /* synthetic */ void lambda$onStartCommand$1$EnhancedIntentService(Intent intent, Task task) {
        finishTask(intent);
    }

    final /* synthetic */ void lambda$processIntent$0$EnhancedIntentService(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            handleIntent(intent);
        } finally {
            taskCompletionSource.m23656c(null);
        }
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.binder == null) {
            this.binder = new BinderC8470y0(new a());
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i2, int i3) {
        synchronized (this.lock) {
            this.lastStartId = i3;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        Task<Void> taskProcessIntent = processIntent(startCommandIntent);
        if (taskProcessIntent.mo23650m()) {
            finishTask(intent);
            return 2;
        }
        taskProcessIntent.mo23640c(ExecutorC8429e.f31986f, new OnCompleteListener(this, intent) { // from class: com.google.firebase.messaging.f

            /* renamed from: a */
            private final AbstractServiceC8433g f31988a;

            /* renamed from: b */
            private final Intent f31989b;

            {
                this.f31988a = this;
                this.f31989b = intent;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            /* renamed from: a */
            public void mo7019a(Task task) {
                this.f31988a.lambda$onStartCommand$1$EnhancedIntentService(this.f31989b, task);
            }
        });
        return 3;
    }

    boolean stopSelfResultHook(int i2) {
        return stopSelfResult(i2);
    }
}
