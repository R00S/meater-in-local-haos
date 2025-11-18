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
final class BodyOnSubscribe<T> implements C11234e.a<T> {
    private final C11234e.a<Response<T>> upstream;

    private static class BodySubscriber<R> extends AbstractC11245j<Response<R>> {
        private final AbstractC11245j<? super R> subscriber;
        private boolean subscriberTerminated;

        BodySubscriber(AbstractC11245j<? super R> abstractC11245j) {
            super(abstractC11245j);
            this.subscriber = abstractC11245j;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            if (this.subscriberTerminated) {
                return;
            }
            this.subscriber.onCompleted();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            if (!this.subscriberTerminated) {
                this.subscriber.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a Retrofit bug with the full stacktrace.");
            assertionError.initCause(th);
            C11412f.m40607c().m40611b().m40566a(assertionError);
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(Response<R> response) {
            if (response.isSuccessful()) {
                this.subscriber.onNext(response.body());
                return;
            }
            this.subscriberTerminated = true;
            HttpException httpException = new HttpException(response);
            try {
                this.subscriber.onError(httpException);
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
                C11412f.m40607c().m40611b().m40566a(new CompositeException(httpException, th));
            }
        }
    }

    BodyOnSubscribe(C11234e.a<Response<T>> aVar) {
        this.upstream = aVar;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    public void call(AbstractC11245j<? super T> abstractC11245j) {
        this.upstream.call(new BodySubscriber(abstractC11245j));
    }
}
