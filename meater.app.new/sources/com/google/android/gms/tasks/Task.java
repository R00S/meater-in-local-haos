package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* loaded from: classes2.dex */
public abstract class Task<TResult> {
    /* renamed from: a */
    public Task<TResult> mo23638a(Executor executor, OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    /* renamed from: b */
    public Task<TResult> mo23639b(OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: c */
    public Task<TResult> mo23640c(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: d */
    public abstract Task<TResult> mo23641d(Executor executor, OnFailureListener onFailureListener);

    /* renamed from: e */
    public abstract Task<TResult> mo23642e(Executor executor, OnSuccessListener<? super TResult> onSuccessListener);

    /* renamed from: f */
    public <TContinuationResult> Task<TContinuationResult> mo23643f(Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: g */
    public <TContinuationResult> Task<TContinuationResult> mo23644g(Executor executor, Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: h */
    public <TContinuationResult> Task<TContinuationResult> mo23645h(Executor executor, Continuation<TResult, Task<TContinuationResult>> continuation) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    /* renamed from: i */
    public abstract Exception mo23646i();

    /* renamed from: j */
    public abstract TResult mo23647j();

    /* renamed from: k */
    public abstract <X extends Throwable> TResult mo23648k(Class<X> cls) throws Throwable;

    /* renamed from: l */
    public abstract boolean mo23649l();

    /* renamed from: m */
    public abstract boolean mo23650m();

    /* renamed from: n */
    public abstract boolean mo23651n();

    /* renamed from: o */
    public <TContinuationResult> Task<TContinuationResult> mo23652o(SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    /* renamed from: p */
    public <TContinuationResult> Task<TContinuationResult> mo23653p(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
