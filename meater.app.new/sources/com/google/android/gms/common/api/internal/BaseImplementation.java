package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.SimpleClientAdapter;

@KeepForSdk
/* loaded from: classes2.dex */
public class BaseImplementation {

    @KeepForSdk
    public static abstract class ApiMethodImpl<R extends Result, A extends Api.AnyClient> extends BasePendingResult<R> implements ResultHolder<R> {

        /* renamed from: q */
        @KeepForSdk
        private final Api.AnyClientKey<A> f17309q;

        /* renamed from: r */
        @KeepForSdk
        private final Api<?> f17310r;

        @KeepForSdk
        protected ApiMethodImpl(Api<?> api, GoogleApiClient googleApiClient) {
            super((GoogleApiClient) Preconditions.m14373l(googleApiClient, "GoogleApiClient must not be null"));
            Preconditions.m14373l(api, "Api must not be null");
            this.f17309q = (Api.AnyClientKey<A>) api.m13838a();
            this.f17310r = api;
        }

        @KeepForSdk
        /* renamed from: x */
        private void m13928x(RemoteException remoteException) {
            m13934y(new Status(8, remoteException.getLocalizedMessage(), null));
        }

        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
        @KeepForSdk
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo13929a(Object obj) {
            super.m13940k((Result) obj);
        }

        @KeepForSdk
        /* renamed from: s */
        protected abstract void mo13719s(A a) throws RemoteException;

        @KeepForSdk
        /* renamed from: t */
        public final Api<?> m13930t() {
            return this.f17310r;
        }

        @KeepForSdk
        /* renamed from: u */
        public final Api.AnyClientKey<A> m13931u() {
            return this.f17309q;
        }

        @KeepForSdk
        /* renamed from: v */
        protected void m13932v(R r) {
        }

        @KeepForSdk
        /* renamed from: w */
        public final void m13933w(A a) throws DeadObjectException {
            if (a instanceof SimpleClientAdapter) {
                a = ((SimpleClientAdapter) a).m14400j();
            }
            try {
                mo13719s(a);
            } catch (DeadObjectException e2) {
                m13928x(e2);
                throw e2;
            } catch (RemoteException e3) {
                m13928x(e3);
            }
        }

        @KeepForSdk
        /* renamed from: y */
        public final void m13934y(Status status) {
            Preconditions.m14363b(!status.m13915e0(), "Failed result must not be success");
            R rMo13718h = mo13718h(status);
            m13940k(rMo13718h);
            m13932v(rMo13718h);
        }
    }

    @KeepForSdk
    public interface ResultHolder<R> {
        @KeepForSdk
        /* renamed from: a */
        void mo13929a(R r);
    }
}
