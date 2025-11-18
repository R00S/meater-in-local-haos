package com.aptoide.aptoide_ab_testing.service;

import com.aptoide.aptoide_ab_testing.model.EvalContext;
import com.aptoide.aptoide_ab_testing.model.Flag;
import com.aptoide.aptoide_ab_testing.model.PostEvaluationResponseJson;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.HttpUrl;

/* compiled from: FlagrService.kt */
@Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m32267d2 = {"Lcom/aptoide/aptoide_ab_testing/service/FlagrService;", HttpUrl.FRAGMENT_ENCODE_SET, "getFlag", "Lcom/aptoide/aptoide_ab_testing/model/Flag;", "flagID", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postEvaluation", "Lcom/aptoide/aptoide_ab_testing/model/PostEvaluationResponseJson;", "body", "Lcom/aptoide/aptoide_ab_testing/model/EvalContext;", "(Lcom/aptoide/aptoide_ab_testing/model/EvalContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aptoide-ab-testing"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public interface FlagrService {
    Object getFlag(String str, Continuation<? super Flag> continuation);

    Object postEvaluation(EvalContext evalContext, Continuation<? super PostEvaluationResponseJson> continuation);
}
