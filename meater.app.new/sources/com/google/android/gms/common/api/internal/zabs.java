package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public interface zabs {
    /* renamed from: a */
    void mo14094a();

    /* renamed from: b */
    boolean mo14095b(SignInConnectionListener signInConnectionListener);

    /* renamed from: c */
    void mo14096c();

    /* renamed from: d */
    void mo14097d();

    void disconnect();

    void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: e */
    ConnectionResult mo14098e();

    boolean isConnected();

    /* renamed from: l0 */
    <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo14100l0(T t);

    /* renamed from: m0 */
    <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T mo14101m0(T t);
}
