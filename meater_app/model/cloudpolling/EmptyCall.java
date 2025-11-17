package com.apptionlabs.meater_app.model.cloudpolling;

import bn.b;
import bn.d;
import bn.s;
import cl.b0;
import ih.l;
import ih.u;
import kotlin.Metadata;
import ql.c0;
import wh.m;

/* compiled from: CookInfoUploadPolling.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0000H\u0016J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016J\u0016\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016¨\u0006\u0013"}, d2 = {"Lcom/apptionlabs/meater_app/model/cloudpolling/EmptyCall;", "Lbn/b;", "Lih/u;", "clone", "Lbn/s;", "execute", "Lbn/d;", "callback", "enqueue", "", "isExecuted", "cancel", "isCanceled", "Lcl/b0;", "request", "Lql/c0;", "timeout", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
final class EmptyCall implements b<u> {
    public void enqueue(d<u> dVar) {
        m.f(dVar, "callback");
    }

    public s<u> execute() {
        s<u> h10 = s.h((Object) null);
        m.e(h10, "success(...)");
        return h10;
    }

    public boolean isCanceled() {
        return false;
    }

    public boolean isExecuted() {
        return true;
    }

    public b0 request() {
        return new b0.a().b();
    }

    public c0 timeout() {
        throw new l("An operation is not implemented: Not yet implemented");
    }

    /* renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public EmptyCall m7clone() {
        return new EmptyCall();
    }

    public void cancel() {
    }
}
