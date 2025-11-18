package retrofit2.adapter.rxjava;

import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.exceptions.C11240a;
import retrofit2.Call;
import retrofit2.Response;

/* loaded from: classes3.dex */
final class CallExecuteOnSubscribe<T> implements C11234e.a<Response<T>> {
    private final Call<T> originalCall;

    CallExecuteOnSubscribe(Call<T> call) {
        this.originalCall = call;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    public void call(AbstractC11245j<? super Response<T>> abstractC11245j) {
        Call<T> callClone = this.originalCall.clone();
        CallArbiter callArbiter = new CallArbiter(callClone, abstractC11245j);
        abstractC11245j.add(callArbiter);
        abstractC11245j.setProducer(callArbiter);
        try {
            callArbiter.emitResponse(callClone.execute());
        } catch (Throwable th) {
            C11240a.m40140e(th);
            callArbiter.emitError(th);
        }
    }
}
