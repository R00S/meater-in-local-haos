package p456rx.p470p;

import java.util.Arrays;
import p456rx.AbstractC11245j;
import p456rx.exceptions.C11240a;
import p456rx.exceptions.CompositeException;
import p456rx.exceptions.OnCompletedFailedException;
import p456rx.exceptions.OnErrorFailedException;
import p456rx.exceptions.OnErrorNotImplementedException;
import p456rx.exceptions.UnsubscribeFailedException;
import p456rx.p471q.C11409c;
import p456rx.p471q.C11412f;

/* compiled from: SafeSubscriber.java */
/* renamed from: rx.p.c */
/* loaded from: classes3.dex */
public class C11403c<T> extends AbstractC11245j<T> {

    /* renamed from: f */
    private final AbstractC11245j<? super T> f42990f;

    /* renamed from: g */
    boolean f42991g;

    public C11403c(AbstractC11245j<? super T> abstractC11245j) {
        super(abstractC11245j);
        this.f42990f = abstractC11245j;
    }

    /* renamed from: c */
    protected void m40557c(Throwable th) {
        C11412f.m40607c().m40611b().m40566a(th);
        try {
            this.f42990f.onError(th);
            try {
                unsubscribe();
            } catch (Throwable th2) {
                C11409c.m40578j(th2);
                throw new OnErrorFailedException(th2);
            }
        } catch (OnErrorNotImplementedException e2) {
            try {
                unsubscribe();
                throw e2;
            } catch (Throwable th3) {
                C11409c.m40578j(th3);
                throw new OnErrorNotImplementedException("Observer.onError not implemented and error while unsubscribing.", new CompositeException(Arrays.asList(th, th3)));
            }
        } catch (Throwable th4) {
            C11409c.m40578j(th4);
            try {
                unsubscribe();
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError", new CompositeException(Arrays.asList(th, th4)));
            } catch (Throwable th5) {
                C11409c.m40578j(th5);
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError and during unsubscription.", new CompositeException(Arrays.asList(th, th4, th5)));
            }
        }
    }

    @Override // p456rx.InterfaceC11241f
    public void onCompleted() {
        UnsubscribeFailedException unsubscribeFailedException;
        if (this.f42991g) {
            return;
        }
        this.f42991g = true;
        try {
            this.f42990f.onCompleted();
            try {
                unsubscribe();
            } finally {
            }
        } catch (Throwable th) {
            try {
                C11240a.m40140e(th);
                C11409c.m40578j(th);
                throw new OnCompletedFailedException(th.getMessage(), th);
            } catch (Throwable th2) {
                try {
                    unsubscribe();
                    throw th2;
                } finally {
                }
            }
        }
    }

    @Override // p456rx.InterfaceC11241f
    public void onError(Throwable th) {
        C11240a.m40140e(th);
        if (this.f42991g) {
            return;
        }
        this.f42991g = true;
        m40557c(th);
    }

    @Override // p456rx.InterfaceC11241f
    public void onNext(T t) {
        try {
            if (this.f42991g) {
                return;
            }
            this.f42990f.onNext(t);
        } catch (Throwable th) {
            C11240a.m40141f(th, this);
        }
    }
}
