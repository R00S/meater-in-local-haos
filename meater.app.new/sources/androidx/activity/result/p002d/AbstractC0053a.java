package androidx.activity.result.p002d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;

/* compiled from: ActivityResultContract.java */
/* renamed from: androidx.activity.result.d.a */
/* loaded from: classes.dex */
public abstract class AbstractC0053a<I, O> {

    /* compiled from: ActivityResultContract.java */
    /* renamed from: androidx.activity.result.d.a$a */
    public static final class a<T> {

        /* renamed from: a */
        @SuppressLint({"UnknownNullness"})
        private final T f148a;

        public a(@SuppressLint({"UnknownNullness"}) T t) {
            this.f148a = t;
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: a */
        public T m176a() {
            return this.f148a;
        }
    }

    /* renamed from: a */
    public abstract Intent mo173a(Context context, @SuppressLint({"UnknownNullness"}) I i2);

    /* renamed from: b */
    public a<O> mo174b(Context context, @SuppressLint({"UnknownNullness"}) I i2) {
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: c */
    public abstract O mo175c(int i2, Intent intent);
}
