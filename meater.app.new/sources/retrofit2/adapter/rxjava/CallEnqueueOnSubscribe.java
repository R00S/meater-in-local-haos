package retrofit2.adapter.rxjava;

import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.exceptions.C11240a;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* loaded from: classes3.dex */
final class CallEnqueueOnSubscribe<T> implements C11234e.a<Response<T>> {
    private final Call<T> originalCall;

    CallEnqueueOnSubscribe(Call<T> call) {
        this.originalCall = call;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    public void call(AbstractC11245j<? super Response<T>> abstractC11245j) {
        Call<T> callClone = this.originalCall.clone();
        final CallArbiter callArbiter = new CallArbiter(callClone, abstractC11245j);
        abstractC11245j.add(callArbiter);
        abstractC11245j.setProducer(callArbiter);
        callClone.enqueue(new Callback<T>() { // from class: retrofit2.adapter.rxjava.CallEnqueueOnSubscribe.1
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call, Throwable th) {
                C11240a.m40140e(th);
                callArbiter.emitError(th);
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call, Response<T> response) {
                callArbiter.emitResponse(response);
            }
        });
    }
}
