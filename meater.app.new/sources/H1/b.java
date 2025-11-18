package H1;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.o;

/* compiled from: EmojiEditableFactory.java */
/* loaded from: classes.dex */
final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f5459a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile Editable.Factory f5460b;

    /* renamed from: c, reason: collision with root package name */
    private static Class<?> f5461c;

    @SuppressLint({"PrivateApi"})
    private b() {
        try {
            f5461c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f5460b == null) {
            synchronized (f5459a) {
                try {
                    if (f5460b == null) {
                        f5460b = new b();
                    }
                } finally {
                }
            }
        }
        return f5460b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f5461c;
        return cls != null ? o.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
