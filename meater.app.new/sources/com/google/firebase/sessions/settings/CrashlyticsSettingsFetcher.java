package com.google.firebase.sessions.settings;

import java.util.Map;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* compiled from: RemoteSettingsFetcher.kt */
@Metadata(m32266d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bà\u0080\u0001\u0018\u00002\u00020\u0001J|\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b21\u0010\u000b\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m32267d2 = {"Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", HttpUrl.FRAGMENT_ENCODE_SET, "doConfigFetch", HttpUrl.FRAGMENT_ENCODE_SET, "headerOptions", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "onSuccess", "Lkotlin/Function2;", "Lorg/json/JSONObject;", "Lkotlin/coroutines/Continuation;", "onFailure", "Lkotlin/ParameterName;", "name", "msg", "(Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.sessions.m0.a, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public interface CrashlyticsSettingsFetcher {
    /* renamed from: a */
    Object mo26802a(Map<String, String> map, Function2<? super JSONObject, ? super Continuation<? super C10775u>, ? extends Object> function2, Function2<? super String, ? super Continuation<? super C10775u>, ? extends Object> function22, Continuation<? super C10775u> continuation);
}
