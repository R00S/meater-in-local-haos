package retrofit2.adapter.rxjava;

import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.exceptions.C11240a;
import p456rx.exceptions.CompositeException;
import p456rx.exceptions.OnCompletedFailedException;
import p456rx.exceptions.OnErrorFailedException;
import p456rx.exceptions.OnErrorNotImplementedException;
import p456rx.p471q.C11412f;
import retrofit2.Response;

/* loaded from: classes3.dex */
final class ResultOnSubscribe<T> implements C11234e.a<Result<T>> {
    private final C11234e.a<Response<T>> upstream;

    private static class ResultSubscriber<R> extends AbstractC11245j<Response<R>> {
        private final AbstractC11245j<? super Result<R>> subscriber;

        ResultSubscriber(AbstractC11245j<? super Result<R>> abstractC11245j) {
            super(abstractC11245j);
            this.subscriber = abstractC11245j;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            this.subscriber.onCompleted();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            try {
                this.subscriber.onNext(Result.error(th));
                this.subscriber.onCompleted();
            } catch (Throwable th2) {
                try {
                    this.subscriber.onError(th2);
                } catch (OnCompletedFailedException e2) {
                    e = e2;
                    C11412f.m40607c().m40611b().m40566a(e);
                } catch (OnErrorFailedException e3) {
                    e = e3;
                    C11412f.m40607c().m40611b().m40566a(e);
                } catch (OnErrorNotImplementedException e4) {
                    e = e4;
                    C11412f.m40607c().m40611b().m40566a(e);
                } catch (Throwable th3) {
                    C11240a.m40140e(th3);
                    C11412f.m40607c().m40611b().m40566a(new CompositeException(th2, th3));
                }
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(Response<R> response) {
            this.subscriber.onNext(Result.response(response));
        }
    }

    ResultOnSubscribe(C11234e.a<Response<T>> aVar) {
        this.upstream = aVar;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    public void call(AbstractC11245j<? super Result<T>> abstractC11245j) {
        this.upstream.call(new ResultSubscriber(abstractC11245j));
    }
}
