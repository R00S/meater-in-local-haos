package cm.aptoide.p092pt.util;

import cm.aptoide.p092pt.utils.BaseException;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.exceptions.C11240a;
import p456rx.p471q.AbstractC11410d;

/* loaded from: classes.dex */
public class RxJavaStackTracer extends AbstractC11410d {

    static class OperatorTraceOnError<T> implements C11234e.b<T, T> {
        private final StackTraceElement[] trace = new Throwable().getStackTrace();

        private static class TracedException extends RuntimeException {
            public TracedException(Throwable th, StackTraceElement[] stackTraceElementArr) {
                super(th);
                setStackTrace(stackTraceElementArr);
            }
        }

        OperatorTraceOnError() {
        }

        public static <T> OperatorTraceOnError<T> traceOnError() {
            return new OperatorTraceOnError<>();
        }

        @Override // p456rx.p460m.InterfaceC11256e
        public AbstractC11245j<? super T> call(final AbstractC11245j<? super T> abstractC11245j) {
            AbstractC11245j<T> abstractC11245j2 = new AbstractC11245j<T>() { // from class: cm.aptoide.pt.util.RxJavaStackTracer.OperatorTraceOnError.1
                @Override // p456rx.InterfaceC11241f
                public void onCompleted() {
                    abstractC11245j.onCompleted();
                }

                @Override // p456rx.InterfaceC11241f
                public void onError(Throwable th) {
                    if (BaseException.class.isAssignableFrom(th.getClass())) {
                        abstractC11245j.onError(th);
                    } else {
                        abstractC11245j.onError(new TracedException(th, OperatorTraceOnError.this.trace));
                    }
                }

                @Override // p456rx.InterfaceC11241f
                public void onNext(T t) {
                    abstractC11245j.onNext(t);
                }
            };
            abstractC11245j.add(abstractC11245j2);
            return abstractC11245j2;
        }
    }

    @Override // p456rx.p471q.AbstractC11410d
    public <T> C11234e.a<T> onSubscribeStart(C11234e<? extends T> c11234e, final C11234e.a<T> aVar) {
        return new C11234e.a<T>() { // from class: cm.aptoide.pt.util.RxJavaStackTracer.1
            @Override // p456rx.p460m.InterfaceC11253b
            public void call(AbstractC11245j<? super T> abstractC11245j) {
                try {
                    AbstractC11245j<? super T> abstractC11245jCall = RxJavaStackTracer.this.onLift(OperatorTraceOnError.traceOnError()).call(abstractC11245j);
                    try {
                        abstractC11245jCall.onStart();
                        aVar.call(abstractC11245jCall);
                    } catch (Throwable th) {
                        C11240a.m40140e(th);
                        abstractC11245jCall.onError(th);
                    }
                } catch (Throwable th2) {
                    C11240a.m40140e(th2);
                    abstractC11245j.onError(th2);
                }
            }
        };
    }
}
