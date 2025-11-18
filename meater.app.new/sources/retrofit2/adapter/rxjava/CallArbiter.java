package retrofit2.adapter.rxjava;

import java.util.concurrent.atomic.AtomicInteger;
import p456rx.AbstractC11245j;
import p456rx.InterfaceC11242g;
import p456rx.InterfaceC11246k;
import p456rx.exceptions.C11240a;
import p456rx.exceptions.CompositeException;
import p456rx.exceptions.OnCompletedFailedException;
import p456rx.exceptions.OnErrorFailedException;
import p456rx.exceptions.OnErrorNotImplementedException;
import p456rx.p471q.C11412f;
import retrofit2.Call;
import retrofit2.Response;

/* loaded from: classes3.dex */
final class CallArbiter<T> extends AtomicInteger implements InterfaceC11246k, InterfaceC11242g {
    private static final int STATE_HAS_RESPONSE = 2;
    private static final int STATE_REQUESTED = 1;
    private static final int STATE_TERMINATED = 3;
    private static final int STATE_WAITING = 0;
    private final Call<T> call;
    private volatile Response<T> response;
    private final AbstractC11245j<? super Response<T>> subscriber;
    private volatile boolean unsubscribed;

    CallArbiter(Call<T> call, AbstractC11245j<? super Response<T>> abstractC11245j) {
        super(0);
        this.call = call;
        this.subscriber = abstractC11245j;
    }

    private void deliverResponse(Response<T> response) {
        try {
            if (!isUnsubscribed()) {
                this.subscriber.onNext(response);
            }
            try {
                if (isUnsubscribed()) {
                    return;
                }
                this.subscriber.onCompleted();
            } catch (OnCompletedFailedException e2) {
                e = e2;
                C11412f.m40607c().m40611b().m40566a(e);
            } catch (OnErrorFailedException e3) {
                e = e3;
                C11412f.m40607c().m40611b().m40566a(e);
            } catch (OnErrorNotImplementedException e4) {
                e = e4;
                C11412f.m40607c().m40611b().m40566a(e);
            } catch (Throwable th) {
                C11240a.m40140e(th);
                C11412f.m40607c().m40611b().m40566a(th);
            }
        } catch (OnCompletedFailedException e5) {
            e = e5;
            C11412f.m40607c().m40611b().m40566a(e);
        } catch (OnErrorFailedException e6) {
            e = e6;
            C11412f.m40607c().m40611b().m40566a(e);
        } catch (OnErrorNotImplementedException e7) {
            e = e7;
            C11412f.m40607c().m40611b().m40566a(e);
        } catch (Throwable th2) {
            C11240a.m40140e(th2);
            try {
                this.subscriber.onError(th2);
            } catch (OnCompletedFailedException e8) {
                e = e8;
                C11412f.m40607c().m40611b().m40566a(e);
            } catch (OnErrorFailedException e9) {
                e = e9;
                C11412f.m40607c().m40611b().m40566a(e);
            } catch (OnErrorNotImplementedException e10) {
                e = e10;
                C11412f.m40607c().m40611b().m40566a(e);
            } catch (Throwable th3) {
                C11240a.m40140e(th3);
                C11412f.m40607c().m40611b().m40566a(new CompositeException(th2, th3));
            }
        }
    }

    void emitError(Throwable th) {
        set(3);
        if (isUnsubscribed()) {
            return;
        }
        try {
            this.subscriber.onError(th);
        } catch (OnCompletedFailedException e2) {
            e = e2;
            C11412f.m40607c().m40611b().m40566a(e);
        } catch (OnErrorFailedException e3) {
            e = e3;
            C11412f.m40607c().m40611b().m40566a(e);
        } catch (OnErrorNotImplementedException e4) {
            e = e4;
            C11412f.m40607c().m40611b().m40566a(e);
        } catch (Throwable th2) {
            C11240a.m40140e(th2);
            C11412f.m40607c().m40611b().m40566a(new CompositeException(th, th2));
        }
    }

    void emitResponse(Response<T> response) {
        while (true) {
            int i2 = get();
            if (i2 == 0) {
                this.response = response;
                if (compareAndSet(0, 2)) {
                    return;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2 || i2 == 3) {
                        throw new AssertionError();
                    }
                    throw new IllegalStateException("Unknown state: " + i2);
                }
                if (compareAndSet(1, 3)) {
                    deliverResponse(response);
                    return;
                }
            }
        }
    }

    @Override // p456rx.InterfaceC11246k
    public boolean isUnsubscribed() {
        return this.unsubscribed;
    }

    @Override // p456rx.InterfaceC11242g
    public void request(long j2) {
        if (j2 == 0) {
            return;
        }
        while (true) {
            int i2 = get();
            if (i2 != 0) {
                if (i2 == 1) {
                    return;
                }
                if (i2 != 2) {
                    if (i2 == 3) {
                        return;
                    }
                    throw new IllegalStateException("Unknown state: " + i2);
                }
                if (compareAndSet(2, 3)) {
                    deliverResponse(this.response);
                    return;
                }
            } else if (compareAndSet(0, 1)) {
                return;
            }
        }
    }

    @Override // p456rx.InterfaceC11246k
    public void unsubscribe() {
        this.unsubscribed = true;
        this.call.cancel();
    }
}
