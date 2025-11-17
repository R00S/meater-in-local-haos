package com.apptionlabs.meater_app.data;

import kotlin.Metadata;
import rk.g;
import rk.l0;
import rk.l1;
import rk.y0;
import wh.m;

/* compiled from: AsyncTaskCoroutine.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000H\u0083@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u00028\u00012\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0012\u001a\u00020\u0006\"\u0004\b\u0002\u0010\u00112\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u000b\u001a\u0004\u0018\u00018\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/apptionlabs/meater_app/data/AsyncTaskCoroutine;", "I", "O", "", "", "input", "Lih/u;", "callAsync", "([Ljava/lang/Object;Lnh/d;)Ljava/lang/Object;", "onPreExecute", "onCancelled", "result", "onPostExecute", "(Ljava/lang/Object;)V", "params", "doInBackground", "([Ljava/lang/Object;)Ljava/lang/Object;", "T", "execute", "([Ljava/lang/Object;)V", "Ljava/lang/Object;", "getResult", "()Ljava/lang/Object;", "setResult", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public abstract class AsyncTaskCoroutine<I, O> {
    private O result;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object callAsync(I[] r12, nh.d<? super ih.u> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.apptionlabs.meater_app.data.AsyncTaskCoroutine$callAsync$1
            if (r0 == 0) goto L13
            r0 = r13
            com.apptionlabs.meater_app.data.AsyncTaskCoroutine$callAsync$1 r0 = (com.apptionlabs.meater_app.data.AsyncTaskCoroutine$callAsync$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.apptionlabs.meater_app.data.AsyncTaskCoroutine$callAsync$1 r0 = new com.apptionlabs.meater_app.data.AsyncTaskCoroutine$callAsync$1
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = oh.b.c()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r12 = r0.L$0
            com.apptionlabs.meater_app.data.AsyncTaskCoroutine r12 = (com.apptionlabs.meater_app.data.AsyncTaskCoroutine) r12
            ih.o.b(r13)
            goto L57
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            ih.o.b(r13)
            rk.l1 r5 = rk.l1.q
            rk.g0 r6 = rk.y0.b()
            r7 = 0
            com.apptionlabs.meater_app.data.AsyncTaskCoroutine$callAsync$2 r8 = new com.apptionlabs.meater_app.data.AsyncTaskCoroutine$callAsync$2
            r8.<init>(r11, r12, r3)
            r9 = 2
            r10 = 0
            rk.q0 r12 = rk.g.b(r5, r6, r7, r8, r9, r10)
            r0.L$0 = r11
            r0.label = r4
            java.lang.Object r12 = r12.s(r0)
            if (r12 != r1) goto L56
            return r1
        L56:
            r12 = r11
        L57:
            rk.l1 r4 = rk.l1.q
            rk.d2 r5 = rk.y0.c()
            r6 = 0
            com.apptionlabs.meater_app.data.AsyncTaskCoroutine$callAsync$3 r7 = new com.apptionlabs.meater_app.data.AsyncTaskCoroutine$callAsync$3
            r7.<init>(r12, r3)
            r8 = 2
            r9 = 0
            rk.g.d(r4, r5, r6, r7, r8, r9)
            ih.u r12 = ih.u.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apptionlabs.meater_app.data.AsyncTaskCoroutine.callAsync(java.lang.Object[], nh.d):java.lang.Object");
    }

    public abstract O doInBackground(I... params);

    public final <T> void execute(I... input) {
        m.f(input, "input");
        g.d(l1.q, y0.c(), (l0) null, new AsyncTaskCoroutine$execute$1(this, input, null), 2, (Object) null);
    }

    public final O getResult() {
        return this.result;
    }

    public final void setResult(O o10) {
        this.result = o10;
    }

    public void onCancelled() {
    }

    public void onPreExecute() {
    }

    public void onPostExecute(O result) {
    }
}
