package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: ApplicationInfo.kt */
@Metadata(m32266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m32267d2 = {"Lcom/google/firebase/sessions/LogEnvironment;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/google/firebase/encoders/json/NumberedEnum;", "number", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;II)V", "getNumber", "()I", "LOG_ENVIRONMENT_UNKNOWN", "LOG_ENVIRONMENT_AUTOPUSH", "LOG_ENVIRONMENT_STAGING", "LOG_ENVIRONMENT_PROD", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.sessions.s, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public enum LogEnvironment implements NumberedEnum {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* renamed from: k */
    private final int f32350k;

    LogEnvironment(int i2) {
        this.f32350k = i2;
    }

    @Override // com.google.firebase.encoders.json.NumberedEnum
    /* renamed from: f, reason: from getter */
    public int getF32350k() {
        return this.f32350k;
    }
}
